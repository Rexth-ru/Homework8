public class Main {
    public static void main(String[] args) {
        Author author = new Author(" Александр", " Грин ");
        Book book = new Book("Алые паруса ", author,   1923);
        Author author1 = new Author(" Юрий", " Олеша");
        Book book1 = new Book("Три толстяка ", author1,  1925);
        Author author2 = new Author(" Александр", " Грин ");
        Book book2 = new Book("Алые паруса ", author,   1923);

        book1.setYearBook(1947);
        System.out.println(book);
        System.out.println(author1.equals(author));
        System.out.println("book1.equals(book) = " + book1.equals(book));
    }
}
