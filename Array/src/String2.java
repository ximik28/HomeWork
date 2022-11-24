import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        System.out.println("Введите любую фразу");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        while (str.isEmpty()) {
            System.out.println("Строка не может быть пустой! Введите фразу еще раз");
            str = scan.nextLine();
        }


        System.out.println("Введите символ 'a', который хотите заменить");
        String a = scan.nextLine();
        while (a.isEmpty()) {
            System.out.println("Строка символа не может быть пустой! Введите символ 'a' еще раз");
            a = scan.nextLine();
        }
        char[] arrA = a.toCharArray();

        System.out.println("Введите символ 'b', на который хотите заменить символ 'а'");
        String b = scan.nextLine();
        while (b.isEmpty()) {
            System.out.println("Строка символа не может быть пустой! Введите символ 'b' еще раз");
            b = scan.nextLine();
        }
        char[] arrB = b.toCharArray();

        char[] array9 = str.toCharArray();
        for (int i =0; i < array9.length; i++) {
            if (array9[i] == arrA[0]) {
                array9[i] = arrB[0];
            }
        }
        System.out.println(array9);
    }
}