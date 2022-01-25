package Домашка3;

public class Домашка3_3 {
    public static void main(String[] args) {
        chngeArray();
        System.out.println();
    }

    public static void chngeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                System.out.println(arr[i] * 2);


            }
        }
    }
}