/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gallonstoliters;

/**
 *
 * @author Rob
 */
public class GallonsToLiters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gallons; //contains number of gallons
        double liters; //contains number of liters
        
        gallons = 10; //initializes number of gallons
        liters = gallons *3.8754; //initializes number of liters
        
        //outputs the conversion to the screen
        System.out.println(gallons + " gallons is " + liters + " liters");
        
    }
    
}
