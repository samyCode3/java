public class printfMethod {
     public static void main(String[] args) {
        // System.err.printf("%d This is a format", 123);
        boolean myBoolean = true;
        char mychar = '@';
        String myString =  "Bro";
        int myint = 50;
        double myDouble = 10000;
       

        // System.out.printf("%b", myBoolean);
        // System.out.printf("%c", mychar);
        // System.out.printf("%s", myString);
        // System.out.printf("%d", myint);
        // System.out.printf("%b", myDouble);

        System.out.printf("Hello %-10s", myString);

        // Precision Method

        System.out.printf("You have this much money %.2f", myDouble);

         //Flaging  Method

         System.out.printf("You have this much money %,.2f", myDouble);


     }
}
