package ca.durhamcollege;

import java.util.InputMismatchException;
import java.util.Scanner;

public class
Main {
    private static int TOTAL_ROUNDS = 10;
    private static int TOTAL_GAMES = 3;


    public static void main(String[] args) {
	// write your code here        \
        Scanner input = new Scanner(System.in);

        String[] names = {"Angaran", "Taylor", "Tom"};
        String[] players = new String[3];
        int[][] playerScores = new int[3][TOTAL_ROUNDS];

       /* for (int i = 0; i < names.length; i++) {
            System.out.println("Please enter the score for "+ names[i] + game[]);
        }*/
        boolean isTrue = false;
        while (!isTrue) {
            /* Loop through each player, for 10 rounds each */
            for (int i = 0; i <= TOTAL_GAMES; i++) {
                for (int count = 1; count <= TOTAL_ROUNDS ; count++) {

                    try {
                        int score = 0;
                        //System.out.print("Please enter the score for" + players[count] + " : ");
                        System.out.print("Please enter the score for " + names[i] + " in round" + count);
                        score= input.nextInt();
                        isTrue = true;

                        if (score <= 0 || score > 300) {
                            System.out.println("The score must be between 0 and 300");
                            input.nextLine();
                            isTrue = false;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("You must enter a valid integer");
                        input.nextLine();
                        isTrue = false;
                    }



                }
            }
        }

        while (isTrue)
        {



        }

    }

}
