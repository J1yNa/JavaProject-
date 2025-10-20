import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        // Создание двух объектов Student
        Student student1 = new Student("Данил Цой", 1001);
        Student student2 = new Student("Юрий Антипов", 1002);

        // Запись информации в файл
        try (PrintWriter writer = new PrintWriter(new FileWriter("students.txt"))) {
            writer.println("Студент 1:");
            writer.println("Имя: " + student1.getName());
            writer.println("ID: " + student1.getStudentId());
            writer.println();

            writer.println("Студент 2:");
            writer.println("Имя: " + student2.getName());
            writer.println("ID: " + student2.getStudentId());

            System.out.println("Информация о студентах успешно записана в файл students.txt");

        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }

        // Проверка записи файла
        checkFileContent();
    }

    private static void checkFileContent() {
        try {
            System.out.println("\nСодержимое файла students.txt:");
            Files.lines(Paths.get("students.txt")).forEach(System.out::println);

            // Проверка ОС
            String os = System.getProperty("os.name").toLowerCase();
            System.out.println("\nТекущая ОС: " + System.getProperty("os.name"));
            System.out.println("Файл создан в: " + Paths.get("students.txt").toAbsolutePath());

        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}