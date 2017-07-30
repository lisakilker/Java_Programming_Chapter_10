/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W5HW;
//import W5HW.DoublesTennisGame;

/**
 *
 * @author Lisa
 */
public class TennisGame {

    private String playerOneName;
    private String playerTwoName;
    private int playerOneFinalScore;
    private int playerTwoFinalScore;
    private int winningNames;
    private String returnError;
    public static String GAME_WIN_NAMES[] = {"LOVE", "15", "30", "40", "GAME"};

    public TennisGame() {
        this("Jane Doe", "John Doe", 0, 0);
    }

    public TennisGame(String firstPlayerName, String secondPlayerName, int firstPlayerScore, int secondPlayerScore) {
        this.playerOneName = firstPlayerName;
        this.playerTwoName = secondPlayerName;
        this.playerOneFinalScore = firstPlayerScore;
        this.playerTwoFinalScore = secondPlayerScore;
    }

    public String getPlayerOneName() {
        return playerOneName;
    }

    public String getPlayerTwoName() {
        return playerTwoName;
    }

    public void setPlayerNames(String firstPlayerName, String secondPlayerName) {
        this.playerOneName = firstPlayerName;
        this.playerTwoName = secondPlayerName;
    }

    public int getPlayerOneFinalScore() {
        return playerOneFinalScore;
    }

    public int getPlayerTwoFinalScore() {
        return playerTwoFinalScore;
    }

    public void setPlayerFinalScore(int firstPlayerScore, int secondPlayerScore) {
        playerOneFinalScore = firstPlayerScore;
        playerTwoFinalScore = secondPlayerScore;
        

        if (firstPlayerScore < GAME_WIN_NAMES.length || firstPlayerScore > GAME_WIN_NAMES.length) {
            playerOneFinalScore = 0;
            returnError = "ERROR";
            if (secondPlayerScore < GAME_WIN_NAMES.length || firstPlayerScore > GAME_WIN_NAMES.length) {
                playerTwoFinalScore = 0;
                returnError = "ERROR";
            } else {
                playerOneFinalScore = firstPlayerScore;
                playerTwoFinalScore = secondPlayerScore;
            }
        }
    }

    public void setGameWinningName(int gameWinningNames) {
        winningNames = gameWinningNames;

    }
         public String getWinName(int i) {
        return GAME_WIN_NAMES[i];
    }
}



