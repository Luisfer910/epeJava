package taller_java_epe;

import java.sql.SQLException;
import java.sql.ResultSet;

public class Pacientes {

    private String rut_p;
    private String nombre_p;
    private String apellidos_p;
    private String email;

    public Pacientes() {
    }

    public Pacientes(String rut_p, String nombre_p, String apellidos_p, String email) {  // Constructor con parámetros
        this.rut_p = rut_p;
        this.nombre_p = nombre_p;
        this.apellidos_p = apellidos_p;
        this.email = email;
    }

    // Getters y setters
    public String getRut_p() {
        return rut_p;
    }

    public void setRut_p(String rut_p) {
        this.rut_p = rut_p;
    }

    public String getNombre_p() {
        return nombre_p;
    }

    public void setNombre_p(String nombre_p) {
        this.nombre_p = nombre_p;
    }

    public String getApellidos_p() {
        return apellidos_p;
    }

    public void setApellidos_p(String apellidos_p) {
        this.apellidos_p = apellidos_p;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método para guardar un paciente en la base de datos
    public void guardarPaciente() throws SQLException {
        try {
            String strSQL = "INSERT INTO Pacientes VALUES (?, ?, ?, ?)";//variable strSQL con sentencia para insertar datos
            Conexion.conectar(); //llamo al metodo conectar
            Conexion.st = Conexion.conx.prepareStatement(strSQL);
            Conexion.st.setString(1, rut_p);
            Conexion.st.setString(2, nombre_p);
            Conexion.st.setString(3, apellidos_p);
            Conexion.st.setString(4, email);
            Conexion.st.executeUpdate();
            System.out.println("Datos del paciente almacenados correctamente.");//Imprime en consola
        
        
        } catch (SQLException e) {
            System.out.println("Error al guardar el paciente: " + e.getMessage());
        } finally {
            Conexion.desconectar();
        }
    }
    public static String mostrarTodos() throws SQLException {
    StringBuilder pacientesInfo = new StringBuilder();
    String strSQL = "SELECT * FROM Pacientes";
    
    try {
        Conexion.conectar();
        Conexion.st = Conexion.conx.prepareStatement(strSQL);
        ResultSet objRes = Conexion.st.executeQuery();
        
        while (objRes.next()) {
            String rut = objRes.getString("rut_p");
            String nombre = objRes.getString("nombre_p");
            String apellidos = objRes.getString("apellidos_p");
            String email = objRes.getString("email");
            
            String pacienteInfo = String.format("Rut: %s, Nombre: %s, Apellidos: %s, Email: %s\n", rut, nombre, apellidos, email);
            pacientesInfo.append(pacienteInfo); // Agregar cada paciente al StringBuilder
        }
    } catch (SQLException e) {
        System.out.println("Error al obtener y mostrar los pacientes: " + e.getMessage());
    } finally {
        Conexion.desconectar();
    }
    
    return pacientesInfo.toString(); // Devolver la cadena con toda la información de los pacientes
}


    // Método para cargar un paciente por su rut desde la base de datos
    public void cargarRutPaciente() throws SQLException {
        try {
            String strSQL = "SELECT * FROM Pacientes WHERE rut_p = ?";
            Conexion.conectar();
            Conexion.st = Conexion.conx.prepareStatement(strSQL);
            Conexion.st.setString(1, rut_p);// Se establece el parámetro rut_p en la consulta SQL
            ResultSet objRes = Conexion.st.executeQuery();// Se ejecuta la consulta
            if (objRes.next()) {
                rut_p = objRes.getString("rut_p");// Se obtienen los datos del paciente desde la base de datos
                nombre_p = objRes.getString("nombre_p");
                apellidos_p = objRes.getString("apellidos_p");
                email = objRes.getString("email");
            } else {
                System.out.println("Paciente no encontrado.");
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar el paciente: " + e.getMessage());
        } finally {
            Conexion.desconectar();
        }
    }

    // Método para actualizar los datos de un paciente en la base de datos
    public void actualizar() throws SQLException {
        try {
            String strSQL = "UPDATE Pacientes SET nombre_p = ?, apellidos_p = ?, email = ? WHERE rut_p = ?";
            Conexion.conectar();
            Conexion.st = Conexion.conx.prepareStatement(strSQL);
            Conexion.st.setString(1, nombre_p);
            Conexion.st.setString(2, apellidos_p);
            Conexion.st.setString(3, email);
            Conexion.st.setString(4, rut_p);
            Conexion.st.executeUpdate();
            System.out.println("Paciente actualizado correctamente.");
        } catch (SQLException e) {
            System.out.println("No se pudo actualizar el paciente: " + e.getMessage());
        } finally {
            Conexion.desconectar();
        }
    }


    // Método para eliminar un paciente de la base de datos
    public void eliminar() throws SQLException {
        try {
            String strSQL = "DELETE FROM Pacientes WHERE rut_p = ?";
            Conexion.conectar();
            Conexion.st = Conexion.conx.prepareStatement(strSQL);
            Conexion.st.setString(1, rut_p);
            Conexion.st.executeUpdate();
            System.out.println("Paciente eliminado correctamente.");
        } catch (SQLException e) {
            System.out.println("No se pudo eliminar el paciente: " + e.getMessage());
        } finally {
            Conexion.desconectar();
        }
    }
    

    // Método toString para representar la información del paciente
    @Override
    public String toString() {
        return String.format("Rut: %s\nNombre: %s\nApellidos: %s\nEmail: %s", rut_p, nombre_p, apellidos_p, email);
    }
}


