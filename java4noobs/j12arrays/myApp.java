import java.util.Arrays;

public class myApp {
    public static void main(String[] args) {

        // creating a String Array (length 2)
        String[] names = new String[2];
        names[0] = "lucas";
        names[1] = "laila";

        names = Arrays.copyOf(names, names.length + 1);
        names[names.length - 1] = "cleude";

        for (String i : names) {
            System.out.println(i);
        }
    }
}