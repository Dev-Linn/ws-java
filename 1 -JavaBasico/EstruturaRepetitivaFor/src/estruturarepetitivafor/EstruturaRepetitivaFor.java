package estruturarepetitivafor;

import java.util.Scanner;

public class EstruturaRepetitivaFor {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o número de inteiros que você deseja somar:");
        int N = sc.nextInt();
        
        int soma = 0;
        
        System.out.println("Digite os " + N + " inteiros:");
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            soma = soma + x;
        }
        
        System.out.println("A soma é: " + soma);
        
        sc.close();
    }
}
