package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //////////// Will include more as soon as I find useful things for LL ///////////////////

        // This is how we create a linked list
        LinkedList<String> ll= new LinkedList<>();

        // adding elements to its last
        ll.add("Nagaon");
        ll.add("Jorhat");
        ll.add("Tezpur");
        ll.add("Uttarakhand");
        ll.add("Kedarnath");

        // to add element at a position
        ll.add(1,"New Place");

        // to remove element
        ll.remove(2);

        // Needs this iterator to iterate the list
        // initially it points to an imaginary element before the starting node
        Iterator<String> it= ll.iterator();

        // hasNext() of iterator checks if the next element exist or not
        while(it.hasNext()){
            // next() goes to the next element and returns it
            System.out.println(it.next());
        }

        // ListIterators are more handy than iterators and works for list collections
        // ListIterators has no current elements. It stays between the next and the previous
        ListIterator<String> lit= ll.listIterator();

        System.out.println("\n***********************\n");

        // same hasNext and next as before
        while(lit.hasNext()){
            System.out.println(lit.next());
        }

        System.out.println("\n***********************\n");

        // same analogous to above
        while(lit.hasPrevious()){
            System.out.println(lit.previous());
        }

        // lit.add("new Place") --> adds new element before the next element

        System.out.println("\n***********************\n");

        // below function provides a custom visit function
        visit(ll);
    }

    public static void visit(LinkedList ll){

        ListIterator<String> lit= ll.listIterator();

        System.out.println("Available options are: \n");
        System.out.println("1. 0 for stop\n 2. 1 for forward\n 2. 2 for previous\n");
        Scanner scanner= new Scanner(System.in);
        int choice,direction=1;
        do {
            choice=scanner.nextInt();
            switch (choice){
                case 0:
                    System.out.println("Stopping the visit !!!");
                    break;

                case 1:
                    if(direction==-1){
                        if(lit.hasNext())
                            lit.next();
                    }
                    if(lit.hasNext()){
                        direction=1;
                        System.out.println("The next node is "+lit.next());
                    }else{
                        System.out.println("No next element exist");
                    }
                    break;

                case 2:
                    if(direction==1){
                        if(lit.hasPrevious())
                            lit.previous();
                    }
                    if(lit.hasPrevious()){
                        direction=-1;
                        System.out.println("The previous node is "+lit.previous());
                    }else{
                        System.out.println("No previous element exist");
                    }
                    break;
            }
        }while (choice!=0);
    }

}
