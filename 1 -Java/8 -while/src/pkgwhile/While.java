package pkgwhile;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        
        
        
        int soma = 0;
        
        
        while (x != 0) {
            soma = soma + x;
            x = sc.nextInt();
        }
        
        System.out.println("O número 0 foi adicionado");
        
        sc.close();
        
    }
    
}
