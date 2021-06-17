import java.util.Scanner;

public class myApp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Instanciando o obj scanner

        System.out.println("name: ");
        String name = sc.nextLine(); // lendo input String

        System.out.println("age: ");
        int age = sc.nextInt(); // lendo input int

        System.out.println("height: ");
        float height = sc.nextFloat(); //lendo input float

        System.out.println("=====================================");
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("height: " + height);
        System.out.println("=====================================");

        sc.close();
    }
}