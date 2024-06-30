package javaapplication61;

import java.util.Locale;
import java.util.Scanner;


public class JavaApplication61 {

    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n;
        double soma , media;
        
        System.out.println("Quantos números você vai digitar?");
        n = sc.nextInt();
        
        double[] vetor = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número");
            vetor[i] = sc.nextDouble();
            
        }
        
        soma = 0;
        for (int i = 0; i < n; i++) {
            
            soma = soma + vetor[i];
        }
        
        media = soma / n;
        
        
            for (int i = 0; i < n; i++) {
            System.out.printf("numeros: %.1f%n "  , vetor[i]);
        }
            
        System.out.printf("soma: %.1f%n "  , soma);
        System.out.printf("media: %.1f%n "  , media);
        
        sc.close();
        
    }
    
}
