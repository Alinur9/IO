public class Generic1 {
    public static < E > void printArray(E []inputArray){
        for (E element : inputArray){
            System.out.printf("%s ", element );
        }
        System.out.println();
    }
    public static void main(String args[]){
        Integer[]intArray = {1,2,3,4,5,6};
        Double[]dArray = {1.1,2.2,4.4,3.3};
        Character[]charArray = {'1','2','3','4','5'};
        System.out.println("Integer Array contains: ");
        printArray(intArray);
        System.out.println("\ndArray contains: ");
        printArray(dArray);
        System.out.println("\ncharArray contains: ");
        printArray(charArray);
    }
}
