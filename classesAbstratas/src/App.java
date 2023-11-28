import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> shape = new ArrayList<>();

        System.out.print("informe o numero de figuras? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados da figura " + i);
            System.out.print("Circulo ou Retangulo (c/r)? ");
            char res = sc.next().charAt(0);
            System.out.print("Cor: (PRETO, AZUL OU VERMELHO): ");
            Color cor = Color.valueOf(sc.next());
            if (res == 'r') {
                System.out.print("Largura: ");
                double largura = sc.nextDouble();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                shape.add(new Rectangle(cor, largura, altura));
            } else {
                System.out.print("Raio: ");
                double raio = sc.nextDouble();
                shape.add(new Circle(cor, raio));
            }
        }
        System.out.println();
        System.out.println("Areas das figuras: ");
        for (Shape sh : shape) {
            System.out.println(String.format("%.2f", sh.area()));

        }
    }
}
