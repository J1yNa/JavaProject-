//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Student {
    private String name;
    private int studentId;

    public Student(String var1, int var2) {
        this.name = var1;
        this.studentId = var2;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String var1) {
        this.name = var1;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public void setStudentId(int var1) {
        this.studentId = var1;
    }

    public String toString() {
        return "Student{name='" + this.name + "', studentId=" + this.studentId + "}";
    }
}
