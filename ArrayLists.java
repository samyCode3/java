import java.util.ArrayList;

public class ArrayLists {
    
    public static void  main(String[] args) {
          ArrayList<String> food = new ArrayList<String>();
          food.add("Amala");
          food.add("egusi");
          food.add("noodle");

          food.set(0, "tuwo");
          food.remove(2);
          food.clear();

          for(int i = 0; i < food.size(); i++) {
             System.out.println(food.get(i));
          }
    }
}
