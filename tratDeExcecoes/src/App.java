import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        method1();
        System.out.println("End of program!");

    }

    public static void method1() {
        System.out.println("***METHOD1 START***");
        method2();
        System.out.println("***METHOD1 END***");

    }

    public static void method2() {
        System.out.println("***METHOD2 START***");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position.");
            e.printStackTrace(); // mostra toda a chamada de métodos que acarreta na exceção
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Position must be a number.");
        }

        sc.close();

        System.out.println("***METHOD2 END***");
    }
}
