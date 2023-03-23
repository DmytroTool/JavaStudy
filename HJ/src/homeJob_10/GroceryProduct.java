package homeJob_10;
import java.time.LocalDateTime;
public class GroceryProduct extends Product {
    public GroceryProduct(LocalDateTime productionDateTime, LocalDateTime expirationDateTime) {
        super(productionDateTime, expirationDateTime);
    }

    @Override
    public boolean isGrocery() {
        return true;
    }
}

