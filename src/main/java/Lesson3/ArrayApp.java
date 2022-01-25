package Lesson3;

public class ArrayApp {
    public static void main(String[] args) {
        int [] array = new int[5];
        //int[] array2 = array;
        array[2]=199;
        array[array.length]=100;
        printArray(array);
    }
    public static void printArray(int[] array){
        for (int i=0; 1< array.length; i++){
            System.out.print(array[i]+"");
        }
        System.out.println();
    }
}
