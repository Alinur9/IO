package com.xyz.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.io.IOUtils;

import java.io.File;

public class Hdfs {
    private String getName(String filePath){
        File file = new File(filePath);
        String name = file.getName();
        return name;
    }
    public void put(String filePath, String destination)throws Exception{
        String fileName = "/"+getName(filePath);
        Configuration hadoopConfig = new Configuration();
        hadoopConfig.set("fs.hdfs.impl",
                org.apache.hadoop.hdfs.DistributedFileSystem.class.getName()
        );
        hadoopConfig.set("fs.file.impl",
                org.apache.hadoop.fs.LocalFileSystem.class.getName()
        );
        hadoopConfig.set("fs.defaultFS","hdfs://localhost:9000");
        FileSystem hdfsSystem = FileSystem.get(hadoopConfig);
        FileSystem localSystem = FileSystem.get(new Configuration());
        FSDataInputStream inputStream = localSystem.open(new Path(filePath));
        FSDataOutputStream outputStream = hdfsSystem.create(new Path(destination+fileName),true);
        IOUtils.copyBytes(inputStream,outputStream,4096,true);

    }
    public void get(String filePath, String destination)throws Exception{
        String fileName = "/"+getName(filePath);
        Configuration hadoopConfig = new Configuration();
        hadoopConfig.set("fs.hdfs.impl",
                org.apache.hadoop.hdfs.DistributedFileSystem.class.getName()
        );
        hadoopConfig.set("fs.file.impl",
                org.apache.hadoop.fs.LocalFileSystem.class.getName()
        );
        hadoopConfig.set("fs.defaultFS","hdfs://localhost:9000");
        FileSystem hdfsSystem = FileSystem.get(hadoopConfig);
        FileSystem localSystem = FileSystem.get(new Configuration());
        FSDataInputStream inputStream = hdfsSystem.open(new Path(filePath));
        FSDataOutputStream outputStream = localSystem.create(new Path(destination+fileName),true);
        IOUtils.copyBytes(inputStream,outputStream,4096,true);
    }

}
