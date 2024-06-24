package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Product product = new Product();
        System.out.print("Data: ");
        
        System.out.println("Name:");
        product.name = sc.nextLine();
        
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        
        System.out.print("Quantity: ");
        product.quantidade = sc.nextInt();
        
        
        
        System.out.printf("Product data: %n" + product);
        
        System.out.println();       
        System.out.println("Entre com o número de produtos para serem adicionados ao estoque: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        
        System.out.printf("Updated data: %n" + product);
        
        System.out.println();
        System.out.println("Entre com o número de produtos que você quer remover do estoque: ");
        int removeQuantity = sc.nextInt();
        product.removeProducts(removeQuantity);
        
        System.out.printf("Updated data: %n" + product);
        
        sc.close();
        
    }
    
}
