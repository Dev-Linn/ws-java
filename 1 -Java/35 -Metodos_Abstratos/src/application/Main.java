package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.entities.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> List = new ArrayList<>();

        System.out.print("Enter the number of shapes");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int p = i + 1;
            System.out.println("Shape" + "#" + p + " data:");
            System.out.print("Rectangle or Circle (r/c)");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED)");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Heigth: ");
                double heigth = sc.nextDouble();
                List.add(new Rectangle(color, width, heigth));
            } else {
                System.out.print("Radios: ");
                double radius = sc.nextDouble();
                List.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape s : List) {
            System.out.printf("%.2f" , s.area());
        }

        sc.close();



    }
}