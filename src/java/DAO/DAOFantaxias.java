/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.DTOReferencia;
import DTO.DTOTabla;
import DTO.DTOZona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class DAOFantaxias {

    //Creamos un objeto de la clase conexion
    Connectiondb connect = new Connectiondb();

    //Meetodo para regiatrar una referencia en fantaxias
    public boolean CrearReferenciaFantaxia(DTOReferencia referencia) {
        boolean flag = false;
        PreparedStatement pst = null;
        try {
            String consulta = "INSERT INTO tbl_referencia(id_referencia, nombre_referencia, id_zona, color) values(?, ?, ?, ?)";
            pst = connect.getConnect().prepareCall(consulta);
            pst.setInt(1, 0);
            pst.setString(2, referencia.getNombre_referencia());
            pst.setInt(3, referencia.getId_zona());
            pst.setString(4, referencia.getColor());

            if (pst.executeUpdate() == 1) {
                flag = true;
            }
        } catch (Exception e) {
            System.err.println("Error" + e);
            System.out.println("Error" + e);
        } finally {
            try {
                if (connect != null) {
                    connect.closeConnect();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
            }
        }

        return flag;
    }

    //metodo para mostrar todas las referencias
    public ArrayList<DTOReferencia> mostrarReferenciasFantaxia(int id_zona) {

        ArrayList<DTOReferencia> respuesta = new ArrayList();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            String consulta = "SELECT  id_referencia, nombre_referencia, r.id_zona, color FROM tbl_referencia r INNER JOIN tbl_zona z ON r.id_zona = z.id_zona WHERE z.id_zona = ?;";
            pst = connect.getConnect().prepareCall(consulta);
            pst.setInt(1, id_zona);
            rs = pst.executeQuery();
            while (rs.next()) {
                respuesta.add(new DTOReferencia(rs.getInt("id_referencia"), rs.getString("nombre_referencia"), rs.getInt("id_zona"), rs.getString("color")));
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
            System.err.println("Error" + e);
        } finally {
            try {
                if (connect != null) {
                    connect.closeConnect();
                };
                if (pst != null) {
                    pst.close();
                };
                if (rs != null) {
                    pst.close();
                }
            } catch (Exception e) {
            }
        }

        return respuesta;
    }

    //metodo para traer los datos a la hora de actualizarlos
    public ArrayList<DTOReferencia> mostrarReferenciaActualizarFantaxia(String referencia) {

        ArrayList<DTOReferencia> respuesta = new ArrayList();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            String consulta = "SELECT  id_referencia, nombre_referencia, r.id_zona, color, nombre_zona FROM tbl_referencia r INNER JOIN tbl_zona z ON r.id_zona = z.id_zona WHERE nombre_referencia = ?;";
            pst = connect.getConnect().prepareCall(consulta);
            pst.setString(1, referencia);
            rs = pst.executeQuery();
            while (rs.next()) {
                respuesta.add(new DTOReferencia(rs.getInt("id_referencia"), rs.getString("nombre_referencia"), rs.getInt("id_zona"), rs.getString("color"), rs.getString("nombre_zona")));
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
            System.err.println("Error" + e);
        } finally {
            try {
                if (connect != null) {
                    connect.closeConnect();
                };
                if (pst != null) {
                    pst.close();
                };
                if (rs != null) {
                    pst.close();
                }
            } catch (Exception e) {
            }
        }
        return respuesta;
    }
    
    //metodo para actualizar las referencias
    public boolean actualizarReferenciasFantaxias(DTOReferencia referencia){
        
        boolean flag = false;
        PreparedStatement pst = null;
        
        try {
            String consulta = "call actualizarReferenciaFantaxias(?, ?, ?)";
            pst = connect.getConnect().prepareCall(consulta);
            pst.setInt(1, referencia.getId_referencia());
            pst.setString(2, referencia.getNombre_referencia());
            pst.setString(3, referencia.getColor());
            
            if (pst.executeUpdate() == 1) {
                flag = true;
            }
        } catch (Exception e) {
            System.err.println("Error" + e);
            System.out.println("Error" + e);
        } finally {
            try {
                if (connect != null) {
                    connect.closeConnect();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
            }
        }
        return flag;
    }
    
    //metodo para eliminar una referencia
    public boolean eliminarReferenciaFantaxias(int id_referencia){
        
        boolean flag = false;
        PreparedStatement pst = null;
        
        try {
            String consulta = "DELETE FROM tbl_referencia WHERE id_referencia = ?";
            pst = connect.getConnect().prepareCall(consulta);
            pst.setInt(1, id_referencia);
            if (pst.executeUpdate() == 1) {
                flag = true;
            }
        } catch (Exception e) {
            System.err.println("Error" + e);
            System.out.println("Error" + e);
        } finally {
            try {
                if (connect != null) {
                    connect.closeConnect();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
            }
        }
        return flag;
    }

    //Para realizar pruebas
    public static void main(String[] args) {
        DAOFantaxias df = new DAOFantaxias();
        // System.out.println(df.CrearReferenciaFantaxia(new DTOReferencia(0, "Prueba desde java", 1, "CHIMBO")));
//        for (DTOReferencia r : df.mostrarReferenciasFantaxia(1)) {
//            System.out.println(r.getNombre_referencia());
//            System.out.println(r.getColor());
//            System.out.println(r.getId_zona());
//            System.out.println(r.getId_referencia());
//        }
//        for (DTOReferencia r : df.mostrarReferenciaActualizarFantaxia("hola mundo")) {
//            System.out.println(r.getNombre_referencia());
//            System.out.println(r.getColor());
//            System.out.println(r.getId_zona());
//            System.out.println(r.getId_referencia());
//            System.out.println(r.getNombre_zona());
//        }
//        System.out.println(df.actualizarReferenciasFantaxias( new DTOReferencia(2, "Actualizado", 1, "verde")));
          System.out.println(df.eliminarReferenciaFantaxias(2));
    }
}
