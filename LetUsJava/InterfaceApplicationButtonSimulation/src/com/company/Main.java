package com.company;

import java.util.Scanner;

public class Main {

    public static Button btn= new Button("I am a button !!!");
    public static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
        // 1. Anonymous class
//        btn.setOnClickListener(new Button.IOnClickListener() {
//            @Override
//            public void onClick(String title) {
//                System.out.println(title);
//            }
//        });
//        listen(btn);

        // 2. Local class
        class clickListener implements Button.IOnClickListener {
            @Override
            public void onClick(String title) {
                System.out.println(title);
            }
        }

        btn.setOnClickListener(new clickListener());
        listen(btn);
    }

    public static void listen(Button btn){
        int choice=1;
        do{
            System.out.println("Enter 0 to exit and 1 to click ");
            choice=scanner.nextInt();
            if(choice==0)
                break;
            btn.onClick();
        }while(true);
    }

}
