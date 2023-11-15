package Boulder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/BoulderDash";
        String username = "postgres";
        String password = "Tassdog";
        
        try {
            // Établir une connexion à la base de données
            Connection connection = DriverManager.getConnection(url, username, password);
            
          
            // Créer une requête SQL pour récupérer les données
            String selectQuery = "SELECT * FROM map";
            
            // Préparer la requête de sélection
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            
            // Exécuter la requête de sélection
            ResultSet resultSet = preparedStatement.executeQuery();
            
            // Parcourir les résultats et afficher les données
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String niveau = resultSet.getString("niveau");
                int matrice = resultSet.getInt("matrice");
                System.out.println("ID: " + id + ", niveau: " + niveau + ", matrice: " + matrice);
            
            // Fermer la connexion à la base de données
            connection.close();}}
           catch (SQLException e) {
            e.printStackTrace();
        }}}
    


