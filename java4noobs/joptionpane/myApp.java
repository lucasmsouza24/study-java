import javax.swing.JOptionPane;

public class myApp {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Nome:");
        JOptionPane.showMessageDialog(null, "Hello " + name + "!");
    }
}