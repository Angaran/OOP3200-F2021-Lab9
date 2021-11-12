package ca.durhamcollege;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here        \
        Scanner scan = new Scanner(System.in);
        int score = 0;
        String[] names = {"Angaran", "Taylor", "Tom"};

       /* for (int i = 0; i < names.length; i++) {
            System.out.println("Please enter the score for "+ names[i] + game[]);
        }*/
        boolean isTrue = false;
        while (!isTrue)
        {
            System.out.print("Please enter the score for " +names[1]);
            try
            {
                score = scan.nextInt();
                isTrue =true;

                if (score <= 0 || score > 300)
                {
                    System.out.println("The score must be between 0 and 300");
                    scan.nextLine();
                    isTrue = false;
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("You must enter a valid integer");
                scan.nextLine();
                isTrue = false;
            }
        }

    }
}
