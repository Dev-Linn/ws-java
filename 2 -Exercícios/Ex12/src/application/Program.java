package application;

import java.util.Locale;
import java.util.Scanner;


public class Program {
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        
        
        
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        
        int[] vetor = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            if (vetor[i] < 0) {
                System.out.println("Os números menores que 0 são:" + vetor[i]);
            }
        }
      
        
        
        
        
        sc.close();
    }
    
}
