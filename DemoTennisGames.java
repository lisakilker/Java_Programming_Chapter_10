/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W5HW;

import java.util.Scanner;

/**
 *
 * @author Lisa
 */
public class DemoTennisGames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TennisGame tennisGame[] = new TennisGame[3];
        DoublesTennisGame doubleGame[] = new DoublesTennisGame[3];

        for (int i = 0; i < tennisGame.length; i++) {
            TennisGame aTennisGame = new TennisGame();
            DoublesTennisGame aDoublesGame = new DoublesTennisGame();
            System.out.println("*****New Game*****");
            aTennisGame.setPlayerNames(getPlayerOneName(), getPlayerTwoName());
            aTennisGame.setGameWinningName(getPlayerOneFinalScore());
            aTennisGame.setGameWinningName(getPlayerTwoFinalScore());
            aDoublesGame.setDoublesPartnerOne(getPlayerOneDouble());
            aDoublesGame.setDoublesPartnerTwo(getPlayerTwoDouble());
            displayGameDetails(aTennisGame);
            displayDoublesDetails(aDoublesGame);
        }
    }

    public static String getPlayerOneName() {
        String nameOne;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter player one name: ");
        nameOne = input.nextLine();
        return nameOne;
    }

    public static String getPlayerTwoName() {
        String nameTwo;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter player two name: ");
        nameTwo = input.nextLine();
        return nameTwo;
    }

    public static int getPlayerOneFinalScore() {
        int playerOneScore;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter player one's score ");
        playerOneScore = input.nextInt();
        return playerOneScore;
    }

    public static int getPlayerTwoFinalScore() {
        int playerTwoScore;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter player two's score ");
        playerTwoScore = input.nextInt();
        return playerTwoScore;
    }

    public static String getPlayerOneDouble() {
        String nameOneDouble;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter player one double partner name: ");
        nameOneDouble = input.nextLine();
        return nameOneDouble;
    }

    public static String getPlayerTwoDouble() {
        String nameTwoDouble;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter player two double partner name: ");
        nameTwoDouble = input.nextLine();
        return nameTwoDouble;
    }

    public static void displayGameDetails(TennisGame gameOne) {
        System.out.println();
        System.out.println("--GAME DETAILS--");
        System.out.println("Game players are one and two are: " + gameOne.getPlayerOneName() + " and " + gameOne.getPlayerTwoName());
        System.out.println("Game final scores for players one and two are: " + gameOne.getWinName(gameOne.getPlayerOneFinalScore()) + " and " + gameOne.getWinName(gameOne.getPlayerTwoFinalScore()));
    }

    public static void displayDoublesDetails(DoublesTennisGame gameOne) {
        System.out.println("Doubles partners for one and two are: " + gameOne.getDoublesPartnerOne() + " and " + gameOne.getDoublesPartnerTwo());
    }
}
