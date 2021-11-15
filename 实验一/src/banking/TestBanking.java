package banking;

import banking.*;

public class TestBanking {
    public static void main(String[] args) {
        Customer customer;
        Account account;
        System.out.println("Creating the customer Bing David.");
        customer = new Customer("Bing", "David",20);
        System.out.println("Creating his account with a 300.00 balance.");
        customer.setAccount(new Account(300.00));
        account = customer.getAccount();
        // Perform some account transactions
        System.out.println("Withdraw 50.00: " + account.withdraw(50.00));
        System.out.println("Deposit 20.50: " + account.deposit(20.50));
        System.out.println("Withdraw 60.00: " + account.withdraw(60.00));
        System.out.println("Withdraw 361.00: " + account.withdraw(361.00));
        // Print out the final account balance
        System.out.println("Customer [" + customer.getLastName()
                + ", " + customer.getFirstName()
                + "] has a balance of " + account.getBalance());
    }
}
