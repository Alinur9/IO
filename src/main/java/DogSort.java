import java.util.Comparator;
import java.util.List;

public class DogSort {
    public static void sort(List<Dog1> x) {
        for (int i = 1; i < x.size(); i++) {
            Dog1 a1 = x.get(i);
            for (int j = 0; j < i; j++) {
                Dog1 a2 = x.get(j);
                int comp = a1.compareTo(a2); //-1
                if (comp < 0) {
                    Dog1 temp = x.get(i);
                 //   x.remove(i);
                    x.set(i, x.get(j));
                 //   x.remove(j);
                    x.set(j, temp);
                }
            }
        }

    }
    public static void comparator(List<Dog1> x, Comparator y){
        for (int i = 1; i < x.size(); i++){
            Dog1 a1 = x.get(i);
            for (int j = 0; j < i; j++){
                Dog1 a2 = x.get(j);
                int comp = y.compare(a1,a2);
                if (comp < 0){
                    Dog1 temp = x.get(i);
                    x.set(i, x.get(j));
                    x.set(j, temp);
                }
            }
        }
    }
}
