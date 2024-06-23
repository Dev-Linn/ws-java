package pkgfor;

import java.util.Scanner;


public class For {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int soma = 0;
        for (int i=0; i<N ;i++) { // i, se iniciou em 0, depois foi checado se i era menor que n, e logo depois incrementou 1 na variavel i deixando ela com o valor 1.
            int x = sc.nextInt();
            soma = soma + x;
        }
        
        
        System.out.println(soma);
        
        
        
        sc.close();
        
        
        
    }
    
}
