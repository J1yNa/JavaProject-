import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты с использованием конструктора с параметрами
        Student student1 = new Student("Вася Попочкин", 1001);
        Student student2 = new Student("Дарья Казанцева", 1002);
        Student student3 = new Student("Алексей Смирнов", 1003);

        // Создаем объект с использованием конструктора по умолчанию
        Student student4 = new Student();

        // Сохраняем данные в файл
        try (PrintWriter writer = new PrintWriter("constructors.txt")) {
            writer.println(student1.toString());
            writer.println(student2.toString());
            writer.println(student3.toString());
            writer.println(student4.toString());
            System.out.println("Данные записаны в constructors.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка при записи файла: " + e.getMessage());
        }
    }
}