package CafePackage;

import java.util.HashMap;

public class CafeOrders {
    public static void main(String[] args) {
        HashMap<String, String> orders = new HashMap<>();
        orders.put("mina", "americano");
        orders.put("jun", "kimbap");
        orders.put("sora", "latte");

        System.out.println("size=" + orders.size());
        System.out.println("mina=" + orders.get("mina"));
        System.out.println("unknown=" + orders.get("unknown"));

        orders.put("mina", "cookie");
        System.out.println("mina=" + orders.get("mina") + " size=" + orders.size());

        String name = "jun";
        if (orders.containsKey(name)) {
            System.out.println("menu=" + orders.get(name));
        } else {
            System.out.println("missing");
        }

        for (String key : orders.keySet()) {
            System.out.println(key + "=" + orders.get(key));
        }
    }
}