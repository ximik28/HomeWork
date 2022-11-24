import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {

        int minA, maxB, N;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        N = scan.nextInt();
        while (N <= 0) {
            System.out.println("Неверный размер массива! Введите размер массива больше нуля");
        }
        System.out.println("Введите нижний диапазон массива");
        minA = scan.nextInt();
        System.out.println("Введите верхний диапазон массива");
        maxB = scan.nextInt();
        while (maxB <= minA) {
            System.out.println("Неверные диапазоны массива! Верхний диапазон массива должен быть больше нижнего. Введите нижний диапазон массива");
            minA = scan.nextInt();
            System.out.println("Введите верхний диапазон массива");
            maxB = scan.nextInt();
        }
        System.out.println();
        int[] Arr7 = new int[N];
        for (int i = 0; i < Arr7.length; i++) {
            Arr7[i] = (int) ((Math.random() * (maxB - minA)) + minA);
            System.out.print(Arr7[i] + " ");
        }
        System.out.println();

 // теперь сортировка
        int iMax;
        for (int i = Arr7.length - 1; i >= 0; i--) {
            iMax = i;
            for (int j = i; j >= 0; j--) {
                if (Arr7[j] > Arr7[iMax]) {
                    iMax = j;
                }
            }
            if (iMax != i) {
                int temp = Arr7[iMax];
                Arr7[iMax] = Arr7[i];
                Arr7[i] = temp;
            }
        }
        for (int j : Arr7) {
            System.out.print(j + " ");
        }
        System.out.println();

        // линейный поиск
        int k;
        int index = -1;
        int counter1 = 0;
        System.out.println("Введите число, которое нужно найти");
        k = scan.nextInt();
        for (int i = 0; i < Arr7.length; i++) {
            counter1++;
            if (Arr7[i] == k) {
                index = i;
                System.out.println("Искомое число " + k + " находится под индексом " + index + ".");
                break;
            }
        }
        System.out.println("Линейный поиск: " + counter1 + " шагов.");
        if (index < 0) {
            System.out.println("Искомое число в массиве отсутствует.");
        }
        System.out.println();

// двоичный поиск
        int lowIndex = 0;
        int highIndex = Arr7.length -1;
        int elementIndex = -1;
        int counter2 = 0;
        while (lowIndex <= highIndex) {
            counter2++;
            int midIndex = (highIndex + lowIndex) / 2;
            if (k == Arr7[midIndex]) {
                elementIndex = midIndex;
                break;
            } else if (k < Arr7[midIndex]) {
                highIndex = midIndex - 1;
            } else if (k > Arr7[midIndex]) {
                lowIndex = midIndex + 1;
            }
        }
        System.out.println("Двоичный поиск: " + counter2 + " шагов.");
    }
}