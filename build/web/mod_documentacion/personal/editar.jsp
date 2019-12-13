<%-- 
    Document   : editar
    Created on : 16-ago-2019, 11:49:42
    Author     : marco
--%>

<%@page import="ReglasDeNegocio.Personal"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%!
   Personal personal= new Personal();
%>
<%
    try {
        
         int codigo= Integer.parseInt(request.getParameter("codigo"));
      //  out.print("<script>alert("+codigo+");</script>");
         personal=Personal.personal_buscarporid(codigo);
        
        
        
        } catch (Exception e) {
        }
   
   
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar personal</title>
     
    </head>
    
    <body>
       
        
        
          <form method="POST" action="procesa_editar.jsp">
              <input type="hidden" id="codigo" name="codigo" value="<%=personal.getId_personal()%>">
              <input type="text" class="form-control" placeholder="Nombre"  id="nombre" value="<%=personal.getNombre()%>" name="nombre"/>            
            <input type="text" class="form-control" placeholder="Apellido"  id="apellido" value="<%=personal.getApellidos()%>" name="apellido"/>
            <input type="text" class="form-control" placeholder="Cedula"  id="cedula" value="<%=personal.getCedula()%>" name="cedula"/>
            <input type="text" class="form-control" placeholder="Cargo"  id="cargo" value="<%=personal.getCargo()%>" name="cargo"/>
           
            <div class="modal-footer">
                <button id="btn_guardar" name="btn_guardar" type="submit" class="btn btn-primary" >Guardar</button>
                 <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
            </div>
        </form>
          
        
    </body>
    
</html>

