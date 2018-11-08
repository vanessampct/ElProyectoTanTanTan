
package DTO;

/**
 *
 * @author David
 */
public class DTOZona {

    public int getId_zona() {
        return id_zona;
    }

    public void setId_zona(int id_zona) {
        this.id_zona = id_zona;
    }

    public String getNombre_zona() {
        return nombre_zona;
    }

    public void setNombre_zona(String nombre_zona) {
        this.nombre_zona = nombre_zona;
    }

    public int getId_tabla() {
        return id_tabla;
    }

    public void setId_tabla(int id_tabla) {
        this.id_tabla = id_tabla;
    }

    public DTOZona(int id_zona, String nombre_zona, int id_tabla) {
        this.id_zona = id_zona;
        this.nombre_zona = nombre_zona;
        this.id_tabla = id_tabla;
    }
   
    private int id_zona;
    private String nombre_zona;
    private int id_tabla;
            
    
    
}
