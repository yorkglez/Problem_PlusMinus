package com.problemplusminus.app;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        //Variables declaration
        int arrayElements = 5;

        //Object declaration
        Scanner in = new Scanner(System.in);

        //Input
        arrayElements = in.nextInt();

        //Array declaration
        int arrayNumbers[] = new int[arrayElements];
//        int arrayNumbers[] = {1, 1, 0, -1, -1};

       //Add numbers to array
        for(int i = 0; i < arrayElements; i++)
        {
            arrayNumbers[i] = in.nextInt();
        }

        //output result
        plusMinus(arrayNumbers);

        //close input
        in.close();
    }

    static void plusMinus(int[] arr)
    {
        //Variables declaration
        double zeroCount = 0.0;
        double positiveCount = 0.0;
        double negativeCount = 0.0;

        //Process
        for(int i = 0; i < arr.length; i++)
        {
            //Validate negative numbers
            if(arr[i] <= -1)
            {
                negativeCount++;
            }

            //Validate positive numbers
            if(arr[i] > 0)
            {
                positiveCount++;
            }

            //Validate negatives numbers
            if(arr[i] == 0)
            {
                zeroCount++;
            }
        }

        //Object declaration
        DecimalFormat decimalFormat = new DecimalFormat("#0.00000");

        //Output results
        System.out.println(decimalFormat.format(positiveCount / arr.length));
        System.out.println(decimalFormat.format(negativeCount / arr.length));
        System.out.println(decimalFormat.format(zeroCount / arr.length));
    }
}
