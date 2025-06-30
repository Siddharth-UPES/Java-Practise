class BankAccount {
    void processTransaction(int amount) {
        class TransactionLog {
            void log(String message) {
                System.out.println("Transaction: " + message + ", Amount: " + amount);
            }
        }
        TransactionLog logger = new TransactionLog();
        logger.log("Transaction successful.");
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.processTransaction(1000);
        account.processTransaction(500);
        account.processTransaction(2000);
    }
}



