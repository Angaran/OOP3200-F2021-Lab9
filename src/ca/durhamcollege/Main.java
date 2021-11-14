package ca.durhamcollege;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
*  @author Angaran Yogeswaran XXXXXXXXX
*  @author Taylor Bazouzi 100579090
*  @lastModified November 14, 2021
*  @Description Java console program that accepts user inputted scores for three players
*               and then displays the total of each players scores
*
* */


public class
Main {
    private static int TOTAL_ROUNDS = 2;
    private static int TOTAL_PLAYERS = 3;
    private static int score = 0;
    private static int total = 0;
    private static int sum = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"Angaran", "Taylor", "Tom"};

        /* String[] player = new String[3]; */

        //int[][] playerScores = new int[TOTAL_PLAYERS][TOTAL_ROUNDS];

        boolean isTrue = false;
        while (!isTrue) {
            /* Loop through each player, for 10 rounds each */
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
                        isTrue = false;
                    }
                }
                // Output of score average
                int average = sum / TOTAL_ROUNDS;
                System.out.println("Average Score: "+ average);
                //System.out.println("Sum is : " + sum);
            }
        }
    }
}
