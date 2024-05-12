import java.util.Scanner;
public class stringClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         String password = "";
         String phone = "08121241240";

         while (password.isEmpty()) {

         System.out.println("Enter your password");
          password =scanner.nextLine();
         }
    
         if(password.equals("Ayomi")) {
            System.out.println("Password is correct");
         } else {
            System.out.println("Password is incorrect");
         }
         int re = phone.indexOf("0");
         String result = phone.replace('0', '4');
         System.out.println(result + " "  + re);
         
        //  boolean result = name.equals(name)
    }
}
