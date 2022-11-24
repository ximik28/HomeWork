import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int N = scan.nextInt();
        while (N <= 0 | N < 3) {
            System.out.println("Размер массива должен быть больше нуля и не менее трех. Введите размер массива еще раз");
            N = scan.nextInt();
        }

        System.out.println("Введите минимальное значение массива");
        int minA = scan.nextInt();
        System.out.println("Введите максимальное значение массива");
        int maxB = scan.nextInt();
        while (minA >= maxB) {
            System.out.println("Минимальное значение не должно быть больше максимального. Введите минимальное значение массива");
            minA = scan.nextInt();
            System.out.println("Введите максимальное значение массива");
            maxB = scan.nextInt();
        }
        System.out.println();
        int[] Arr4 = new int[N];
        for (int i = 0; i < Arr4.length; i++) {
            Arr4[i] = (int) ((Math.random() * (maxB - minA)) + minA);
            System.out.print(Arr4[i] + " ");
        }
        System.out.println();
        for (int a = 0; a < Arr4.length; a++) {
            for (int i = 0; i < Arr4.length - a - 1; i++) {
                if (Arr4[i] < Arr4[i + 1]) {
                    int t = Arr4[i];
                    Arr4[i] = Arr4[i + 1];
                    Arr4[i + 1] = t;
                }
            }
        }
        for (int j : Arr4) System.out.print(j + " ");
    }
}