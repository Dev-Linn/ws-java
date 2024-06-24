package saidadedados;

import java.util.Locale;



public class SaidaDeDados {

   
    public static void main(String[] args) {
        
        int y =32;
        double x = 10.35784;
        
        System.out.println("Bom dia");
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n" , x); // FORMATAÇÃO
        System.out.printf("%.4f%n" , x); // FORMATAÇÃO
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n" , x); // FORMATAÇÃO
        
        System.out.println("RESULTADO - " + x + " METROS");
        System.out.printf("RESULTADO = %.2f metros%n", x); //X MUDA PARA %.2F
        
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.0f reais %n" , nome, idade, renda); // MUDANDO AS 3 VARIAVEIS PARA O %.x
        
    }
    
}
