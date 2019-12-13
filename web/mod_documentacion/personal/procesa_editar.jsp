<%-- 
    Document   : procesa_editar
    Created on : 16-ago-2019, 11:42:47
    Author     : marco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*,ReglasDeNegocio.*"%>
<!DOCTYPE html>
<%
    try {
            Personal personal=new Personal();
            personal.setNombre(request.getParameter("nombre"));
            personal.setApellidos(request.getParameter("apellido"));
            personal.setCedula(request.getParameter("cedula"));
            personal.setCargo(request.getParameter("cargo"));;
            personal.setId_personal(Integer.valueOf(request.getParameter("codigo")));
           boolean result= Personal.personal_editar(personal);
             if (result)
                out.println("<script> ; location.replace('listar.jsp?alerta=si');</script>");
            else 
                out.println("<script> ; location.replace('listar.jsp?alerta=no');</script>");

        } catch (Exception e) {
            out.print(e.getMessage());
        }

%>
