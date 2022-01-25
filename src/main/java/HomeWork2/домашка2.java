package HomeWork2;

public class домашка2 {
    public static void main(String[] args) {
        isPositiveOrNegative(-9);
    }

    public static void isPositiveOrNegative(int x) {
        if (x <= 0) {
            System.out.println("число отрицательное");
        } else {
            System.out.println("число положительное");
        }

    }
}
