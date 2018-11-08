package Servlets;

import Controllers.ControllerProveedor;
import DTO.DTOProveedor;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletProveedor extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            ControllerProveedor ctp = new ControllerProveedor();

            int opcion = Integer.parseInt(request.getParameter("opcion"));

            switch (opcion) {
                case 1: {
                    String nombre_proovedor = request.getParameter("nombre_proveedor");
                    String telefono_proovedor = request.getParameter("telefono_proveedor");
                    String color = request.getParameter("colors");
                    

                    int colorI;

                    switch (color) {
                        case "azul":
                            colorI = 0;
                            break;
                        case "amarillo":
                            colorI = 1;
                            break;
                        default:
                            colorI = 2;
                            break;
                    }

                    if (ctp.insert(new DTOProveedor(nombre_proovedor, telefono_proovedor, colorI))) {
                        response.getWriter().println("<h6  id=\"mensaje-registrar-proovedor\" class=\" bg-success text-white font-weight-normal shadow-sm \">\n"
                                + "                Proveedor Registrado Con exito!\n"
                                + "            </h6>");
                    } else {
                        response.getWriter().println("<h6  id=\"mensaje-registrar-proovedor\" class=\" bg-danger text-white font-weight-normal shadow-sm \">\n"
                                + "                Error al registrar el proovedor\n"
                                + "            </h6>");
                    }
                    break;
                }
                case 2: {
                    int id_proovedor = Integer.parseInt(request.getParameter("buscarProovedor"));
                    
                    
                    response.getWriter().print(ctp.buscarProovedorId(id_proovedor));
                  
                    break;
                }
                case 3: {
                    String nombre_proovedor = request.getParameter("nombre_proveedor");
                    String telefono_proovedor = request.getParameter("telefono_proveedor");
                    String color = request.getParameter("color");
                    int id = Integer.parseInt(request.getParameter("id_proovedor"));
                    int colorI;

                    switch (color) {
                        case "azul":
                            colorI = 0;
                            break;
                        case "amarillo":
                            colorI = 1;
                            break;
                        default:
                            colorI = 2;
                            break;
                    }
                    if(ctp.update(new DTOProveedor(id, nombre_proovedor, telefono_proovedor, colorI))){
                        response.getWriter().println("<h6  id=\"mensaje-registrar-proovedor\" class=\" bg-success text-white font-weight-normal shadow-sm \">\n"
                                + "                Los datos del proovedor se han actualizado\n"
                                + "            </h6>");
                    }else{
                        response.getWriter().println("<h6  id=\"mensaje-registrar-proovedor\" class=\" bg-danger text-white font-weight-normal shadow-sm \">\n"
                                + "                Error al intentar atualziar los datos del proovedor\n"
                                + "            </h6>");
                    }
     
                    break;
                }
                case 4: {
                    int id = Integer.parseInt(request.getParameter("id-eliminarp"));
                   
                    if( ctp.delete(id)){
                        response.getWriter().println("<h6  id=\"mensaje-registrar-proovedor\" class=\" bg-warning text-white font-weight-normal shadow-sm \" style=\"height;200px;\">\n"
                                + "              ! Se ha eliminado El proovedor de tu lista\n"
                                + "            </h6>");
                    }
                }
            }


        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
