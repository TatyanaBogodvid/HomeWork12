import com.sun.security.jgss.GSSUtil;

public class Main {

    public static void main(String[] args) {
        Autor autor1 = new Autor("Александр ", "Пушкин");
        Book book1 = new Book("Руслан и Людмила", autor1, 2011);
        System.out.println(book1);

        Autor autor2 = new Autor("Иван ", "Тургенев");
        Book book2 = new Book("Муму", autor2, 1980);
        System.out.println(book2);

        book2.setProductionYear(2020);
        System.out.println("Переиздание Муму " + book2.getProductionYear());











    }
}