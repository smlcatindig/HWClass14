package class14;

public class HWTask2 {
    /* Create a method createEmail(). Based on values of users firstName,
    lastName and email type, your method should return complete email Address.
    Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
     */
    String  createEmail(String firstName, String lastName, String emailType){
        String emailAddress=firstName+lastName+"@"+emailType+".com";
        return emailAddress.toLowerCase();
    }

    public static void main(String[] args) {
        HWTask2 obj=new HWTask2();
        String email=obj.createEmail("Suzy", "Catindig","gmail");
        System.out.println(email);
    }
}
