package ad211.cheban;

public class Student extends Person{
    private String group;
    private int number;

    public Student(String name, String surname, int age, String group, int number) { // конструктор
        super(name, surname, age);
        this.group = group;
        this.number = number;
    }
    // геттери та сеттери полів
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void printInfo() { // метод виводу інформації
        System.out.println("Студент групи " + getGroup() + " " + getSurname() + ", " + getName() +
                ", возраст: " + getAge() + ". Номер студентського квитка :" + getNumber());
    }
}