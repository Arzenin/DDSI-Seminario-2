import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.sql.Savepoint;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author jomar
 */
public class DDSI_Seminario2{
    String jdbcUrl = "jdbc:mysql://localhost:3306/seminario2";
    String username = "root"; // Reemplaza con tu nombre de usuario
    String password = "sem2"; // Reemplaza con tu contraseña

    Connection connection = null;
    Statement sentencia = null;
    ResultSet resultSet = null;
    Savepoint savepoint = null;
    
    public DDSI_Seminario2(){}
    
    public DDSI_Seminario2(String user, String pass)
    {
        username = user; 
        password = pass;
    }
    
    public void Iniciar_Sesion(){
        try {
            // Cargar el controlador JDBC de Oracle
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Conexión a la base de datos
            connection =DriverManager.getConnection(jdbcUrl, username, password);
            sentencia=connection.createStatement();
            connection.setAutoCommit(false);
            savepoint = connection.setSavepoint();
        } 
        catch (Exception e) {
            System.out.println("Error al iniciar sesión");
            e.printStackTrace();
        }     
    }
    
    public void Cerrar_Sesion(){
        try{
            if (resultSet != null) resultSet.close();
            if (sentencia != null) sentencia.close();
            if (connection != null) connection.close();
            System.exit(0);
        }
        catch(Exception e){
            System.out.println("Error al cerrar sesión");
            System.exit(0);
        }
        
    }
    
    public void Hacer_Consulta(){
        try{
            
            String hacerConsulta = "SELECT * FROM STOCK";
            resultSet = sentencia.executeQuery(hacerConsulta);
            
            while(resultSet.next()){
                int columna1 = -1;
                int columna2 = -1;
                columna1 = resultSet.getInt("CPRODUCTO");
                columna2 = resultSet.getInt("CANTIDAD");
                String fila = "    " +columna1+"       "+columna2;
                System.out.println(fila);
            }
        }
        catch(Exception e){
            System.out.println("Error Al Hacer la consulta");
            e.printStackTrace();
        } 
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DDSI_Seminario2 BD = new DDSI_Seminario2("root","sem2");
        BD.Iniciar_Sesion();

        BD.Hacer_Consulta();

        BD.Cerrar_Sesion();
        // TODO code application logic here
    }
    
}
