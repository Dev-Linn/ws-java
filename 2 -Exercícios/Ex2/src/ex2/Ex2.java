
package ex2;

import java.util.Scanner;


public class Ex2 {

    
    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);
        
        int x , y;
        
        x = sc.nextInt();
        y = sc.nextInt();
        
        double soma = x + y;
        
        System.out.println("Dados Recebidos: ");
        
        
        
        System.out.println(x);
        System.out.println(y);
        
        System.out.printf("SOMA = %.0f " , soma);
        
        
        
        
        sc.close();




    }
    
}
