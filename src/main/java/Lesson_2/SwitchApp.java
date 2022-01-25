package Lesson_2;

public class SwitchApp {
    public static void main(String[] args) {
        /*CheсkOrderStatus("ACCEPTED");
        CheсkOrderStatus("IN_DILIVERY");*/

        checkOrderStatus2("IN_DELIVERY");
        checkOrderStatus2("SHIPPED");
        String month = "Jan";
        switch (month) {
            case "DEC" :
            case "JAN" :
            case "FEB" :{
                System.out.println("Winter");
                break;
            }
        }
    }

    private static void checkOrderStatus2(String shipped) {
    }

    public static void CheсkOrderStatus(String orderStatus) {
        if (orderStatus.equals("ACCEPTED")) {
            System.out.println("Принят");
        } else if (orderStatus.equals("DELIVERED")) {
            System.out.println("Доставлен");

        } else {
            System.out.println("Неизвестный статус заказа");


        }

    }

    public static void CheckOrderStatus2(String orderStatus) {
        switch (orderStatus) {
            case "ACCEPTED": {
                System.out.println("Принят");
                break;
            }
            case "DELIVERED": {
                System.out.println("Доставлен");
                break;
            }
            case "SHIPPED" :
            case "IN_DELIVERY": {
                System.out.println("В доставке");
                break;
            }
                default: {
                System.out.println("Неизвестный статус заказа");
            }
        }

    }
}




