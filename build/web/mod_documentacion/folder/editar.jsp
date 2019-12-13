<%-- 
    Document   : editar
    Created on : 16-ago-2019, 11:49:42
    Author     : marco
--%>

<%@page import="ReglasDeNegocio.Folder"%>
<%@page import="ReglasDeNegocio.Recibidos"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
 List<Recibidos> lista= Recibidos.recibido_buscartodos();
 Iterator<Recibidos> itRecibidos=lista.iterator();
%>
<%!
   Folder folder= new Folder();
%>
<%
    try {
        
         int codigo= Integer.parseInt(request.getParameter("codigo"));
      //  out.print("<script>alert("+codigo+");</script>");
         folder=Folder.folder_buscarporid(codigo);
        
        
        
        } catch (Exception e) {
        }
   
   
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar folder</title>
     
    </head>
    
    <body>
       
        
        
          <form method="POST" action="procesa_editar.jsp">
              <input type="hidden" id="codigo" name="codigo" value="<%=folder.getId_folder()%>">
              <input type="text" class="form-control" placeholder="Nombre"  id="nombre" value="<%=folder.getNombre()%>" name="nombre"/>            
            <input type="text" class="form-control" placeholder="Tipo"  id="apellido" value="<%=folder.getTipo()%>" name="tipo"/>
           <select class="form-control" placeholder="Id_recibidos" id="id_recibidos" value="<%=folder.getRecibidos()%>" name="id_recibidos">  
            <option>Recibidos</option>
            <%while(itRecibidos.hasNext()){
                Recibidos recibidos = itRecibidos.next();%> %>
                <option value="<%=recibidos.getId_recibidos()%>"><%=recibidos.getAsunto()%></option>
            <% } %> 
            </select>
            <div class="modal-footer">
                <button id="btn_guardar" name="btn_guardar" type="submit" class="btn btn-primary" >Guardar</button>
                 <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
            </div>
        </form>
          
        
    </body>
    
</html>

