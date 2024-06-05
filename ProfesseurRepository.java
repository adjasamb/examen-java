package repository;

import java.sql.SQLException;

import entities.Professeur;

public class ProfesseurRepository extends Database{
    private final static String SQL_INSERT="INSERT INTO professeur (id,nom,prenom,telephone) VALUES (?,?,?);";

    public static void insert(Professeur professeur){
        try{
            ouvrirConnexion();
            initPrepareStatement(SQL_INSERT);
            statement.setInt(1,professeur.getId());
            statement.setString(2,professeur.getNom());
            statement.setString(3, professeur.getPrenom());
            executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}