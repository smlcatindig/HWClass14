package class14;

public class E5ArrayUtils {
    /* create a method call it contains it should take an array of int and an int number in the method body
    it should search the array for that number if number is present in the array method should return true,
    otherwise method should return false in the separate class call the method and test it for below input
    {10,20,45} number 20 15
     */

    /* return type => boolean
    name of method => contains
    parameters => int[] arr, int num
    body {

    }
     */

    boolean contains(int[] arr, int num) {
        boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                isFound = true;
            }
        }
        return isFound;
    }

    public static void main(String[] args) {
        int[] arr={10,20,45};
        int number=20;
        E5ArrayUtils obj=new E5ArrayUtils();
        boolean result=obj.contains(arr,number);
        System.out.println(result);

    }
}
