package homeJob_10;
import java.time.LocalDateTime;
public class ProductFactory {
    private static int groceryProductCount = 0;
    private static int nonGroceryProductCount = 0;

    public static Product createProduct(boolean isGrocery, LocalDateTime productionDateTime, LocalDateTime expirationDateTime) {
        Product product;
        if (isGrocery) {
            product = new GroceryProduct(productionDateTime, expirationDateTime);
            groceryProductCount++;
        } else {
            product = new NonGroceryProduct(productionDateTime, expirationDateTime);
            nonGroceryProductCount++;
        }
        return product;
    }
    public static int getGroceryProductCount() {
        return groceryProductCount;
    }

    public static int getNonGroceryProductCount() {
        return nonGroceryProductCount;
    }
}



