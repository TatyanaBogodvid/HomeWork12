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

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()){
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, name, productionYear);
    }
}
