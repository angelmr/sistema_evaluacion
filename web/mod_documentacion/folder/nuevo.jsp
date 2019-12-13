<%-- 
    Document   : nuevo
    Created on : 16-ago-2019, 11:46:46
    Author     : marco
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="ReglasDeNegocio.Recibidos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
 List<Recibidos> lista= Recibidos.recibido_buscartodos();
 Iterator<Recibidos> itRecibidos=lista.iterator();
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo recibidos</title>
        
    </head>
    <body>
        
        
          <form method="POST"  action="procesa_nuevo.jsp">
            <input type="text" class="form-control" placeholder="Nombre" required id="nombre" name="nombre"/>            
            <input type="text" class="form-control" placeholder="Tipo" required id="tipo" name="tipo"/>
            <select class="form-control" placeholder="Id_recibidos" required id="id_recibidos" name="id_recibidos">  
            <option>Recibidos</option>
            <%while(itRecibidos.hasNext()){
                Recibidos recibidos = itRecibidos.next();%> %>
                <option value="<%=recibidos.getId_recibidos()%>"><%=recibidos.getAsunto()%></option>
            <% } %> 
            </select> <div class="modal-footer">
                <button id="btn_guardar" name="btn_guardar" type="submit" class="btn btn-primary" >Guardar</button>
                 <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
            </div>
        </form>
          
    </body>
</html>
