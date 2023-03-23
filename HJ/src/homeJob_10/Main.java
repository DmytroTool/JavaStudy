package homeJob_10;
import java.time.LocalDateTime;
public class Main {
    public static void main(String[] args) {
        // Create some products using the constructor
        Product product1 = new GroceryProduct(LocalDateTime.now(), LocalDateTime.now().plusDays(7));
        Product product2 = new NonGroceryProduct(LocalDateTime.now(), LocalDateTime.now().plusYears(1));

        // Create some products using the factory
        Product product3 = ProductFactory.createProduct(true, LocalDateTime.now(), LocalDateTime.now().plusDays(14));
        Product product4 = ProductFactory.createProduct(false, LocalDateTime.now(), LocalDateTime.now().plusMonths(6));

        // Print the number of products created
        System.out.println("The factory produced " + ProductFactory.getGroceryProductCount() + " food products");
        System.out.println("The factory produced " + ProductFactory.getNonGroceryProductCount() + " non-food products");
        System.out.println("A total of " + (ProductFactory.getGroceryProductCount() + ProductFactory.getNonGroceryProductCount()) + " products were created");
    }
}

