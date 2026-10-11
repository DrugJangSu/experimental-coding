import java.util.HashMap;

public class MapBasic1 {
    public static void main(String[] args) {
        HashMap<String, Integer> prices = new HashMap<>();
        prices.put("coffee", 3000);
        prices.put("tea", 2500);
        prices.put("juice", 4000);

        System.out.println("tea=" + prices.get("tea"));
        System.out.println("size=" + prices.size());
        System.out.println("water=" + prices.get("water"));


    }
}
