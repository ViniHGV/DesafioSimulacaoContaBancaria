import domain.models.bankAccount.BankAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.InsertValues();
        bankAccount.LoadingCreateAccont();
        bankAccount.ApresentationBankDate();
    }
}