<%-- 
    Document   : procesa_editar
    Created on : 20-ago-2019, 12:58:53
    Author     : marco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*,ReglasDeNegocio.*"%>

<!DOCTYPE html>

<%
    try {
            Enviados enviados=new Enviados();
            enviados.setId_documento(Integer.valueOf(request.getParameter("id_documento")));
            enviados.setDescripcion(request.getParameter("descripcion"));
            Personal personal = new Personal();  
            Personal persona = personal.personal_buscarporid(Integer.valueOf(request.getParameter("id_personal")));         
            enviados.setPersonal(persona); 
            Ciudadanos ciudadano = new Ciudadanos();  
            Ciudadanos ciudadanos = ciudadano.ciudadano_buscarporid(Integer.valueOf(request.getParameter("id_ciudadanos")));         
            enviados.setCiudadanos(ciudadanos); 
            enviados.setId_enviados(Integer.valueOf(request.getParameter("codigo")));
           boolean result= Enviados.enviados_editar(enviados);
             if (result)
                out.println("<script> location.replace('listar.jsp?alerta=si');</script>");
            else 
                out.println("<script> location.replace('listar.jsp?alerta=no');</script>");

        } catch (Exception e) {
            out.print(e.getMessage());
        }
%>