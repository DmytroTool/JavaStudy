package homeJob_10;
import java.time.LocalDateTime;
public class NonGroceryProduct extends Product {
    public NonGroceryProduct(LocalDateTime productionDateTime, LocalDateTime expirationDateTime) {
        super(productionDateTime, expirationDateTime);
    }

    @Override
    public boolean isGrocery() {
        return false;
    }
}

