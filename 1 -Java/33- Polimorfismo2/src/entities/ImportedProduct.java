package entities;

public class ImportedProduct extends Product {

    private Double customFee;

    public ImportedProduct() {}

    public ImportedProduct(Double customFee) {
        this.customFee = customFee;
    }

    public ImportedProduct(String name, double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }

    public Double Fee() {
        return getPrice() + customFee;
    }

    public String priceTag() {
        return getName() + " $ " + String.format("%.2f", getPrice() + Fee()) + " (Customs fee: $ " + customFee + ")";
    }



}
