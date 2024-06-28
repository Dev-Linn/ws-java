package ex10;

import java.util.Locale;
import java.util.Scanner;
import utils.Converter;

public class Ex10 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual é a cotação do dólar?");
        double dollarRate = sc.nextDouble();
        
        System.out.println("Quantos dólares você deseja comprar?");
        double dollarAmount = sc.nextDouble();
        
        double totalInReais = Converter.convert(dollarRate, dollarAmount);
        
        System.out.printf("O valor com 6%% a mais é: %.2f%n", totalInReais);
        
        sc.close();
    }
}
