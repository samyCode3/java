public class method {
     public static void main(String[] args) {
         String name = "Ayomi";
         int x = 2;
         int y = 3;

         System.out.println(add(x,y));
         hello(name);
     }

     static void hello(String name) {
        System.out.println("Hello" + " " +  name);
     }

     static int add(int x, int y) {
        int z = x + y;
          return z;
     }
}
