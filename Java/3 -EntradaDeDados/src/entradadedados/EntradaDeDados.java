
package entradadedados;




import java.util.Locale;
import java.util.Scanner;


public class EntradaDeDados {

    
    public static void main(String[] args) {
        
       /*
        Scanner:
        next();
        nextInt();
        nextDouble();
        next().charAt(0) // Seleciona a primeira letra

        Locale:
        Locale.setDefault(Locale.US); // e fazer o import
        
        Como ler até a quebra de linha:
        nedtLine();
        
        Como limpar o buffer de leitura:
        sc.nextline(); antes do buffer
        
        
        */
     
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int x;
        String s1, s2, s3;
        
        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
                
        
        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2); 
        System.out.println(s3); 
        
        
        sc.close();
        
    }
    
}
