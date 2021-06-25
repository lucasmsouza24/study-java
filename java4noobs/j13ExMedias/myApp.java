import java.util.Scanner;
import java.util.Arrays;

public class myApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float note;
        float[] notes = new float[0];

        while (true) {
            System.out.println("Type your note:");
            System.out.println("-1 to end");
            note = sc.nextFloat();

            if (note < 0) {
                break;
            } else if (note > 10) {
                System.out.println("Invalid note! Try again...");
                continue;
            } else {
                notes = Arrays.copyOf(notes, notes.length + 1);
                notes[notes.length - 1] = note;
            }
        }

        sc.close();

        for (int i = 0; i < notes.length; i++) {
            System.out.println(i + 1 + "º nota: " + notes[i]);
        }

        System.out.println("media: " + media(notes));
    }

    public static float sum(float[] notes) {
        float total = 0;
        for (float i : notes) {
            total += i;
        }

        return total;
    }

    public static float media(float[] array) {
        return sum(array) / array.length;
    }
}