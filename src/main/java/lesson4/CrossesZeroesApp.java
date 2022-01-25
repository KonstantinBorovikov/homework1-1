package lesson4;
import java.util.Arrays;

public class CrossesZeroesApp {
    //поле
    public static char[][] map;
    //размер поля
    public static final int SIZE = 3;
    //Точек для победы
    public static final int DOTS_TO_WIN = 3;

    //Описание точек
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'x';
    public static final char DOT_0 = 'y';

    /**
     * проинициализировать поле.
     */
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i< map.length; i++){
            for (int j = 0; j< map[i].length;j++){
                map[i][j] = DOT_EMPTY;
            }

            //Arrays.fill(map[i],DOT_EMPTY); тоже самое но проще писать
        }

    }

    public static void printMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j< map[i].length;j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        initMap();
        printMap();


    }
}
