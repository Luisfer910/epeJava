package taller_java_epe;

import java.sql.PreparedStatement;  //clases necesarias para trabajar con SQL
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion{
   
        public static String JDBC_DRIVER = "com.mysql.jdbc.Driver"; // Driver JDBC para MySQL
        public static String DB_URL = "jdbc:mysql://localhost/registro_atenciones";// URL de la base de datos
        public static String USER = "root";//Usuario de la base de datos
        public static String PASS = "ipchile"; // Contraseña del usuario
        
        public static Connection conx; // Objeto de conexión a la base de datos
        public static PreparedStatement st;//une el lenguaje java y sql
        
        public static boolean buscarPaciente;
        
         // Método para establecer una conexión con la base de datos
        public static void conectar(){
            
        try{
            // Registrar el driver JDBC
            Class.forName(JDBC_DRIVER);
            // Establecer la conexión con la base de datos usando las credenciales proporcionadas
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

