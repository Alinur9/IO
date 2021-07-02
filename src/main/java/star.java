
public class star
{

    public static String getLine(int space,int star, boolean spaceFirst){
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for (int j = 0; j< space ; j++){
            a.append(" ");
        }

        for ( int x = 0; x <star ; x ++){
            b.append("*");
        }

         if(spaceFirst)
        return     a.toString() + b.toString();
        return b.toString() + a.toString();
    }
    public static void main(String[] args)

    {
        int len = 5;
        for (int i = 0; i < 5; i++)
        {
//            System.out.println(" ");

//            System.out.println(getLine(i, 5-i, true));

//            for (int j = 1; j <= i; j++)
//            {
//                System.out.print(" ");
//            }
//            for (int k = 5; k > i; k--)
//            {
//                System.out.print("*");
//            }

        }
//        System.out.println(getLine(3,1,true));
//        System.out.println(getLine(2,3,true));
//        System.out.println(getLine(1,5,true));
//        System.out.println(getLine(0,7,true));

        int n  = 11;
        int med = (n/2) + 1; //4

        System.out.println(med);

        boolean isEven = (n%2) == 0;

//        int loop = isEven? med -1 : med;


        int space = isEven ? med-2 :  med -1; //3 -> -1;
        int star = isEven? 2 : 1; // -> +1

        int lines = space +1;

        for (int x =0; x< lines; x++){

            System.out.println(getLine(space, star, true));
            space -=1;
            star +=2;
        }




    }
}
