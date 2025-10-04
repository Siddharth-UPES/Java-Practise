//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//// Step 1: Subject Interface
//interface ATM {
//    void login(String user, String password);
//    void withdraw(double amount);
//    void checkBalance();
//    void miniStatement();
//}
//
//// Step 2: Real Subject (Real ATM Machine)
//class RealATM implements ATM {
//    private double balance;
//    private List<String> transactions;
//    private boolean loggedIn;
//
//    public RealATM(double initialBalance) {
//        this.balance = initialBalance;
//        this.transactions = new ArrayList<>();
//        this.loggedIn = false;
//    }
//
//    @Override
//    public void login(String user, String password) {
//        this.loggedIn = true; // Proxy already checks credentials
//        System.out.println("✅ Welcome " + user + ", you are logged in successfully.");
//    }
//
//    @Override
//    public void withdraw(double amount) {
//        if (!loggedIn) {
//            System.out.println("⚠️ Please login first.");
//            return;
//        }
//        if (amount <= balance) {
//            balance -= amount;
//            transactions.add("Withdrawn: " + amount);
//            System.out.println("💰 Transaction Successful! Withdrawn: " + amount);
//        } else {
//            System.out.println("❌ Transaction Failed! Insufficient Balance.");
//        }
//    }
//
//    @Override
//    public void checkBalance() {
//        if (!loggedIn) {
//            System.out.println("⚠️ Please login first.");
//            return;
//        }
//        System.out.println("💳 Current Balance: " + balance);
//    }
//
//    @Override
//    public void miniStatement() {
//        if (!loggedIn) {
//            System.out.println("⚠️ Please login first.");
//            return;
//        }
//        System.out.println("📜 Mini Statement:");
//        if (transactions.isEmpty()) {
//            System.out.println("No transactions yet.");
//        } else {
//            for (String t : transactions) {
//                System.out.println("- " + t);
//            }
//        }
//    }
//}
//
//// Step 3: Proxy (Controls Access)
//class ATMProxy implements ATM {
//    private RealATM realATM;
//    private String validUser = "siddharth";
//    private String validPassword = "1234";
//    private boolean authenticated = false;
//
//    public ATMProxy(double initialBalance) {
//        realATM = new RealATM(initialBalance);
//    }
//
//    @Override
//    public void login(String user, String password) {
//        if (user.equals(validUser) && password.equals(validPassword)) {
//            authenticated = true;
//            realATM.login(user, password);
//        } else {
//            System.out.println("❌ Access Denied! Invalid credentials.");
//        }
//    }
//
//    @Override
//    public void withdraw(double amount) {
//        if (authenticated) {
//            realATM.withdraw(amount);
//        } else {
//            System.out.println("⚠️ Please login first through Proxy.");
//        }
//    }
//
//    @Override
//    public void checkBalance() {
//        if (authenticated) {
//            realATM.checkBalance();
//        } else {
//            System.out.println("⚠️ Please login first through Proxy.");
//        }
//    }
//
//    @Override
//    public void miniStatement() {
//        if (authenticated) {
//            realATM.miniStatement();
//        } else {
//            System.out.println("⚠️ Please login first through Proxy.");
//        }
//    }
//}
//
//// Step 4: Client (Interactive Menu)
//public class ProxyPatternATM {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ATM atm = new ATMProxy(5000);
//
//        boolean exit = false;
//        while (!exit) {
//            System.out.println("\n===== ATM Menu =====");
//            System.out.println("1. Login");
//            System.out.println("2. Withdraw");
//            System.out.println("3. Check Balance");
//            System.out.println("4. Mini Statement");
//            System.out.println("5. Exit");
//            System.out.print("👉 Choose an option: ");
//            int choice = sc.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter Username: ");
//                    String user = sc.next();
//                    System.out.print("Enter Password: ");
//                    String pass = sc.next();
//                    atm.login(user, pass);
//                    break;
//
//                case 2:
//                    System.out.print("Enter amount to withdraw: ");
//                    double amount = sc.nextDouble();
//                    atm.withdraw(amount);
//                    break;
//
//                case 3:
//                    atm.checkBalance();
//                    break;
//
//                case 4:
//                    atm.miniStatement();
//                    break;
//
//                case 5:
//                    System.out.println("👋 Thank you for using ATM. Goodbye!");
//                    exit = true;
//                    break;
//
//                default:
//                    System.out.println("❌ Invalid choice! Try again.");
//            }
//        }
//        sc.close();
//    }
//}


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface ATM {
    void login(String user, String password);
    void withdraw(double amount);
    void checkBalance();
    void miniStatement();
}

class RealATM implements ATM {
    private double balance;
    private List<String> transactions;
    private boolean loggedIn;

    public RealATM(double initialBalance) {
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
        this.loggedIn = false;
    }

    @Override
    public void login(String user, String password) {
        this.loggedIn = true;
        System.out.println("✅ Welcome " + user + ", you are logged in successfully.");
    }

    @Override
    public void withdraw(double amount) {
        if (!loggedIn) {
            System.out.println("⚠️ Please login first.");
            return;
        }
        if (amount <= balance) {
            balance -= amount;
            transactions.add("Withdrawn: " + amount);
            System.out.println("💰 Transaction Successful! Withdrawn: " + amount);
        } else {
            System.out.println("❌ Transaction Failed! Insufficient Balance.");
        }
    }

    @Override
    public void checkBalance() {
        if (!loggedIn) {
            System.out.println("⚠️ Please login first.");
            return;
        }
        System.out.println("💳 Current Balance: " + balance);
    }

    @Override
    public void miniStatement() {
        if (!loggedIn) {
            System.out.println("⚠️ Please login first.");
            return;
        }
        System.out.println("📜 Mini Statement:");
        if (transactions.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String t : transactions) {
                System.out.println("- " + t);
            }
        }
    }
}

class ATMProxy implements ATM {
    private RealATM realATM;
    private String validUser = "siddharth";
    private String validPassword = "1234";
    private boolean authenticated = false;

    public ATMProxy(double initialBalance) {
        realATM = new RealATM(initialBalance);
    }

    @Override
    public void login(String user, String password) {
        if (user.equals(validUser) && password.equals(validPassword)) {
            authenticated = true;
            realATM.login(user, password);
        } else {
            System.out.println("❌ Access Denied! Invalid credentials.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (authenticated) {
            realATM.withdraw(amount);
        } else {
            System.out.println("⚠️ Please login first through Proxy.");
        }
    }

    @Override
    public void checkBalance() {
        if (authenticated) {
            realATM.checkBalance();
        } else {
            System.out.println("⚠️ Please login first through Proxy.");
        }
    }

    @Override
    public void miniStatement() {
        if (authenticated) {
            realATM.miniStatement();
        } else {
            System.out.println("⚠️ Please login first through Proxy.");
        }
    }
}

public class ProxyPatternATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATMProxy(5000);
        boolean exit = false;
        while (!exit) {
            System.out.println("\n===== ATM Menu =====");
            System.out.println("1. Login");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Mini Statement");
            System.out.println("5. Exit");
            System.out.print("👉 Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Username: ");
                    String user = sc.next();
                    System.out.print("Enter Password: ");
                    String pass = sc.next();
                    atm.login(user, pass);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double amount = sc.nextDouble();
                    atm.withdraw(amount);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    atm.miniStatement();
                    break;
                case 5:
                    System.out.println("👋 Thank you for using ATM. Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("❌ Invalid choice! Try again.");
            }
        }
        sc.close();
    }
}
