package exx;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Utils;

public class Exx {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Utils> lista = new ArrayList<>();

        System.out.print("Digite o número de funcionários que você deseja registrar: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i);
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha deixada pelo nextInt()
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salario = sc.nextDouble();

            lista.add(new Utils(id, name, salario));
        }

        System.out.print("Enter employee id that will have salary increase: ");
        int idToChange = sc.nextInt();
        
       
        System.out.print("Enter the value to be added to the salary: ");
        double addSalary = sc.nextDouble();

        // Procurar o funcionário na lista e adicionar ao salário
        for (Utils x : lista) {
            if (x.getId() == idToChange) {
                x.setSalario(x.getSalario() + addSalary);
                break; // Parar o loop depois de encontrar e alterar
            }
        }

        sc.close();

        // Mostrar todos os cartões na caixinha
        System.out.println("Funcionários registrados:");
        for (Utils x : lista) {
            System.out.println(x);
        }
    }

}
