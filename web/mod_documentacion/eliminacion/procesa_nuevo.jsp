<%-- 
    Document   : procesa_nuevo
    Created on : 16-ago-2019, 11:33:49
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
           boolean result= Eliminacion.eliminacion_insertar(eliminacion);
             if (result)
                out.println("<script> alert('Se ha guardado correctamente...'); location.replace('listar.jsp');</script>");
            else 
                out.println("<script> alert('No se ha guardado correctamente...'); location.replace('listar.jsp');</script>");

        } catch (Exception e) {
            out.print(e.getMessage());
        }

  %>
