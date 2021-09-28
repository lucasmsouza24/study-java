package br.com.bandtec.alura.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class TestaConexao {
    
    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/java_alura", "SA", "");

            System.out.println("Abrindo conexão com banco!");


            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
