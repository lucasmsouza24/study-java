public class myTabuadaInteira {
    public static void main(String[] args) {

        // first number
        int i = 0;

        while (i <= 10) {

            // second number
            int j = 0;
                while (j <= 10) {

                    // printing result
                    int result = i * j;

                    System.out.println(i + " x " + j++ + " = " + result);
                }
            i++;
            System.out.println("===============================");
        }
    }
}