import java.util.Scanner;

public class Cycle5 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину большого отрезка A:");
        int a = scan.nextInt();
        System.out.println("Введите длину маленького отрезка B:");
        int b = scan.nextInt();
        int c = 0;
        if (a <= b) {
            System.out.println("Вы ввели неверные размеры отрезков!");
        } else {
            for (int i = a; i >= b; i = i - b) {
                c = c + b;
            }
            System.out.println("Незанятый отрезок равен: " + (a - c));
        }
    }
}
