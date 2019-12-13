<%-- 
    Document   : nuevo
    Created on : 16-ago-2019, 11:46:46
    Author     : marco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo personal</title>
        
    </head>
    <body>
        
        
          <form method="POST"  action="procesa_nuevo.jsp">
            <input type="text" class="form-control" placeholder="Nombre" required id="nombre" name="nombre"/>            
            <input type="text" class="form-control" placeholder="Apellido" required id="apellido" name="apellido"/>
            <input type="text" class="form-control" placeholder="Cedula" required id="cedula" name="cedula"/>
            <input type="text" class="form-control" placeholder="Cargo" required id="cargo" name="cargo"/>
            <div class="modal-footer">
                <button id="btn_guardar" name="btn_guardar" type="submit" class="btn btn-primary" >Guardar</button>
                 <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
            </div>
        </form>
          
    </body>
</html>
