import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        method1();
        method2();
        System.out.println("End of program");



    }

    public static void method1(){
        System.out.println("METODO 1 START");
        method2();
        System.out.println("METODO 1 END");
    }

    public static void method2(){
        System.out.println("METODO 2 START");
        Scanner sc = new Scanner(System.in);


        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Err");
        } catch (InputMismatchException e) {
            System.out.println("Err");
        }

        System.out.println("METODO 2 END");
        sc.close();
    }
}