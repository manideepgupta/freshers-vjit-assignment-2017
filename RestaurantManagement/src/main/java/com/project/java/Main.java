package com.project.java;
import java.util.*;
import java.io.*;


public class Main {
    private static int sno;
    static Customer c;
    static String[] items={"burger","pizza","icecream","biryani"};
    static double[] prices={25,35,6.5,100};

    private static HashMap<Integer,Customer> tables;
   private static HashMap<Integer,Double> bills;
    static Scanner br;

    public static void main(String args[]) throws IOException {

        tables = new HashMap<>();
        bills=new HashMap<>();
        br = new Scanner(System.in);
        while (true) {
            System.out.println("**********************************");
            System.out.println("Welcome to Hotel Management System");
            System.out.println("**********************************");
            System.out.println("Please choose from the menu");
            System.out.println("1. Book a Table");
            System.out.println("2. Place an order");
            System.out.println("3. Pay the Bill");
            System.out.println("4. exit");
            System.out.println("Enter your choice");
            int ch = br.nextInt();
            switch (ch) {
                case 1:
                     sno=bookTable();
                    break;
                case 2:
                    placeOrder();
                    break;
                case 3:
                    payBill();
                    break;
                    case 4:
                    System.exit(1);

            }
        }
    }

    private static void placeOrder() {
        Menu menu=new Menu(items,prices);
        String items[]=menu.getItems();
        double prices[]=menu.getPrices();
        for(int i=0;i<items.length;i++)
        {
            System.out.println((i+1)+". ITEM : "+items[i]+"  |   "+"PRICE :"+ prices[i]);
        }
        System.out.println("Enter the item number");
        int itemId=br.nextInt();
        System.out.println("SERVING "+items[itemId-1]+".........");
        bills.put(sno,bills.get(sno)+prices[itemId-1]);
    }


    public static void payBill(){
        System.out.println("Enter the table number");
        int no=br.nextInt();
        System.out.println("Your total billed amount is : "+bills.get(no));
        System.out.println("Please provide your feedback..........");
        String s=br.next();
        c.setFeedback(s);
        System.out.println("Thanks for the feedback... visit again");

    }

    public static int bookTable(){
        System.out.println("enter customer name");
        String cname=br.next();
        int sno=tables.size()+1;
        c=new Customer(cname,sno);
        System.out.println("Hello Mr."+cname+", your Table No is :"+sno);
        bills.put(sno,new Double(0));
        return sno;
    }
}
