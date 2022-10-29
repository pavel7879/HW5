public class HW5 {
    public static void main (String[] args) {
System.out.println("Задание 1");
int clientOS = 1;
if (clientOS == 1) {
    System.out.println("Установите версию приложения для Android по ссылке");
} else {
    System.out.println("Установите версию приложения для iOS по ссылке");
}
System.out.println("Задание 2. Вариант 1");
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылкее");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        System.out.println("Задание 2. Вариант 2. Сложный и громоздкий");
        if (clientOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылкее");
            }
        }
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        System.out.println("Задание 3");
        int year = 2021;
        if ((year % 400 ==0) || ((year % 4 ==0) && (year % 100 !=0))) {
            System.out.println( + year + " год является високосным");
        } else {
            System.out.println( + year + " год не является високосным");
        }
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance <= 20) {
            int time = 1 * day;
            System.out.println("Потребуется дней:" + time +"");
        }  else if (deliveryDistance > 20 && deliveryDistance <= 60){
            int time = 2 * day;
            System.out.println("Потребуется дней:" + time +"");
        }  else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            int time = 3 * day;
            System.out.println("Потребуется дней:" + time + "");
        }
        System.out.println("Задание 5");
        int monthNumber  = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                 break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
