import javax.imageio.IIOException;
import java.io.File;
import java.util.List;

public class FileSort {
    public static void size(List<File> x) {
        for (int i = 1; i < x.size(); i++) {
            File a1 = x.get(i);
            for (int j = 0; j < i; j++) {
                File a2 = x.get(j);
               BackgroundFileSort bfs = new BackgroundFileSort();
                int comp = bfs.compare(a1, a2);
                if (comp < 0) {
                    File temp = x.get(i);
                    x.set(i, x.get(j));
                    x.set(j, temp);
                }
            }
        }
    }
    public static void name(List<File> x)  {
            for (int i = 1; i < x.size(); i++) {
                File a1 = x.get(i);
                for (int j = 0; j < i; j++) {
                    File a2 = x.get(j);
                    int comp = BackgroundFileSort.getName(a1, a2);
                    if (comp < 0) {
                        File temp = x.get(i);
                        x.set(i, x.get(j));
                        x.set(j, temp);
                    }
                }
            }
    }
    public static void lastModified(List<File> x) {
        for (int i = 1; i < x.size(); i++) {
            File a1 = x.get(i);
            for (int j = 0; j < i; j++) {
                File a2 = x.get(j);
                int comp = BackgroundFileSort.getLastModified(a1, a2);
                if (comp < 0) {
                    File temp = x.get(i);
                    x.set(i, x.get(j));
                    x.set(j, temp);
                }
            }
        }
    }
}




