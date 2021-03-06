<%-- 
    Document   : component.fantaxias
    Created on : 06-nov-2018, 1:16:33
    Author     : Administrator
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Controllers.ControllerReferencias" %>
<% ControllerReferencias cr = new ControllerReferencias();%>
<div id="component-fantaxias">
    <center><h4>Fantaxias</h4></center>
    <br>
    <ul class="nav nav-pills mb-3 menu-crud" id="pills-tab " role="tablist">
        <li class="nav-item">
            <a class="nav-link active" data-toggle="pill" id="btn-mostrar-fantaxi" href="#pills-mostrar-fantaxi" role="tab" aria-controls="pills-home" aria-selected="flase">Mostrar referencias</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" data-toggle="pill" id="btn-registrar-fantaxi" href="#pills-registrar-fantaxi" role="tab" aria-controls="pills-home" aria-selected="true">Crear Referencias</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" data-toggle="pill" id="btn-modificar-fantaxi" href="#pills-modificar-fantaxi" role="tab" aria-controls="pills-home" aria-selected="flase" >Editar referencias</a>
        </li>
    </ul>
    <!-- Contenedor donde se mostraran los datos en una tabla -->
    <div class="tab-pane fade show active" id="pills-mostrar-fantaxi" role="tabpanel" aria-labelledby="pills-home-tab">
            <div class="m-5 container pl-3 pr-5 mw-100">
                <div class="row w-100">
                
                    <!-- <table class="table bg-blue" id="tablas-administracion">
                            <thead class="">
                              <tr>
                                <th scope="col" style="border-radius: 10px 0px 0px 0px !important;">#</th> 
                                <th scope="col" >R</th>
                                <th scope="col">T</th>
                                <th scope="col">PAO</th>
                                <th scope="col">H</th>
                                <th scope="col" style="border-radius: 0px 10px 0px 0px  !important;">Z</th>
                              </tr>
                            </thead>
                            <tbody>
                              <tr>
                                <th scope="row">1</th>
                                <td>XBRD 0264 DORADO    <div class="color"></div></td>
                                <td>T 051 DORADO    <div class="color"></div></td>
                                <td>PAO 468 PL  <div class="color"></div></td>
                                <td>H 339-10 NQ <div class="color"></div></td>
                                <td>Z 290 NQ    <div class="color"></div></td>
                              </tr>
                              <th scope="row">1</th>
                              <th scope="row"> 2</th>
                              <th scope="row">3</th>
                              <th scope="row">4</th>  
                              <tr></tr>
                              
                            </tbody>
                    </table> -->
                    <table class="tablaM bg-blue" id="tablaM" style="margin-left: 11%;
                    border-radius: 14px 0 0% 0%;">                    
                        <thead class="">
                            <tr>
                              <th scope="col" style="border-radius: 10px 0px 0px 0px !important; border: none; border-left: none;">R</th>
                            </tr>
                          </thead> 
                          <tbody>
                              <% out.print(cr.mostrarReferenciasFantaxia(1));%>
                          </tbody>  
                    </table>
                    <table class="tablaM bg-blue" id="tablaM">                    
                        <thead class="">
                            <tr>
                              <th scope="col" >T</th>
                            </tr>
                          </thead> 
                          <tbody>
                            <% out.print(cr.mostrarReferenciasFantaxia(2));%>
                          </tbody>  
                    </table>
                    <table class="tablaM bg-blue" id="tablaM">                    
                        <thead class="">
                            <tr>
                              <th scope="col" >PAO</th>
                            </tr>
                          </thead> 
                          <tbody>
                            <% out.print(cr.mostrarReferenciasFantaxia(3));%>
                          </tbody>  
                    </table>
                    <table class="tablaM bg-blue" id="tablaM">                    
                        <thead class="">
                            <tr>
                              <th scope="col" >H</th>
                            </tr>
                          </thead> 
                          <tbody>
                            <% out.print(cr.mostrarReferenciasFantaxia(4));%>
                          </tbody>  
                    </table>
                    <table class="tablaM bg-blue" id="tablaM" >                    
                        <thead class="">
                            <tr>
                              <th scope="col" style="border-radius: 0px 10px 0px 0px !important;">Z</th>
                            </tr>
                          </thead> 
                          <tbody>
                            <% out.print(cr.mostrarReferenciasFantaxia(5));%>
                          </tbody>  
                    </table>
                
                </div>
            </div>
        <br>
        <br>
    </div>
    <!-- Contenedor donde se se crearan una categoria nueva -->
    <div class="tab-pane fade show active" id="pills-registrar-fantaxi" style="display: none;" role="tabpanel" aria-labelledby="pills-home-tab">
            <div class="m-5 container pl-3 pr-5 mw-100">
                <div class="row w-100">
                
                    <form id="form-registrar-referencia-fantaxi">
                        <div class="form-row">
                                <div class="col-6">
                                    <label for="zona-fanxias">Zona</label>
                                    <select id="zona-fanxias" class="form-control" name="zona-fanxias">
                                        <option selected>Elija una zona</option>
                                        <option value="1">R</option>
                                        <option value="2">T</option>
                                        <option value="3">PAO</option>
                                        <option value="4">H</option>
                                        <option value="5">Z</option>
                                    </select>
                                </div>
                                <div class="col-6" >
                                    <label for="inputState">Color</label>
                                    <select id="inputState" class="form-control" name="color">
                                        <option selected>Seleccione un color</option>
                                        <option><div value="azul" class="color color-rosado">Azul</div></option>
                                        <option><div value="rosado" class="color color-rosado">Rosado</div></option>
                                        <option><div value="verde" class="color color-verde">Verde</div></option>
                                    </select>
                                </div>
                        </div>
                        <div class="form-group">
                                <label for="formGroupExampleInput">Ingrese el nombre de la referencia</label>
                                <input type="text" class="form-control" name="referencia-fanaxi" placeholder="">
                                <input type="text" name="opcion" value="1" style="display: none;">
                        </div>
                        <center><button class="btn-sm btn-outline-primary" id="registrar-referencia">Registrar referencia</button></center>
                    </form>  

                </div>
            </div>

    </div>
    <!-- Contenedor donde se Modificaran las referencias-->
    <div class="tab-pane fade show active" id="pills-modificar-fantaxi" role="tabpanel" style="display: none;" aria-labelledby="pills-home-tab">
            <div class="m-5 container pl-3 pr-5 mw-100">
                <div class="row w-100">
                    <div id="buscar-referencia-fantaxias">
                        <center>
                            <div class="form-row">
                                <div class="col-3"></div>
                                <div class="col-6">
                                    <form id="form-buscar-modificar-fantaxias">
                                            <label for="formGroupExampleInput">Ingrese el la referencia</label>
                                            <input type="text" class="form-control" name="referencia" placeholder="">
                                            <input type="text" class="form-control" value="2" name="opcion" style="display: none;">
                                    </form>
                                </div>
                                        <div class="col-3"><button class="btn-sm " id="modificar-referencia-fantaxias">🔍</button></div>
                            </div>
                        </center>
                    </div>
                </div>
            </div>
            <div id="cont-data-actualizar">

            </div>
            <!-- <table class="table bg-blue" id="tablas-administracion" style="margin: 0px auto;">
                    <thead class="">
                      <tr>
                        <th scope="col" style="border-radius: 10px 0px 0px 0px !important;">Zona</th> 
                        <th scope="col">Nombre</th>
                        <th scope="col">Color</th>
                        <th scope="col">Actualizar</th>
                        <th scope="col" style="border-radius: 0px 10px 0px 0px  !important; width: 121px !important;">Eliminar</th>
                      </tr>
                    </thead>
                    <tbody >
                        
                    </tbody>
                    </table> -->
                       
                    
    </div>
    <br>  
    <br>   
</div>

<style>
#component-fantaxias{
    border: 1px solid grey;
    border-radius: 3px;
}
#tablas-administracion{
    width: 75%;
    margin: 0px auto;
    text-align: center;
    border-radius: 5px;
    box-shadow: 0 2px 4px 0 rgba(0,0,0,0.16),0 2px 10px 0 rgba(0,0,0,0.12)!important;
}
#tablas-administracion thead {
    border-radius: 5px !important;
    background:#007bff;
    height: 34px;
    font-size: 15px;
    color: white;
}

tbody tr{
    font-size: 13px;  
}
tbody tr:hover{
    background: #eee; 
}
td{
    border-left: 1px solid rgb(219, 216, 216);
}
.color{
    display: inline-block;
    width: 11px;
    height: 11px;
    border-radius: 100%
}
.color.color-Rosado {
    background: #e83e8c;
    height: 12px;
    width: 44px;
    font-size: 9px;
    color: white;
    border: 1px solid rgb(148, 10, 35);
    border-radius: 5px;
    line-height: 9px;
    opacity: 1.0;
}
.color.color-Azul {
    background: #007bff;
    height: 12px;
    width: 44px;
    font-size: 9px;
    color: white;
    border: 1px solid blue;
    border-radius: 5px;
    line-height: 9px;
}
.color.color-Verde {
    background: #28a745;
    height: 12px;
    width: 44px;
    font-size: 9px;
    color: white;
    border: 1px solid green;
    border-radius: 5px;
    line-height: 9px;
}

.menu-crud{
    width: 50%;
    margin: 0px auto;
}
.menu-crud a{
    height: 32px;
    line-height: 13px;
    background: #343a40;
    color: white;
}
.nav-pills .nav-link.active, .nav-pills .show>.nav-link {
    color: #343a40;
    background-color: white;
    border: 1px solid grey;
}
#form-registrar-referencia-fantaxi{
    width: 60%;
    margin: 0px auto;
    border: 1px solid rgb(219, 216, 216);
    border-radius: 5px;
    padding: 15px;
}
#form-registrar-referencia-fantaxi:hover{
    box-shadow: 0 2px 4px 0 rgba(0,0,0,0.16),0 2px 10px 0 rgba(0,0,0,0.12)!important;
}
#buscar-referencia-fantaxias{
    width: 60%;
    margin: 0px auto;
    border: 1px solid rgb(207, 207, 207);
    border-radius: 3px;
}
#modificar-referencia-fantaxias{
    width: 40px;
    height: 40px;
    margin-top: 32px;
    float: left;
    margin-bottom: 15px;
    background: white;
    border: 1px solid grey;
    cursor: pointer;
    font-size: 15px;
}
#color-administrar{
    width: 25px;
    height: 25px; 
}
.btns-modificar{
    height: 25px;
    line-height: 1px;
    border: 1px solid grey;
    margin-right: 13px;
    cursor: pointer;
}

.tablaM{
    width: 143px;
    text-align: center;
}

.tablaM th{
    background: #007bff;
    height: 45px;
    border-left: 1px solid rgb(200, 200, 200);
    font-size: 14px; 
}

.tablaM td{
    height: 37px;
    border-bottom: 1px solid rgb(219, 216, 216);
    box-shadow: 0px 15px 7px -16px;
    font-size: 14px;
    font-weight: 450;
    opacity: 0.9;
    border-right: 1px solid rgb(209, 209, 209);
}

#actualizar-referencia-enviar{
    MARGIN: 0px auto;
    margin-top: 8px;
    border: 1px solid #cdcaca;
    width: 75%;
    padding: 3px;
    padding-left: 2%;
    border-radius: 5px;
}


</style>
<script>

    //funciones para navegar entre los contenedores de CRUD

    var btnMostrar = $('#btn-mostrar-fantaxi');
    var btnRegistrar = $('#btn-registrar-fantaxi');
    var btnModificar = $('#btn-modificar-fantaxi');
    var contMostrar = $('#pills-mostrar-fantaxi');
    var contRegistrar = $('#pills-registrar-fantaxi');
    var contmodificar = $('#pills-modificar-fantaxi');
   
    btnMostrar.click(function(){
        contMostrar.css('display', 'block');  
        contmodificar.css('display', 'none');
        contRegistrar.css('display', 'none'); 
    });
    btnRegistrar.click(function(){
        contMostrar.css('display', 'none');  
        contmodificar.css('display', 'none');
        contRegistrar.css('display', 'block');  
    });
    btnModificar.click(function(){
        contMostrar.css('display', 'none');  
        contmodificar.css('display', 'block');
        contRegistrar.css('display', 'none');     
    });   

    //Funciones AJAX para enviar la informaciï¿½n
    
    $('#registrar-referencia').click(function(e){
        e.preventDefault();
        var data = $('#form-registrar-referencia-fantaxi').serialize();
        $.post('ServletFantaxias', data, function (res, est, jqXHR) {
           
            alert(res);
            contenidoAdministracion.load('modulos/modulo.administracion/componentes/component.fantaxias.jsp');
        });
    });
    $('#modificar-referencia-fantaxias').click(function(){
        var data = $('#form-buscar-modificar-fantaxias').serialize();
        $.post('ServletFantaxias', data, function (res, est, jqXHR) {
                $('#cont-data-actualizar').html(res);
            
       });
       
    });
    
    $('#eliminar-referencia-fantaxias').click(function(){
        var data =$('#cod-referencia').val();
        $.post('ServletFantaxias', data, function (res, est, jqXHR) {
                alert(res);        
       });
    });
</script>

