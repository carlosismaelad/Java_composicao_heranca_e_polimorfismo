import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ContratoPorHora;
import entities.Departamento;
import entities.Funcionario;
import entities.enums.NivelFuncionario;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Informe o nome do departamento: ");
        String departamento = sc.nextLine();
        System.out.println("Informe os dados do funcionario:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Nivel: ");
        String nivel = sc.nextLine();
        System.out.print("Salario base: ");
        Double salarioBase = sc.nextDouble();

        Funcionario funcionario = new Funcionario(nome, NivelFuncionario.valueOf(nivel), salarioBase,
                new Departamento(departamento));

        System.out.print("Quantos contratos tem este colaborador? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Entre com os dados docontrato #" + i);
            System.out.print("Data (DD/MM/YYYY): ");
            Date dataDoContrato = sdf.parse(sc.next());
            System.out.print("Valor da hora: ");
            double valorPorHora = sc.nextDouble();
            System.out.print("Duracao: ");
            int horas = sc.nextInt();

            ContratoPorHora contrato = new ContratoPorHora(dataDoContrato, valorPorHora, horas);

            funcionario.addContrato(contrato);
        }

        System.out.println();
        System.out.print("Informe o mes e o ano para calculo de renda (MM/YYYY): ");
        String mesEAno = sc.next();
        int mes = Integer.parseInt(mesEAno.substring(0, 2));
        int ano = Integer.parseInt(mesEAno.substring(3));

        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Departamento: " + funcionario.getDepartamento().getName());
        System.out.println("Ganhos para " + mesEAno + ": " + String.format("%.2f", funcionario.renda(ano, mes)));

        sc.close();

    }
}
