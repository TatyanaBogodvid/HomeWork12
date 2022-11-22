public class Book {
    String bookTitle;
    Autor name;
    int productionYear;


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
}
