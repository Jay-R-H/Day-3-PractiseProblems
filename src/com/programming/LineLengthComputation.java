package com.programming;

import java.util.Scanner;

public class LineLengthComputation {

    public static void main(String[] args) {
        // The co-ordinates below represents the line-1
        Scanner p1 = new Scanner(System.in);
        System.out.println("Enter the co-ordinate for pt X1");
        double X1 = p1.nextDouble();

        Scanner p2 = new Scanner(System.in);
        System.out.println("Enter the co-ordinate for pt Y1");
        double Y1 = p2.nextDouble();

        Scanner p3 = new Scanner(System.in);
        System.out.println("Enter the co-ordinate for pt X2");
        double X2 = p3.nextDouble();

        Scanner p4 = new Scanner(System.in);
        System.out.println("Enter the co-ordinate for pt Y2");
        double Y2 = p4.nextDouble();
        // The co-ordinates below represents the line-2
        Scanner q1 = new Scanner(System.in);
        System.out.println("Enter the co-ordinate for pt x1");
        double x1 = q1.nextDouble();

        Scanner q2 = new Scanner(System.in);
        System.out.println("Enter the co-ordinate for pt y1");
        double y1 = q2.nextDouble();
        Scanner q3 = new Scanner(System.in);
        System.out.println("Enter the co-ordinate for pt x2");
        double x2 = q3.nextDouble();
        Scanner q4 = new Scanner(System.in);
        System.out.println("Enter the co-ordinate for pt y2");
        double y2 = q4.nextDouble();

        // To calculate the length of the line L1 from the given co-ordinates

        double lengthL1 = Math.sqrt((Math.pow((X2 - X1), 2)) + (Math.pow((Y2 - Y1), 2)));
        String s1 = Double.toString(lengthL1);
        System.out.println("The length of the line-L1 is = " + lengthL1);

        // To calculate the length of the line L2 from the given co-ordinates

        double lengthL2 = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        String s2 = Double.toString(lengthL2);
        System.out.println("The length of the line-L2 is = " + lengthL2);

        // To compare the lengths of the lines to print the result
        if (s1.equals(s2)) {
            System.out.println("Both the lines L1 and L2 have same length");
        } else if (s1.compareTo(s2) > 0) {
            System.out.println("The length of the line L1 is greater than the length of the line L2");
        } else if (s1.compareTo(s2) < 0) {
            System.out.println("The length of the line L2 is greater than the length of the line L1");

        }
    }
}
