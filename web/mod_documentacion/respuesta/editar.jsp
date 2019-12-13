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


<%!
   Respuestas respuestas= new Respuestas();
%>
<%
    try {
        
         int codigo= Integer.parseInt(request.getParameter("codigo"));
      //  out.print("<script>alert("+codigo+");</script>");
         respuestas = Respuestas.respuestas_buscarporid(codigo);                       
        } catch (Exception e) {
        }
   
   
%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Respuestas</title>
     
    </head>
    
    <body>                    
          <form method="POST" action="procesa_editar.jsp">
          <input type="hidden" id="codigo" name="codigo" value="<%=respuestas.getId_respuesta()%>">   
          <select class="form-control" placeholder="Id_personal" id="id_personal" value="<%=respuestas.getPersonal()%>"  name="id_personal">  
            <option>Personal</option>
            <%while(itPersonal.hasNext()){
                Personal personal = itPersonal.next();%> %>
                <option value="<%=personal.getId_personal()%>"><%=personal.getNombre()%></option>
            <% } %> 
            </select>
           <input type="text" class="form-control" placeholder="Id_documento"  id="id_documento" value="<%=respuestas.getId_documento()%>"  name="id_documento"/>
            <input type="text" class="form-control" placeholder="Fecha_respuesta"  id="fecha_respuesta" value="<%=respuestas.getFecha_respuesta()%>" name="fecha_respuesta"/>     
            <input type="text" class="form-control" placeholder="Asunto"  id="asunto" value="<%=respuestas.getAsunto()%>" name="asunto"/>                
             <input type="text" class="form-control" placeholder="Ruta"  id="ruta" value="<%=respuestas.getRuta()%>"  name="ruta"/>
            <input type="text" class="form-control" placeholder="Fecha_expira"  id="fecha_expira" value="<%=respuestas.getFecha_expira()%>" name="fecha_expira"/>     
            <input type="text" class="form-control" placeholder="Observaciones"  id="observaciones" value="<%=respuestas.getObservaciones()%>" name="observaciones"/>                  
            <div class="modal-footer">
                <button id="btn_guardar" name="btn_guardar" type="submit" class="btn btn-primary" >Guardar</button>
                 <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
            </div>
        </form>
          
        
    </body>
    
</html>