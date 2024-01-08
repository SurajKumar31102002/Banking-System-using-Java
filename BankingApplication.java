package BankingApp;

import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        BankAccount obj1=new BankAccount("XYZ","647");
        obj1.showMenu();
    }
}
    class BankAccount {
        int balance;
        int previousTransaction;
        String CustomerName;
        String CustomerId;

        BankAccount(String cname,String cid){
            CustomerName=cname;
            CustomerId=cid;
        }


        void deposit(int amount){
            if (amount !=0){
                balance=balance+amount;
                previousTransaction=amount;
            }
        }
        void withdraw(int amount){
            if (amount!=0){
                balance=balance-amount;
                previousTransaction=-amount;
            }
        }
        void getPreviousTransaction(){
            if (previousTransaction>0){
                System.out.println("Deposited : "+previousTransaction);
            }else if (previousTransaction<0){
                System.out.println("Withdraw  : "+Math.abs(previousTransaction));
            }else
                System.out.println("No transition");
        }
        void showMenu(){
            char option='0';
            Scanner sc=new Scanner (System.in);

            System.out.println("Welcome "+CustomerName);
            System.out.println("Your ID is "+CustomerId);
            System.out.println("\n");
            System.out.println("A. Check balance");
            System.out.println("B. Deposited");
            System.out.println("C. Withdraw");
            System.out.println("D. PreviousTransaction");
            System.out.println("E. Exit");

            do {
                System.out.println("======================================================");
                System.out.println("Enter the option");
                System.out.println("======================================================");
                option=sc.next().charAt(0);
                System.out.println("\n");

                switch (option){
                    case 'A':
                        System.out.println("--------------------------------------------");
                        System.out.println("Balance = "+balance);
                        System.out.println("---------------------------------------------");
                        System.out.println("\n");
                        break;

                    case 'B':
                        System.out.println("--------------------------------------------");
                        System.out.println("Enter an amount to deposit : ");
                        System.out.println("--------------------------------------------");
                        int amount=sc.nextInt();
                        deposit(amount);
                        System.out.println("\n");
                        break;

                    case 'C':
                        System.out.println("--------------------------------------------");
                        System.out.println("Enter an amount to Withdraw : ");
                        System.out.println("--------------------------------------------");
                        int amount2=sc.nextInt();
                        withdraw(amount2);
                        System.out.println("\n");
                        break;

                    case 'D':
                        System.out.println("--------------------------------------------");
                        getPreviousTransaction();
                        System.out.println("--------------------------------------------");
                        System.out.println("\n");
                        break;

                    case 'E':
                        System.out.println("*********************************************");
                        break;

                    default:
                        System.out.println("Invalid option! Please enter again ");
                        break;
                }
            }while (option !='E');
                System.out.println("Thank you for using out services");
        }
    }


