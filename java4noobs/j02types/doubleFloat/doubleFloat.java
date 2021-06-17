public class doubleFloat {
    public static void main(String args[]) {
        // Double (8 bytes)
        System.out.println("Double:");
        double a = 10;
        double b = 2.5;
        double c = a / b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a / b = " + c);

        System.out.println("================================");

        // Float (4 bytes)
        System.out.println("Float:");
        
        float d = 3.3f;
        float e = 1.1f;
        float f = d / e;

        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("d / e = " + f);
    }
}
