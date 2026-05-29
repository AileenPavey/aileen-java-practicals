class Product {
    int id;
    String name;
    double price;

    // Static members (organization-level data)
    static String companyName = "ABC Pvt Ltd";
    static String gstNo = "GST12345";

    void getData(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Company: " + companyName);
        System.out.println("GST No: " + gstNo);
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

// Main class
public class ProductMain {
    public static void main(String[] args) {

        Product p[] = new Product[3]; // array of objects

        p[0] = new Product();
        p[0].getData(1, "Pen", 10);

        p[1] = new Product();
        p[1].getData(2, "Book", 50);

        p[2] = new Product();
        p[2].getData(3, "Bag", 500);

        // Display all products
        for(int i = 0; i < p.length; i++) {
            p[i].display();
        }
    }
}