package ex5;

import java.util.Scanner;


public class Ex5 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de números que você desja.");
        int N = sc.nextInt();
        
        int DentroDoIntervalo = 0;
        int ForaDoIntervalo = 0;
        
        
        for (int i = 0; i < N; i++) {
            System.out.println("Digite o próximo número: ");
            int x = sc.nextInt();
            
            if(x >= 10 && x <= 20) {
                DentroDoIntervalo++;
            } else {
            ForaDoIntervalo++;            
        } 
    }
    
        System.out.printf("Numeros fora do intervalo: %s%n" , ForaDoIntervalo);
        System.out.printf("Numeros dentro do intervalo: %s%n" , DentroDoIntervalo);

        
        sc.close();
    }
}
