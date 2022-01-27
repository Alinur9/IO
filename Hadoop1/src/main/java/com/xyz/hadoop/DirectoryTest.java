package com.xyz.hadoop;

import org.apache.commons.io.FileUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.io.IOUtils;

import java.io.File;

public class DirectoryTest {
    public static void main(String[] args) throws Exception{
        String hdfsDirectory = "/test2";
        String fileDirectory = "/home/alinur/Downloads/nirjhor";
        Configuration hadoopConfig = new Configuration();
        hadoopConfig.set("fs.hdfs.impl",
                org.apache.hadoop.hdfs.DistributedFileSystem.class.getName()
        );
        hadoopConfig.set("fs.file.impl",
                org.apache.hadoop.fs.LocalFileSystem.class.getName()
        );

        hadoopConfig.set("fs.defaultFS","hdfs://localhost:9000");
        FileSystem fileSystem = FileSystem.get(hadoopConfig);
        boolean abc =  fileSystem.isDirectory(new Path(hdfsDirectory));
        System.out.println(abc);
        FileSystem localSystem = FileSystem.get(new Configuration());
        FSDataInputStream in1 = fileSystem.open(new Path(hdfsDirectory));
        FSDataOutputStream out1 = localSystem.create(new Path(fileDirectory));
        IOUtils.copyBytes(in1,out1,4096,false);
    //    FileUtils.copyInputStreamToFile();
    //    FileUtils.copyDirectory(fileSystem,localSystem);
    }
}
