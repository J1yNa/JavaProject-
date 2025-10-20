import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Создаем объект
        Student student = new Student("Иван Иванов", 1001);

        // Вызываем метод printInfo
        student.printInfo();

        // Изменяем имя и сохраняем логи
        try (PrintWriter writer = new PrintWriter("update_log.txt")) {
            // Логируем исходные данные
            writer.println("Исходное имя: " + student.getName());

            // Изменяем имя
            student.updateName("Петр Петров");

            // Логируем изменение
            writer.println("Новое имя: " + student.getName());
            writer.println("Изменение завершено успешно");

            System.out.println("Логи записаны в update_log.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка при записи файла: " + e.getMessage());
        }
    }
}