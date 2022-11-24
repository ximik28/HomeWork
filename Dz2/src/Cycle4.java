import java.util.Scanner;

public class Cycle4 {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        System.out.println("Введите число А:");
        int a = skan.nextInt();
        System.out.println("Введите число В, большее чем число А:");
        int b = skan.nextInt();
        if (a >= b) {
            System.out.println("Число В должно быть больше числа А!");
        } else

            for (int i = b - 1; i > a; i--) {
                System.out.print(i + " ");

            }
        System.out.println();
        System.out.println(b - a - 1);
    }
}
