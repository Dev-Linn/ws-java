
package entities;


public class Retangulo {
    
    public double Altura;
    public double Largura;
    
    
    
    
    public double area(){
        return Largura * Altura;
    }
    
    public double perimetro(){
        return 2* (Largura + Altura);
    }
    
    public double diagonal() {
        return Math.sqrt(Math.pow(Largura, 2) + Math.pow(Altura, 2));
    }
    
  
    public String toString() {
        return "AREA = "
                + String.format("%.2f%n", area())
                + "PERIMETER = "
                + String.format("%.2f%n", perimetro())
                + "DIAGONAL = "
                + String.format("%.2f%n", diagonal());
                
    
    
    
}
}
