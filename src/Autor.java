import java.util.Objects;

public class Autor {
   private String firstName;
   private String lastName;

    public Autor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }

    public String toString() {
        return this.firstName + this.lastName;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return firstName.equals(autor.firstName) && lastName.equals(autor.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
