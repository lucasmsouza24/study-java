import java.util.Arrays;

public class myApp {
    public static void main(String[] args) {
        String[] names = {"Lucas", "Laila", "Alice", "Cleude"};

        names = Arrays.copyOf(names, names.length + 1);
        names[names.length - 1] = "Pedrola";

        for (String name : names) {
            System.out.println("Hello, " + name + "!");
        }
    }
}
