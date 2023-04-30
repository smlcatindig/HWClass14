package class14;

public class HWTask3 {
    /* Write a method to return whether given number is prime or not?

     */
    boolean isPrime(int number) {
        boolean p = true;
        if (number < 2) {
            p = false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                p = false;
                break;
            }
        }
        return p;
    }
    public static void main(String[] args) {
    HWTask3 obj=new HWTask3();
        System.out.println(obj.isPrime(22));
    }
}
