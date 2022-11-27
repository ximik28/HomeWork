public class Book {
    private String nameBook;
    private String authorName;
    private String text;

    public Book(){}
    public Book(String name, String authorName, String text){
        this.nameBook = name;
        this.authorName = authorName;
        this.text = text;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}