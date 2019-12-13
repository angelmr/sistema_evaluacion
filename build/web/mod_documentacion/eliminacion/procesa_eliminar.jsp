<%-- 
    Document   : procesa_eliminar
    Created on : 16-ago-2019, 11:38:23
    Author     : marco
--%>

<%@page import="ReglasDeNegocio.Eliminacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
try {
       boolean result =Eliminacion.eliminacion_eliminar(Integer.valueOf(request.getParameter("codigo")));
        if (result)
       out.println("<script>; location.replace('listar.jsp?alerta=si');</script>");
        else 
       out.println("<script> ; location.replace('listar.jsp?alerta=no');</script>");

       
    } catch (Exception e) {
        out.print(e.toString());
    }
%>