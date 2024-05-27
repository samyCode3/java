import java.util.Random;

public class DiceRoller {
    int number;
    Random random;
    // anything that is local is declared inside a method
    // anything that is global is declare outside the class
    DiceRoller() {
      random = new Random();
      number = 0;

    }

    void roll() {
       number =  random.nextInt(6)+1;
       System.out.println(number);
    }
}
