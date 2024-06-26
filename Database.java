package repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Database {
     protected static Connection conn=null;
     protected static  PreparedStatement statement=null;

     public static void ouvrirConnexion() {
       try {
        Class.forName("com.mysql.cj.jdbc.Driver");
           conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/ism", "root", "");
       } catch (Exception e) {
          System.out.println("Erreur de connexion a la BD");
       }
     }
     public static void initPrepareStatement(String sql){
        try {
            statement= conn.prepareStatement(sql);
        } catch (SQLException e) {
            System.out.println("Erreur Initialisation du PrepareStatement");
        }
     }
     public static int executeUpdate(){
        int nbreLigne=0;
          try {
            nbreLigne= statement.executeUpdate();
         } catch (SQLException e) {
            System.out.println("Erreur Execution de requete");
          }
        return nbreLigne;
     }


     public ResultSet executeSelect(){
        ResultSet rs=null;
        try {
            rs= statement.executeQuery();
         } catch (SQLException e) {
            System.out.println("Erreur Execution de requete");
          }
          return rs;
     }

     public void fermerConnexion() throws SQLException {
        if (conn!=null) {
            conn.close();
        }
     }

}