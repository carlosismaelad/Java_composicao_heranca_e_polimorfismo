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

    }
}
