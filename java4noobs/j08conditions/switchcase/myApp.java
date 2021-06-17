import java.util.Scanner;

public class myApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int caso = 0;

        System.out.println("[1] Paulo\n[2] José\n[3] Joyce");
        caso = sc.nextInt();
        sc.close();

        switch (caso) {
            case 1:
                System.out.println("Paulo");
                break;
            case 2:
                System.out.println("José");
                break;
            case 3:
                System.out.println("Joyce");
                break;
            default:
                System.out.println("Valor não encontrado no menu!");
        }
    }
}
