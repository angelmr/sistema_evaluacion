<%-- 
    Document   : nuevo
    Created on : 20-ago-2019, 13:09:46
    Author     : marco
--%>

<%@page import="ReglasDeNegocio.Eliminacion"%>
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
 List<Eliminacion> listae= Eliminacion.eliminacion_buscartodos();
 Iterator<Eliminacion> itEliminacion=listae.iterator();
%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo Recibidos</title>
        
    </head>
    <body>  
        
            <form method="POST"  action="procesa_nuevo.jsp">
            <select class="form-control" placeholder="Id_eliminacion" required id="id_eliminacion" name="id_eliminacion">  
            <option>Eliminacion</option>
            <%while(itPersonal.hasNext()){
                Eliminacion eliminacion = itEliminacion.next();%> %>
                <option value="<%=eliminacion.getId_eliminacion()%>"><%=eliminacion.getDescrpcion()%></option>
            <% } %> 
            </select>
            <input type="text" class="form-control" placeholder="Id_documento" required id="id_documento" name="id_documento"/>
            <select class="form-control" placeholder="Id_personal" required id="id_personal" name="id_personal">  
            <option>Personal</option>
            <%while(itPersonal.hasNext()){
                Personal personal = itPersonal.next();%> %>
                <option value="<%=personal.getId_personal()%>"><%=personal.getNombre()%></option>
            <% } %> 
            </select>    
             <input type="text" class="form-control" placeholder="Fecha_oficio" required id="fecha_oficio" name="fecha_oficio"/> 
            <input type="text" class="form-control" placeholder="Asunto" required id="asunto" name="asunto"/>     
            <input type="text" class="form-control" placeholder="Destinatario" required id="destinatario" name="destinatario"/>  
            <input type="text" class="form-control" placeholder="Fecha_ingreso" required id="fecha_ingreso" name="fecha_ingreso"/>
            <div class="modal-footer">
                <button id="btn_guardar" name="btn_guardar" type="submit" class="btn btn-primary" >Guardar</button>
                 <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
            </div>
        </form>
          
    </body>
</html>
