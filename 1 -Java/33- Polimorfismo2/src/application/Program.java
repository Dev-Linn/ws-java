package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i): ");
            char ch = sc.next().charAt(0);
            sc.nextLine(); // Consome a nova linha após o char

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Custom fee: ");
                double customFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customFee));
            } else if (ch == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String dateStr = sc.next();
                Date manufactureDate = sdf.parse(dateStr);
                products.add(new UsedProduct(name, price, manufactureDate));
            } else {
                products.add(new Product(name, price));
            }
        }

        System.out.println();
        System.out.println("Você deseja conferir os PRICES TAGS: (y/n)");
        char ch = sc.next().charAt(0);
        if (ch == 'y') {
            System.out.println("PRICE TAGS:");
            for (Product p : products) {
                System.out.println(p.priceTag());
            }
        } else {
            return;
        }



        sc.close();
    }
}
