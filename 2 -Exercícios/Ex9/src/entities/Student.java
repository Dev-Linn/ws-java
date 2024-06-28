package entities;

public class Student {
    public String nome;
    public double n1;
    public double n2;
    public double n3;
    
    
    public void passou(){
        double media = calcularMedia();
        
        if (media >= 60) {
            System.out.println(nome + " passou.");
        } else {
            double falta = 60 - media;
            System.out.println(nome + " não passou. Faltaram " + falta + " pontos para passar.");
        }
    }
    
    public double calcularMedia(){
       return n1 + n2 + n3;  
    }
}
