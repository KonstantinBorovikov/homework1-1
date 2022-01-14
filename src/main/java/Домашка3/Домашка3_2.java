package Домашка3;

public class Домашка3_2 {
    public static void main(String[] args) {
        fillArray();
        System.out.println();

    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1);
        }
    }
}
