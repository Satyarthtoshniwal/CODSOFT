import java.util.Scanner;

class checkbalance {
    String name = "Satyarth Toshniwal";
    int acnum = 12545038;
    int pin = 5566;
    // assume the current balance of the user is 50000
    float balance = 50000;
    Scanner sc = new Scanner(System.in);

    void display() {
        System.out.println("Name =" + name);
        System.out.println("Account number  =" + acnum);
        System.out.println("Balance =" + balance);
    }

    float amount;

    void depositamount(float m) {
        amount = m;
        balance += amount;
        System.out.println("Amount deposited succesfully\nTransaction succesfull");
        System.out.println("Balance =" + balance);
    }

    void withdrawamount(float n) {
        amount = n;
        if (balance > amount) {
            balance -= amount;
            System.out.println("Amount withdrawed succesfully\nTransaction succesfull");
            System.out.println("Balance =" + balance);
        } else {
            System.out.println("Insufficient balance to withdraw\nTransaction unsuccesfull");
            System.out.println("Balance =" + balance);
        }
    }

    void pin() {
        System.out.println("Enter the pin");
        int cpin = sc.nextInt();
        if (cpin == pin) {
            System.out.println("Welcome Satyarth Toshniwal.....");
        } else {
            System.out.println("Entered pin is Wrong....");
            System.exit(0);
        }
    }
}

class atm {
    public static void main(String[] args) {
        checkbalance cb1 = new checkbalance();
        int choice;
        Scanner sc = new Scanner(System.in);
        cb1.display();
        System.out.println("Enter the operation to execute:");
        System.out.println("1.Withdraw\n2.Deposit\n3.Checkbalance\n4.Logout");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                cb1.pin();
                System.out.println("Enter amount to withdraw:");
                cb1.withdrawamount(sc.nextFloat());
                break;
            case 2:
                cb1.pin();
                System.out.println("Enter amount to deposit:");
                cb1.depositamount(sc.nextFloat());
                break;
            case 3:
                cb1.pin();
                cb1.display();
                break;
            case 4:
                System.out.println("Thankyou Satyarth Toshniwal for using our services");
                System.exit(0);
            default:
                System.out.println("Wrong choice......");
        }
        sc.close();
    }
}