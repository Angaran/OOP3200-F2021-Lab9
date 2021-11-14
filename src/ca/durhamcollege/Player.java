package ca.durhamcollege;

import java.util.Scanner;

public class Player {
    private static int TOTAL_ROUNDS = 10;
    private static int TOTAL_PLAYERS = 3;
    private static int score = 0;

    Scanner input = new Scanner(System.in);

    String[] name = {"Angaran", "Taylor", "Tom"};
    String[] player = new String[3];
    int[][] playerScores = new int[TOTAL_PLAYERS][TOTAL_ROUNDS];

    public Player(String[] names, int inputScore)
    {
        name = names;
        score = inputScore;
    }
    public String[] getName()
    {
        return name;
    }
    public String[] setName(String[] names)
    {
        return names;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int inScore)
    {
        score = inScore;
    }



}
