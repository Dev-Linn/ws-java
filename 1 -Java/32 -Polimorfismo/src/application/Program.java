package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> List = new ArrayList<>();

    System.out.print("Enter the number of employees: ");
    int n = sc.nextInt();

    for (int i = 1; i < n; i++) {
        System.out.println("Emplyoee #" + i + " data:");
        System.out.print("Outsourced (y/n)");
        char ch = sc.next().charAt(0);
        System.out.println("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Hours: ");
        int hours = sc.nextInt();
        System.out.println("Value per hour: ");
        Double valuePerHour = sc.nextDouble();
        if (ch == 'y') {
            System.out.print("Additional charge: ");
            Double additionalCharges = sc.nextDouble();
            List.add(new OutsourcedEmployee(name,hours, valuePerHour, additionalCharges));
        } else {
            List.add(new Employee(name,hours, valuePerHour));
        }
    }

    System.out.println("Você deseja verificar os pagamentos?");
    char ch = sc.next().charAt(0);
    if (ch == 'y') {
        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee e : List) {
            System.out.println(e.getName() + "- $" + String.format("%.2f",e.payment()));
        }
    } else {
        return;
    }





        sc.close();

}

}