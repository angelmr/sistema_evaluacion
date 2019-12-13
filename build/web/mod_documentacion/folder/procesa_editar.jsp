<%-- 
    Document   : procesa_editar
    Created on : 16-ago-2019, 11:42:47
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
            folder.setId_folder(Integer.valueOf(request.getParameter("codigo")));
           boolean result= Folder.folder_editar(folder);
             if (result)
                out.println("<script> ; location.replace('listar.jsp?alerta=si');</script>");
            else 
                out.println("<script> ; location.replace('listar.jsp?alerta=no');</script>");

        } catch (Exception e) {
            out.print(e.getMessage());
        }

%>
