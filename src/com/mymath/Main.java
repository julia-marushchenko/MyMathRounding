/**
 *  Java program to demonstrate rounding with Math class.
 */

package com.mymath;

/**
 *  Main class.
 */
public class Main {
    public static void main(String[] args) {

        //Creating variables.
        double a = Math.floor(3.2); // Output: 3.0
        double b = Math.ceil(3.8); // Output: 4.0
        double c = Math.round(3.2); // Output: 3.0
        double d = Math.round(3.8); // Output: 4.0

        // Printing the result.
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}