import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class SortTest {
    public static void main(String[] args) {
        List<Dog1> dogList = new ArrayList<Dog1>();
        dogList.add(new Dog1("gheuuu", 13));
        dogList.add(new Dog1("paglu", 2));
        dogList.add(new Dog1("courage", 1));
        dogList.add(new Dog1("tommy", 4));
        DogSort.sort(dogList);
    //    System.out.println("Comparable");
        //   for (Dog1 a : dogList) {
        //  System.out.println(a.getName() + " : " + a.getAge());
        DogCompare x = new DogCompare();

        DogSort.comparator(dogList,x);
        System.out.println("Comparator");
          for (Dog1 a : dogList)
           System.out.println(a.getName() + " : " + a.getAge());
        List<File> FileList = new ArrayList<File>();
        FileList.add(new File("C:\\Users\\Adnan\\IdeaProjects\\IO\\src\\FileSort1"));
        FileList.add(new File("C:\\Users\\Adnan\\IdeaProjects\\IO\\src\\FileSort25"));
        FileList.add(new File("C:\\Users\\Adnan\\IdeaProjects\\IO\\src\\FileTort1"));
        FileList.add(new File("C:\\Users\\Adnan\\IdeaProjects\\IO\\src\\FileSort34"));
        FileSort.size(FileList);
      //  System.out.println("size");
    //   for (File a : FileList)
    //        System.out.println(a.getName());
        FileSort.name(FileList);
     //   System.out.println("name");
    //    for (File a : FileList)
    //        System.out.println(a.getName());
        FileSort.lastModified(FileList);
     //   System.out.println("lastModified");
    //    for (File a : FileList)
    //        System.out.println(a.getName());

    }

}
