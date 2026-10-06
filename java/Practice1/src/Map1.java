import java.util.HashMap;

public class Map1 {
    public static void main(String[] args) {
        HashMap<String, Integer> prices = new HashMap<>();

        prices.put("americano", 4500);
        prices.put("kimbap", 4000);
        prices.put("water", 1000);

        System.out.println(prices.get("kimbap"));
        System.out.println(prices.containsKey("cookie"));

    }
}
