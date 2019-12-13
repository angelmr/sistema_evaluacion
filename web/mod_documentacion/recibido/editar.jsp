<%-- 
    Document   : editar
    Created on : 20-ago-2019, 14:14:40
    Author     : marco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="ReglasDeNegocio.*"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%
 List<Personal> lista= Personal.personal_buscartodos();
 Iterator<Personal> itPersonal=lista.iterator();
%>
<%
 List<Eliminacion> listae= Eliminacion.eliminacion_buscartodos();
 Iterator<Eliminacion> itEliminacion=listae.iterator();
%>

<%!
   Recibidos recibidos= new Recibidos();
%>
<%
    try {
        
         int codigo= Integer.parseInt(request.getParameter("codigo"));
      //  out.print("<script>alert("+codigo+");</script>");
         recibidos = Recibidos.recibidos_buscarporid(codigo);                       
        } catch (Exception e) {
        }
   
   
%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Recibidos</title>
     
    </head>
    
    <body>                    
          <form method="POST" action="procesa_editar.jsp">
          <input type="hidden" id="codigo" name="codigo" value="<%=recibidos.getId_recibidos()%>">   
          <select class="form-control" placeholder="Id_eliminacion"  id="id_eliminacion" value="<%=recibidos.getEliminacion()%>" name="id_eliminacion">  
            <option>Eliminacion</option>
            <%while(itPersonal.hasNext()){
                Eliminacion eliminacion = itEliminacion.next();%> %>
                <option value="<%=eliminacion.getId_eliminacion()%>"><%=eliminacion.getDescrpcion()%></option>
            <% } %> 
            </select>
            <input type="text" class="form-control" placeholder="Id_documento"  id="id_documento" value="<%=recibidos.getId_documento()%>" name="id_documento"/>
            <select class="form-control" placeholder="Id_personal" id="id_personal" value="<%=recibidos.getPersonal()%>" name="id_personal">  
            <option>Personal</option>
            <%while(itPersonal.hasNext()){
                Personal personal = itPersonal.next();%> %>
                <option value="<%=personal.getId_personal()%>"><%=personal.getNombre()%></option>
            <% } %> 
            </select>    
             <input type="text" class="form-control" placeholder="Fecha_oficio"  id="fecha_oficio" value="<%=recibidos.getFecha_oficio()%>" name="fecha_oficio"/> 
            <input type="text" class="form-control" placeholder="Asunto" id="asunto" value="<%=recibidos.getAsunto()%>" name="asunto"/>     
            <input type="text" class="form-control" placeholder="Destinatario"  id="destinatario" value="<%=recibidos.getDestinatario()%>" name="destinatario"/>  
            <input type="text" class="form-control" placeholder="Fecha_ingreso"  id="fecha_ingreso" value="<%=recibidos.getFecha_ingreso()%>" name="fecha_ingreso"/>
            <div class="modal-footer">
                <button id="btn_guardar" name="btn_guardar" type="submit" class="btn btn-primary" >Guardar</button>
                 <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
            </div>
        </form>
          
        
    </body>
    
</html>