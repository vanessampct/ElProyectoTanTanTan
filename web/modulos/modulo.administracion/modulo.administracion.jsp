<%-- 
    Document   : administracion
    Created on : 03-nov-2018, 22:19:59
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<br>  
<center><h2>Administración de tablas<h2></center>  
<ul class="nav nav-pills mb-3 ul-tablas" id="pills-tab " role="tablist">
    <li class="nav-item">
        <a class="nav-link active btn-blue" id="fantaxias" >Fantaxias</a>
    </li>
    <li class="nav-item">
        <a class="nav-link btn-red" id="Formatex" >Formatex</a>
    </li>
    <li class="nav-item">
        <a class="nav-link btn-green" id="Tiber" >Tiber</a>
    </li>
    <li class="nav-item">
        <a class="nav-link btn-blue" id="Macro_Herrajes" >Macro Herrajes</a>
    </li>
    <li class="nav-item">
        <a class="nav-link btn-gray" id="General" >General</a>
    </li>
    <li class="nav-item">
        <a class="nav-link btn-yellow" id="Cadenas_Alum_y_Acero" >Cadenas Alum y Acero</a>
    </li>
    <li class="nav-item">
        <a class="nav-link btn-gray" id="Cadenas_de_Hierro" >Cadenas de Hierro</a>
    </li>
</ul>
<div id="contenido-componentes-administracion">
        <br>
    <div id="contenido-inicio">
            <center><h1>Modulo de Administración</h1></center> 
            <p class="lead">
                    En este modulo se encuentra toda la información de las zonas y las referencias que se encuentran guardadas en la base de datos, con la característica de que se pueden modificar y agregar nuevas referencias
            </p>
    </div>
</div>

<!-- Scrips del modulo -->
<script>
    var contenidoAdministracion = $('#contenido-componentes-administracion');
    
    //Cargar el componente de fantaxias
    $('#fantaxias').click(function(){
    contenidoAdministracion.load('modulos/modulo.administracion/componentes/component.fantaxias.jsp');
    });

</script>
<style>
.ul-tabla{
    padding-left: 3%;
    padding-right: 3%;
}
.ul-tablas li {
    width: 13%;
    margin: 5px;
    font-size: 12px;
}
.ul-tablas li a{
    cursor: pointer;
    text-align: center;
}
.ul-tablas li a:hover{
    cursor: pointer;
    box-shadow: 0 2px 4px 0 rgba(0,0,0,0.16),0 2px 10px 0 rgba(0,0,0,0.12)!important;
}

#fantaxias{
   background:  #007bff;
   color: white;
   margin-left: 25px !important;
}
#Formatex{
    background:  #dc3545;
    color: white; 
}
#Tiber{
    background:#28a745;
    color: white;  
}
#Macro_Herrajes{
    background:  #007bff;
    color: white; 
}
#General{
    background:  #6c757d;
    color: white; 
}
#Cadenas_Alum_y_Acero{
    background:  #ffc107;
    color: black; 
    font-size: 11px;
}
#Cadenas_de_Hierro{
    background:  #6c757d;
    color: white; 
}
#contenido-componentes-administracion{
    margin-left: 30px;
    margin-right: 25px;
}
#contenido-inicio{
    margin: 32px;
    border: 1px solid grey;
    border-radius: 5px;
    text-align: center;
}
</style>


