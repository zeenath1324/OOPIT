

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(Short.MIN_VALUE + " " + Short.MAX_VALUE);

        System.out.println("Enter Principal Amount:");
        int principal = sc.nextInt();

        System.out.println("Enter Rate of Interest:");
        float rate = sc.nextFloat();

        System.out.println("Enter Time (in years):");
        int time = sc.nextInt();

        System.out.println("Enter your Name:");
        String name = sc.next();

        System.out.println("Enter your Gender (M/F):");
        char gender = sc.next().charAt(0);

        double interest = (principal * rate * time) / 100;

        System.out.println("-----------------------------");
        System.out.println("Customer Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Principal Amount: " + principal);
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Time Period: " + time + " years");
        System.out.println("Simple Interest: " + interest);

        if (interest > 1000) {
            System.out.println("Status: High Interest Earned");
        } else {
            System.out.println("Status: Low Interest Earned");
        }

        System.out.println("\n--- Year-wise Interest Report ---");
        for (int i = 1; i <= time; i++) {
            double yearlyInterest = (principal * rate * i) / 100;
            System.out.printf("At the end of year %d: Interest = %.2f%n", i, yearlyInterest);
        }

        System.out.println("-----------------------------");
        System.out.println("Thank you, " + name + "! Have a nice day!");
    }
}
