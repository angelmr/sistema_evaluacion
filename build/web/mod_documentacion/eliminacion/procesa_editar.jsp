<%-- 
    Document   : procesa_editar
    Created on : 16-ago-2019, 11:42:47
    Author     : marco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*,ReglasDeNegocio.*"%>
<!DOCTYPE html>
<%
    try {
            Eliminacion eliminacion=new Eliminacion();
            eliminacion.setId_documento(Integer.valueOf(request.getParameter("id_documento")));
            eliminacion.setDescrpcion(request.getParameter("descripcion"));
            eliminacion.setBase_legal(request.getParameter("base_legal"));
            eliminacion.setPlazo(request.getParameter("plazo"));
            eliminacion.setTecnica_seleccion(request.getParameter("tecnica_seleccion"));
            eliminacion.setDigitalizacion(request.getParameter("digitalizacion"));
            eliminacion.setObservacion(request.getParameter("observacion"));
            eliminacion.setId_eliminacion(Integer.valueOf(request.getParameter("codigo")));
           boolean result= Eliminacion.eliminacion_editar(eliminacion);
             if (result)
                out.println("<script> ; location.replace('listar.jsp?alerta=si');</script>");
            else 
                out.println("<script> ; location.replace('listar.jsp?alerta=no');</script>");

        } catch (Exception e) {
            out.print(e.getMessage());
        }

%>
