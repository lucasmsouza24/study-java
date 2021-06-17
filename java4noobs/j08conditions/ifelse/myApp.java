public class myApp {
    public static void main(String args[]) {
        int idade1 = 50;
        int idade2 = 50;

        if (idade1 > idade2) { //leia-se: "se a idade1 for maior que a idade2, ocorre o que estiver entre os blocos de chaves".

            System.out.println("A idade1 é maior que a idade2");

        } else if (idade1 < idade2) { //leia-se: "se a condição do bloco anterior não foi satisfeita, E se a idade1 for menor que idade2, ocorre o que tiver dentro das chaves".

            System.out.println("A idade2 é maior que a idade1");

        } else { //senão, ocorre o que estive dentro dos blocos.

            System.out.println("A idade2 é igual que a idade1");
        }
    }
}
