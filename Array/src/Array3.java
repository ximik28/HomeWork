import java.util.Scanner;
public class Array3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int N = scan.nextInt();
        while (N <= 0 | N <3) {
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

        int[] Arr3 = new int[N];
        for(int i= 0; i < Arr3.length; i++) {
            Arr3[i] = (int) ((Math.random() * (maxB - minA)) + minA);
            System.out.print(Arr3[i] + " ");
        }
        System.out.println();
        int iMax = 0;
        for (int i = 0; i < Arr3.length; i++) {
            if(Arr3[i] > Arr3[iMax]) {
                iMax = i;
            }
        }
        System.out.println("Максимальное значение: " + Arr3[iMax] + " Индекс элемента: " + iMax);
    }
}
