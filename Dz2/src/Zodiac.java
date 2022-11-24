public class Zodiac {
    public static void main(String[] args) {
        int d = 5;
        int m = 6;
        switch (m) {
            case 1:
                if(d >= 20 && d <= 31) {
                    System.out.println("Ваш знак - Водолей");
                } else if (d >= 1 && d <= 19) {
                    System.out.println("Ваш знак - Козерог");
                } else {
                    System.out.println("Введите число от 1 до 31");
                } break;
            case 2:
                if(d >= 1 && d <= 18) {
                    System.out.println("Ваш знак - Водолей");
                } else if (d >= 19 && d <= 29) {
                    System.out.println("Ваш знак - Рыбы");
                } else {
                    System.out.println("Введите число от 1 до 29");
                } break;
            case 3:
                if(d >= 1 && d <= 20) {
                    System.out.println("Ваш знак - Рыбы");
                } else if (d >= 21 && d <= 31) {
                    System.out.println("Ваш знак - Овен");
                } else {
                    System.out.println("Введите число от 1 до 31");
                } break;
            case 4:
                if(d >= 1 && d <= 19) {
                    System.out.println("Ваш знак - Овен");
                } else if (d >= 20 && d <= 30) {
                    System.out.println("Ваш знак - Телец");
                } else {
                    System.out.println("Введите число от 1 до 30");
                } break;
            case 5:
                if(d >= 1 && d <= 20) {
                    System.out.println("Ваш знак - Телец");
                } else if (d >= 21 && d <= 31) {
                    System.out.println("Ваш знак - Близнецы");
                } else {
                    System.out.println("Введите число от 1 до 31");
                } break;
            case 6:
                if(d >= 1 && d <= 21) {
                    System.out.println("Ваш знак - Близнецы");
                } else if (d >= 22 && d <= 30) {
                    System.out.println("Ваш знак - Рак");
                } else {
                    System.out.println("Введите число от 1 до 30");
                } break;
            case 7:
                if(d >= 1 && d <= 22) {
                    System.out.println("Ваш знак - Рак");
                } else if (d >= 23 && d <= 31) {
                    System.out.println("Ваш знак - Лев");
                } else {
                    System.out.println("Введите число от 1 до 31");
                } break;
            case 8:
                if(d >= 1 && d <= 22) {
                    System.out.println("Ваш знак - Лев");
                } else if (d >= 23 && d <= 31) {
                    System.out.println("Ваш знак - Дева");
                } else {
                    System.out.println("Введите число от 1 до 31");
                } break;
            case 9:
                if(d >= 1 && d <= 22) {
                    System.out.println("Ваш знак - Дева");
                } else if (d >= 23 && d <= 30) {
                    System.out.println("Ваш знак - Весы");
                } else {
                    System.out.println("Введите число от 1 до 30");
                } break;
            case 10:
                if(d >= 1 && d <= 22) {
                    System.out.println("Ваш знак - Весы");
                } else if (d >= 23 && d <= 31) {
                    System.out.println("Ваш знак - Скорпион");
                } else {
                    System.out.println("Введите число от 1 до 31");
                } break;
            case 11:
                if(d >= 1 && d <= 22) {
                    System.out.println("Ваш знак - Скорпион");
                } else if (d >= 23 && d <= 30) {
                    System.out.println("Ваш знак - Стрелец");
                } else {
                    System.out.println("Введите число от 1 до 30");
                } break;
            case 12:
                if(d >= 1 && d <= 21) {
                    System.out.println("Ваш знак - Стрелец");
                } else if (d >= 22 && d <= 31) {
                    System.out.println("Ваш знак - Козерог");
                } else {
                    System.out.println("Введите число от 1 до 30");
                } break;
            default:
            {
                System.out.println("Введите номер месяца от 1 до 12");
            }
        }
    }
}
