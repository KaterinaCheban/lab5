package ad211.cheban;

public class Person {
    private String surname;
    private String name;
    private int age;

    public Person(String surname, String name, int age) { // коструктор
        this.surname = surname;
        this.name = name;
        this.age = age;
    }
    // геттери та сеттери полів
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void printInfo() { // метод виводу інформації
        System.out.println("Людина " + getSurname() + " " + getName() + ", вік " + getAge());
    }
}