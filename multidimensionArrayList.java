import java.util.ArrayList;

public class multidimensionArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
        ArrayList<String> bakeryList = new ArrayList<String>();

        bakeryList.add("DavKem");

        ArrayList<String> product = new ArrayList<String>();
        product.add("test");

        list.add(bakeryList);
        list.add(product);
        System.out.println(list);

    
    }
}
