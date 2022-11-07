package login_sql;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;

/**
 *
 * @author nuria
 */
public class DBManager_login {
    //CONEXION

    private static Connection conn = null; // este metodo devuelve un true o falsa dependiendo si se ha producido la conexion

    // CONFIGUARICON DE LA CONEXION
    private static final String DB_HOST = "localhost";
    private static final String DB_PORT = "3306";
    private static final String DB_NAME = "zoo";
    private static final String DB_URL = "jdbc:mariadb://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME;
    private static final String DB_USER = "zoo_admind";
    private static final String DB_PASS = "1234";

    // METODOS DE CONEXION:
    //___________________________________________________________________________________________________________
    // DRIVER DE JDBC
    public static Connection conexion() {

        try {
            conn = (Connection) DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);// metodo para encontrar el driver instalado en netbeants
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(DBManager_login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

//________________________________________________________________________________________________________________
    // CERRAR CONEXION
    public void closeConexion(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DBManager_login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    //_____________________________________________________________________________________________________________
    //METODO  COMPROBAR LOGIN
    public static String getLogin(String nombre, String pass) {
        try {
            // para realizar una consulta se hace con un objeto llamado Statement

            Statement consulta_mia = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE); // eso sirve para moverte linea a lina y poder hacerlo actualizable
            // la consulta
            String sql = "SELECT usuario FROM login WHERE usuario = '" + nombre + "' AND pass ='" + pass + "'";
            // el resultado 
            ResultSet resultado = consulta_mia.executeQuery(sql);// le pasas el sql de arriba para que lo ejecute

            //if para comprobar si existe 
            if (!resultado.first()) {
                return null;

            } else {
                String nombreuser = resultado.getString("usuario");
                return nombreuser;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBManager_login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    //______________________________________________________________________________________________________________   
    // VARIABLES TABLA LOGIN 
    private String DB_LOGIN = "login";
    private String DB_LOGIN_SELECT = "SELECT * FROM" + DB_LOGIN;
    private String DB_NOMBRE = "usuario";
    private String DB_PASSLogin = "pass";

    //______________________________________________________________________________________________________________   
    // VARIABLES TABLA ANIMAL
    private String DB_ANIMAL = "animales";
    private String DB_ANIMAL_SELECT = "SELECT * FROM" + DB_ANIMAL;
    private String DB_ANIMAL_NOMBRE = "nombre";
    private String DB_ANIMAL_RAZA = "raza";
    private String DB_ANIMAL_ESPECIE = "especie";
    private String DB_ANIMAL_PESO = "peso";
    private String DB_ANIMAL_ID_ANIMALES = "id_animales";

    //______________________________________________________________________________________________________________   
    // VARIABLES TABLA CUIDADOS
    private String DB_CUIDADOS = "cuidados";
    private String DB_CUIDADOS_SELECT = "SELECT * FROM" + DB_CUIDADOS;
    private String DB_CUIDADOS_TIPO_COMIDA = "tipoComida";
    private String DB_CUIDADOS_CANTIDAD_COMIDA = "CcantidadComida";
    private String DB_CUIDADOS_COSTE_PROMEDIO = "costePromedio";
    private String DB_CUIDADOS_HABITAD = "habitad";
    private String DB_CUIDADOS_FECHA = "fecha";
    private String DB_CUIDADOS_ID_CUIDADOS = "id_cuidados";

    //______________________________________________________________________________________________________________   
    // VARIABLES TABLA ESPECIALIDAD
    private String DB_ESPECIALIDAD = "especialidad";
    private String DB_ESPECIALIDAD_SELECT = "SELECT * FROM" + DB_ESPECIALIDAD;
    private String DB_ESPECIALIDAD_NOMBRE = "nombre";
    private String DB_ESPECIALIDAD_SALARIO = "salario";
    private String DB_ESPECIALIDAD_ID_ESPECIALIDAD = "id_especialidad";

    //______________________________________________________________________________________________________________   
    // VARIABLES TABLA ESPECIE
    private String DB_ESPECIE = "especie";
    private String DB_ESPECIE_SELECT = "SELECT * FROM" + DB_ESPECIE;
    private String DB_ESPECIE_NOMBRE = "nombre";
    private String DB_ESPECIE_ID_ESPECIE = "id_especie";

    //______________________________________________________________________________________________________________   
    // VARIABLES TABLA PERSONAS
    private String DB_PERSONAS = "personas";
    private String DB_PERSONAS_SELECT = "SELECT * FROM" + DB_PERSONAS;
    private String DB_PERSONAS_NOMBRE = "nombre";
    private String DB_PERSONAS_APELLIDOS = "apellidos";
    private String DB_PERSONAS_TELEFONO = "telefono";
    private String DB_PERSONAS_TIPO = "tipo";
    private String DB_PERSONAS_SALARIO = "salario";
    private String DB_PERSONAS_ID_PERSONAS = "id_personas";

    //______________________________________________________________________________________________________________   
    // VARIABLES TABLA ANI_CUI_PER
    private String DB_ANI_CUI_PER = "ani_cui_per";
    private String DB_ANI_CUI_PER_SELECT = "SELECT * FROM" + DB_ANI_CUI_PER;
    private String DB_ANI_CUI_PER_ANIMALES = "animales";
    private String DB_ANI_CUI_PER_PERSONAS = "personas";
    private String DB_ANI_CUI_PER_CUIDADOS = "cuidados";
    private String DB_ANI_CUI_PER_FECHA = "fecha";

    //______________________________________________________________________________________________________________   
    // VARIABLES TABLA PER_ESPE
    private String DB_PER_ESPE = "ani_cui_per";
    private String DB_PER_ESPE_SELECT = "SELECT * FROM" + DB_PER_ESPE;
    private String DB_PER_ESPE_ID_ESPECIALIDAD = "id_especialidad";
    private String DB_PER_ESPE_ID_PERSONA = "id_persona";

    //////////////////////////////////////////
    //METODOS
    /////////////////////////////////////////
    //_____________________________________________________________________________________________________________
    //METODOS DEVUELVE TABLA COMPELTA
    public static ResultSet obtener_tablas(int resultSetTipe, int resultSetConcurrency, String consulta_sql) {

        try {

            Statement consulta = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultado = consulta.executeQuery(consulta_sql);// aqui se pasa el argumento de la tabla que quieres
            return resultado;
        } catch (SQLException ex) {
            Logger.getLogger(DBManager_login.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    //______________________________________________________________________________________________________

    //_____________________________________________________________________________________________________________
    //METODOS AÑADIR ANIMALES
    public static boolean add_animales(String especie, String nombre, String raza, float peso) {

        try {
            String consulta_animal = "SELECT * FROM animales";
            ResultSet resultado = obtener_tablas(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE, consulta_animal);
            resultado.moveToInsertRow();// inserta dato al final de la tabla
            resultado.updateString("especie", especie);
            resultado.updateString("nombre", nombre);
            resultado.updateString("raza", raza);
            resultado.updateFloat("peso", peso);

            resultado.insertRow();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBManager_login.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //_____________________________________________________________________________________________________________
    //METODOS AÑADIR CUIDADORES
    public static boolean add_cuidadores(String nombre, String apellidos, int telefono, String cargo, float salario) {

        try {
            String consulta_cuidadores = "SELECT * FROM personas";
            ResultSet resultado = obtener_tablas(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE, consulta_cuidadores);
            resultado.moveToInsertRow();// inserta dato al final de la tabla

            resultado.updateString("nombre", nombre);
            resultado.updateString("apellidos", apellidos);
            resultado.updateInt("telefono", telefono);
            resultado.updateString("cargo", cargo);
            resultado.updateFloat("salario", salario);
            resultado.insertRow();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBManager_login.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //_____________________________________________________________________________________________________________
    //METODOS AÑADIR CUIDADORES( tipo de tarea) CAMBIAR NOMBRE A LA TABLA SQL
    public static boolean add_tipo_tarea(String nombre, String peligrosidad, float salario_extra) {

        try {
            String consulta_cuidadores = "SELECT * FROM cuidados";
            ResultSet resultado = obtener_tablas(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE, consulta_cuidadores);
            resultado.moveToInsertRow();// inserta dato al final de la tabla

            resultado.updateString("nombre_tarea", nombre);
            resultado.updateString("peligrosidad", peligrosidad);
            resultado.updateFloat("salario_extra", salario_extra);

            resultado.insertRow();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBManager_login.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    //_____________________________________________________________________________________________________________
    //METODOS AÑADIR especialidad

    public static boolean add_especialidad(String nombre) {

        try {
            String consulta_cuidadores = "SELECT * FROM especialidad";
            ResultSet resultado = obtener_tablas(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE, consulta_cuidadores);
            resultado.moveToInsertRow();// inserta dato al final de la tabla

            resultado.updateString("nombre", nombre);

            resultado.insertRow();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBManager_login.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    //_____________________________________________________________________________________________________________
    //METODOS AÑADIR especie

    public static boolean add_especie(String nombre) {

        try {
            String consulta_cuidadores = "SELECT * FROM especie";
            ResultSet resultado = obtener_tablas(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE, consulta_cuidadores);
            resultado.moveToInsertRow();// inserta dato al final de la tabla

            resultado.updateString("nombre", nombre);

            resultado.insertRow();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBManager_login.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    //_________________________________________________________________________________________________
    // METODO OBTENER ANIMAL POR EL ID

    public static ResultSet obtener_id_animal(int id) {
        try {
            String consulta_sql = " Select * from animales where id_animales = '" + id + "';";

            Statement consulta = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultado = consulta.executeQuery(consulta_sql);// aqui se pasa el argumento de la tabla que quieres
            if (!resultado.first()) {// si no hay primero de la fila
                return null;

            }
            return resultado;
        } catch (SQLException ex) {
            Logger.getLogger(DBManager_login.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    //_________________________________________________________________________________________________
    //METODO BORRAR ANIMAL
    public static boolean borrar_animal(int id) {

        try {
            ResultSet resultado = obtener_id_animal(id);
            if (resultado == null) {
                return false;

            }
            if (resultado.first()) {

                resultado.deleteRow();
                resultado.close();
                JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
                return true;

            } else {
                JOptionPane.showMessageDialog(null, "No se ha podido eliminar");
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBManager_login.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    //_____________________________________________________________________________________________________________
    //METODOS editar animal 
    public static boolean actualizar_animales(int id, String especie, String nombre, String raza, float peso) {

        try {

            ResultSet resultado = obtener_id_animal(id);
            if (resultado == null) {
                JOptionPane.showMessageDialog(null, "No se ha podido actualizar");
                return false;

            }
            if (resultado.first()) {
                resultado.updateString("especie", especie);
                resultado.updateString("nombre", nombre);
                resultado.updateString("raza", raza);
                resultado.updateFloat("peso", peso);
                resultado.updateRow();
                resultado.close();

                return true;

            } else {
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBManager_login.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    //______________________________________________________________________________________________________
    // METODO OBTENER ANIMAL POR EL ID

    public static ResultSet obtener_id_personas(int id) {
        try {
            String consulta_sql = " Select * from personas where id_persona = '" + id + "';";

            Statement consulta = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultado = consulta.executeQuery(consulta_sql);// aqui se pasa el argumento de la tabla que quieres
            if (!resultado.first()) {// si no hay primero de la fila
                return null;

            }
            return resultado;
        } catch (SQLException ex) {
            Logger.getLogger(DBManager_login.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
    //_________________________________________________________________________________________________
    //METODOS editar animal 
    public static boolean actualizar_persona(int id, String nombre, String apellido, int telefono, String cargo, float salario) {

        try {

            ResultSet resultado = obtener_id_personas(id);
            if (resultado == null) {
                JOptionPane.showMessageDialog(null, "No se ha podido actualizar");
                return false;

            }
            if (resultado.first()) {
                resultado.updateString("nombre", nombre);
                resultado.updateString("apellidos", apellido);
                resultado.updateInt("telefono", telefono);
                resultado.updateString("cargo", cargo);
                resultado.updateFloat("salario", salario);
                resultado.updateRow();
                resultado.close();

                return true;

            } else {
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBManager_login.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
     //_________________________________________________________________________________________________
    // METODO OBTENER persona POR EL ID

    public static ResultSet obtener_persona_id(int id) {
        try {
            String consulta_sql = " Select * from personas where id_persona = '" + id + "';";

            Statement consulta = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultado = consulta.executeQuery(consulta_sql);// aqui se pasa el argumento de la tabla que quieres
            if (!resultado.first()) {// si no hay primero de la fila
                return null;

            }
            return resultado;
        } catch (SQLException ex) {
            Logger.getLogger(DBManager_login.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
    
    
    //_________________________________________________________________________________________________
    //METODO BORRAR Persona
    public static boolean borrar_persona(int id) {

        try {
            ResultSet resultado = obtener_persona_id(id);
            if (resultado == null) {
                return false;

            }
            if (resultado.first()) {

                resultado.deleteRow();
                resultado.close();
                JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
                return true;

            } else {
                JOptionPane.showMessageDialog(null, "No se ha podido eliminar");
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBManager_login.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
    //_____________________________________________________________________________________________________________
    //METODOS AÑADIR tareas

    public static boolean add_tareas(String fecha, int persona, int animal,int cuidados) {

        try {
            String consulta_cuidadores = "SELECT * FROM ani_cui_per";
            ResultSet resultado = obtener_tablas(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE, consulta_cuidadores);
            resultado.moveToInsertRow();// inserta dato al final de la tabla

            resultado.updateString("fecha", fecha);
            resultado.updateInt("personas", persona);
            resultado.updateInt("animales", animal);
            resultado.updateInt("tarea", cuidados);
            

            resultado.insertRow();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBManager_login.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
     //_________________________________________________________________________________________________
    // METODO OBTENER el id de un animal mediante el nombre

    public static int obtener_animal_porNombre(String nombre) {
        try {
            String consulta_sql = " Select * from animales  where nombre  = '" + nombre+ "';";

            Statement consulta = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultado = consulta.executeQuery(consulta_sql);// aqui se pasa el argumento de la tabla que quieres
            if (!resultado.first()) {// si no hay primero de la fila
                return -1;

            }
            int id_animales = resultado.getInt("id_animales");
            return id_animales;
            
        } catch (SQLException ex) {
            Logger.getLogger(DBManager_login.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }

    }
    
    //_________________________________________________________________________________________________
    // METODO OBTENER el id de un trabajo mediante el nombre

    public static int obtener_trabajo_porNombre(String nombre) {
        try {
            String consulta_sql = " Select * from cuidados where nombre_tarea  = '" + nombre+ "';";

            Statement consulta = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultado = consulta.executeQuery(consulta_sql);// aqui se pasa el argumento de la tabla que quieres
            if (!resultado.first()) {// si no hay primero de la fila
                return -1;

            }
            int id_tipo_tarea = resultado.getInt("id_tipo_tarea");
            return id_tipo_tarea;
            
        } catch (SQLException ex) {
            Logger.getLogger(DBManager_login.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }

    }
    
 //_________________________________________________________________________________________________
    // METODO OBTENER el id de un cuidador mediante el telefono

    public static String obtener_cuidador_porTelefono(String telefono) {
        try {
            String consulta_sql = " SELECT id_persona FROM personas WHERE telefono  = '" + telefono+ "'";
            

            Statement consulta = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultado = consulta.executeQuery(consulta_sql);// aqui se pasa el argumento de la tabla que quieres
            if (!resultado.first()) {// si no hay primero de la fila
                return null;

            }
            String id_persona = resultado.getString("id_persona");
            return id_persona;
            
        } catch (SQLException ex) {
            Logger.getLogger(DBManager_login.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
     //_________________________________________________________________________________________________
    // METODO OBTENER el id de un animal mediante el id

    public static String obtener_animal_porId(int id) {
        try {
            String consulta_sql = " Select * from animales  where id_animales  = '" + id+ "';";

            Statement consulta = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultado = consulta.executeQuery(consulta_sql);// aqui se pasa el argumento de la tabla que quieres
            if (!resultado.first()) {// si no hay primero de la fila
                return null;

            }
           String nombre_animal = resultado.getString("nombre");
            return nombre_animal;
            
        } catch (SQLException ex) {
            Logger.getLogger(DBManager_login.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
     //_________________________________________________________________________________________________
    // METODO OBTENER persona por id

    public static String obtener_persona_porId(int id) {
        try {
            String consulta_sql = " Select * from personas  where id_persona  = '" + id+ "';";

            Statement consulta = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultado = consulta.executeQuery(consulta_sql);// aqui se pasa el argumento de la tabla que quieres
            if (!resultado.first()) {// si no hay primero de la fila
                return null;

            }
           String nombre_persona = resultado.getString("nombre");
            return nombre_persona;
            
        } catch (SQLException ex) {
            Logger.getLogger(DBManager_login.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
     //_________________________________________________________________________________________________
    // METODO OBTENER tarea por id

    public static String obtener_tarea_porId(int id) {
        try {
            String consulta_sql = " Select * from cuidados  where id_tipo_tarea  = '" + id+ "';";

            Statement consulta = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultado = consulta.executeQuery(consulta_sql);// aqui se pasa el argumento de la tabla que quieres
            if (!resultado.first()) {// si no hay primero de la fila
                return null;

            }
           String nombre_tarea = resultado.getString("nombre_tarea");
            return nombre_tarea;
            
        } catch (SQLException ex) {
            Logger.getLogger(DBManager_login.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
     //_________________________________________________________________________________________________
    // METODO OBTENER el telefono por id

    public static String obtener_telefono_id(int id) {
        try {
            String consulta_sql = " Select * from personas  where id_persona  = '" + id+ "';";

            Statement consulta = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultado = consulta.executeQuery(consulta_sql);// aqui se pasa el argumento de la tabla que quieres
            if (!resultado.first()) {// si no hay primero de la fila
                return null;

            }
           String telefono = resultado.getString("telefono");
            return telefono;
            
        } catch (SQLException ex) {
            Logger.getLogger(DBManager_login.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
     //_________________________________________________________________________________________________
    // METODO comprobar si existe

    public static boolean comprobar_si_existe_animal(String nombre,String especie) {
        try {
            String consulta_sql = " Select * from animales  where nombre = '" + nombre+ "' AND especie = '"+especie+"';";

            Statement consulta = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultado = consulta.executeQuery(consulta_sql);// aqui se pasa el argumento de la tabla que quieres
            if (!resultado.first()) {// si no hay primero de la fila
                return false;

            }
          
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(DBManager_login.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
    
}
