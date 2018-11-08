package Controllers;

import DAO.DAOProveedor;
import DTO.DTOProveedor;
import java.util.ArrayList;

public class ControllerProveedor {

    //Metodo para registrar el proovedor
    public boolean insert(DTOProveedor dtoProveedor) {

        DAOProveedor daoProveedor = new DAOProveedor();
        return daoProveedor.insert(dtoProveedor);
    }

    //metodo para mostrar el proovedor
    public String read() {

        DAOProveedor daoProveedor = new DAOProveedor();
        String Registros = "";
        for (DTOProveedor p : daoProveedor.find()) {
            String color = "";
            switch (p.getColorProovedor()) {
                case 0:
                    color = "Azul";
                    break;
                case 1:
                    color = "Amarillo";
                    break;
                default:
                    color = "Verde";
                    break;
            }

            Registros += "<tr>\n"
                    + "                                <th scope=\"row\">" + p.getIdProovedor() + "</th>\n"
                    + "                                <td>" + p.getNombreProovedor() + "</td>\n"
                    + "                                <td>" + p.getTelefonoProovedor() + "</td>\n"
                    + "                                <td>" + color + "</td>\n"
                    + "                              </tr>";
        }

        return Registros;
    }

    //metodo para modificar el proovedor
    public boolean update(DTOProveedor dtoProovedor) {
        DAOProveedor daoProveedor = new DAOProveedor();
        return daoProveedor.update(dtoProovedor);
    }

    //Metodo para eliminar a un proovedor
    public boolean delete(int id_proovedor) {
        DAOProveedor daoProveedor = new DAOProveedor();
        return daoProveedor.delete(id_proovedor);
    }

    public String buscarProovedorId(int id_proovedor) {
        String respuesta = "";
        DAOProveedor daoProveedor = new DAOProveedor();
        for (DTOProveedor tp : daoProveedor.buscarProovedorId(id_proovedor)) {
            String color = "";
            switch (tp.getColorProovedor()) {
                case 0:
                    color = "Azul";
                    break;
                case 1:
                    color = "Amarillo";
                    break;
                default:
                    color = "Verde";
                    break;
            }
            respuesta = ""
                    + ""
                    + "<form id=\"data-eliminar-proovedor\" style=\"display: none;\">\n"
                    + "                                <input type=\"text\" name=\"id-eliminarp\" value=\"" + tp.getIdProovedor() + "\">\n"
                    + "                                <input type=\"text\" name=\"opcion\" value=\"4\">\n"
                    + "                            </form>"
                    + "<form class=\"p-3\" id=\"form-registrar-modificarProvedor\"  method=\"post\" style=\"width: 83%;\">\n"
                    + "                           \n"
                    + "                                <label for=\"nombre_proveedor\">Nombre:</label>\n"
                    + "                                <input type=\"text\" name=\"nombre_proveedor\" \n"
                    + "                                       class=\"form-control\" id=\"nombre_proveedor\" \n"
                    + "                                       placeholder=\"Nombre\" required=\"required\" value=\"" + tp.getNombreProovedor() + "\">\n"
                    + "                                <label for=\"telefono_proveedor\">Teléfono:</label>\n"
                    + "                                <input type=\"text\" name=\"telefono_proveedor\" class=\"form-control\"  required=\"required\" value=\"" + tp.getTelefonoProovedor() + "\" >\n"
                    + "                                <input type=\"text\" name=\"opcion\" class=\"form-control\" value=\"3\" style=\"display:none;\">\n"
                    + "                                <input type=\"text\" name=\"id_proovedor\" class=\"form-control\" value=\"" + tp.getIdProovedor() + "\" style=\"display:none;\">\n"
                    + "                                \n"
                    + "                                <label for=\"color\" style=\"margin-left: 20px;\">color:</label>\n"
                    + "                                    <select class=\"form-control\" name=\"color\" id=\"color\"  >\n"
                    + "                                    <option  value=\"" + color + "\">" + color + "</option>\n"
                    + "                                    <option  value=\"azul\">Azul</option>\n"
                    + "                                    <option  value=\"amrillo\">Amarillo</option>\n"
                    + "                                    <option   value=\"verde\">Verde</option>\n"
                    + "                                </select>  \n"
                    + "                            \n"
                    + "                            <div class=\"row\">\n"
                    + "                                <div class=\"col-12\">\n"
                    + "                                    <div class=\"w-100 mx-auto d-block text-center \"> <br> \n"
                    + "                                        <button class=\"w-50 btn btn-outline-primary\" \n"
                    + "                                                id=\"btn-modificarProveedor\">Actualizar datos del proovedor</button>"
                    + "<button class=\"w-50 btn btn-outline-danger\" \n"
                    + "                                                id=\"btn-eliminar-proovedor\">Eliminar Proovedor</button>\n"
                    + "                                    </div>                    \n"
                    + "                                </div>\n"
                    + "                            </div>\n"
                    + "                        </form>"
                    + "              <script>\n"
                    + "     $('#btn-modificarProveedor').click(function(e){\n"
                    + "            e.preventDefault();\n"
                    + "             var data = $('#form-registrar-modificarProvedor').serialize();\n"
                    + "        $.post('ServletProveedor', data, function (res, est, jqXHR) {\n"
                    + "            console.log(res);;\n"
                    + "            $('#contenedor-mensaje12').html(res)\n"
                    + "              setTimeout(function () {\n"
                    + "                    $('#contenedor-mensaje12').html(\"\");\n"
                    + "             $(\"#loadContent\").load(\"./module/registroPersona.jsp\");  "
                    + "              }, 2000);\n"
                    + "        });\n"
                    + "       });\n"
                    + "$('#btn-eliminar-proovedor').click(function(e){\n"
                    + "     e.preventDefault();"
                    + "                    var datae = $('#data-eliminar-proovedor').serialize();\n"
                    + "                    $.post('ServletProveedor',datae, function (res, est, jqXHR){\n"
                    + "                         console.log(res);"
                    + "                        $('#contenedor-mensaje12').html(res);\n"
                    + "                                  setTimeout(function () {\n"
                    + "                    $('#contenedor-mensaje12').html(\"\");\n"
                    + "                    $(\"#loadContent\").load(\"./module/registroPersona.jsp\");\n"
                    + "                }, 2500);"
                    + "                   });\n"
                    + "                });"
                    + ""
                    + "</script>         ";
        }

        return respuesta;
    }

//    public static void main(String[] args) {
//        ControllerProveedor cp = new ControllerProveedor();
////        
////        System.out.println(cp.delete(75));
//        System.out.println(cp.buscarProovedorId(5));
////        System.out.println(cp.insert(new DTOProveedor("nombre_proveedor", 11111, 1)));
////        System.out.println(cp.update(new DTOProveedor(1,"Jhan Jhan", 22268530, 2)));
//    }
}
