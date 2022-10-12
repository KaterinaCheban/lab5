package ad211.cheban;

public class Lecturer extends Person {
    private String department;
    private int salary;

    public Lecturer(String name, String surname, int age, String department, int salary) { // конструктор
        super(name, surname, age);
        this.department = department;
        this.salary = salary;
    }
    // геттери та сеттери полів
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void printInfo() { // метод виводу інформації
        System.out.println("Викладач кафедри " + getDepartment() + ", " + getSurname() + ", " + getName() + ", " + getAge() + ". Зарплата: " + getSalary());
    }
}