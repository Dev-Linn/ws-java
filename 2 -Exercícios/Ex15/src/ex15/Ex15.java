package ex15;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Ex15 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos serão alugados? ");
        int n = sc.nextInt();
        int room = 0;    
        Rent[] vect = new Rent[10];
        
       

        
        
        for (int i = 0; i < n; i++) {
            System.out.println();
            room = room + 1;
            System.out.println("Rent #" + room + ":");
            
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();
            
            vect[roomNumber] = new Rent(name, email);
            
            
        }
        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
            System.out.println(i + " :" + vect[i]);    
            }
            
            System.out.println("Email: ");
        }
            
        sc.close();
    }
}
