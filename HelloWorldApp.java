public class HelloWorldApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String message = "";
            for (String name : args) {
                message = message + name + ", ";
            }
            System.out.println("Hello, " + message + "!");
        }
    }
}
