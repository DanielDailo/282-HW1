package isDivisible;

//Write a method that returns whether a is divisible by b.
//
//Your method signature should be
//
//public boolean isDivisible(int a, int b)

public class IsDivisible {

    public boolean isDivisible(int a, int b){
        if (a % b == 0){
            return true;
        } else {
            return false;
        }
    }
//    public static boolean isDivisible(int a, int b){
//        if (a % b == 0){
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(isDivisible(2, 1));
//    }

}
