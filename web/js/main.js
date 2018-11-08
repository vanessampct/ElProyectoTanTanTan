$(document).ready(function(){
   
    // Menu sidebar
    $("#menu-toggle").click(function(e) {
       e.preventDefault();
       $("#wrapper").toggleClass("toggled");
       
    });   
    
    loadContent();
    
}); 

function loadContent () {
    
    

    $('#contentAdministracion').click(function(){

        $("#loadContent").load("./modulos/modulo.administracion/modulo.administracion.jsp");
        
    });

   

    $(".dropdown-item").click(function(e){ e.preventDefault(); });
    // $(".linksNav").click(function(e){ e.preventDefault(); });
    $(".linksNav").click(function() { return false; });
    
    
    
    $("#contentGeneral").click(function() {
        
        $("#loadContent").load("");
        
    });
    
    $("#contentResponsable").click(function(){
        $("#loadContent").load("./components/component.responsable.html");
    });
    
    $("#contentIdentificacion").click(function(){
        $("#loadContent").load("./components/component.identificacion.html");
    });

    $("#contentProveedor").click(function(){
        $("#loadContent").load("./modulos/modulo.proovedores/registroProovedores.jsp");
    });
    
    
}