package course;

import entities.Student;
import java.util.Locale;
import java.util.Scanner;


public class Course {

    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student db = new Student();
        
        
        System.out.print("Digite o nome do Aluno e suas respectivas notas: ");
        db.nome = sc.nextLine();
        db.n1 = sc.nextInt();
        db.n2 = sc.nextInt();
        db.n3 = sc.nextInt();
        
        System.out.println(db.calcularMedia());
        db.passou();
        
        sc.close();
        
        
        
    }
    
}
