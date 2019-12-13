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
 List<Ciudadanos> listac= Ciudadanos.ciudadano_buscartodos();
 Iterator<Ciudadanos> itCiudadanos=listac.iterator();
%>

<%!
   Prestamo prestamo= new Prestamo();
%>
<%
    try {
        
         int codigo= Integer.parseInt(request.getParameter("codigo"));
      //  out.print("<script>alert("+codigo+");</script>");
         prestamo = Prestamo.prestamo_buscarporid(codigo);                       
        } catch (Exception e) {
        }
   
   
%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Prestamo</title>
     
    </head>
    
    <body>                    
          <form method="POST" action="procesa_editar.jsp">
          <input type="hidden" id="codigo" name="codigo" value="<%=prestamo.getId_prestamo()%>">         
           <input type="text" class="form-control" placeholder="Id_documento"  id="id_documento" value="<%=prestamo.getId_documento()%>"  name="id_documento"/>
            <input type="text" class="form-control" placeholder="Nombre"  id="nombre" value="<%=prestamo.getNombre()%>" name="nombre"/>     
            <input type="text" class="form-control" placeholder="Dependencia"  id="dependencia" value="<%=prestamo.getDependencia()%>" name="dependencia"/>                
            <select class="form-control" placeholder="Id_personal" id="id_personal" value="<%=prestamo.getPersonal()%>"  name="id_personal">  
            <option>Personal</option>
            <%while(itPersonal.hasNext()){
                Personal personal = itPersonal.next();%> %>
                <option value="<%=personal.getId_personal()%>"><%=personal.getNombre()%></option>
            <% } %> 
            </select>
            <select class="form-control" placeholder="Id_ciudadanos"  id="id_ciudadanos" value="<%=prestamo.getCiudadanos()%>" name="id_ciudadanos">  
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