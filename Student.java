import java.io.*;
import java.util.*;

public class Student {
    String name;
    int studentId;
    private List<String> courses;

    public Student() {
        this.name = "Unknown";
        this.studentId = 0;
        this.courses = new ArrayList<>();
    }

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    // Метод для добавления курса
    public void addCourse(String course) {
        courses.add(course);
        System.out.println("Курс добавлен: " + course);
    }

    // Метод для вывода списка курсов (varargs)
    public void listCourses(String... newCourses) {
        // Добавляем переданные курсы
        for (String course : newCourses) {
            courses.add(course);
        }

        // Сохраняем в файл
        try (PrintWriter writer = new PrintWriter("courses.txt")) {
            writer.println("Список курсов студента " + name + ":");
            for (int i = 0; i < courses.size(); i++) {
                writer.println((i + 1) + ". " + courses.get(i));
            }
            System.out.println("Список курсов сохранен в courses.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка при записи файла: " + e.getMessage());
        }
    }

    public void printInfo() {
        System.out.println("Студент: " + name);
        System.out.println("ID: " + studentId);
    }

    public void updateName(String newName) {
        String oldName = this.name;
        this.name = newName;
        System.out.println("Имя изменено: " + oldName + " -> " + newName);
    }

    public String getName() { return name; }
    public int getStudentId() { return studentId; }

    @Override
    public String toString() {
        return name + "," + studentId;
    }
}