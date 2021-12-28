package Lesson_2;
/*создать поле6х6 и заполнить его звездочками*/
public class DemoApp {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == j) {
                    System.out.print(" 0");
                } else {
                    System.out.print(" *");
                }
                }
                System.out.println();
            }
        }
    }