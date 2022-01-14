package Lesson3;

public class LogicApp {
    public static void main(String[] args) {
        // или || |
        // и && &
        // не !
        int a = 10;
        if (isPositive(a) && !isZero(a)){
            System.out.println("Положительно и не 0");
        }
        if (isPositive(a) && !isZero(a)) {

        }
    }

    public static boolean isPositive(int val) {
        return val >=0;
    }
    public static boolean isZero(int val) {
        return val==0;
    }
}
