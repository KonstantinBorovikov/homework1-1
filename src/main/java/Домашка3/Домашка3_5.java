package Домашка3;

public class Домашка3_5 {
    public static void main(String[] args) {
        printArrayInConsole(retLenArr(0,0));
        System.out.println();
    }


        public static int[] retLenArr ( int len, int initialValue){
            int arr[] = new int[5];
            initialValue = 34;

            for (int i = 0; i < arr.length; i++) {
                arr[i] = initialValue;
            }
            return arr;
        }

        public static void printArrayInConsole ( int[] inputArray){
            for (int i = 0; i < inputArray.length; i++) {
                System.out.print(inputArray[i] + " ");
            }
            System.out.println();
        }
    }



