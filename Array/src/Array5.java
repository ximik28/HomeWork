import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        int[] Arr5 = new int[20];
        int minA = 35;
        int maxB = 197;
        for (int i = 0; i < Arr5.length; i++) {
            Arr5[i] = (int) ((Math.random() * (maxB - minA)) - minA);
            System.out.print(Arr5[i] + " ");
        }
        System.out.println();
        Scanner skan = new Scanner (System.in);
        System.out.println("Введите значение, которое нужно найти");
        int n = skan.nextInt();
        int index = -1;
        for (int i = 0; i < Arr5.length; i++) {
            if (Arr5[i] == n) {
                index = i;
                System.out.println("Индекс искомого значения: " + index);
            }
        }
        if (index < 0) {
                System.out.println("Искомое значение отсутствует в массиве");
        }
    }
}
