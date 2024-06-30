package entities;

public class Utils {
    
    private int number;
    private String holder;
    private double balance;

    public Utils(int numer, String holder) {
        this.number = numer;
        this.holder = holder;
    }

    public Utils(int numer, String holder, double initialDeposit) {
        this.number = numer;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(double amount) {
        balance += amount;
    }
    
    public void whithdraw(double amount){
        balance -= amount  + 5.0;
    }
    
    public String toString(){
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
                
    }
    
    
    
}
