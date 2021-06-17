import java.util.Scanner;
import javax.swing.JOptionPane;

public class myCalc {
    public static void main(String args[]) {

        // scanner
        Scanner sc = new Scanner(System.in);

        // first input
        System.out.println("First number:");
        float num1 = sc.nextFloat();
        
        // choosing operation
        System.out.println("Choose operation:");
        System.out.println("[0] +\n[1] -\n[2] *\n[3] /\n[4] %");
        int op = sc.nextInt();
        
        // second input
        System.out.println("Second number:");
        float num2 = sc.nextFloat();

        sc.close();

        // calc

        boolean validInput = true;
        String opChar = "";
        float result = 0;

        if (op == 0) {
            result = num1 + num2;    
            opChar = "+";
        } else if (op == 1) {
            result = num1 - num2;
            opChar = "-";
        } else if (op == 2) {
            result = num1 * num2;
            opChar = "*";
        } else if (op == 3) {
            result = num1 / num2;
            opChar = "/";
        } else if (op == 4) {
            result = num1 % num2;
            opChar = "%";
        } else {
            validInput = false;
        }

        // show results
        if (validInput) {
            System.out.println(num1 + " " + opChar + " " + num2 + " = " + result);
        } else {
            System.out.println("Invalid operation input. Try again.");
        }
    }
}
