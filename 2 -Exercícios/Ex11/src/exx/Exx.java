
package exx;

import entities.Utils;
import java.util.Locale;
import java.util.Scanner;

public class Exx {

    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        Utils utils;
        
        System.out.println("digite o número da conta bancária: ");
        int number = sc.nextInt();
        
        System.out.println("digite o nome do dono da conta: ");
        sc.nextLine();
        String holder = sc.nextLine();
        sc.nextLine();
        System.out.println("Deseja fazer um deposito inicial (y/n): ");
        char response = sc.next().charAt(0);
        
        if (response == 'y') {
            System.out.println("Entre com um valor inicial");
            double initialDeposit = sc.nextDouble();
            utils = new Utils(number, holder, initialDeposit);
        } 
        
        else {
            utils = new Utils(number, holder);
        } 
        
        System.out.println();
        System.out.println("Account data:");
        System.out.println(utils);
        
        System.out.println();
        System.out.println("Enter a deposit value ");
        double depositValue = sc.nextDouble();
        utils.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(utils);
        
                System.out.println();
        System.out.println("Enter a whithdraw value ");
        double whithdrawValue = sc.nextDouble();
        utils.whithdraw(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(utils);
          
        
        sc.close();
        
        
    }
    
}
