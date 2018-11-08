/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAO.DAOFantaxias;
import DTO.DTOReferencia;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class ControllerReferencias {

//sección decfantaxias    
    //Para crear una referencia
    public boolean CrearReferenciaFantaxia(DTOReferencia referencia) {
        DAO.DAOFantaxias df = new DAOFantaxias();

        return df.CrearReferenciaFantaxia(referencia);
    }

    //metodo para mostrar todas las referencias
    public String mostrarReferenciasFantaxia(int id_zona) {
        DAOFantaxias df = new DAOFantaxias();
        String respuesta = "";
        int contador = 1;
        for (DTOReferencia R : df.mostrarReferenciasFantaxia(id_zona)) {

            respuesta += "<tr>\n"
                    + "                                <td style=\"border-left:none;\"> " + R.getNombre_referencia() + " <div class=\"color color-" + R.getColor() + "\">" + R.getColor() + "</div></td>\n"
                    + "                            </tr>";
        }
        return respuesta;
    }

    //metodo para traer los datos a la hora de actualizarlos
    public String mostrarReferenciaActualizarFantaxia(String referencia) {
        DAOFantaxias df = new DAOFantaxias();
        String respuesta = "";
        for (DTOReferencia R : df.mostrarReferenciaActualizarFantaxia(referencia)) {
            respuesta += "<table class=\"table bg-blue\" id=\"tablas-administracion\" style=\"margin: 0px auto;\">\n"
                    + "                    <thead class=\"\">\n"
                    + "                      <tr>\n"
                    + "                        <th scope=\"col\" style=\"border-radius: 10px 0px 0px 0px !important;\">Zona</th> \n"
                    + "                        <th scope=\"col\">Nombre</th>\n"
                    + "                        <th scope=\"col\">Color</th>\n"
                    + "                        <th scope=\"col\">Actualizar</th>\n"
                    + "                        <th scope=\"col\" style=\"border-radius: 0px 10px 0px 0px  !important; width: 121px !important;\">Eliminar</th>\n"
                    + "                      </tr>\n"
                    + "                    </thead>\n"
                    + "                    <tbody >"
                    + "<tr id=\"lista-buscar-tabla\">\n"
                    + "                            <td>" + R.getNombre_zona() + "<div class=\"color\"></div></td>\n"
                    + "                            <td>" + R.getNombre_referencia() + "</td>\n"
                    + "                            <td> <div class=\" color color-" + R.getColor() + " color-administrar\" >" + R.getColor() + "</div></td>\n"
                    + "                            <td>\n"
                    + "                                <button class=\"btn-sm btns-modificar btn-warning\" id=\"btn-modificarRf\" >Actualizar</button>   \n"
                    + "                            </td>  \n"
                    + "                            <td>\n"
                    + "                                <button class=\"btn-sm btns-modificar btn-danger\" id=\"eliminar-referencia-fantaxias\">Eliminar</button> \n"
                    + "                            </td>\n"
                    + "                         </tr>"
                    + "</tbody>\n"
                    + "                    </table>"
                    + "<form id=\"actualizar-referencia-enviar\" style=\"display:none;\">\n"
                    + "                <input type=\"text\" disabled=\"disabled\" value=\"" + R.getNombre_zona() + "\" style=\"width: 127px;height: 25px;background: white;\n"
                    + "                border: none;\n"
                    + "                text-align: center\">    \n"
                    + "                <input type=\"text\" name=\"referencia\" value=\"" + R.getNombre_referencia() + "\" style=\"    width: 132px;height: 25px;\">\n"
                    + "                            <input type=\"text\" name=\"opcion\" value=\"3\" style=\"display: none;\">   \n"
                    + "                            <input type=\"text\" id=\"cod-referencia\" name=\"id_referencia\" value=\"" + R.getId_referencia() + "\" style=\"display: none;\">\n"
                    + "                    \n"
                    + "                        <select name=\"color\">\n"
                    + "                                <option selected>" + R.getColor() + "</option>\n"
                    + "                                <option><div value=\"azul\" class=\"color color-rosado\">Azul</div></option>\n"
                    + "                                <option><div value=\"rosado\" class=\"color color-rosado\">Rosado</div></option>\n"
                    + "                                <option><div value=\"verde\" class=\"color color-verde\">Verde</div></option>\n"
                    + "                        </select>  \n"
                    + "                        \n"
                    + "                        \n"
                    + "                            <button class=\"btn-sm btns-modificar btn-warning\" id=\"Actualizar-datos-fantaxias\">aceptar</button>   \n"
                    + "                         \n"
                    + "                        </form>"
                    + "<form id=\"form-eliminar-referencia\" style=\"display:none;\">\n"
                    + "        <input type=\"text\" name=\"id_referencia\" value=\""+R.getId_referencia()+"\">\n"
                    + "        <input type=\"text\" name=\"opcion\" value=\"4\">\n"
                    + "    </form>"
                    + "<script>\n"
                    + "    $(\"#btn-modificarRf\").click(function(){\n"
                    + "        $(\"#lista-buscar-tabla\").css('display', 'none');\n"
                    + "        $('#actualizar-referencia-enviar').css('display', 'block');\n"
                    + "    });\n"
                    + "\n"
                    + "\n"
                    + "    $(\"#Actualizar-datos-fantaxias\").click(function(e){\n"
                    + "             e.preventDefault();"
                    + "        var data = $(\"#actualizar-referencia-enviar\").serialize();\n"
                    + "        console.log(data)\n"
                    + "        $.post('ServletFantaxias', data, function (res, est, jqXHR) {\n"
                    + "           \n"
                    + "           alert(res);\n"
                    + "contenidoAdministracion.load('modulos/modulo.administracion/componentes/component.fantaxias.jsp');"
                    + "           \n"
                    + "       });\n"
                    + "    });\n"
                    + "\n"
                    + "    $('#eliminar-referencia-fantaxias').click(function(){\n"
                    + "   var confirmar = confirm(\"Estas seguro que quieres eliminar esta referencia\");\n"
                    + "    if(confirmar){\n"
                    + "        var data = $(\"#form-eliminar-referencia\").serialize();\n"
                    + "        $.post('ServletFantaxias', data, function (res, est, jqXHR) {\n"
                    + "                alert(res);        \n"
                    + "       });\n"
                    + "    }"
                    + "    });"

                    + "</script>";
        }
        if (respuesta != "") {
            return respuesta;
        } else {
            return "<center><h3 style=\"    margin-left:;\n"
                    + "    width: 100%;\n"
                    + "    margin-top: 5px;\n"
                    + "    background: white;\">No se encontrarón resultados</h3></center>";
        }

    }

    //metodo para actualizar las referencias
    public boolean actualizarReferenciasFantaxias(DTOReferencia referencia) {

        DAO.DAOFantaxias df = new DAOFantaxias();

        return df.actualizarReferenciasFantaxias(referencia);
    }

    //metodo para eliminar una referencia
    public boolean eliminarReferenciaFantaxias(int id_referencia) {
        DAO.DAOFantaxias df = new DAOFantaxias();

        return df.eliminarReferenciaFantaxias(id_referencia);
    }

    public static void main(String[] args) {
        ControllerReferencias cr = new ControllerReferencias();
        // System.out.println(cr.mostrarReferenciasFantaxia(1));
        System.out.println(cr.mostrarReferenciaActualizarFantaxia("prueba123"));
    }
}
