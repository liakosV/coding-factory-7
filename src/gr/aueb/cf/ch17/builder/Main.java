package gr.aueb.cf.ch17.builder;

public class Main {

    public static void main(String[] args) {
        Book book = new Book.Builder(1, "123465").build();
        Book book1 = new Book.Builder(2, "6789")
                .author("TH")
                .tittle("Java")
                .build();
    }
}
