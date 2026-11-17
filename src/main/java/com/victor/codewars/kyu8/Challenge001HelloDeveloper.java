/*
 * SCENARIO:
 *
 * You have just joined a software development company.
 * The HR department needs a simple welcome message for
 * every new developer joining the company.
 *
 * REQUIREMENT:
 *
 * Create a method called greetDeveloper() that receives
 * the developer's name and returns a welcome message.
 *
 * EXPECTED BEHAVIOR:
 *
 * Input:  "Victor"
 * Output: "Hello, Victor!"
 *
 * Input:  "Alice"
 * Output: "Hello, Alice!"
 */

package com.victor.codewars.kyu8;

public class Challenge001HelloDeveloper{
   
    public static String greetingDeveloper(String name){
        return "Hello, " + name + "!";
    }
}
