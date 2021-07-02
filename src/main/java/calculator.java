public class calculator {
     public static void main (String args[]) {
        String a1 = args[0];
        String a2 = args[1];
        System.out.println("Input:" + a1 + " + " + a2);
        int k = a1.length();
        int y = a2.length();
        int i = 1;
        int x = 1;
        int j = 1;
        int total = 0;

        char carry = '1';
        int system = 105;
        int [] show = {'v','0','1','2','3','4','5','6','7','8','9'};
        int n4c = '0';

        int temp = 0;
        int n3c = '0';
        Character n1c = null;
        Character n2c = null;
        int result = 0;

        while (i <= k || x <= y) {

            try {
                n1c = a1.charAt(k - i);
            }
            catch (StringIndexOutOfBoundsException e1){
                n1c = '0';
            }
            try {
                n2c = a2.charAt(y - x);
            }
            catch (StringIndexOutOfBoundsException e2){
                n2c = '0';
            }

            if (temp > 0){
                n3c =  (n1c + n2c) + 1;
            }
            else {
                n3c = n1c + n2c;
            }


            if (n3c > system){
                temp =  (n3c - system);
                int t  = show[temp];
                n4c = t - '0';
                //n3c =  (n3c+ 1);
            }

            else {
                n4c = (char) (n3c - 96);
                temp = 0;

            }

            int n4 =  n4c;

            i += 1;
            x += 1;


            total = n4;
            result += n4;

            System.out.println(total);
        }
        if (temp > 0){
            System.out.println(1);
        }


    }
}

