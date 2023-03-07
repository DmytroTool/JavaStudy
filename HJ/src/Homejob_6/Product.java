package Homejob_6;

public class Product {
    private String name;
    private String articleNumber;
    private double price;
    private String description;
    private boolean presence;

    public Product(String name, String articleNumber, double price, String description, boolean presence) {
        this.name = name;
        this.articleNumber = articleNumber;
        this.price = price;
        this.description = description;
        this.presence = presence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(String articleNumber) {
        this.articleNumber = articleNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPresence() {
        return presence;
    }

    public void setPresence(boolean presence) {
        this.presence = presence;
    }
}

