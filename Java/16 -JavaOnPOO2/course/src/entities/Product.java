package entities;

public class Product {

    public String name;
    public double price;
    public double quantidade;

    public double totalValueInStock() {

        return price * quantidade;

    }

    public void addProducts(int quantidade) {

        this.quantidade += quantidade;

    }

    public void removeProducts(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", " + String.format("%.0f", quantidade)
                + " unidades, Total: $"
                + String.format("%.2f", totalValueInStock());
    }

}
