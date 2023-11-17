import java.util.Scanner;

class c1 {
    private String name;
    private String accnum;

    public c1(String name, String accnum) {
        this.name = name;
        this.accnum = accnum;
    }

    public String getName() {
        return name;
    }

    public String getaccnum() {
        return accnum;
    }

    public void displayInfo() {
        System.out.println("c1: " + name);
        System.out.println("Account Number: " + accnum);
    }
}

class Account {
    protected double bal;

    public Account(double bal) {
        this.bal = bal;
    }

    public double getbal() {
        return bal;
    }

    public void deposit(double amount) {
        bal = bal+amount;
        System.out.println("Amount deposited: " + amount);
        System.out.println("Current bal: " + bal);
    }

    public void withdraw(double amount) {
        if (amount <= bal) {
            bal -= amount;
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("Current bal: " + bal);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void disprate() {
        System.out.println("Default Interest Rate: 4%");
    }
}

class RBI {
    public void setrate(double rate) {
        System.out.println("Setting Default Interest Rate: " + rate + "%");
    }

    public void dispguide() {
        System.out.println("RBI Guidelines: Maintain minimum bal, follow interest rates");
    }
}

class SBI extends RBI {
    @Override
    public void dispguide() {
        System.out.println("SBI Guidelines: Follow RBI guidelines and additional SBI guidelines");
    }
}

class ICICI extends RBI {
    @Override
    public void dispguide() {
        System.out.println("ICICI Guidelines: Follow RBI guidelines and additional ICICI guidelines");
    }
}

class PNB extends RBI {
    @Override
    public void dispguide() {
        System.out.println("PNB Guidelines: Follow RBI guidelines and additional PNB guidelines");
    }
}

public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c1 c1 = new c1("Area51", "123456789");

        while (true) {
            System.out.println("\n___ Bank Menu ___");
            System.out.println("1. SBI Account");
            System.out.println("2. ICICI Account");
            System.out.println("3. PNB Account");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    opacc(new SBI(), c1);
                    break;
                case 2:
                    opacc(new ICICI(), c1);
                    break;
                case 3:
                    opacc(new PNB(), c1);
                    break;
                case 4:
                    System.out.println("Exiting the program. Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void opacc(RBI bank, c1 c1) {
        Scanner sc = new Scanner(System.in);
        bank.dispguide();
        Account account = new Account(5000);

        while (true) {
            System.out.println("\n__ Account options __");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Interest Rate");
            System.out.println("4. Display Customer Info");
            System.out.println("5. Back to Bank Menu");
            System.out.print("Choose an operation: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the deposit amount: ");
                    double depamt = sc.nextDouble();
                    account.deposit(depamt);
                    break;
                case 2:
                    System.out.print("Enter the withdrawal amount: ");
                    double withamt = sc.nextDouble();
                    account.withdraw(withamt);
                    break;
                case 3:
                    account.disprate();
                    break;
                case 4:
                    c1.displayInfo();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Enter valid input");
            }
        }
    }
}
