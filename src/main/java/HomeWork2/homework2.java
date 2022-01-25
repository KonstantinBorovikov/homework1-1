package HomeWork2;

public class homework2 {
    public static void main(String[] args) {
        System.out.println(within10and20(10,3));
    }
    public static boolean within10and20(int x1, int x2){
        int sum = x1+x2;

        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;

        }
    }
}






















