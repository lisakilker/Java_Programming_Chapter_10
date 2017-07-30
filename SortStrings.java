/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W5HW;

import java.util.Arrays;

/**
 *
 * @author Lisa
 */
public class SortStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String sortArray[] = {"Me", "Is", "seven", "turkey", "balloon", "pickle", "corporation", "minus", "end", "girl"};

        Arrays.sort(sortArray);

        for (int i = 0; i < sortArray.length; i++) {
            System.out.println(sortArray[i]);
        }

    }

}
