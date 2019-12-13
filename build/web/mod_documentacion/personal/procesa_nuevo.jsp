<%-- 
    Document   : procesa_nuevo
    Created on : 16-ago-2019, 11:33:49
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
           boolean result= Personal.personal_insertar(personal);
             if (result)
                out.println("<script> alert('Se ha guardado correctamente...'); location.replace('listar.jsp');</script>");
            else 
                out.println("<script> alert('No se ha guardado correctamente...'); location.replace('listar.jsp');</script>");

        } catch (Exception e) {
            out.print(e.getMessage());
        }

  %>
