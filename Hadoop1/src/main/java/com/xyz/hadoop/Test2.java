package com.xyz.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;

import org.apache.hadoop.io.*;
import java.io.*;
public class Test2 {
    public static void main(String[] args) throws Exception{
        String hdfsDirectory = "/test2/nirjhor.jpg";
        String fileDirectory = "/home/alinur/Downloads/nirjhor/n3";
  //      OutputStream out = new BufferedOutputStream(new FileOutputStream(fileDirectory));
   //     InputStream in = new BufferedInputStream(new FileInputStream(hdfsDirectory));
        Configuration hadoopConfig = new Configuration();
        hadoopConfig.set("fs.hdfs.impl",
                org.apache.hadoop.hdfs.DistributedFileSystem.class.getName()
        );
        hadoopConfig.set("fs.file.impl",
                org.apache.hadoop.fs.LocalFileSystem.class.getName()
        );

      //  hadoopConfig.set("fs.defaultFS","hdfs://localhost:9000");
        hadoopConfig.set("fs.defaultFS","hdfs://localhost:9000");
        FileSystem fileSystem = FileSystem.get(hadoopConfig);
        FileSystem localSystem = FileSystem.get(new Configuration());
        FSDataInputStream in1 = fileSystem.open(new Path(hdfsDirectory));
        FSDataOutputStream out1 = localSystem.create(new Path(fileDirectory));
        IOUtils.copyBytes(in1,out1,4096,false);
      // FileUtil.copy(fileSystem,new Path(hdfsDirectory),localSystem,new Path(fileDirectory),false,hadoopConfig);
    }
}
