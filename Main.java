//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] var0) {
        Student var1 = new Student("Данил Цой", 1001);
        Student var2 = new Student("Юрий Антипов", 1002);

        try (PrintWriter var3 = new PrintWriter(new FileWriter("students.txt"))) {
            var3.println("Студент 1:");
            var3.println("Имя: " + var1.getName());
            var3.println("ID: " + var1.getStudentId());
            var3.println();
            var3.println("Студент 2:");
            var3.println("Имя: " + var2.getName());
            var3.println("ID: " + var2.getStudentId());
            System.out.println("Информация о студентах успешно записана в файл students.txt");
        } catch (IOException var8) {
            System.err.println("Ошибка при записи в файл: " + var8.getMessage());
        }

        checkFileContent();
    }

    private static void checkFileContent() {
        try {
            System.out.println("\nСодержимое файла students.txt:");
            Stream var10000 = Files.lines(Paths.get("students.txt"));
            PrintStream var10001 = System.out;
            Objects.requireNonNull(var10001);
            var10000.forEach(var10001::println);
            String var0 = System.getProperty("os.name").toLowerCase();
            System.out.println("\nТекущая ОС: " + System.getProperty("os.name"));
            System.out.println("Файл создан в: " + String.valueOf(Paths.get("students.txt").toAbsolutePath()));
        } catch (IOException var1) {
            System.err.println("Ошибка при чтении файла: " + var1.getMessage());
        }

    }
}
