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
public class RaceHorse extends Horse {

    private int races;

    public RaceHorse(String horseName, String horseColor, int horseBirthYear, int numberOfRaces) {
        super(horseName, horseColor, horseBirthYear);
        this.races = numberOfRaces;
    }

    public int getNumberOfRaces() {
        return races;
    }
}
