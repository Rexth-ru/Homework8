import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String sonameAuthor;

    public Author(String nameAuthor, String sonameAuthor) {
        this.nameAuthor = nameAuthor;
        this.sonameAuthor = sonameAuthor;
    }

    public String getNameAuthor() {

        return this.nameAuthor;
    }

    public String getSonameAuthor() {

        return this.sonameAuthor;
    }

    @Override
    public String toString() {

        return this.nameAuthor + this.sonameAuthor;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nameAuthor, sonameAuthor);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return getNameAuthor().equals(author.getNameAuthor()) && getSonameAuthor().equals(author.getSonameAuthor());
    }
}
