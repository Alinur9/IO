import java.util.Comparator;

public class DogCompare implements Comparator<Dog1> {
    @Override
    public int compare(Dog1 a1, Dog1 a2) {
        return a1.getAge() - a2.getAge();
    }
}
