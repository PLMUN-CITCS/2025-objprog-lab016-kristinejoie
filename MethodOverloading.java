public class MethodOverloading {

    public static void main(String[] args) {
        // Call the overloaded printValue methods
        printValue(10);        // Integer value
        printValue(3.14);      // Double value
        printValue("Hello!");  // String value
    }

    // First overloaded method: prints integer value
    public static void printValue(int number) {
        System.out.println("Integer value: " + number);
    }

    // Second overloaded method: prints double value
    public static void printValue(double number) {
        System.out.println("Double value: " + number);
    }

    // Third overloaded method: prints string value
    public static void printValue(String text) {
        System.out.println("String value: " + text);
    }
}