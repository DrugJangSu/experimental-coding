import java.util.ArrayList;
import java.util.HashMap;

public class Market {
    ArrayList<Product> products = new ArrayList<Product>();
    HashMap<Integer, Product> map = new HashMap<Integer, Product>();

    void addProduct(Product product) {
        products.add(product);
        map.put(product.no, product);

    }

    void printAll() {
        for (Product product : products) {
            product.printInfo();
        }
    }

    void printOne(int no) {
        if (map.containsKey(no)) {
            map.get(no).printInfo();
        } else {
            System.out.println("not found");
        }
    }

    void updatePrice(int no, int newPrice) {
        if (newPrice < 0) {
            System.out.println("invalid price");
        } else if (!map.containsKey(no)) {
            System.out.println("not found");
        } else {
            map.get(no).price = newPrice;
            System.out.println("updated");
        }
    }

    void deleteProduct(int no) {
        if (!map.containsKey(no)) {
            System.out.println("not found");
        } else {
            Product target = map.get(no);
            map.remove(no);
            products.remove(target);
            System.out.println("deleted");
        }
    }

    ArrayList<Product> findAllByCategory(String category) {
        ArrayList<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.category.equals(category)) {
                result.add(product);
            }
        }
        return result;
    }

    void printByCategory(String category) {
        ArrayList<Product> found = findAllByCategory(category);
        if (found.isEmpty()) {
            System.out.println("no product");
        } else {
            for (Product product : found) {
                product.printInfo();
            }
        }
    }

}
