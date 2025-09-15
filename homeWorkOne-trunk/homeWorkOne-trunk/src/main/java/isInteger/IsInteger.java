package isInteger;

public class IsInteger {

//    Given a string, determine if it is an integer. For example the
//    string “123” is an integer, but the string “hello” is not.
//
//    It is an integer if all of the characters in the string are digits.
//
//    Return true if it is an integer, or false if it is not.
//

    String aString = "maximum";

    public boolean stringComparison(String aString){
        int anInt = Integer.parseInt(aString);
        String theInt = Integer.toString(anInt);
        if (aString.equals(theInt)){
            return true;
        } else {
            return false;
        }
}

}
