package ad211.cheban;

public class Main {
    public static void main(String[] args) {
        Person student_1 = new Student("Чебан","Катерина",18,"АД-211",87655460);
        Person student_2 = new Student("Смик","Валерія",18,"АД-211",54767569);
        Person student_3 = new Student("Ахмад","Аніта",18,"АД-211",46709867);
        Person lecturer_1 = new Lecturer("Микола","Рудніченко",30,"Інформаційні системи та технології",25000);
        Person lecturer_2 = new Lecturer("Вичужанін","Володимир",69,"Інформаційні системи та технології",25000);
        Person[] people = {student_1, student_2, student_3, lecturer_1, lecturer_2};
        for (Person person : people) {
            person.printInfo();
        }
    }
}