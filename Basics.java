public class Basics {
    public static void main(String[] args) {
        int age = 18;
        double height = 180;
        String name = "Максик";
        boolean isStudent = true;

        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age + " лет");
        System.out.println("Рост: " + height + " см");
        System.out.println("Статус студента: " + isStudent);

        System.out.println("\n=== АРИФМЕТИЧЕСКИЕ ОПЕРАЦИИ ===");

        int number1 = 15;
        int number2 = 3;
        double decimal1 = 10.5;
        double decimal2 = 2.5;

        int sumInt = number1 + number2;
        int diffInt = number1 - number2;
        int multInt = number1 * number2;
        int divInt = number1 / number2;

        double sumDouble = decimal1 + decimal2;
        double diffDouble = decimal1 - decimal2;
        double multDouble = decimal1 * decimal2;
        double divDouble = decimal1 / decimal2;

        System.out.println("Целочисленные операции:");
        System.out.println(number1 + " + " + number2 + " = " + sumInt);
        System.out.println(number1 + " - " + number2 + " = " + diffInt);
        System.out.println(number1 + " * " + number2 + " = " + multInt);
        System.out.println(number1 + " / " + number2 + " = " + divInt);

        System.out.println("\nДробные операции:");
        System.out.println(decimal1 + " + " + decimal2 + " = " + sumDouble);
        System.out.println(decimal1 + " - " + decimal2 + " = " + diffDouble);
        System.out.println(decimal1 + " * " + decimal2 + " = " + multDouble);
        System.out.println(decimal1 + " / " + decimal2 + " = " + divDouble);

        System.out.println("\nОперации с разными типами:");
        double mixedSum = age + height;
        double mixedDiv = height / age;
        System.out.println("Возраст + Рост = " + mixedSum);
        System.out.println("Рост / Возраст = " + mixedDiv);
    }
}