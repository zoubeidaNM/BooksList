package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //initialize the arrays that will contain the bool information
        String[] bookTitles = new String[100];
        String[] authors = new String[100];
        String[] bookDescriptions= new String[100];

        Scanner keyboard = new Scanner(System.in);

        //Answer Yes [y,Y] or no [n,N] to continue or stop entering book records
        String answer = "";

        // initialize the book counter
        int bookRecordCounter =0;

        // print header
        System.out.println("*--------------------------------------------------*");
        System.out.println("*-----------Book list entry------------------------*");
        System.out.println("*--------------------------------------------------*");

        do {

            // ask the user to enter the book information and scan his entries
            System.out.println("Enter a book title ");
            bookTitles[bookRecordCounter] = keyboard.nextLine();
            System.out.println("Enter the author ");
            authors[bookRecordCounter] = keyboard.nextLine();
            System.out.println("Enter the book description ");
            bookDescriptions[bookRecordCounter] = keyboard.nextLine();
            System.out.println("Do you want to continue (Y/N)");

            // make sure that the user answer is valid
            do {
                // get the answer from the user
                answer = keyboard.next();
                keyboard.nextLine();
            } while (!checkIfAnswerValid(answer));

            // increment the book counter
            bookRecordCounter++;

        }while (answer.equalsIgnoreCase("y") && (bookRecordCounter<100));

        // Sorry message in case the user wanted to enter more then 100 recors
        if(bookRecordCounter == 99) {
            System.out.println("Sorry!!! you can not enter more then a 100 book record.");
        }

        // print to the console what the user entered.
        System.out.println("*--------------------------------------------------*");
        for (int i=0; i<bookTitles.length; i++ ) {
            if(bookTitles[i]!= null) {
                System.out.println("Book Title       : " + bookTitles[i] + ".");
                System.out.println("Book author      : " + authors[i] + ".");
                System.out.println("Book description : " + bookDescriptions[i] + ".");
                System.out.println("*--------------------------------------------------*");
            }
        }


    }

    // check if the answer is Yes [y,Y] or no [n,N]
    public static boolean checkIfAnswerValid(String answer) {

        if ((answer.equalsIgnoreCase("y")) || (answer.equalsIgnoreCase("n"))) {
            return true;
        } else {
            // ask the user to enter a valid answer
            System.out.println("Please, answer [y]or[Y] for Yes or [n]or[N] for No.\n");
            return false;
        }
    }
}
