<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Controllers.ControllerProveedor"%>
<% ControllerProveedor cp = new ControllerProveedor();%>
<br>  
<ul class="nav nav-pills mb-3" id="pills-tab" role="tablist">
    <li class="nav-item">
        <a class="nav-link active" id="pills-home-tab" data-toggle="pill" href="#pills-registrar" role="tab" aria-controls="pills-home" aria-selected="true">Registrar Proovedor</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" id="pills-profile-tab" data-toggle="pill" href="#pills-mostrar" role="tab" aria-controls="pills-profile" aria-selected="true">Ver lista de proovedores</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" id="pills-contact-tab" data-toggle="pill" href="#pills-modificar" role="tab" aria-controls="pills-contact" aria-selected="true">Modificar Proovedores</a>
    </li>
</ul>
<div class="tab-content" id="pills-tabContent">
    <!-- En esta tabla estara el panel para insertar proovedores -->
    <div class="tab-pane fade show active" id="pills-registrar" role="tabpanel" aria-labelledby="pills-home-tab">

        <div class="m-5 container pl-3 pr-5 mw-100">
            <div class="row w-100">
                <div class="col-md-12">
                    <h2 class="h2-responsive bg-dark text-white font-weight-normal shadow-sm p-3" style="margin-bottom: 0px;">
                        Registro de proveedores
                    </h2>
                </div>
                <div class="col-md-12" id="contenedor-mensaje">

                </div>
                <div class="col-md-12">
                    <div class="w-75 mx-auto">
                        <form class="p-3" id="form-registrar-proveedor"  method="post">
                            <div class="form-group">
                                <label for="nombre_proveedor">Nombre:</label>
                                <input type="text" name="nombre_proveedor" 
                                       class="form-control" id="nombre_proveedor" 
                                       placeholder="Nombre completo" required="required">
                            </div>
                            <div class="form-group">
                                <label for="telefono_proveedor">Teléfono:</label>
                                <input type="text" name="telefono_proveedor" class="form-control"  required="required" >
                            </div>
                            <div class="form-group" style="display: none;">
                                <input type="text" name="opcion" class="form-control"  value="1" >
                            </div>
                            <div class="form-group mt-1">
                                <small id="colorHelp" class="form-text text-muted">Selecciona un tipo de color para el proveedor</small>
                                <div class="form-check-inline p-2 bg-primary">
                                    <input class="form-check-input" type="radio" name="colors" id="colorAzul" value="azul">
                                    <label class="form-check-label" for="colorAzul">
                                        Azul
                                    </label>
                                </div>
                                <div class="form-check-inline p-2 bg-warning">
                                    <input class="form-check-input" type="radio" required="required" name="colors" id="colorAmarillo" value="amarillo">
                                    <label class="form-check-label" for="colorAmarillo">
                                        Amarillo
                                    </label>
                                </div>
                                <div class="form-check-inline p-2 bg-success">
                                    <input class="form-check-input" type="radio" required="required" name="colors" id="colorVerde" value="verde">
                                    <label class="form-check-label" for="colorVerde">
                                        Verde
                                    </label>
                                </div>

                            </div>
                            <div class="row">
                                <div class="col-12">
                                    <div class="w-100 mx-auto d-block text-center ">  
                                        <button class="w-50 btn btn-outline-primary" 
                                                id="btn-registrar-proveedor">Registrar</button>
                                    </div>                    
                                </div>
                            </div>
                        </form>
                        <br>
                        <br>
                        <br>
                        <br>
                        <br>
                    </div>
                </div>
            </div>
        </div>

    </div>
    <div class="tab-pane fade" id="pills-mostrar" role="tabpanel" aria-labelledby="pills-profile-tab">

        <div class="m-5 container pl-3 pr-5 mw-100">
            <div class="row w-100">
                <div class="col-md-12">
                    <h2 class="h2-responsive bg-dark text-white font-weight-normal shadow-sm p-3" style="margin-bottom: 0px;">
                        Lista de proovedores
                    </h2>
                </div>

                <div class="col-md-12">
                    <br>
                    <br>
                    <div class="w-75 mx-auto">
                        <table class="table">
                            <thead class="thead-light">
                                <tr>
                                    <th scope="col">Id del proovedor</th>
                                    <th scope="col">Nombre del proovedor</th>
                                    <th scope="col">Número del proovedor</th>
                                    <th scope="col">Color del proovedor</th>
                                </tr>
                            </thead>
                            <tbody>
                                <% out.print(cp.read());%>
                            </tbody>
                        </table>
                        <br>
                        <br>
                        <br>
                        <br>
                        <br>
                    </div>
                </div>
            </div>
        </div>  

    </div>
    <div class="tab-pane fade" id="pills-modificar" role="tabpanel" aria-labelledby="pills-contact-tab">

        <div class="m-5 container pl-3 pr-5 mw-100">
            <div class="row w-100">
                <div class="col-md-12">
                    <h2 class="h2-responsive bg-dark text-white font-weight-normal shadow-sm p-3" style="margin-bottom: 0px;">
                        Modificar Proovedores
                    </h2>
                    <div class="col-md-12" id="contenedor-mensaje12">

                    </div>
                </div>
                <div class="col-md-12">
                    <div class="w-100 mx-auto" style="margin-left: 0% !important">
                        <br>
                        <br>

                        <center>  <label for="buscarProovedor">Buscar por ID del proovedor</label><br>
                            <form id="form-buscarActualizar">
                                <input type="text" id="inputBuscar" name="buscarProovedor" class="form-control ">
                                <input type="text"  name="opcion" class="form-control " value="2" style="display: none;">
                                <button id="btn-buscarProovedor" class="btn btn-outline-info">Buscar</button></center>
                        </form>

                        <br>
                        <br> 
                        <!-- ESpacio para insertar El formulario de atualizxar -->
                        <div id="contenedor-consultaActualizar" >


                        </div>
                        <br>
                        <br>
                        <br>
                        <br>
                        <br>
                    </div>
                </div>
            </div>
        </div> 

    </div>

</div>
                            

<!-- Accíon para mandar los datos mediante AJAX -->
<script>
    $('#btn-registrar-proveedor').click(function (e) {
        e.preventDefault();
        var data = $('#form-registrar-proveedor').serialize();
        $.post('ServletProveedor', data, function (res, est, jqXHR) {
            console.log(data);
            console.log(res);
            if (res == null) {
                $('#contenedor-mensaje').html("<h6  id=\"mensaje-registrar-proovedor\" class=\" bg-danger text-white font-weight-normal shadow-sm \">\n" +
                        "                Error al intentar registrar el proveedor\n" +
                        "            </h6>")
            } else {
                $('#contenedor-mensaje').html(res);
                setTimeout(function () {
                    $('#contenedor-mensaje').html("");
                    $("#loadContent").load("./module/registroPersona.jsp");
                }, 2500);

                
            }

        });
    });

    $('#btn-buscarProovedor').click(function (e) {
        e.preventDefault();
        var data = $('#form-buscarActualizar').serialize();

        $.post('ServletProveedor', data, function (res, est, jqXHR) {
            console.log(data);
            $('#contenedor-consultaActualizar').html(res);
        });
    });

</script>
<script>

</script>