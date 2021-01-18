package com.company;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        /**
         * Covers
         * // Primitive & Reference
         * // Math Class
         * // String Class Methods
         * // Dialogue Boxes
         * // Parsing/Converting Strings
         * // Reading Keyboard Input
         */



        /**
         * ---------------------
         * Primitive & Reference
         * ---------------------
         *
         * Reference stores complex val.s
         * Primitive stores simple values
         *
         * Primitive data types
         *  Type | Bytes  | Range
         *  -----|---------|-----------
         *  Byte | 1 byte  | -128, 127
         *  Short| 2 Bytes | -32k, 32k
         *  int  | 4 bytes | -2B, 2B
         *  long | 8 bytes |
         *
         *  float| 4 bytes |
         *  double|8 bytes |
         *
         *  char | 2 bytes | international letters (A, B, C)
         *  boolean|1 byte | true or false
         *
         *  -----------------
         *  Widening Conversion: Conversion of lower-ranked data to higher-ranked data
         *      ex.
         *      double x;
         *      int y = 10;
         *      x = y; // converts from int to double
         *
         *  Narrowing Conversion: Conversion of higher-ranked data to lower-ranked data
         *
         *  ------------------
         *  Cast Operator: lets you manually convert values
         *      ex 1.
         *      float pi = 3.14;
         *      x = (int)pi // outputs 3
         *
         *      ex 2.
         *      num2 = (short)num1; // returns num 1 as a short val.
         *
         *
         *
         *  --------------------
         *  Mixed Int. Operators
         *  ---------------------
         *  In arithmetic expressions, byte & short data types are temporarily converted to int. values
         *      ex.
         *      short b, c;
         *      x = b + c; // x is int value
         *
         *
         *  ---------------------------------
         *  Creating named constants w/ FINAL
         *  ---------------------------------
         *  final: used to declare a constant. Constants are declared w/ a val. and val. cannot
         *         be changed during execution of program
         *         ex.
         *         final double INTEREST_RATE = 0.077;
         *         amount = balance * INTEREST_RATE;
         *
         *
         *
         *
         *  ----------
         *  Math Class
         *  ----------
         *  Math.pow method
         *      squared = Math.pow(4.0, 2.0)
         *      squared = 4^2 = 16
         *  Math.sqrt method
         *      sqrt = Math.sqrt(9.0)
         *      sqrt = sqrt(9) = 3
         *
         *  Solve the following Math Eexpression
         *  1. 12 / 2 - 4
         *     (12 / 2) - 4
         *     6 - 4 = 2
         *
         *  2. 9 + 12 * (3 - 1)
         *         12 * (2)
         *     9 + 24 = 33
         *
         *  Is the following expression below int. division or floating-point div?
         *  double portion = 20 / 3;
         *  Integer Division
         *
         *  -----------------------------
         *  Combined Assignment Operators
         *  -----------------------------
         *
         *  operator | Ex. Usage | Equivalent to
         *  ---------|-----------|--------------
         *      +=   |  x+=5     | x = x + 5
         *      -=   |   x-=5    | x = x - 5
         *      *=   |   x*=5    | x = x * 5
         *      /=   |   x/=5    | x = x / 5
         *      %=   |   x%5     | x = x % 5
         *
         */


        /**
         * ------------
         * String Class
         * ------------
         * String: sequence of char.s
         * String literals: char.s that make up a string
         *
         * --------
         * Objects
         * --------
         * Objects: Software entities that may contain attributes and methods
         * attributes = data val.s stored in object
         * class: "blueprint" or description of an obj. Creates as many objects needed
         * Instance of a class: Each object created from a class
         *
         *
         * ---------------------
         * String Class Methods
         * ---------------------
         * charAt(index) = letter position at index
         * length() = returns num of characters in string
         * toUpperCase() = Returns string COMPLETELY UPPERCASE
         * toLowerCase() = Returns string COMPLETELY LOWERCASE
         */
        // String name = "Julian";
        // char firstLetter = name.charAt(0);
        // int nameLength = name.length();
        // String upperName = name.toUpperCase(), lowerName = name.toLowerCase();

        //EXECUTED-----------------

        /**
         * Comments
         * --------
         * Comments: notes ignored by compiler
         */

        /**
         * ----------------------
         * Reading Keyboard Input
         * ----------------------
         * System.in works in conjunction w/ Scanner class
         * System.in reads keystroke values as BYTE val.s
         *
         * METHODS:
         * nextByte = returns input as Byte
         * nextDouble = returns input as Double
         * nextFloat = returns input as Float
         * nextInt = returns input as Int
         * nextLine = returns input as String
         * nextLong = returns input as Long
         * nextShort = returns input as Short
         */
        // Write code that asks user to enter their favorite Pokemon
        // then store in variable favPokemon

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("What is your favorite Pokemon? : ");
        // String favPokemon = scanner.nextLine();
        // System.out.println("Your favorite Pokemon is " + favPokemon);

        /**
         * --------------
         * Dialogue Boxes
         * --------------
         *
         * Pop-up window displaying message or asking user for input
         * Uses JOptionPane....
         * 2 Types:
         *      JOptionPane.showMessageDialogue(null, "show message")
         *          displays message w/ "Ok" button
         *      JOptionPane.showInputDialogue(null, "Ask user input here")
         *          displays message asking user for input w/ text box for input
         *
         *
         * Code that asks user for 1st, middle, and last name using 3 dialogue boxes then displays name
         * in message dialogue
         *                                  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓
         */

        // String firstName, middleName, lastName, fullName;

        // firstName = JOptionPane.showInputDialog(null, "First Name");
        // middleName = JOptionPane.showInputDialog(null, "Middle Name");
        // lastName = JOptionPane.showInputDialog(null, "Last Name");
        // fullName = firstName + " " + middleName + " " + lastName;
        // JOptionPane.showMessageDialog(null, "You are " + fullName);

        /**
         * ---------------------------
         * Converting/ Parsing Strings
         * ---------------------------
         * Byte.parseByte = string --> Byte
         * Double.ParseDouble = string --> Double
         * Float.parseFloat = string --> Float
         * Integer.parseInt = string --> Int
         * Long.parseLong = string --> Long
         * Short.parseShort = string --> Short
         *
         * Code that displays input dialogue asking user to enter their age. Then
         * convert input value to an int & store it in a var. named age
         *                             ↓↓↓↓↓↓↓↓↓↓↓↓↓↓
         */

        // String userAge = JOptionPane.showInputDialog(null, "Age: ");
        // int age = Integer.parseInt(userAge);

        /**
         * ============================
         * Ch 2. Programming Challenges
         * ============================
         */

        /**
         * 1. Write a program that computes the tax and tip on a restaurant bill. The program should
         *    ask the user to enter the charge for the meal. The tax should be 6.75 percent of the meal
         *    charge. The tip should be 15 percent of the total after adding the tax. Display the meal
         *    charge, tax amount, tip amount, and total bill on the screen.



        // 1. User enters charge for meal.
        String meal = JOptionPane.showInputDialog(null, "Enter Meal Price.");
        double mealprice = Double.parseDouble(meal);

        double TAX = 0.0675, TIP = 0.15;
        double taxAmount, tipAmount, total;
        taxAmount = mealprice * TAX;
        tipAmount = (mealprice + taxAmount) * TIP;
        total = mealprice + taxAmount + tipAmount;


        // Display meal charge, tax amount, tip amount, and total
        System.out.println("Meal: $" + meal + "\n"
                + "Tax : $" + taxAmount + "\n"
                + "Tip amount: $" + tipAmount + "\n"
                + "Total : $" + total);

         */ // erase there and place above 1. to run code.


    }
}
