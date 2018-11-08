
package DAO;

import java.util.List;
import java.sql.*;
import DAO.Connectiondb;
import DTO.DTOProveedor;
import Controllers.ControllerProveedor;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DAOProveedor implements I_operaciones {
    
    Connectiondb connect = new Connectiondb(); 
    ControllerProveedor cProveedor = new ControllerProveedor();
    
    
    
    
    //Metodo para resgitrar al proveedor
    public boolean insert(DTOProveedor dtoProveedor) {
        boolean respuesta = false;
        PreparedStatement pst = null;
        //String sql = "INSERT INTO tbl_proveedor (nombre_proveedor, telefono_proveedor, color) VALUES (?,?,?)";
        String sql = "INSERT INTO tbl_proveedor (nombre_proovedor, telefono_proovedor, color) VALUES (?,?,?)";
        
        try {
            pst = connect.getConnect().prepareStatement(sql);
            pst.setString(1, dtoProveedor.getNombreProovedor());
            pst.setString(2, dtoProveedor.getTelefonoProovedor());
            pst.setInt(3, dtoProveedor.getColorProovedor());
            
            if(pst.executeUpdate() == 1){
                respuesta = true;
            }else{
                respuesta = false;
            } 
            
            connect.closeConnect();
        } catch (SQLException e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }finally{
            try {
                if(connect != null){connect.closeConnect();}
                if(pst != null){pst.close();}
            } catch (Exception e) {
            }
        }   
        
        return true;
    } 

  
    //metodo para mostrar todos los proveedores
    
    public ArrayList<DTOProveedor> find(){
         PreparedStatement pst  = null;
         ResultSet rs = null;
         ArrayList<DTOProveedor> Respuesta = new ArrayList();
         
         try {
             String consulta= "SELECT * FROM  tbl_proveedor ORDER BY id_proovedor DESC";
            pst = connect.getConnect().prepareCall(consulta);
            rs = pst.executeQuery(consulta);
            while(rs.next()){
                    Respuesta.add(new DTOProveedor(rs.getInt("id_proovedor"),rs.getString("nombre_proovedor"), rs.getString("telefono_proovedor"), rs.getInt("color")));
                
            }
        } catch (Exception e) {
             System.out.println("Error" + e);
             System.err.println("Error" + e);
        }finally{
             try {
                 if(connect.getConnect() != null){connect.closeConnect();};
                 if(pst != null){pst.close();}
             if(rs != null){rs.close();} 
             }catch (Exception e) {
                 
             }
         }
        
         return Respuesta;
    }
    
    //metodo para buscar proovedores por el id 
    public ArrayList<DTOProveedor> buscarProovedorId(int id_proovedor){
         PreparedStatement pst  = null;
         ResultSet rs = null;
         ArrayList<DTOProveedor> Respuesta = new ArrayList();
         
         try {
            String consulta= "call buscarPactualizar(?);";
            pst = connect.getConnect().prepareCall(consulta);
            pst.setInt(1,id_proovedor);
            rs = pst.executeQuery();
            while(rs.next()){
                    Respuesta.add(new DTOProveedor(rs.getInt("id_proovedor"),rs.getString("nombre_proovedor"), rs.getString("telefono_proovedor"), rs.getInt("color")));
                
            }
        } catch (Exception e) {
             System.out.println("Error" + e);
             System.err.println("Error" + e);
        }finally{
             try {
                 if(connect.getConnect() != null){connect.closeConnect();};
                 if(pst != null){pst.close();}
             if(rs != null){rs.close();} 
             }catch (Exception e) {
                 
             }
         }
        
         return Respuesta;
    }
    
    //Metodo para eliminar a el proveedor 
    public boolean delete(int id) {
        PreparedStatement pst = null;
        boolean mensaje = false;
        
        try {
            String consulta = "DELETE FROM tbl_proveedor WHERE id_proovedor = ? ;";
            pst = connect.getConnect().prepareCall(consulta);
            pst.setInt(1,id);
            if(pst.executeUpdate() == 1){
                mensaje = true;
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
            System.err.println("Error" + e);
        }finally{
            try {
                if(connect.getConnect() != null){ connect.closeConnect();};
                if(pst != null){pst.close();};
            } catch (Exception e) {
            }
        }
        
        return mensaje;
    }

    //Metodo para Actualizar a el proovedor
    public boolean update(DTOProveedor dtoProveedor) {
        boolean mensaje = false;
        PreparedStatement pst = null;
        
         try {
             String consulta = "call actualizar_proovedor(?,?,?,?)";
             pst = connect.getConnect().prepareCall(consulta);
             pst.setInt(1,dtoProveedor.getIdProovedor());
             pst.setString(2,dtoProveedor.getNombreProovedor());
             pst.setString(3,dtoProveedor.getTelefonoProovedor());
             pst.setInt(4,dtoProveedor.getColorProovedor());
             
             if(pst.executeUpdate() == 1){
                 mensaje = true;
             }
         } catch (Exception e) {
             System.out.println("Error" + e);
             System.err.println("Error" + e);
         }finally{
             try {
                 if(connect.getConnect() != null){connect.closeConnect();};
                  if(connect.getConnect() != null){connect.closeConnect();};

             } catch (Exception e) {
             }
         }
         return mensaje;
    }
     
//    public static void main(String[] args) {
//        DAOProveedor dp = new DAOProveedor();
//        
////        for(DTOProveedor d: dp.buscarProovedorId(3)){
////            System.out.println(d.getNombreProovedor());
////            System.out.println(d.getTelefonoProovedor()) ;
////            System.out.println(d.getColorProovedor());
////            System.out.println(d.getIdProovedor());
////        }
//        
//      //  System.out.println(dp.delete(1));
// //System.out.println(dp.update(new DTOProveedor("Johny press", "305363636", 1)));
//    }
 
}
