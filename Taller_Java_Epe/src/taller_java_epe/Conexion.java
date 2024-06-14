package taller_java_epe;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion{
   
        public static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        public static String DB_URL = "jdbc:mysql://localhost/registro_atenciones";
        public static String USER = "root";
        public static String PASS = "ipchile";
        
        public static Connection conx;
        public static Statement st;//une el lenguaje java y sql
        
        public static boolean buscarPaciente;
        
        public static void conectar(){
            
        try{
            // Registrar el driver JDBC
            Class.forName(JDBC_DRIVER);
            conx = DriverManager.getConnection(DB_URL, USER, PASS);
            if(conx!=null){
                System.out.println("Conexion Establecida"+DB_URL);
            }
        } catch ( SQLException e) {
            // Manejar cualquier excepción
            System.out.println("Hubo un Error al Conectar");
        }catch(ClassNotFoundException ex){
            System.out.println(ex);
        }
      }
        
        public static void desconectar() throws SQLException{
            conx.close();
        }

    
    }

