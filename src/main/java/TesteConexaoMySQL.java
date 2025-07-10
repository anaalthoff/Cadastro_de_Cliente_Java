import java.sql.*;
 
public class TesteConexaoMySQL {
 
    public static void main(String[] args) {
        String dbdriver = "com.mysql.cj.jdbc.Driver";
        String dburl = "jdbc:mysql://localhost:3306/cliente";
        String dbusuario = "anaalthoff";
        String dbsenha = "52@//I81h";
 
        try {
            Class.forName(dbdriver);
            Connection con = DriverManager.getConnection(dburl, dbusuario, dbsenha);
            System.out.println("Conexão bem sucedida!");
        } catch (ClassNotFoundException e) {
            System.out.println("Falha em carregar o DRIVER " + e);
        } catch (SQLException e) {
            System.out.println("Falha na Conexão ou no SQL " + e);
        }
    }
}