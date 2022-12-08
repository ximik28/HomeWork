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
            scan.nextLine(); //делаем пустую строку, чтобы программа не пропускала следующий ввод

            switch (action) {
                case 1: {
                    boolean isFool = true; //true в случае если в массиве нет места
                    for (int i = 0; i < readers.length; i++) {
                        if (readers[i] == null) {
                            readers[i] = newReader(readers, scan);
                            isFool = false; //записываем false, так как нашли место и добавили читателя
                            break; //выходим из цикла, так как уже добавили читателя
                        }
                    }
                    if (isFool) {
                        System.out.println("Количество читателей максимальное");
                    }
                    break;
                }

                case 2: {
                    System.out.println("Введите номер билета");
                    int number = scan.nextInt();
                    boolean found = false; //записываем false, если не нашли читателя
                    for (Reader r : readers) {
                        if (r != null && r.getLibCardNumber() == number) {
                            r.takeBook(newBook(scan));
                            found = true; //записываем true, так как нашли читателя
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Такого читателя нет");
                    }
                    break;
                }

                case 3: {
                    System.out.println("Введите название книги");
                    String nameBook = scan.nextLine();
                    System.out.println("Введите номер читательского билета");
                    int number = scan.nextInt();
                    scan.nextLine();
                    boolean found = false; //записываем false если не нашли читателя
                    for (Reader r : readers) {
                        if (r != null && r.getLibCardNumber() == number) {
                            r.takeBook(newBook(scan));
                            found = true; //записываем true так как нашли читателя с номером
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Такого читателя нет");
                    }
                    break;
                }

                case 4: {
                    System.out.println("Введите номер билета");
                    int number = scan.nextInt();
                    scan.nextLine();
                    boolean found = false; //записываем false, если не удалось найти читателя
                    for (Reader r : readers) {
                        if (r != null && r.getLibCardNumber() == number) {
                            r.printStatus();
                            found = true; //записываем true, так как нашли читателя с номером
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Такого читателя нет");
                    }
                    break;
                }

                case 5: {
                    for (Reader r : readers) {
                        if (r != null) {
                            r.printStatus();
                        }
                    }
                    break;
                }

                case 6: {
                    System.out.println("Завершение программы");
                    break;
                }

                default: {
                    System.out.println("Нет такой команды");
                }
            }
        } while (action != 6);
    }

    private static Reader newReader(Reader[] readers, Scanner scan) {
        Reader reader = new Reader();
        System.out.println("Введите фамилию");
        reader.setSurname(scan.nextLine());
        System.out.println("Введите имя");
        reader.setName(scan.nextLine());
        System.out.println("Введите отчество");
        reader.setFathername(scan.nextLine());

        System.out.println("Введите номер билета");
        boolean isNumberFree;
        int number;
        do {
            number = scan.nextInt();
            scan.nextLine();
            isNumberFree = true;
            for (Reader r : readers) {
                if (r != null && r.getLibCardNumber() == number) {
                    System.out.println("Введите номер билета повторно");
                    isNumberFree = false;
                }
            }
        } while (!isNumberFree);
        reader.setLibCardNumber(number);

        System.out.println("Введите название факультета");
        reader.setFaculty(scan.nextLine());
        System.out.println("Введите дату рождения");
        reader.setDateOfBirth(scan.nextLine());
        System.out.println("Введите название номер телефона");
        reader.setPhoneNumber(scan.nextLine());

        return reader;
    }

    private static Book newBook(Scanner scan) {
        Book book = new Book();

        System.out.println("Введите название книги");
        book.setNameBook(scan.nextLine());
        System.out.println("Введите автора книги");
        book.setAuthorName(scan.nextLine());
        System.out.println("Введите текст книги");
        book.setText(scan.nextLine());

        return book;
    }
}
