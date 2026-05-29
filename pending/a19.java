import java.util.*;

class a19 {
    public static void main(String[] args) {

        //  ArrayList for products
        ArrayList<String> products = new ArrayList<>();
        products.add("Laptop");
        products.add("Mobile");
        products.add("Tablet");

        //  HashSet for unique categories
        HashSet<String> categories = new HashSet<>();
        categories.add("Electronics");
        categories.add("Gadgets");
        categories.add("Electronics"); // duplicate ignored

        //  HashMap for product-price
        HashMap<String, Integer> priceMap = new HashMap<>();
        priceMap.put("Laptop", 50000);
        priceMap.put("Mobile", 20000);
        priceMap.put("Tablet", 15000);

        //  Display products using Iterator
        System.out.println("Products:");
        Iterator<String> it = products.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //  Display categories
        System.out.println("\nCategories:");
        for (String c : categories) {
            System.out.println(c);
        }

        //  Display product-price mapping
        System.out.println("\nProduct Prices:");
        for (Map.Entry<String, Integer> entry : priceMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}