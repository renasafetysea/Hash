package Passport;

public class Passport {
    private int number;
    private String name;
    private String surname;
    private String lastName;
    private int date;

    public Passport(int number, String name, String surname, String lastName, int date) {
        this.number = number;
        setName(name);
        setSurname(surname);
        setLastName(lastName);
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDate() {
        return date;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Карточка заполнена не полностью!");
        }
        this.name = name;
    }

    public void setSurname(String surname) {
        if (surname == null || surname.isBlank()) {
            throw new IllegalArgumentException("Карточка товара заполнена не полностью!");
        }
        this.surname = surname;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("Карточка товара заполнена не полностью!");
        }
        this.lastName = lastName;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
