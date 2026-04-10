package org.example;

import java.util.Scanner;

public class Calculator3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Monthly Payout: ");

        double monthlyPayout = input.nextDouble();

        System.out.println("Expected Interest Rate:");

        double interestRate = input.nextDouble();

        System.out.println("Years to pay out:");

        int years = input.nextInt();

        double MONTHLY_INTEREST_RATE = interestRate / 12 / 100;

        int totalNumPayments = years * - 12;

        double presentValue = monthlyPayout * ( ( 1 - ( Math.pow( 1 + MONTHLY_INTEREST_RATE, ( totalNumPayments ) ) ) )
                                / MONTHLY_INTEREST_RATE);

        System.out.println();

        System.out.println("Present Value: $" + presentValue);
    }
}
