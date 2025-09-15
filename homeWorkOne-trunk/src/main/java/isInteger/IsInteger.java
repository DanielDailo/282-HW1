package isInteger;

import java.util.Scanner;

public class IsInteger {

    //    Given a string, determine if it is an integer. For example the
//    string “123” is an integer, but the string “hello” is not.
//
//    It is an integer if all of the characters in the string are digits.
//
//    Return true if it is an integer, or false if it is not.
//

    public static boolean isString(String aString){
        try {
            Integer.parseInt(aString);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String aString = input.nextLine();
        input.close();
        System.out.print(isString(aString));
    }

}
