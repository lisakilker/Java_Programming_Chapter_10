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
public class Horse {

    private String name;
    private String color;
    private int birthYear;

    public Horse(String horseName, String horseColor, int horseBirthYear) {
        this.name = horseName;
        this.color = horseColor;
        this.birthYear = horseBirthYear;
    }

    public void setName(String horseName) {
        this.name = horseName;
    }

    public void setColor(String horseColor) {
        this.color = horseColor;
    }

    public void setBirthYear(int horseBirthYear) {
        this.birthYear = horseBirthYear;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getBirthYear() {
        return birthYear;
    }
}
