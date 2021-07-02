public class TwoDimensionalArray {
    public static void main(String args[]){
        int[][] arr = {{0,1,2,3,4,},{5,6,7,8,9},{10,11,12,13,14},{15,16,17,18,19}};
        for (int a = 0; a < arr.length; a++){
            for (int x = 0; x <arr[a].length; x++)
                System.out.print( "["+ a +" "+ arr[a][x]+ "}");
            System.out.println();
        }
        System.out.println();
    }
}
