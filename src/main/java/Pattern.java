import java.util.Scanner;

public class Pattern {
    public static String constructor(int space, int star, boolean spaceFirst, boolean hourGlass) {
        StringBuilder spaces = new StringBuilder();
        StringBuilder stars = new StringBuilder();
        for (int i = 0; i < space; i++) {
            spaces.append(" ");
        }
        if (hourGlass) {
            for (int j = 0; j < star; j++) {
                stars.append("*");
                stars.append(" ");
            }
        }if (hourGlass == false) {
            for (int j = 0; j < star; j++) {
                stars.append("*");
            }
        }
            if (spaceFirst)
                return spaces.toString() + stars.toString();
            return stars.toString() + spaces.toString();
        }

  //  public static String hourGlassConstructor(int space, int star, boolean)
    public static void pattern1(){
        Scanner s = new Scanner(System.in);
        System.out.println("Input:- ");
        int x = s.nextInt();
        System.out.println("Pattern 1");
        for (int i = 0; i <= x; i++){
            System.out.println(constructor(0,i,false,false));
        }
    }
    public static void pattern2(){
        Scanner s = new Scanner(System.in);
        System.out.println("Input:- ");
        int x = s.nextInt();
        System.out.println("Pattern 2");
        for (int i = x; i > 0; i--)
            System.out.println(constructor(0,i,false,false));
    }
    public static void pattern3(){
        Scanner s = new Scanner(System.in);
        System.out.println("Input:- ");
        int x = s.nextInt();
        System.out.println("Pattern 3");
        int j = x - 1;
        for (int i = 0; i < x; i++){
            System.out.println(constructor(j,i,true,false));
            j--;
        }
    }
    public static void pattern4() {
        Scanner s = new Scanner(System.in);
        System.out.println("Input:- ");
        int x = s.nextInt();
        System.out.println("Pattern 4");
            int j = 0;
            for (int i = x; i > 0; i--) {
                System.out.println(constructor(j, i, true,false));
                j++;
            }
        }
    public static void pattern5() {
        Scanner s = new Scanner(System.in);
        System.out.println("Input:- ");
        int x = s.nextInt();
        System.out.println("Pattern 5");
        int j = x / 2;
        if (x % 2 == 1) {
            for (int i = 1; i <= x; i += 2) {
                System.out.println(constructor(j, i, true,false));
                j--;
            }
        } else {
            for (int i = 2; i <= x; i += 2){
                System.out.println(constructor(j,i,true,false));
                j--;
            }
        }
    }
    public static void hourglass() {
        Scanner s = new Scanner(System.in);
        System.out.println("Input:- ");
        int x = s.nextInt();
        System.out.println("Hourglass");
        int j = x / 2;
        int y = 0;

            for (int i = x; i > 1; i-- ){
                System.out.println(constructor(y,i,true,true));
                y++;
            }
            for (int i = 1; i <= x; i++ ) {
                System.out.println(constructor(y, i, true,true));
                y--;
            }
    }
}
