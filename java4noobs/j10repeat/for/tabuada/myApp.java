import java.util.Scanner;

public class myApp {
    public static void main(String[] args) {
        
        // input
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = sc.nextInt();
        sc.close();

        // repeat
        for (int i = 0; i <= 10; i++) {
            int result = i * number;
            System.out.println(i + " x " + number + " = " + result);
        }
    }
}
