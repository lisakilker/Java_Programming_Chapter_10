/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W5HW;

/**
 *
 * @author Lisa
 */
public class DoublesTennisGame extends TennisGame {

    private String doublesPartnerOne;
    private String doublesPartnerTwo;
    
    public DoublesTennisGame(){
        this("Jane Doe", "John Doe", 0,0,"Janet Doe", "Jack Doe");
    }

    public DoublesTennisGame(String firstPlayerName, String secondPlayerName, int firstPlayerScore, int secondPlayerScore, String firstDoublesPartner, String secondDoublesPartner) {
        super(firstPlayerName, secondPlayerName, firstPlayerScore, secondPlayerScore);
        this.doublesPartnerOne = firstDoublesPartner;
        this.doublesPartnerTwo = secondDoublesPartner;
    }

    public String getDoublesPartnerOne() {
        return doublesPartnerOne;
    }

    public String getDoublesPartnerTwo() {
        return doublesPartnerTwo;
    }
    
    public void setDoublesPartnerOne(String firstDoublesPartner){
        this.doublesPartnerOne = firstDoublesPartner;
    }
    
    public void setDoublesPartnerTwo(String secondDoublesPartner){
        this.doublesPartnerTwo = secondDoublesPartner;
    }
}

