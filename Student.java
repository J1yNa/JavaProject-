public class Student {
    String name;
    int studentId;

    public Student() {
        this.name = "Unknown";
        this.studentId = 0;
    }

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    // Метод для вывода данных
    public void printInfo() {
        System.out.println("Студент: " + name);
        System.out.println("ID: " + studentId);
    }

    // Метод для изменения имени
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