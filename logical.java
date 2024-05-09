import java.util.Scanner;

public class logical {
    public static void main(String[] args) {
      // A simple quitting method in java 

       Scanner scanner =  new Scanner(System.in);
       System.out.println("Press q or Q to quit the game");
       String response = scanner.next();

       if(response.equals("q") || response.equals("Q")) {
            System.out.println("Come back next to play our game");
       } else {
           System.out.println("You have chooe to continue this game.. thank u");
       }

       
    }
}
