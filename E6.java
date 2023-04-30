package class14;

public class E6 {
    /* create a method which returns true or false and takes an int number as a parameter if
    number is even it returns true otherwise it returns false. Name of method should be isEven.
     */

    boolean isEven(int num){
       boolean isNumEven=false;
       if(num%2==0){
            isNumEven=true;
        }
        return isNumEven;

       // return num%2==0;
    }

    public static void main(String[] args) {
        E6 obj=new E6();
        System.out.println(obj.isEven(2));

    }
}
