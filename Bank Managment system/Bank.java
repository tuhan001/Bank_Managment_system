import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your 'name' and 'customId' to access your Bank account: ");
        String name = sc.nextLine();
        String customId= sc.nextLine();
        BankAccount obj1 = new BankAccount(name,customId);
        obj1.manu();
    }
}
class BankAccount {
    double bal;
    double prevTrans;
    String customerName;
    String customerID;


    BankAccount(String customerName, String customerID) {
        this.customerName = customerName;
        this.customerID = customerID;
    }

    void deposit(double amount) {
        if (amount != 0) {
            bal+= amount;
            prevTrans = amount;
        }
    }

    void withdraw(double amt) {
        if (amt != 0 && bal > amt) {
            bal = amt;
            prevTrans = amt;
        } else if (bal < amt) {
            System.out.println("Bank balance insurricient");

        }
    }

    void getPerviousTrans() {
        if (prevTrans > 0) {
            System.out.println("Deposited");
        } else if (prevTrans < 0) {
            System.out.println("withdraw");
        } else {
            System.out.println("no transaction");
        }
    }

    void manu() {
        char option = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome" + customerName);
        System.out.println("your id: " + customerID);
        System.out.println("\n");
        System.out.println("a) Check Balance");
        System.out.println("b) Deposit");
        System.out.println("c) Withdraw");
        System.out.println("d) Previous Transection");
        System.out.println("e) exit");

        do {
            System.out.println("******************************");
            System.out.println("Balance" + bal);
            System.out.println("*******************************");
            System.out.println("\n");

            switch (option) {
                case 'a':
                    System.out.println("**************************");
                    System.out.println("Balance" + bal);
                    System.out.println("***************************");
                    System.out.println("\n");
                    break;
                case 'b':
                    System.out.println("****************************");
                    System.out.println("Enter a amount to Deposit");
                    System.out.println("*****************************");
                    double amt = sc.nextDouble();
                    deposit(amt);
                    System.out.println("\n");
                    break;
                case 'c':
                    System.out.println("*****************************");
                    System.out.println("Enter a amount to Withdraw");
                    System.out.println("******************************");
                    double amtw = sc.nextDouble();
                    withdraw(amtw);
                    System.out.println("\n");
                    break;
                case 'd':
                    System.out.println("****************************");
                    System.out.println("Previous Trasaction ");
                    getPerviousTrans();
                    System.out.println("*****************************");
                    System.out.println("\n");
                    break;
                case 'e':
                    System.out.println("*******************************");
                    break;
                default:
                    System.out.println("choose a correct option to proceed");
                    break;
            }
        }
        while (option != 'e');
        System.out.println("Thank you for Useing our service");

    }
}


