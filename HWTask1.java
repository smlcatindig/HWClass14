package class14;

import java.util.Scanner;

public class HWTask1 {
    /* Create a method that will say Hello in different language
    based on the country that will passed when method is executed.
     */
    void languageHello (String country) {
        if (country.equalsIgnoreCase("Philippines")) {
            System.out.println("Mabuhay");
        }
        if (country.equalsIgnoreCase("Spain")) {
            System.out.println("Hola");
        }
        if (country.equalsIgnoreCase("French")) {
            System.out.println("Bonjour");
        }
        if (country.equalsIgnoreCase("Japan")) {
            System.out.println("Konnichiwa");
        }
        if (country.equalsIgnoreCase("Saudi Arabia")) {
            System.out.println("Ahlan");
        }
    }

    public static void main(String[] args) {
        HWTask1 hw=new HWTask1();
        String languageHello="Philippines";
        hw.languageHello(languageHello);



    }
}
