import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Dog implements Comparator<Dog>, Comparable <Dog>, Serializable {
    private String name;
    private int age;
    Dog(){
    }
    Dog(String n, int a){
        name = n;
        age = a;
    }
    public String getDogName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int compareTo(Dog d){
        return this.age - d.age;
    }
    public int compare(Dog d1, Dog d2){
        return (d1.name.length()) -(d2.name.length());
    }
}
class Sorting {
    public static void main(String args[]){
        List<Dog>dogList = new ArrayList<Dog>();
        dogList.add(new Dog("Gheu",13));
        dogList.add(new Dog("paglu",2));
        dogList.add(new Dog("courage", 1));
        dogList.add(new Dog("Tommy", 4));
        Collections.sort(dogList);
        for (Dog a : dogList){
            System.out.println(a.getDogName() + " : " + a.getAge() +",");
        }
        Collections.sort(dogList);
        Collections.sort(dogList,new Dog());
        System.out.println(" ");
        for (Dog a : dogList){
            System.out.println(a.getDogName() +" : "+ a.getAge() + ", ");
        }
    }
}

