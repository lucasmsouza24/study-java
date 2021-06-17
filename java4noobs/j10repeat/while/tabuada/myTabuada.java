import java.util.Scanner;

public class myTabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.println("Digite um número para ver sua tabuada: ");
        int number = sc.nextInt();
        sc.close();

        // repeat
        int i = 0;

        while (i <= 10) {
            int result = i * number;
            System.out.println(i++ + " x " + number + " = " + result);
        }

    }
}
