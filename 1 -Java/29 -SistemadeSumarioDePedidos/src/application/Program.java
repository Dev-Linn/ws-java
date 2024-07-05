package application;

import entities.*;
import entities.Client;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("enter client data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.next();
        System.out.println("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter Order data: ");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date() , status, client);


        System.out.println("How many items to this order?: ");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println("Enter #" + (i + 1) + " item data:");
            System.out.println("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.println("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.println("Quantity> ");
            int quantity = sc.nextInt();
            Product product = new Product(productName, productPrice);
            OrderItem it = new OrderItem(quantity, productPrice, product);

        }

        System.out.println();
        System.out.println(order);


                sc.close();
        }
    }
