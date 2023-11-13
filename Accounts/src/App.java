import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {

        Account account = new Account(1001, "Alex Green", 0.0);

        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.00, 500.00);

        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 1200.00);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        // DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2; // a conversão não é natural como no Upcasting

        // conversão não permitida = subclasse para outra subclasse
        // BusinessAccount acc5 = (BusinessAccount) acc3;

        // Testando se uma classe pode ser convertida para outra
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.00);
            System.out.println("Empréstimo");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }

        // Testando a sobrescrita do método withdraw
        Account test1 = new Account(1001, "John Doe", 1000.00);
        test1.withdraw(200.00);
        System.out.println(test1.getBalance()); // 1000 - 200 - 5

        Account test2 = new SavingsAccount(1002, "Bob", 1000.00, 0.01);
        test2.withdraw(200.00);
        System.out.println(test2.getBalance()); // 1000 - 200

        Account test3 = new BusinessAccount(1003, "Maria", 1000.00, 500.00);
        test3.withdraw(200.00);
        System.out.println(test3.getBalance());

    }
}
