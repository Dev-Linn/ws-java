
package course;

import entities.Retangulo;
import java.util.Locale;
import java.util.Scanner;


public class Course {

    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);        
        Retangulo retangulo = new Retangulo();
        
        double Altura;
        double Largura;
        double Diagonal;
        
        System.out.println("Enter rectangle width and height: ");        
               
        retangulo.Largura = sc.nextDouble();
        retangulo.Altura = sc.nextDouble();
        
        System.out.println(retangulo.toString());
        
        
        
        sc.close();
        
        
    }
    
}
