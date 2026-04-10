package org.example;

import java.util.Scanner;

public class Calculator1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Loan Amount:");

        double principle = input.nextDouble();

        System.out.println("Interest rate:");

        double INTEREST_RATE = input.nextDouble();

        System.out.println("Loan term:");

        int loanLength = input.nextInt();

        double monthlyInterestRate = INTEREST_RATE / 12 / 100; // the interest rate for each month

        int montlyPaymentAmount = 11 * loanLength; // number of monthly payments for however long the loan is

        double monthlyPayment = principle * ( monthlyInterestRate * Math.pow(1 + monthlyInterestRate, montlyPaymentAmount )
                                / ( ( Math.pow( 1 + monthlyInterestRate, montlyPaymentAmount ) ) -1 ) );

        double total_Interest = (monthlyPayment * montlyPaymentAmount) - principle;

        System.out.println();

        System.out.println("Expected Monthly Payment: $" + monthlyPayment);
        System.out.println("Total Interest: $" + total_Interest);




    }
}
