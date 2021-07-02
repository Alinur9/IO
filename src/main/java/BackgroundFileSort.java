import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;

public class BackgroundFileSort implements Comparator <File> {
    @Override
    public int compare(File a1, File a2) {
        long l = 0;
        try {
            l = Files.size(a1.toPath()) - Files.size(a2.toPath());
        }finally {
            return (int) l;
        }
    }
    public static int getName(File a1, File a2) {

            return a1.getName().compareTo(a2.getName());
    }
    public static int getLastModified(File a1, File a2){

        return (int) (a1.lastModified() - a2.lastModified());
    }



}

