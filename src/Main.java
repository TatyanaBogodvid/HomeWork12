import com.sun.security.jgss.GSSUtil;

public class Main {

    public static void main(String[] args) {
        Autor autor1 = new Autor("Александр ", "Пушкин");
        System.out.print(autor1.getFirstName());
        System.out.println(autor1.getLastName());
        Book book1 = new Book("Руслан и Людмила", autor1, 2011);
        System.out.println(book1.getBookTitle());
        //System.out.println(pushkin.getName()); печатается адрес ячейки? что неверно?
        System.out.println(book1.getProductionYear());

        Autor autor2 = new Autor("Иван ", "Тургенев");
        System.out.print(autor2.getFirstName());
        System.out.println(autor2.getLastName());
        Book book2 = new Book("Муму", autor2, 1980);
        System.out.println(book2.getBookTitle());
        System.out.println(book2.getProductionYear());

        book2.setProductionYear(2020);
        System.out.println("Переиздание Муму " + book2.getProductionYear());

        // Как можно использовать getName?









    }
}