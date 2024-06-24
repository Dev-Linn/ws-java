package application;

import entities.Area;
import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Progam {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
       
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();
        
        System.out.println("Coloque as medidas do triangulo x");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        
        System.out.println("Coloque as medidas do triangulo y");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        
        double areaX = x.area();
        double areaY = y.area();
        
         
        
        System.out.printf("Triangulo x area: %.4f%n" , areaX);
        System.out.printf("Triangulo y area: %.4f%n" , areaY);
        
        if (areaX > areaY) {
            System.out.println("A maior area é do X");
        } else {
                    System.out.println("A maior area é do Y");

        }
        
        
        sc.close();
        
    } 
    
    
}
