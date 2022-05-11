import java.time.LocalDate;

public class Person {

    private String name;
    private String lastName;
    private String patronymic;
    private LocalDate dateOFBirth;

    public Person(String name, String lastName, String patronymic, LocalDate dateOFBirth) {
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.dateOFBirth = dateOFBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOFBirth() {
        return dateOFBirth;
    }

    public void setDateOFBirth(LocalDate dateOFBirth) {
        this.dateOFBirth = dateOFBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" +  name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOFBirth=" + dateOFBirth +
                '}';
    }


}
