<%-- 
    Document   : procesa_nuevo
    Created on : 20-ago-2019, 12:27:26
    Author     : marco
--%>


<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*,ReglasDeNegocio.*"%>
<%@page import="java.sql.Date"%>
<!DOCTYPE html>

<%
    try {
            Respuestas respuestas=new Respuestas();
            Personal personal = new Personal();  
            Personal persona = personal.personal_buscarporid(Integer.valueOf(request.getParameter("id_personal")));         
            respuestas.setPersonal(persona); 
            respuestas.setId_documento(Integer.valueOf(request.getParameter("id_documento")));
            respuestas.setFecha_respuesta(Date.valueOf(request.getParameter("fecha_respuesta")));
            respuestas.setAsunto(request.getParameter("asunto"));  
            respuestas.setRuta(request.getParameter("ruta")); 
            respuestas.setFecha_expira(Date.valueOf(request.getParameter("fecha_expira")));
            respuestas.setObservaciones(request.getParameter("observaciones")); 
             
            boolean result= Respuestas.respuestas_insertar(respuestas);
             if (result)
                out.println("<script> location.replace('listar.jsp?alerta=si');</script>");
            else 
                out.println("<script> location.replace('listar.jsp?alerta=no');</script>");
        } catch (Exception e) {
            out.print(e.getMessage());
        }

%>
