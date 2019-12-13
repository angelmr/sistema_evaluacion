<%-- 
    Document   : procesa_nuevo
    Created on : 20-ago-2019, 12:27:26
    Author     : marco
--%>


<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*,ReglasDeNegocio.*"%>

<!DOCTYPE html>

<%
    try {
            Prestamo prestamo=new Prestamo();
            prestamo.setId_documento(Integer.valueOf(request.getParameter("id_documento")));
            prestamo.setNombre(request.getParameter("nombre"));
            prestamo.setNombre(request.getParameter("dependencia"));
            Personal personal = new Personal();  
            Personal persona = personal.personal_buscarporid(Integer.valueOf(request.getParameter("id_personal")));         
            prestamo.setPersonal(persona); 
            Ciudadanos ciudadano = new Ciudadanos();  
            Ciudadanos ciudadanos = ciudadano.ciudadano_buscarporid(Integer.valueOf(request.getParameter("id_ciudadanos")));         
            prestamo.setCiudadanos(ciudadanos); 
            boolean result= Prestamo.prestamo_insertar(prestamo);
             if (result)
                out.println("<script> location.replace('listar.jsp?alerta=si');</script>");
            else 
                out.println("<script> location.replace('listar.jsp?alerta=no');</script>");
        } catch (Exception e) {
            out.print(e.getMessage());
        }

%>
