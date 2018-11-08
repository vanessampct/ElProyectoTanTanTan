
package DTO;

/**
 *
 * @author David
 */
public class DTOProveedor {

    public int getIdProovedor() {
        return idProovedor;
    }

    public void setIdProovedor(int idProovedor) {
        this.idProovedor = idProovedor;
    }

    public String getNombreProovedor() {
        return nombreProovedor;
    }

    public void setNombreProovedor(String nombreProovedor) {
        this.nombreProovedor = nombreProovedor;
    }

    public String getTelefonoProovedor() {
        return telefonoProovedor;
    }

    public void setTelefonoProovedor(String telefonoProovedor) {
        this.telefonoProovedor = telefonoProovedor;
    }

    public int getColorProovedor() {
        return colorProovedor;
    }

    public void setColorProovedor(int colorProovedor) {
        this.colorProovedor = colorProovedor;
    }

    public DTOProveedor(int idProovedor, String nombreProovedor, String telefonoProovedor, int colorProovedor) {
        this.idProovedor = idProovedor;
        this.nombreProovedor = nombreProovedor;
        this.telefonoProovedor = telefonoProovedor;
        this.colorProovedor = colorProovedor;
    }
    
    public DTOProveedor(String nombreProovedor, String telefonoProovedor, int colorProovedor) {
        this.nombreProovedor = nombreProovedor;
        this.telefonoProovedor = telefonoProovedor;
        this.colorProovedor = colorProovedor;
    }
    
    private int idProovedor;
    private String nombreProovedor;
    private String telefonoProovedor;
    private int colorProovedor;
    
    
}
