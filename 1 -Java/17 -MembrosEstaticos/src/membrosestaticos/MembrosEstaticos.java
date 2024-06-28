package membrosestaticos;

import java.util.Locale;
import java.util.Scanner;
import utils.Calculator;


public class MembrosEstaticos {

   

  
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.println("Coloque o valor do raio: ");
        double radius = sc.nextDouble();
        
        double c = Calculator.circumference(radius);
        
        double v = Calculator.volume(radius);
        
        System.out.printf("Circunfecnia:  %.2f%n" , c);
        System.out.printf("Circunfecnia:  %.2f%n" , v);
        System.out.printf("Circunfecnia:  %.2f%n" , Calculator.PI);
        
        
        
        
        
        
        sc.close();
    }
        
        
        
    }
    

