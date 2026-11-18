/*
* CHALLENGE 001: HELLO DEVELOPER
*
* Scenario:
* You are developing a welcome system for a software
* development bootcamp. Each new developer should
* receive a personalize welcome message.
*
* Requirement:
* Create a method that accepts a deveper's name
* and return a welcome message
*/

package victor.codewars.kyu8;

public class Challenge001HelloDeveloper{

    public static String greetingDeveloper(String name){
        return "Hello, " + name + "!";
    }

    public static void main(String[] args){
        String result = greetDeveloper("Victor");

        System.out.println(result);
    }
}
