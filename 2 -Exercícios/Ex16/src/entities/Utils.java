package entities;


public class Utils {

    private Integer Id;
    private String name;
    private Double salario;

    public Utils(Integer Id, String name, Double salario) {
        this.Id = Id;
        this.name = name;
        this.salario = salario;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    @Override
    public String toString() {
        return "Id: " + Id + ", Name: " + name + ", Salary: " + salario;
    }
    
    public static String toString1(){
        return "ERRO";
    }
    
}
    

