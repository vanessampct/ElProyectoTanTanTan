/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Controllers.ControllerReferencias;
import DTO.DTOReferencia;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class ServletFantaxias extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
          
            int crud = Integer.parseInt(request.getParameter("opcion"));

            
            switch(crud){
                case 1:{
                   String NombreReferencia = request.getParameter("referencia-fanaxi");
                   int Zona = Integer.parseInt(request.getParameter("zona-fanxias"));
                   String color = request.getParameter("color");
                   
                   ControllerReferencias cr = new ControllerReferencias();
                    if (cr.CrearReferenciaFantaxia(new DTOReferencia(0, NombreReferencia, Zona, color)) == true) {
                        response.getWriter().print("Se ha añadido una nueva referencia!");
                    }else{
                        response.getWriter().print("Error al añadir una nueva referencia!");
                    }
                    break;
                }
                case 2:{
                     String referencia = request.getParameter("referencia");
                      ControllerReferencias cr = new ControllerReferencias();
                     response.getWriter().print(cr.mostrarReferenciaActualizarFantaxia(referencia));
                     System.out.println(cr.mostrarReferenciaActualizarFantaxia(referencia));
                     break;
                }
                case 3:{
                    int id_referencia = Integer.parseInt(request.getParameter("id_referencia"));
                    String color = request.getParameter("color");
                    String referencia = request.getParameter("referencia");
                    
                    ControllerReferencias cr = new ControllerReferencias();
                    
                    System.out.println(cr.actualizarReferenciasFantaxias(new DTOReferencia(id_referencia, referencia, 0, color)));
                   if(cr.actualizarReferenciasFantaxias(new DTOReferencia(id_referencia, referencia, 0, color)) == true){
                    response.getWriter().print("Referencia Actualizada con exito");
                }else{
                       response.getWriter().print("Error al actualizar la referencia");
                   }
                    
                  break;  
                }case 4:{
                    int cod_referencia = Integer.parseInt(request.getParameter("id_referencia"));
                    ControllerReferencias cr = new ControllerReferencias();
                    if(cr.eliminarReferenciaFantaxias(cod_referencia)){
                         response.getWriter().println("Se ha eliminado la referencia");
                    }
                   
                }
               
            }
           

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

//    public static void main(String[] args) {
//        ControllerReferencias cr = new ControllerReferencias();
//        System.out.println(cr.mostrarReferenciaActualizarFantaxia("referencia 1"));
//    }
}
