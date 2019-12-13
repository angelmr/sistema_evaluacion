<%-- 
    Document   : editar
    Created on : 16-ago-2019, 11:49:42
    Author     : marco
--%>

<%@page import="ReglasDeNegocio.Eliminacion"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%!
   Eliminacion eliminacion= new Eliminacion();
%>
<%
    try {
        
         int codigo= Integer.parseInt(request.getParameter("codigo"));
      //  out.print("<script>alert("+codigo+");</script>");
         eliminacion=Eliminacion.eliminacion_buscarporid(codigo);
        
        
        
        } catch (Exception e) {
        }
   
   
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar eliminacion</title>
     
    </head>
    
    <body>
       
        
        
          <form method="POST" action="procesa_editar.jsp">
              <input type="hidden" id="codigo" name="codigo" value="<%=eliminacion.getId_eliminacion()%>">
              <input type="text" class="form-control" placeholder="Id_documento" id="id_documento" value="<%=eliminacion.getId_documento()%>" name="nombre"/>            
            <input type="text" class="form-control" placeholder="Descripcion"  id="descripcion" value="<%=eliminacion.getDescrpcion()%>" name="descripcion"/>
            <input type="text" class="form-control" placeholder="Plazo"  id="plazo" value="<%=eliminacion.getPlazo()%>" name="plazo"/>
            <input type="text" class="form-control" placeholder="Base legal"  id="base_legal" value="<%=eliminacion.getBase_legal()%>" name="base_legal"/>
            <input type="text" class="form-control" placeholder="Tecnica seleccion"  id="tecnica_seleccion" value="<%=eliminacion.getTecnica_seleccion()%>" name="tecnica_seleccion"/>
            <input type="text" class="form-control" placeholder="Digitalizacion"  id="digitalizacion" value="<%=eliminacion.getDigitalizacion()%>" name="digitalizacion"/>
            <input type="text" class="form-control" placeholder="Observacion"  id="observacion" value="<%=eliminacion.getObservacion()%>" name="observacion"/>
            
            <div class="modal-footer">
                <button id="btn_guardar" name="btn_guardar" type="submit" class="btn btn-primary" >Guardar</button>
                 <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
            </div>
        </form>
          
        
    </body>
    
</html>

