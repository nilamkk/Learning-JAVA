package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public void addNewBranch(String name){
        Branch newBranch= new Branch(name);
        branches.add(newBranch);
    }

    public void addNewCustomerToBranch(String customerName, double initialTrans, String branchName){
        int sizeOfBranches= branches.size();
        int indexOfBranch=-1;
        for(int i=0;i<sizeOfBranches;i++){
            if(branches.get(i).getName()==branchName){
                indexOfBranch=i;
                break;
            }
        }
        if(indexOfBranch==-1){
            System.out.println("Branch with name "+branchName+" does not exist!!!");
            return;
        }
        branches.get(indexOfBranch).addNewCustomer(customerName,initialTrans);
    }



}
