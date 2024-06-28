
package course2;


import entities.Progam;
import java.util.Locale;
import java.util.Scanner;


public class Course2 {

    
    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Progam db = new Progam();
        
        System.out.print("Nome:");
        db.name = sc.nextLine();
        
        System.out.print("Salário: ");
        db.salario = sc.nextDouble();
        
        System.out.print("Taixas: ");
        db.tax = sc.nextDouble();
        
        
        
        System.out.println(db.toString());       
       
        System.out.println("Whitch percentage to increase salary?");
        
        db.percentage = sc.nextDouble();
        
         
         System.out.println(db.toString1());
        
        
        
        
        
       
        
        

        
        
        
        sc.close();
        
    }
    
}
