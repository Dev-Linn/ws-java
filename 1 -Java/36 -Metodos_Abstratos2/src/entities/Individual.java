package entities;

public class Individual extends Taxplayer {

    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double Tax() {
        double basicTax;
        if (getAnualIncome() < 20000.00) {
            basicTax = getAnualIncome() * 0.15;
        } else {
            basicTax = getAnualIncome() * 0.25;
        }
        double healthDeduction = healthExpenditures * 0.50;
        return basicTax - healthDeduction;
    }
}
