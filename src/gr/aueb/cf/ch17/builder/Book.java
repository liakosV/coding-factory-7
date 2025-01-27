package gr.aueb.cf.ch17.builder;

public class Book {
    private final long id;
    private final String isbn;
    private final String author;
    private final String tittle;

    public static class Builder {
        private final long id;
        private final String isbn;

        private String author = "";
        private String tittle = "";

        public Builder(long id, String isbn) {
            this.id = id;
            this.isbn = isbn;
        }

        //setter
        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder tittle(String tittle) {
            this.tittle = tittle;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }

    private Book(Builder builder) {
        this.id = builder.id;;
        this.author = builder.author;
        this.tittle = builder.tittle;
        this.isbn = builder.isbn;
    }

    public long getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getTittle() {
        return tittle;
    }
}
