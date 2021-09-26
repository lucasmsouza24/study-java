package br.com.bandtec.alura.bibliotecas.scanner;

import java.io.FileInputStream;
import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;

public class App {
    
    public static void main(String[] args) {

        try {
            // sources
            File file1 = new File("./src/main/java/br/com/bandtec/alura/bibliotecas/scanner/file.txt");
            File file2 = new File("./src/main/java/br/com/bandtec/alura/bibliotecas/scanner/file2.txt");

            // reader and writter
            Scanner sc = new Scanner(new FileInputStream(file1));
            PrintStream ps = new PrintStream(file2);

            int i = 0;
            
            // reading and writting
            while (sc.hasNextLine()) {
                // read
                String line = sc.nextLine();

                // writte
                ps.println(i + ": " + line);

                // print on console
                System.out.println(line);
                i++;
            }
            
            // closing
            sc.close();
            ps.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
