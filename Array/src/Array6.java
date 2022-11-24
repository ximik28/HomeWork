import java.util.Scanner;

public class Array6 {
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
        int[] Arr6 = new int[N];
        for (int i = 0; i < Arr6.length; i++) {
            Arr6[i] = (int) ((Math.random() * (maxB - minA)) + minA);
            System.out.print(Arr6[i] + " ");
        }
        for (int i = 0; i < Arr6.length / 2; i++) {
            int temp = Arr6[i];
            Arr6[i] = Arr6[Arr6.length - 1 - i];
            Arr6[Arr6.length - 1 - i] = temp;

        }
        System.out.println();
        for (int i = 0; i < Arr6.length; i++) {
            System.out.print(Arr6[i] + " ");
        }
    }
}
