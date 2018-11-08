<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inventario Susherrajes</title>
        <link rel="stylesheet" href="./bootstrap/css/bootstrap.min.css">
        <link href="https://fonts.googleapis.com/css?family=Quicksand" rel="stylesheet">
        <link rel="stylesheet" href="./css/simple-sidebar.css">
        <link rel="stylesheet" href="./css/main.css">
    </head>
    <body style="margin: 0px; padding: 0px;">
         <div id="wrapper" class="toggled">
            <!-- Sidebar -->
            <div id="sidebar-wrapper">
                <ul class="sidebar-nav mt-4">
                    <li class="sidebar-brand">
                        <h3 class="font-weight-normal text-center text-white mr-3 py-2">
                            Contenido <hr style="background: #fff;" class="ml-4">
                        </h3>
                        
                    </li>
                    <li class="p-1">
                        <a href="./">Inicio</a>
                    </li>
                    <li class="p-1">
                        <a class="linksNav" id="contentAdministracion" href="#">Aministración de modulos</a>
                    </li> 
                    <li class="p-1"> 
                        <a class="linksNav" id="contentIdentificacion" href="#">Inventario</a>
                    </li>
                    <li class="p-1">    
                        <a class="linksNav" id="contentKardex" href="#">Kardex</a>
                    </li>
                    <li class="p-1">
                        <a class="linksNav" id="contentProveedor" href="#">Contacto</a>
                    </li> 
                </ul>

            </div>
        <!-- /# sidebar-wrapper -->
        
        <!-- Page Content -->
        <div id="page-content-wrapper">
            <nav class="navbar navbar-dark bg-primary pl-3 pr-3 h-25">
                <button href="#menu-toggle" id="menu-toggle" class="ml-2 navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarToggleExternalContent" aria-controls="navbarToggleExternalContent" aria-expanded="false" aria-label="Toggle navigation">
                   <span class="navbar-toggler-icon"></span>
                </button>     
                <div class="position-absolute w-100" id="contenedor-logo">
                    <h3 class="text-white text-center font-weight-light font-italic">Logo + empresa</h3>
                </div>
            </nav>
        </div>
            
        <!-- Contenedor Principal -->
        <div id="loadContent" class="mw-100">
            <div class="m-5 container pl-3 pr-5 mw-100">
                <div class="row mw-100">
                    <div class="col-md-12">
                        <div class="jumbotron">
                            <h1 class="display-4">Susherrajes</h1>
                            <p class="lead">
                                Lorem ipsum dolor sit amet consectetur adipiscing 
                                elit felis vulputate, curabitur commodo eleifend 
                                consequat nullam massa urna litora, condimentum 
                                mus lacus phasellus justo netus sed enim. 
                            </p>
                            <hr class="my-4">
                            <p>It uses utility classes for typography and spacing to space content out within the larger container.</p>
                            <a class="btn btn-primary btn-lg" href="#" role="button">Leer más...</a>
                        </div>
                    </div>
                </div>
            </div>
            
            <div class="row w-100">
                <div class="col-md-12">
                    <div class="ml-5 p-3">
                        <h2 class="h2-responsive bg-dark text-white font-weight-normal shadow-sm p-3">
                            Información del proyecto 
                        </h2>
                        <hr class="bg-light">
                    </div>
                </div>
            </div>
            
            <div class="ml-5 pl-3 pr-5 container-fluid">
                <div class="row w-100 my-3">
                    
                    <div class="col-md-6">
                        <div class="card">
                            <div class="card-header bg-info active">
                                <h3 class="h3-responsive font-weight-light text-white text-center">
                                    Justificación
                                </h3>
                            </div>
                            <div class="card-body">
                                <p class="lead">
                                    Los motivos por el cual vamos hacer este 
                                    proyecto es ayudar la empresa Susherrajes ya
                                    que se genera muchas perdida de 
                                    información, tiempo y dinero, por lo que se
                                    lleva un registro muy grande de información
                                    en hojas de Excel haciendo que el manejo de 
                                    este se vea con dificultades. Por eso se 
                                    decidirá hacer un programa con el cual la 
                                    empresa se vea beneficiada a la hora de 
                                    usar su información.
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="card my-3">
                            <div class="card-header bg-light active">
                                <h3 class="h3-responsive font-weight-light text-center">
                                    Planteamiento del problema
                                </h3>
                            </div>
                            <div class="card-body">
                                <p class="lead">
                                    En la empresa para manejar el inventario 
                                    utilizan un programa de Excel por tanta 
                                    información este es lento y dificulta su 
                                    búsqueda, si hay un apagón de luz la 
                                    información registrada y no guardada se 
                                    elimina haciendo que hayan perdidas.
                                    <span class="d-block font-weight-bold text-info">
                                        Pregunta problematizadora:
                                    </span>   
                                    ¿Cómo realizar un software que ayude a 
                                    distribuir y guardar la información y datos 
                                    de la empresa de una manera más efectiva? 
                                </p>
                            </div>
                        </div>
                    </div>
                    
                </div>
                
                <!-- Título: nuestro objetivos -->
                <div class="row w-100">
                    <div class="col-md-12">
                        <h3 class="h3-responsive bg-dark font-weight-normal shadow-sm text-light p-3">
                            Nuestros objetivos
                        </h3>
                    </div>
                </div>
                <!-- /#Título: nuestro objetivos -->
                
                <div class="row w-100 mb-5">
                    <div class="col-md-3">
                            <div class="card my-2">
                                <div class="card-header">
                                    <h3 class="h3-responsive text-dark text-center font-weight-light">
                                        Objetivo
                                    </h3>
                                </div>
                                <div class="card-body bg-light">
                                    <p class="lead">
                                        Ayudar a que la empresa Susherrajes maneje 
                                        mejor sus datos e información, volviendo el 
                                        tiempo de los empleados más eficaz. 
                                    </p>
                                </div>
                            </div>
                        </div>
                       <div class="col-md-9">
                        <div class="card my-2">
                            <div class="card-header bg-info">
                                <h3 class="h3-responsive font-weight-light text-center text-white">
                                    Objetivos específicos
                                </h3>
                            </div>
                            <div class="card-body lead">
                                <ul>
                                    <li class="text-secondary">
                                        <p class="lead">
                                            <span class="text-info">Planear:</span>
                                            Realizar un software con múltiples 
                                            beneficios.
                                        </p>
                                    </li>
                                    <li class="text-secondary">
                                        <p class="lead">
                                            <span class="text-info">Hacer:</span>
                                            Implementar un método para que la 
                                            información se guarde 
                                            automáticamente, la búsqueda 
                                            de información sea rápida, creando 
                                            un software rápido y eficiente para 
                                            una empresa.
                                        </p>
                                    </li>
                                    <li class="text-secondary">
                                        <p class="lead">
                                            <span class="text-info">Verificar:</span>
                                            Hacer pruebas de funcionamiento del 
                                            software antes de entregarlo a la 
                                            empresa.
                                        </p>
                                    </li>
                                    <li class="text-secondary">
                                        <p class="lead">
                                            <span class="text-info">Actuar:</span>
                                            Verificar el funcionamiento correcto
                                            de cada parte del software para 
                                            después hacer entrega de este a la 
                                            empresa. 
                                        </p>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
    
                </div>
            </div>
            <div class="m-5 container pl-3 pr-5 mw-100">
                <div class="row w-100">
                    <div class="col-md-12">
                        <div class="p-3">
                            <h2 class="h2-responsive bg-dark text-white font-weight-normal shadow-sm p-3">
                                Responsables
                            </h2>
                            <hr class="bg-light">
                        </div>
                           <div class="card mb-3 w-75 mx-auto">
                            <img style="width: 365px; width: 370px;" class="mx-auto card-img-top" src="./img/img_presentation_.jpg"  alt="Card image cap">
                            <div class="card-body">
                                <ul class="nav nav-tabs" id="myTab" role="tablist">
                                    <li class="nav-item">
                                        <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">Nallely Velásquez</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab" aria-controls="profile" aria-selected="false">Gustavo Vásquez</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" id="contact-tab" data-toggle="tab" href="#contact" role="tab" aria-controls="contact" aria-selected="false"> Vanessa Hernández </a>
                                    </li>
                                </ul>
                                <div class="tab-content pt-3" id="myTabContent">
                                    <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                                        <ul>
                                            <li class="text-secondary">
                                                <p class="">
                                                    <span class="text-info font-weight-normal">Nombre:</span>
                                                    Nallely Velásquez Gómez
                                                </p>
                                            </li>
                                            <li class="text-secondary">
                                                <p class="">
                                                    <span class="text-info font-weight-normal">Fecha de nacimiento:</span>
                                                    04 de abril del 2001
                                                </p>
                                            </li>
                                            <li class="text-secondary">
                                                <p class="">
                                                    <span class="text-info font-weight-normal">Edad:</span>
                                                    17
                                                </p>
                                            </li>
                                            <li class="text-secondary">
                                                <p class="">
                                                    <span class="text-info font-weight-normal">N° de documento:</span>
                                                    1001137354
                                                </p>
                                            </li>
                                            <li class="text-secondary">
                                                <p class="">
                                                    <span class="text-info font-weight-normal">Correo Electrónico:</span>
                                                    nani.v.g@htomail.com
                                                </p>
                                            </li>
                                            <li class="text-secondary">
                                                <p class="">
                                                    <span class="text-info font-weight-normal">Teléfono:</span>
                                                    587-61-78
                                                </p>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="tab-pane fade" id="profile" role="tabpanel" aria-labelledby="profile-tab">
                                        <ul>
                                            <li class="text-secondary">
                                                <p class="">
                                                    <span class="text-info font-weight-normal">Nombre:</span>
                                                    Gustavo Mauricio Vásquez Estrada 
                                                </p>
                                            </li>
                                            <li class="text-secondary">
                                                <p class="">
                                                    <span class="text-info font-weight-normal">Fecha de nacimiento:</span>
                                                    12 de Junio del 2001 
                                                </p>
                                            </li>
                                            <li class="text-secondary">
                                                <p class="">
                                                    <span class="text-info font-weight-normal">Edad:</span>
                                                    17
                                                </p>
                                            </li>
                                            <li class="text-secondary">
                                                <p class="">
                                                    <span class="text-info font-weight-normal">N° de documento:</span>
                                                    1193254598 
                                                </p>
                                            </li>
                                            <li class="text-secondary">
                                                <p class="">
                                                    <span class="text-info font-weight-normal">Correo Electrónico:</span>
                                                     Gustavoeestrada@gmail.com 
                                                </p>
                                            </li>
                                            <li class="text-secondary">
                                                <p class="">
                                                    <span class="text-info font-weight-normal">Teléfono:</span>
                                                    581-63-26 
                                                </p>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="tab-pane fade" id="contact" role="tabpanel" aria-labelledby="contact-tab">
                                        <ul>
                                            <li class="text-secondary">
                                                <p class="">
                                                    <span class="text-info font-weight-normal">Nombre:</span>
                                                    Vanessa Borja Hernández 
                                                </p>
                                            </li>
                                            <li class="text-secondary">
                                                <p class="">
                                                    <span class="text-info font-weight-normal">Fecha de nacimiento:</span>
                                                    08 de Octubre del 2001  
                                                </p>
                                            </li>
                                            <li class="text-secondary">
                                                <p class="">
                                                    <span class="text-info font-weight-normal">Edad:</span>
                                                    16
                                                </p>
                                            </li>
                                            <li class="text-secondary">
                                                <p class="">
                                                    <span class="text-info font-weight-normal">N° de documento:</span>
                                                    1001014209 
                                                </p>
                                            </li>
                                            <li class="text-secondary">
                                                <p class="">
                                                    <span class="text-info font-weight-normal">Correo Electrónico:</span>
                                                    lize566@hotmail.es 
                                                </p>
                                            </li>
                                            <li class="text-secondary">
                                                <p class="">
                                                    <span class="text-info font-weight-normal">Teléfono:</span>
                                                    505-74-06 
                                                </p>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="m-5 container pl-3 pr-5 mw-100">
                    <div class="row w-100">
                        <div class="col-md-12">
                            <div class="">
                                <h2 class="h2-responsive bg-dark text-white font-weight-normal shadow-sm p-3">
                                    Identificación
                                </h2>
                                <hr class="bg-light">
                            </div>
                            <div class="card bg-light">
                                <ul>
                                    <li>
                                        <p class="lead">
                                            <span class="font-weight-normal">Nombre del proyecto</span>
                                            Inventario Susherrajes
                                        </p>
                                    </li>
                                    <li>
                                        <p class="lead">
                                            <span class="font-weight-normal">Estado:</span>
                                            Anteproyecto 
                                        </p>
                                    </li>
                                    <li>
                                        <p class="lead">
                                            <span class="font-weight-normal">Lugar y fecha:</span>
                                            18 de Abril del 2027 Empresa Susherrajes 
                                        </p>
                                    </li>
                                    <li>
                                        <p class="lead">
                                            <span class="font-weight-normal">Centro/complejo:</span>
                                            CTMA  
                                        </p>
                                    </li>
                                    <li>
                                        <p class="lead">
                                            <span class="font-weight-normal">Programa de formación:</span>
                                            Técnica en programación de software 
                                        </p>
                                    </li>
                                    <li>
                                        <p class="lead">
                                            <span class="font-weight-normal">Ficha de caracterización:</span>
                                            1162972 
                                        </p>
                                    </li>
                                    <li class="lead">
                                        <span class="font-weight-normal">Datos de contacto en la coordinación de la I.E</span>
                                            <ul>
                                                <li>Nombre: José de Jesús Zapata Pérez</li>
                                                <li>Cargo: Coordinador </li>
                                                <li>Teléfono: 478-33-20</li>
                                                <li>Correo: </li>
                                            </ul>
                                    </li>
                                    <li>
                                        <p class="lead">
                                            <span class="font-weight-normal">Beneficiarios del proyecto:</span>
                                            La población que se beneficiara con este proyecto 
                                            son los empleados de la Empresa los cuales presentan
                                            dificultades con un programa de Excel. 
                                        </p>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>    
        </div>
        
            
            
            <footer id="footer" class="footer bg-primary">
                <div class="container w-100 mx-auto text-center">
                    <div class="row mx-auto pr-4">
                        <div class="col-md-12 pr-4">
                            <div class="row mx-auto w-100 mt-3 py-3 px-5">
                                <div class="col-md-4">
                                    <div class="p-1 w-100">
                                        <h5 class="text-white font-weight-bold font-italic">
                                            LOCALIZACIÓN
                                        </h5>   
                                        <p class="text-white">Cra. 77 No. 89a 27</p>
                                        <p class="text-white">Antioquia, Medellín</p>
                                    </div>                           
                                </div>
                                <div class="col-md-4">
                                    <div class="p-1 w-100">
                                        <h5 class="text-white font-weight-bold font-italic">
                                            EMPLEADOS
                                        </h5>   
                                        <p class="text-white">Con más de </p>
                                        <p class="text-white">120 empleados</p>
                                    </div>    
                                </div>
                                <div class="col-md-4">
                                    <div class="p-1 w-100 text-center ">
                                        <h5 class="text-white font-weight-bold font-italic">
                                            INVENTARIO
                                        </h5>   
                                        <p class="text-white">Modulos</p>
                                        <p class="text-white">...</p>
                                        <p class="text-white">...</p>
                                    </div>        
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row bg-dark">
                    <div class="col-md-12">
                        <p class="text-center text-white mt-3 p-1">
                            Programación de Software© Autor 2018
                        </p>
                        </div>
                    </div>
            </footer>
        </div>   
        <!-- /#Contenedor Principal -->

    <!-- Menu Toggle Script -->

        <script src="./js/jquery-3.3.1.min.js"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
        <script src="./js/popper.min.js"></script>
        <script src="./bootstrap/js/bootstrap.min.js"></script>
        <script src="./js/main.js"></script>
        
    </body>
</html>
