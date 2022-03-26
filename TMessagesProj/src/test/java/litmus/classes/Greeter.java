package litmus.classes;

public class Greeter {
    public static String greet() {
        return "Hello, " + name() + "!";
    }

    public static String name() {
        return "Guest";
    }
}
