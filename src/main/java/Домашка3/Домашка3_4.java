package Домашка3;

public class Домашка3_4 {
    public static void main(String[] args) {
        fillDiagonal();
        System.out.println();
    }


    public static void fillDiagonal() {
        int a = 1;
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][i] = a;
                System.out.print(arr[i][j] +  " ");
            }
            System.out.println();
        }
    }
}









