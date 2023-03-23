package homeJob_10;

import java.time.LocalDateTime;

public abstract class Product {
    private LocalDateTime productionDateTime;
    private LocalDateTime expirationDateTime;

    public Product(LocalDateTime productionDateTime, LocalDateTime expirationDateTime) {
        this.productionDateTime = productionDateTime;
        this.expirationDateTime = expirationDateTime;
    }

    public LocalDateTime getProductionDateTime() {
        return productionDateTime;
    }

    public LocalDateTime getExpirationDateTime() {
        return expirationDateTime;
    }

    public abstract boolean isGrocery();
}

