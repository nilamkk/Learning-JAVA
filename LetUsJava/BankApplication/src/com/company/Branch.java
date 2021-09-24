package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name=name;
        this.customers = new ArrayList<Customer>();
    }

    // addNewCustomer
    // 1. visibility   2. arguments
    public void addNewCustomer(String name,double initialTrans){
        int customerSize= customers.size();
        for(int i=0;i<customerSize;i++){
            if(customers.get(i).getName()==name){
                System.out.println("Customer with name "+name+" already exist!");
                return;
            }
        }
        Customer newCustomer= new Customer(name,initialTrans);
        customers.add(newCustomer);
    }
    public void addTransForCustomer(String name,double trans){
        int size=customers.size();
        int index=-1;
        for(int i=0;i<size;i++){
            if(customers.get(i).getName()==name){
                index=i;
                break;
            }
        }
        if(index==-1)
            return;
        customers.get(index).addNewTransaction(trans);
    }


    public String getName() {
        return name;
    }

}
