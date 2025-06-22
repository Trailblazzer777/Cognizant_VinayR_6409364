public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Sneakers", "Footwear"),
            new Product(3, "Book", "Education"),
            new Product(4, "Smartphone", "Electronics")
        };

        System.out.println("Linear Search Result:");
        Product p1 = LinearSearch.search(products, "Sneakers");
        System.out.println(p1 != null ? p1 : "Not Found");

        System.out.println("\nBinary Search Result:");
        Product p2 = BinarySearch.search(products, "Book");
        System.out.println(p2 != null ? p2 : "Not Found");
    }
}
