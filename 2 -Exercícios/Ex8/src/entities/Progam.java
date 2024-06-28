package entities;

public class Progam {
    public String name;
    public double salario;
    public double tax;
    public double percentage;

    public double netSalary() {
        return salario - tax;
    }

    public double IncreaseSalary(){
        return netSalary() * (1 + (percentage / 100));
    }

    @Override
    public String toString() {
        return "Employee: " + name + ", $" + String.format("%.2f", netSalary());
    }

    public String toString1() {
        return "Updated data: Employee: " + name + ", $" + String.format("%.2f", IncreaseSalary());
    }
}
