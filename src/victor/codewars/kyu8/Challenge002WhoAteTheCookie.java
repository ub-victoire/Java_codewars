package victor.codewars.kyu8;

import java.util.Objects;

/**
 * Challenge 001 - Who ate the cookie?
 * Level:    8 kyu
 * Tags:     Fundamentals
 * Codewars: https://www.codewars.com/kata/55a996e0e8520afab9000055
 *
 * SCENARIO
 *   You look after the office snack jar. A bot reads each message and blames
 *   someone for the missing cookie. Text blames Zach, numbers blame Monica,
 *   and anything else blames the dog.
 *
 * INSTRUCTIONS (from Codewars)
 *   For this problem you must create a program that says who ate the last cookie.
 *   If the input is a string then "Zach" ate the cookie.
 *   If the input is a Double or an Integer then "Monica" ate the cookie.
 *   If the input is anything else "the dog" ate the cookie.
 *   The way to return the statement is:
 *   "Who ate the last cookie? It was (name)!"
 *
 *   Ex: Input = "hi" --> Output = "Who ate the last cookie? It was Zach!"
 *   (The reason you return Zach is because the input is a string)
 *
 *   Note: Make sure you return the correct message with correct spaces and punctuation.
 *
 * SYNTAX TO REMEMBER
 *   x instanceof String   -> true when x is a text value
 *   if / else if / else   -> choose exactly one branch
 */
public class Challenge002WhoAteTheCookie {

    public static String whoAteTheCookie(Object x) {
        String name;
        if (x instanceof String) {
            name = "Zach";
        } else if (x instanceof Integer || x instanceof Double) {
            name = "Monica";
        } else {
            name = "the dog";
        }
        return "Who ate the last cookie? It was " + name + "!";
    }

    public static void main(String[] args) {
        check("text input", whoAteTheCookie("hi"), "Who ate the last cookie? It was Zach!");
        check("integer input", whoAteTheCookie(5), "Who ate the last cookie? It was Monica!");
        check("double input", whoAteTheCookie(2.5), "Who ate the last cookie? It was Monica!");
        check("boolean input", whoAteTheCookie(true), "Who ate the last cookie? It was the dog!");
    }

    private static void check(String label, Object actual, Object expected) {
        if (Objects.equals(actual, expected)) {
            System.out.println("PASS  " + label);
        } else {
            System.out.println("FAIL  " + label + ": got " + actual + ", expected " + expected);
        }
    }
}


/**
Explaination of some key concept

public static String whoAteTheCookie(Object x)

- Object = the dat type
x = the variable name that stores the value passed into the method

and x can receive different types of objects

Java determine the value accordingly

- instanceof?
is 


**/
