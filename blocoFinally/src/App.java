import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\test\\in.txt");

        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error opening file" + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
                // independente do arquivo ser aberto ou não
                // temos que fechar o scanner
                // então, usamos finally
            }
        }

    }
}
