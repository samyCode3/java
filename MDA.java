public class MDA {
    public static void main(String[] args) {
      //2d array or multidimession arrays 

      String[][] cars = new String[3][3];
      cars[0][0] = "camaro";
      cars[0][1] = "Corvette";
      cars[0][2] = "Silverado";
      cars[1][0] = "benz";
      cars[1][1] = "ranger";
      cars[1][2] = "mustang";
      cars[2][0] = "Farrari";
      cars[2][1] = "Lambo";
      cars[2][2] = "Tesla";
      
      for(int i=0;  i<cars.length; i++) {
           System.out.println();
           for(int j = 0; j<cars[i].length; j++) {
            System.out.println(cars[i][j]+"");
           }
      }
    }
}
