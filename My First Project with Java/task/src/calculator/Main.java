package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println(""" 
            Earned amount:
            Bubblegum: $202
            Toffee: $118
            Ice cream: $2250
            Milk chocolate: 1680
            Doughnut: $1075
            Pancake: $80""");

           int Income =  5405;

        System.out.println("Income:" + Income);

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println(" Staff expenses: ");

       int staffExpenses = Integer.parseInt(myObj.nextLine());  // Read user input
        System.out.println( staffExpenses  );  // Output user input

        System.out.println("Other expenses: ");

        int otherExpenses = Integer.parseInt(myObj.nextLine());  // Read user input
        System.out.println( otherExpenses  );  // Output user input
         int netIncome = Income - staffExpenses - otherExpenses;   // Output user input
        System.out.println("Net income: "  + netIncome);






    }
}

