import java.util.Scanner;
public class Array2 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int arrSize = scan.nextInt();
        while (arrSize <= 0 | arrSize <3) {
            System.out.println("Размер массива должен быть больше нуля и не менее трех. Введите размер массива еще раз");
            arrSize = scan.nextInt();
        }

        System.out.println("Введите минимальное значение массива");
        int min = scan.nextInt();
        System.out.println("Введите максимальное значение массива");
        int max = scan.nextInt();
        while (min >= max) {
            System.out.println("Минимальное значение не должно быть больше максимального. Введите минимальное значение массива");
            min = scan.nextInt();
            System.out.println("Введите максимальное значение массива");
            max = scan.nextInt();
        }
        System.out.println();
        int[] Arr2 = new int[arrSize];
        for(int i= 0; i < Arr2.length; i++) {
            Arr2[i] = (int) ((Math.random() * (max - min)) + min);
            System.out.print(Arr2[i] + " ");
        }
        int iMax = 0;
        for (int i = 0; i < Arr2.length; i++) {
            if (Arr2[i] > Arr2[iMax]){
                iMax = i;
            }

        }
        System.out.println("index: " + iMax + "; value: " + Arr2[iMax]);
    }
}
