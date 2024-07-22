package entities;

public class Company extends Taxplayer {

    private Integer numberOfEmployees;

    public Company() {
        super();
    }

    public Company(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public Company(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double Tax() {
        double taxRate;
        if (numberOfEmployees > 10) {
            taxRate = 0.14;
        } else {
            taxRate = 0.16;
        }
        return getAnualIncome() * taxRate;
    }
}
