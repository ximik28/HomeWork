import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        String str;
        String bukva;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любую фразу");
        str = scan.nextLine();
        System.out.println("Введите символ для поиска в вашей фразе");
        bukva = scan.nextLine();

        char[] array8 = str.toCharArray();
        System.out.println(array8);
        System.out.println();

        char[] arrayBukva = bukva.toCharArray();

        int counter = 0;
        for (int i : array8) {
            if (i == arrayBukva[0]) {
                counter++;
            }
        }
        if (counter ==0) {
            System.out.println("Такой символ в стоке отсутствует");
        } else {
            System.out.println("Число вхождений символа " + "'" + bukva + "'" + " - " + counter);
        }
    }
}
