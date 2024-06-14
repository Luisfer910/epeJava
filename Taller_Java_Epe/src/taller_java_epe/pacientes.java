package taller_java_epe;

import java.sql.SQLException;
import java.sql.ResultSet;

public class pacientes{

     private  String rut_p;
     private  String nombre_p;
     private  String apellidos_p;
     private  String email;

     public pacientes(){
     }  

    public pacientes(String rut_p, String nombre_p, String apellidos_p, String email) {
        this.rut_p = rut_p;
        this.nombre_p = nombre_p;
        this.apellidos_p = apellidos_p;
        this.email = email;
    }

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

    @Override
    public String toString() {
        return "pacientes{" + "rut_p=" + rut_p + ", nombre_p=" + nombre_p + ", apellidos_p=" + apellidos_p + ", email=" + email + '}';
    }
    
    public void imprimir(){
    
        System.out.println(toString());
    }
    
    public void guardarPaciente(){
    
        try{
             String strSQL = "INSERT INTO Pacientes values('"+rut_p+"','"+nombre_p+"','"+apellidos_p+"','"+email+"')";
             
             Conexion.conectar();
             Conexion.st=Conexion.conx.prepareStatement(strSQL);
             Conexion.st.execute(strSQL);
             System.out.println("Datos Almacenados");
             
        }catch(SQLException e){
            System.out.println("Error en el metodo guardar Alumno"+ e.getMessage());
        }
    }
    
    public void cargarRutPaciente() {
    try {
        Conexion.buscarPaciente = false;
        String strSQL = "select * from Pacientes where rut_p='" + rut_p + "'";
        Conexion.conectar();
        Conexion.st = Conexion.conx.prepareStatement(strSQL);
        ResultSet objRes = (ResultSet) Conexion.st.executeQuery(strSQL);
        if (objRes.next()) {
            Conexion.buscarPaciente=true;
            rut_p = objRes.getString("rut_p");
            nombre_p = objRes.getString("nombre_p");
            apellidos_p = objRes.getString("apellidos_p");
            email = objRes.getString("email");
        }
        Conexion.desconectar();
    } catch (SQLException e) {
        System.out.println("Error al Buscar el paciente: " + e.getMessage());
    }
}
    
    public void actualizar(){
            
            try {
                String strSQL ="update alumno set nombre= '"+nombre_p+"','"+apellidos_p+"','"+email+"' where rut_p='"+rut_p+"'";
                Conexion.conectar();
                Conexion.st=Conexion.conx.prepareStatement(strSQL);
                Conexion.st.execute(strSQL);
                System.out.println("Paciente Actualizado");
                Conexion.desconectar();
            } catch (SQLException e) {
                System.out.println("No se pudo actualizar");
            }
            
           
            
            
            } public void eliminar(){
                
             try {
                String strSQL ="delete from Pacientes where rut_p='"+rut_p+"'";
                Conexion.conectar();
                Conexion.st=Conexion.conx.prepareStatement(strSQL);
                Conexion.st.execute(strSQL);
                System.out.println("Paciente Eliminado");
                Conexion.desconectar();
            } catch (SQLException e) {
                System.out.println("No se puede eliminar");
            }
        }
    }
