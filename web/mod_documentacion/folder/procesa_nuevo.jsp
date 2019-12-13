<%-- 
    Document   : procesa_nuevo
    Created on : 16-ago-2019, 11:33:49
    Author     : marco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*,ReglasDeNegocio.*"%>
<!DOCTYPE html>
<%

try {
            Folder folder =new Folder();
            folder.setNombre(request.getParameter("nombre"));
            folder.setTipo(request.getParameter("tipo"));
            Recibidos recibidos = new Recibidos();  
            Recibidos persona = recibidos.recibidos_buscarporid(Integer.valueOf(request.getParameter("id_recibidos")));         
            folder.setRecibidos(persona); 
           boolean result= Folder.folder_insertar(folder);
             if (result)
                out.println("<script> alert('Se ha guardado correctamente...'); location.replace('listar.jsp');</script>");
            else 
                out.println("<script> alert('No se ha guardado correctamente...'); location.replace('listar.jsp');</script>");

        } catch (Exception e) {
            out.print(e.getMessage());
        }

  %>
