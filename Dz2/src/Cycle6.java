import java.util.Scanner;

public class Cycle6 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину прямоугольника:");
        int a = scan.nextInt();
        System.out.println("Введите ширину прямоугольника:");
        int b = scan.nextInt();
        System.out.println("Введите сторону квадрата:");
        int c = scan.nextInt();
        int k = 0;
        int n = 0;
        while (a >= c) {
            a -= c;
            k++;
        }
        while (b >= c) {
            b -= c;
            n++;
        }
        int total = 0;
        for (int i = 0; i < k; i++)
            total = total + n;
        System.out.println("N = " + total);
    }
}
