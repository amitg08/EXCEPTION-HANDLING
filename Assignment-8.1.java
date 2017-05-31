public abstract class BankAccount {

    double balance;
    double deposits;
    double withdrawals;

    public void _BankAccount(double newBalance) {
        balance = newBalance;
    }

    public void Deposit(double newDeposit) {
        balance = balance + newDeposit;
    }

    public void Withdraw(double newWithdraw) {
        balance = balance - newWithdraw;
    }

}

public class SavingsAccount extends BankAccount {

    boolean status;

    public void savingWithdraw(double newWithdraw) {
        if (balance < 10000) {
            System.out.println("Error – Not enough funds.");
        } else {
            Withdraw(newWithdraw);
        }
    }

    public void savingDeposit(double newDeposit) {
        if (balance < 25) {
            Deposit(newDeposit);
            System.out.println("Savings account is now active.");
        } else {
            Deposit(newDeposit);
        }
    }
}

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String choice;
    int num = 0;
    boolean quit = false;
    do {
        System.out.println("Which account would you like to access, current or savings?:");
        choice = in.nextLine();
        if (choice.equals("regular")) {
            num = 0;
        }
        if (choice.equals("savings")) {
            num = 1;
        }
        switch (num) {
            case 0:
                System.out.println("What action do you wish to perform \n(Withdraw, deposit)?:");
                choice = in.nextLine();
                if (choice.equals("withdraw")) {
                    num = 0;
                }
                if (choice.equals("deposit")) {
                    num = 1;
                }
                switch (num) {
                    case 0:
                        System.out.println("Enter amount to withdraw:");
                        Withdraw(in.nextInt());
                    case 1:
                        System.out.println("Enter amount to withdraw:");
                        Deposit(in.nextInt());
                }
            case 1:
                System.out.println("What action do you wish to perform \n(Withdraw, deposit)?:");
                choice = in.nextLine();
                if (choice.equals("withdraw")) {
                    num = 0;
                }
                if (choice.equals("deposit")) {
                    num = 1;
                }
                switch (num) {
                    case 0:
                        System.out.println("Enter amount to withdraw:");
                        savingsWithdraw(in.nextInt());
                    case 1:
                        System.out.println("Enter amount to withdraw:");
                        savingsDeposit(in.nextInt());
                }

        }
    }


}