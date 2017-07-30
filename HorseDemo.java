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
public class HorseDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Horse aHorse = new Horse("Buttercup", "Brown", 2002);
        System.out.println("***A new horse***");
        System.out.println("Name: " + aHorse.getName());
        System.out.println("Color: " + aHorse.getColor());
        System.out.println("Year of birth: " + aHorse.getBirthYear());

        RaceHorse raceHorse = new RaceHorse("Milton", "Black", 2007, 49);
        System.out.println("***A new race horse***");
        System.out.println("Name: " + raceHorse.getName());
        System.out.println("Color: " + raceHorse.getColor());
        System.out.println("Year of Birth: " + raceHorse.getBirthYear());
        System.out.println("Number of races: " + raceHorse.getNumberOfRaces());
    }

}
