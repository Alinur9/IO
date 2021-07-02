import java.util.Comparator;

public class Dog1 implements Comparable <Dog1> {
    private String name;
    private int age;

    Dog1() {
    }

    Dog1(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public int compareTo(Dog1 d1) {
        return this.getName().length() - d1.getName().length();

    }
}


  //  List b = new ArrayList();
  //  b= {gheeu,paglu,courage,tommy};




