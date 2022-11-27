public class Reader {
    private String name;
    private String surname;
    private String fathername;
    private int libCardNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;
    private Book[] books = new Book[10];

    public Reader(){}

    public void takeBook(Book book) {   //проходимся по массиву книг и, если находим пустое место, вставляем туда книгу
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                System.out.println(getFIO() + " взял книгу " + book.getNameBook());
                return;
            }
        }
        System.out.println("Нет места для новой книги!");
    }

    public Book returnBook(String bookName) {
        Book ret = null;    //если у читателя есть книга bookName - вернем ее из метода
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getNameBook().equals(bookName)) {  //сначала проверяем books[i] != null, чтобы не было ошибки
                ret = books[i];
                for (int j = i; j < books.length - 1; j++) {
                    books[j] = books[j + 1];
                }
                break;  //если книгу удалили нет смысла дальше ее искать, выходим из цикла
            }
        }
        if (ret == null) {  //если книгу не нашли
            System.out.println(getFIO() + " не хранит такую книгу.");
        } else {
            System.out.println(getFIO() + " вернул книгу " + bookName + ".");
        }
        return ret;
    }

    public void printStatus() {
        String booksString = "";
        int i = 0;
        for (Book b : books) {
            if (b != null) {
                booksString +=  b.getNameBook() + " ,";
                i++;
            }
        }
        if (i == 0) {
            System.out.println(getFIO() + " не брал книг.");
        } else {
            System.out.println(getFIO() + " взял " + i + " книг: " + booksString);
        }
    }

    private String getFIO() {
        return surname + " " + name.charAt(0) + ". " + fathername.charAt(0) + ".";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public int getLibCardNumber() {
        return libCardNumber;
    }

    public void setLibCardNumber(int libCardNumber) {
        this.libCardNumber = libCardNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
