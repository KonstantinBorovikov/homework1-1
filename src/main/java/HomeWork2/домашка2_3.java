package HomeWork2;

public class домашка2_3 {
    public static void main(String[] args) {
        isNegative(7);


    }

    public static boolean isNegative(int x) {
        if (x < 0) {
            System.out.println("-");
            return true;
        } else {
            System.out.println("+");
            return false;
        }
    }
}



