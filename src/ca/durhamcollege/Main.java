package ca.durhamcollege;

import java.util.InputMismatchException;
import java.util.Scanner;

public class
Main {
    private static int TOTAL_ROUNDS = 10;
    private static int TOTAL_GAMES = 3;


    public static void main(String[] args) {
	// write your code here        \
        Scanner scan = new Scanner(System.in);
        int score = 0;
        String[] names = {"Angaran", "Taylor", "Tom"};
        String[] players = new String[3];
        int[][] playerScores = new int[3][TOTAL_ROUNDS];

       /* for (int i = 0; i < names.length; i++) {
            System.out.println("Please enter the score for "+ names[i] + game[]);
        }*/
        boolean isTrue = false;
        while (!isTrue) {

            for (int i = 1; i <= TOTAL_ROUNDS; i++) {
                for (int count = 0; count <= TOTAL_GAMES ; count++) {

                    try {
                        //System.out.print("Please enter the score for" + players[count] + " : ");
                        System.out.print("Please enter the score for " + names[1]);
                        playerScores[count][i] = scan.nextInt();

                        score = scan.nextInt();
                        isTrue = true;

                        if (score <= 0 || score > 300) {
                            System.out.println("The score must be between 0 and 300");
                            scan.nextLine();
                            isTrue = false;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("You must enter a valid integer");
                        scan.nextLine();
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
