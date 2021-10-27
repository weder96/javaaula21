package PackOCP11JavaClassDesign.Study05.products;

import java.time.LocalDate;

public class Product {
    private String name;
    private double weight;
    private LocalDate expirationDate;

    public Product(String name, double weight, LocalDate expirationDate) {
        this.name = name;
        this.weight = weight;
        this.expirationDate = expirationDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return this.name;
    }

    public double getWeight() {
        return this.weight;
    }

    public LocalDate getExpirationDate() {
        return this.expirationDate;
    }
}
