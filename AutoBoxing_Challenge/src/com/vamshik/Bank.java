package com.vamshik;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<Branch>();
    }

    public String getBankName() {
        return bankName;
    }

    public boolean addBranches(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String CustomerName, double amount) {
        Branch branch = findBranch(branchName);

        if(branch != null) {
            return branch.newCustomer(CustomerName, amount);
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String CustomerName, double amount) {
        Branch branch = findBranch(branchName);

        if(branch != null) {
            return branch.addTransaction(CustomerName, amount);
        }

        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            Branch existing_branch = branches.get(i);
            if (existing_branch.getBranchName().equals(branchName)) {
                return existing_branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);

        if (branch != null) {
            System.out.println("Showing Customer details of the branch: " + branch.getBranchName());
            for (int i = 0; i < branch.getCustomers().size(); i++) {
                System.out.println("[" + (i+1) +"]. " + branch.getCustomers().get(i).getName());

                if (showTransactions) {
                    System.out.println("The transaction details of " + branch.getCustomers().get(i).getName());

                    for (int j = 0; j < branch.getCustomers().get(i).getTransactions().size(); j++) {
                        System.out.println("[" + (j+1) +"]. " + branch.getCustomers().get(i).getTransactions().get(j));
                    }
                    System.out.println();
                }
            }
            return true;
        }
        else {
            return false;
        }
    }
}
