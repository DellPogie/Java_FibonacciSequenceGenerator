
// set the package name
package com.dellpogie;

// add reference to the Java Standard Library
import java.util.Scanner;

// create Fibonacci class
public class FibonacciSequenceGenerator {

    // entry point in Java
    public static void main(String[] args) {

        // user input listener
        Scanner scanner = new Scanner(System.in);

        // display intro
        System.out.println("\nDellPogie 2024 - Java Portfolio using the Java Standard Library\n");
        System.out.println("FIBONACCI SEQUENCE GENERATOR\n");

        /* ask the user to input the number of terms
           Note: Just be careful of your input, it may consume a lot of memory. */
        System.out.print("Input the number of terms in the Fibonacci sequence: ");

        // scan for user input
        int intNumberOfTerms = scanner.nextInt();

        // process and display the Fibonacci sequence
        System.out.println("\nFibonacci Sequence:");
        for (int i = 0; i < intNumberOfTerms; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        // aesthetics lang hehe
        System.out.print("\n\n\n");

        // clear the memory
        scanner.close();

    }

    // method to process the Fibonacci number at position x
    public static int fibonacci(int x) {

        if (x <= 1) {
            return x;
        }

        return fibonacci(x - 1) + fibonacci(x - 2);

    }
}
