package org.example;

import java.util.Scanner;

public class Calculator2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Deposit amount:");

        double deposit = input.nextDouble();

        System.out.println("Annual Percentage Yield (APY):");

        double ANNUAL_INTEREST_RATE = input.nextDouble();

        System.out.println("CD Term Length:");

        double interest_rate = ANNUAL_INTEREST_RATE / 100;

        int termLength = input.nextInt();

        double futureValue = deposit * ( Math.pow( 1 + ( interest_rate / 365 ), 365 * termLength ) );

        double total_Interest = futureValue - deposit;

        System.out.println();

        System.out.println("Future Value: $" + futureValue);
        System.out.println("Total Interest: $" + total_Interest);

    }
}
