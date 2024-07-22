package application;

import entities.Company;
import entities.Individual;
import entities.Taxplayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Taxplayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int p = i + 1;
            System.out.println("Tax payer #" + p + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine(); // consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();
            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, annualIncome, healthExpenditures));
            } else if (ch == 'c') {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name, annualIncome, numberOfEmployees));
            }
        }

        double totalTaxes = 0.0;

        System.out.println();
        System.out.println("TAXES PAID:");
        for (Taxplayer tp : list) {
            double tax = tp.Tax();
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
            totalTaxes += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));

        sc.close();
    }
}
