import java.util.Scanner;
public class nestedLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       int rows;
       int column;
       String symbol = "";

      System.out.println("Enter number of rows: ");
      rows = scanner.nextInt();
      System.out.println("Enter number of column: ");
      column = scanner.nextInt();
      System.out.println("Enter sysbol to use: ");
      symbol = scanner.next();

      for(int i = 0; i <= rows; i++) {
            System.out.println();
            for(int j = 0; j <= column; j++) {
                System.out.print(symbol);
            }
      }
    }
}
