package com.company;

public class Main {

    // You job is to create a simple banking application.
    // There should be a Bank class
    // It should have an arrayList of Branches
    // Each Branch should have an arrayList of Customers
    // The Customer class should have an arrayList of Doubles (transactions)
    // Customer:
    // Name, and the ArrayList of doubles.
    // Branch:
    // Need to be able to add a new customer and initial transaction amount.
    // Also needs to add additional transactions for that customer/branch
    // Bank:
    // Add a new branch
    // Add a customer to that branch with initial transaction
    // Add a transaction for an existing customer for that branch
    // Show a list of customers for a particular branch and optionally a list
    // of their transactions
    // Demonstration autoboxing and unboxing in your code
    // Hint: Transactions
    // Add data validation.
    // e.g. check if exists, or does not exist, etc.
    // Think about where you are adding the code to perform certain actions

    public static void main(String[] args) {
        Bank bank = new Bank("Bank of America");

        if (bank.addBranch("Charlotte")) {
            System.out.println("Charlotte branch created");
        }

        bank.addCustomer("Charlotte", "Jarad", 50.05);
        bank.addCustomer("Charlotte", "Mike", 175.34);
        bank.addCustomer("Charlotte", "Percy", 220.12);

        bank.addBranch("Dallas");
        bank.addCustomer("Dallas", "Bob", 150.54);

        bank.addCustomerTransaction("Charlotte", "Jarad", 44.22);
        bank.addCustomerTransaction("Charlotte", "Jarad", 12.44);
        bank.addCustomerTransaction("Charlotte", "Mike", 1.65);

        bank.listCustomers("Charlotte", true);
        bank.listCustomers("Dallas", true);

        bank.addBranch("Denver");

        if (!bank.addCustomer("Denver", "Brian", 5.33)) {
            System.out.println("Error Denver branch does not exist");
        }

        if (!bank.addBranch("Charlotte")) {
            System.out.println("Charlotte branch already exists");
        }

        if (!bank.addCustomerTransaction("Charlotte", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if (!bank.addCustomer("Charlotte", "Jarad", 12.21)) {
            System.out.println("Customer Jarad already exists");
        }

    }
}
