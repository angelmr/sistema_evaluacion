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
        <title>Nueva eliminacion</title>
        
    </head>
    <body>
        
        
          <form method="POST"  action="procesa_nuevo.jsp">
            <input type="text" class="form-control" placeholder="Id_documento" required id="nombre" name="nombre"/>            
            <input type="text" class="form-control" placeholder="Descripcion" required id="descripcion" name="descripcion"/>
            <input type="text" class="form-control" placeholder="Plazo" required id="plazo" name="plazo"/>
            <input type="text" class="form-control" placeholder="Base legal" required id="base_legal" name="base_legal"/>
            <input type="text" class="form-control" placeholder="Tecnica seleccion" required id="tecnica_seleccion" name="tecnica_seleccion"/>
            <input type="text" class="form-control" placeholder="Digitalizacion" required id="digitalizacion" name="digitalizacion"/>
            <input type="text" class="form-control" placeholder="Observacion" required id="observacion" name="observacion"/>
            <div class="modal-footer">
                <button id="btn_guardar" name="btn_guardar" type="submit" class="btn btn-primary" >Guardar</button>
                 <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
            </div>
        </form>
          
    </body>
</html>
