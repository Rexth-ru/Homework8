import java.util.Objects;

public class Book {
    private String nameBook;
    private Author authorBook;
    private int yearBook;

    public Book(String nameBook, Author authorBook, int yearBook) {
        this.nameBook = nameBook;
        this.authorBook=authorBook;
        this.yearBook = yearBook;
    }
    public String getNameBook() {
        return this.nameBook;
    }
    public Author getAuthorBook()
    {
        return this.authorBook;
    }
    public int getYearBook() {

        return this.yearBook;
    }
    public void setYearBook(int yearBook) {
        // Создали сеттер — метод, который меняет значение
        this.yearBook = yearBook;
    }
    public String toString() {

        return this.nameBook + this.authorBook + this.yearBook;
    }
    @Override
    public int hashCode() {

        return java.util.Objects.hash(nameBook, authorBook, yearBook);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getYearBook() == book.getYearBook() && getNameBook().equals(book.getNameBook()) && Objects.equals(getAuthorBook(), book.getAuthorBook());
    }
}

