import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int action;
        Reader[] readers = new Reader[10]; //создаем массив читателей

        do {
            System.out.println("1 - Добавить нового читателя");
            System.out.println("2 - Читатель хочет взять книгу");
            System.out.println("3 - Читатель хочет вернуть книгу");
            System.out.println("4 - Вывести статус читателя");
            System.out.println("5 - Вывести статус всех читателей");
            System.out.println("6 - Выйти из программы");
            System.out.println("1 - Введите номер действия");

            action = scan.nextInt();
            scan.nextLine(); // делаем чтобы программа не пропускала следующий ввод

            switch (action) {
                case 1: {

                }
            }
        }
    }
}
