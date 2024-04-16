package domain.models.bankAccount;

import Utils.PriceFormatter;

import java.text.MessageFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BankAccount {

    public BankAccount() {
    }

    private Integer number;
    private String agency;
    private String nameClient;
    private double current;
    private Scanner scan = new Scanner(System.in);

    public void InsertValues(){
        System.out.println("Insira o numero da sua conta: ");
        this.number = scan.nextInt();
        scan.nextLine();
        System.out.println("Insira o número da agência: ");
        this.agency = scan.nextLine();
        System.out.println("Insira o seu Nome: ");
        this.nameClient = scan.nextLine();
        System.out.println("Insira o saldo da sua conta: ");
        this.current = Double.parseDouble(scan.nextLine());

    }

    public void LoadingCreateAccont() {
        try {
            System.out.println("\n");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Carregando...");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("\n");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void ApresentationBankDate(){
         System.out.println(MessageFormat.format(
                 "Olá {0}, obrigado por criar uma conta em nosso banco, sua agência é {1}, " +
                 "conta {2}, e seu saldo {3} já está disponível para saque",
                 this.nameClient, this.agency, this.number, PriceFormatter.FormatValue(this.current)));
    }

}
