<%-- 
    Document   : procesa_editar
    Created on : 20-ago-2019, 12:58:53
    Author     : marco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*,ReglasDeNegocio.*"%>
<%@page import="java.sql.Date"%>
<!DOCTYPE html>

<%
    try {
            Recibidos recibidos=new Recibidos();
            Eliminacion eliminacion = new Eliminacion();  
            Eliminacion eliminaciones = eliminacion.eliminacion_buscarporid(Integer.valueOf(request.getParameter("id_personal")));         
            recibidos.setEliminacion(eliminaciones); 
            recibidos.setId_documento(Integer.valueOf(request.getParameter("id_documento")));
            Personal personal = new Personal();  
            Personal persona = personal.personal_buscarporid(Integer.valueOf(request.getParameter("id_personal")));         
            recibidos.setPersonal(persona);            
            recibidos.setFecha_oficio(Date.valueOf(request.getParameter("fecha_oficio")));
            recibidos.setAsunto(request.getParameter("asunto"));  
            recibidos.setDestinatario(request.getParameter("destinatario")); 
            recibidos.setFecha_ingreso(Date.valueOf(request.getParameter("fecha_ingreso"))); 
           respuestas.setId_respuesta(Integer.valueOf(request.getParameter("codigo")));
           boolean result= Respuestas.respuestas_editar(respuestas);
             if (result)
                out.println("<script> location.replace('listar.jsp?alerta=si');</script>");
            else 
                out.println("<script> location.replace('listar.jsp?alerta=no');</script>");

        } catch (Exception e) {
            out.print(e.getMessage());
        }
%>