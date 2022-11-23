import java.util.Objects;

public class Book {
    private String bookTitle;
    private Autor name;
    private int productionYear;


    public Book(String bookTitle, Autor name, int productionYear) {
        this.bookTitle = bookTitle;
        this.name = name;
        this.productionYear = productionYear;
    }
    public String getBookTitle(){
        return this.bookTitle;
    }
    public Autor getName(){
        return this.name;
    }
    public int getProductionYear(){
        return this.productionYear;
    }
    public void setProductionYear(int productionYear){
        this.productionYear = productionYear;
    }

    public String toString() {
        return this.bookTitle + " " + this.name + " " + this.productionYear;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return productionYear == book.productionYear && bookTitle.equals(book.bookTitle) && name.equals(book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, name, productionYear);
    }
}
