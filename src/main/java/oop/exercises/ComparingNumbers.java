/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises;
import java.util.Scanner;

public class ComparingNumbers
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        String input = in.nextLine();
        int first = Integer.parseInt(input);
        System.out.print("Enter the second number: ");
        input = in.nextLine();
        int second = Integer.parseInt(input);
        System.out.print("Enter the third number: ");
        input = in.nextLine();
        int third = Integer.parseInt(input);
        int largest = first;

        if(first == second && second == third)
        {
            return;
        }
        if(second > largest)
        {
            largest = second;
        }
        if(third > largest)
        {
            largest = third;
        }

        System.out.printf("The largest number is %d.", largest);
    }
}
