import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Создаем объект
        Student student = new Student("Иван Иванов", 1001);

        // Добавляем курсы через addCourse
        student.addCourse("Java Programming");
        student.addCourse("Database Systems");

        // Выводим список курсов через listCourses (varargs)
        // Можно передать дополнительные курсы или оставить пустым
        student.listCourses("Algorithms", "Web Development");

        System.out.println("Задание 4 завершено!");
    }
}