//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.Vector;
//
//public class Directory_Compare {
//    public void directoryCompare(Directory1 x)throws IOException {
//        String string1 = getNames(path);
//        String string2 = getNames(x.path);
//        if (!string1.equals(string2)){
//            System.out.println("The Directories are not same!");
//            return;
//        }
//        Vector v1 = x.getVector(x.path);
//        v = getVector(path);
//        int len1 = v.size();
//        int len2 = v1.size();
//        if (len1 != len2){
//            System.out.println("The Directories are not same!");
//            return;
//        }
//        boolean same = true;
//
//        for (Object children1 : v) {
//
//            String s1 = children1.toString();
//            File file1 = new File(s1);
//            InputStream stream1 = new FileInputStream(file1);
//            for (Object children2 : v1) {
//                String s2 = children2.toString();
//                File file2 = new File(s2);
//                InputStream stream2 = new FileInputStream(file2);
//
//                int read1;
//                int read2;
//                while ((read1 = stream1.read()) != -1) {
//                    read2 = stream2.read();
//                    if (read1 != read2){
//                        same = false;
//                        break;
//                    }
//                }
//            }
//        }
//        if (same){
//            System.out.println("The Directories are same!");
//        }else {
//            System.out.println("The Directories are not same!");
//        }
//    }
//}
