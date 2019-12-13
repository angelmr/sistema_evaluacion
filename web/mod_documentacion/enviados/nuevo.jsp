<%-- 
    Document   : nuevo
    Created on : 20-ago-2019, 13:09:46
    Author     : marco
--%>

<%@page import="ReglasDeNegocio.Ciudadanos"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="ReglasDeNegocio.Personal"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
 List<Personal> lista= Personal.personal_buscartodos();
 Iterator<Personal> itPersonal=lista.iterator();
%>

<%
 List<Ciudadanos> listac= Ciudadanos.ciudadano_buscartodos();
 Iterator<Ciudadanos> itCiudadanos=listac.iterator();
%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo Enviado</title>
        
    </head>
    <body>  
        
            <form method="POST"  action="procesa_nuevo.jsp">            
            <input type="text" class="form-control" placeholder="Id_documento" required id="id_documento" name="id_documento"/>
            <input type="text" class="form-control" placeholder="Descripcion" required id="descripcion" name="descripcion"/>     
            
            <select class="form-control" placeholder="Id_personal" required id="id_personal" name="id_personal">  
            <option>Personal</option>
            <%while(itPersonal.hasNext()){
                Personal personal = itPersonal.next();%> %>
                <option value="<%=personal.getId_personal()%>"><%=personal.getNombre()%></option>
            <% } %> 
            </select>
            <select class="form-control" placeholder="Id_ciudadanos" required id="id_ciudadanos" name="id_ciudadanos">  
            <option>Ciudadanos</option>
            <%while(itCiudadanos.hasNext()){
                Ciudadanos ciudadanos = itCiudadanos.next();%> %>
                <option value="<%=ciudadanos.getId_ciudadano()%>"><%=ciudadanos.getNombre()%></option>
            <% } %> 
            </select>
            <div class="modal-footer">
                <button id="btn_guardar" name="btn_guardar" type="submit" class="btn btn-primary" >Guardar</button>
                 <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
            </div>
        </form>
          
    </body>
</html>
