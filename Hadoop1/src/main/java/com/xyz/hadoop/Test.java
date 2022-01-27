package com.xyz.hadoop;

import org.apache.hadoop.hdfs.server.namenode.NameNode;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.io.IOUtils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import org.apache.hadoop.hdfs.DistributedFileSystem;
import java.io.OutputStream;
import java.net.URI;

public class Test {
    public static void main(String[] args) throws Exception{
  //      String destiny = "/test2";
       // String fileDirectory = "/home/alinur/Downloads/nirjhor.jpg";
        String destiny = "/test2/nirjhor.jpg";
        String fileDirectory = "/home/alinur/Downloads/nirjhor/";
 //       InputStream in = new BufferedInputStream(new FileInputStream(fileDirectory));
        Configuration hadoopConfig = new Configuration();
        hadoopConfig.set("fs.hdfs.impl",
                org.apache.hadoop.hdfs.DistributedFileSystem.class.getName()
        );
        hadoopConfig.set("fs.file.impl",
                org.apache.hadoop.fs.LocalFileSystem.class.getName()
        );

        hadoopConfig.set("fs.defaultFS","hdfs://localhost:9000");
        hadoopConfig.set("fs.defaultFS","hdfs://localhost:9000");
        FileSystem fileSystem = FileSystem.get(hadoopConfig);
        FileSystem localSystem = FileSystem.get(new Configuration());
        FileUtil.copy(fileSystem,new Path(destiny),localSystem,new Path(fileDirectory),false,hadoopConfig);
  //      FileUtil.copy(localSystem,new Path(fileDirectory),fileSystem,new Path(destiny),false,hadoopConfig);
        //1st method
        //   System.out.println("Connecting to -- "+configuration.get("fs.defaultFS"));
//
//            OutputStream out = fileSystem.create(new Path(destiny));
//           IOUtils.copyBytes(in,out,4096,true);
        //    FileSystem fileSystem = FileSystem.get(URI.create(destiny),hadoopConfig);
        //



    }
}
