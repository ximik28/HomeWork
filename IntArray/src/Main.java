import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IntArray myArray1 = new IntArray();

        System.out.println("Введите минимальное значение массива: ");
        Scanner scan = new Scanner(System.in);
        int minA = scan.nextInt();
        System.out.println("Введите максимальное значение массива: ");
        int maxB = scan.nextInt();
        System.out.println();

        for (int i = 0; i < myArray1.getMyarrayLength(); i++) {
            myArray1.setMyarray((int) ((Math.random() * (maxB - minA)) + minA), i);

        }
        System.out.println("Массив myArray1: ");
        myArray1.print();
        System.out.println();
        System.out.println("Для сортировки массива по убыванию или возрастанию введите число меньше 0 или больше 0");
        int N = scan.nextInt();
        myArray1.sort(N);
        myArray1.print();
        System.out.println();
        System.out.println();

        int K;
        System.out.println("Введите количество элементов второго массива");
        K = scan.nextInt();
        IntArray myArray2 = new IntArray(K);
        System.out.println("Массив myArray2: ");

        for (int i = 0; i < myArray2.getMyarrayLength(); i++) {
            myArray2.setMyarray((int) ((Math.random() * (maxB - minA)) + minA), i);
        }
        myArray2.print();
        System.out.println();
        System.out.println("Для сортировки массива по убыванию или возрастанию введите число меньше 0 или больше 0");
        N = scan.nextInt();
        myArray2.sort(N);
        myArray2.print();
        System.out.println();

        int[] myArray3 = new int[15];
        System.out.println();
        System.out.println("Массив myArray3: ");

        for (int i = 0; i < myArray3.length; i++) {
            myArray3[i] = ((int) ((Math.random() * (maxB - minA)) + minA));
        }

        IntArray myArray4 = new IntArray(myArray3);
        myArray4.print();
        System.out.println();
        System.out.println("Для сортировки массива по убыванию или возрастанию введите число меньше 0 или больше 0");
        N = scan.nextInt();
        myArray4.sort(N);
        myArray4.print();
    }
}
