package ca.durhamcollege;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
*  @author Angaran Yogeswaran XXXXXXXXX
*  @author Taylor Bazouzi 100579090
*  @lastModified November 14, 2021
*  @Description Java console program that accepts user inputted scores for three players
*               and then displays the average of each players scores
*
* */

public class
Main {
    // Variable Declarations
    private static int TOTAL_ROUNDS = 2;
    private static int TOTAL_PLAYERS = 3;
    private static int score = 0;
    private static double average = 0;
    private static double sum = 0;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] names = {"Angaran", "Taylor", "Tom"};
        boolean isTrue = false;

        while (!isTrue) {
            // Loop through each player, for 2 rounds each
            for (int p = 0 ; p <= TOTAL_PLAYERS; p++)
            {
                for (int count = 1; count <= TOTAL_ROUNDS; count++)
                {
                    try
                    {
                        // Error output
                        System.out.printf("Please enter the score for " + names[p] + " in round" + count);
                        score = input.nextInt();
                        isTrue = true;

                        if (score <= 0 || score > 300)
                        {
                            // Error output
                            System.out.println("The score must be between 0 and 300");
                            input.nextLine();
                            isTrue = false;
                        } else {
                            sum += score;
                        }
                    } catch (InputMismatchException e) {
                        // Error output
                        System.out.println("You must enter a valid integer");
                        input.nextLine();
                        isTrue = true;
                    }
                }
                // Output of score average
                average = sum / TOTAL_ROUNDS;
                sum = 0;
                System.out.println("Average Score: "+ average);
            }
        }
    }
}
