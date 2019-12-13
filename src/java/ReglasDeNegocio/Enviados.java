/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReglasDeNegocio;
import AccesoADatos.Comando;
import AccesoADatos.Conexion;
import AccesoADatos.Global;
import AccesoADatos.Parametro;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Enviados {
 private int id_enviados ;
 private int id_documento;
 private String descripcion ;
 private Personal personal ;
 private Ciudadanos ciudadanos;
 
public Enviados (){

}

    public Enviados(int id_enviados, int id_documento, String descripcion, Personal personal, Ciudadanos ciudadanos) {
        this.id_enviados = id_enviados;
        this.id_documento = id_documento;
        this.descripcion = descripcion;
        this.personal = personal;
        this.ciudadanos = ciudadanos;
    }

    public int getId_enviados() {
        return id_enviados;
    }

    public void setId_enviados(int id_enviados) {
        this.id_enviados = id_enviados;
    }

    public int getId_documento() {
        return id_documento;
    }

    public void setId_documento(int id_documento) {
        this.id_documento = id_documento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Ciudadanos getCiudadanos() {
        return ciudadanos;
    }

    public void setCiudadanos(Ciudadanos ciudadanos) {
        this.ciudadanos = ciudadanos;
    }
     
        // Buscar todos
    public static ArrayList<Enviados> enviados_buscartodos() throws Exception
    {
         //CREO LISTA QUE RECIBIRA LOS DATOS DEL RESULSET
       ArrayList<Enviados> lista= new ArrayList<Enviados>();
       Enviados obj= new Enviados();
       ResultSet rs= null;
      //LLAMO LA CONEXION
      Conexion con= new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      //DECLARO UN PREPAREDSTATEMENT QUE EJECUTARA LA SQL
      PreparedStatement preStm= null;

      try {
          //declaro mi sql
          String sql= "select * from public.enviados_buscartodos()";
          //creo mi preparedstatement
          preStm=con.creaPreparedSmt(sql);
          //ejecuto el prepardestatement y le asigno a mi resulset
          
          rs= con.ejecutaPrepared(preStm);
          obj=null;
          while (rs.next()) {
              obj= new Enviados();
              obj.setId_enviados(rs.getInt("pid_enviados"));
              obj.setId_documento(rs.getInt("pid_documento"));
              obj.setDescripcion(rs.getString("pdescripcion"));
              Personal personal = new Personal();
              Personal persona = personal.personal_buscarporid(rs.getInt("pid_personal"));
              obj.setPersonal(persona);
              
              Ciudadanos ciudadanos = new Ciudadanos();
              Ciudadanos ciudadano = ciudadanos.ciudadano_buscarporid(rs.getInt("pid_ciudadano"));
              obj.setCiudadanos(ciudadano);
              
              
               lista.add(obj);
          }
      } catch (SQLException e) {
          System.out.println(e.getMessage());
      }
      finally
      {
          rs.close();
          preStm.close();
          con.desconectar();
      }
            return lista;

    }
    
    //  buscar por su id
    
    public static Enviados enviados_buscarporid(int piid_enviados) throws Exception
    {
         //CREO LISTA QUE RECIBIRA LOS DATOS DEL RESULSET
       ArrayList<Enviados> lista= new ArrayList<Enviados>();
       Enviados obj= new Enviados();
       ResultSet rs= null;
      //LLAMO LA CONEXION
      Conexion con= new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      //DECLARO UN PREPAREDSTATEMENT QUE EJECUTARA LA SQL
      PreparedStatement preStm= null;
       
      try {
          //declaro mi sql
          String sql= "select * from public.enviados_buscarporid(?)";
          //creo mi preparedstatement
          preStm=con.creaPreparedSmt(sql);
          //ejecuto el prepardestatement y le asigno a mi resulset
          preStm.setInt(1, piid_enviados);
          rs= con.ejecutaPrepared(preStm);
          obj=null;
          while (rs.next()) {
              obj = new Enviados();
              obj.setId_enviados(rs.getInt("pid_enviados"));
              obj.setId_documento(rs.getInt("pid_documento"));
              obj.setDescripcion(rs.getString("pdescrpcion"));
              Personal personal = new Personal();
              Personal persona = personal.personal_buscarporid(rs.getInt("pid_personal "));
              obj.setPersonal(persona);
              
              Ciudadanos ciudadanos = new Ciudadanos();
              Ciudadanos ciudadano = ciudadanos.ciudadano_buscarporid(rs.getInt("pid_ciudadano "));
              obj.setCiudadanos(ciudadano);
              
              lista.add(obj);
          }
      } catch (SQLException e) {
          System.out.println(e.getMessage());
      }
      finally
      {
          rs.close();
          preStm.close();
          con.desconectar();
      }
            return obj;

    }
    
    //Insertar 
    public static boolean enviados_insertar(Enviados enviados) throws Exception
  {
      boolean respuesta=false;
      Conexion con = new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      try {
          //CREAMOS EL ARRAYLIST DE LOS COMANDOS O SENTENCIAS SQL
          ArrayList<Comando> comandos = new ArrayList<Comando>();
          //CREAMOS EL PRIMER COMANDO QUE SERA AÃ‘ADIDO AL ARRAYLIST D COMANDOS
          Comando cmd= new Comando();
          //SETEAMOS LA FUNCION AL COMAND0
          cmd.setSetenciaSql("select * from public.enviados_insertar(?,?,?,?)");
          //CREAMOS EL ARRALIST DE PARAMETROS PARA ASIGANR A MI PRIMER COMANDO
          ArrayList<Parametro> parametros = new ArrayList<Parametro>();
          //llenamos el arraylist con todos los parametros
          parametros.add(new Parametro(1, enviados.getId_documento()));
          parametros.add(new Parametro(2, enviados.getDescripcion()));
          parametros.add(new Parametro(3, enviados.getPersonal().getId_personal()));
          parametros.add(new Parametro(4, enviados.getCiudadanos().getId_ciudadano()));      
          //llenar el comando con los parametros
          cmd.setLstParametros(parametros);
          comandos.add(cmd);
          //llamamos al funcion que ejecuta la transaccion en la base de datos
          respuesta= con.ejecutaPreparedTransaccion(comandos);

      } catch (SQLException e) {
          throw  new Exception(e.getMessage());
      }
      finally
      {
          con.desconectar();
      }
      return respuesta;

  }

   // Editar datos 
    public static boolean enviados_editar(Enviados enviados) throws Exception
  {
      boolean respuesta=false;
      Conexion con = new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      try {
          //CREAMOS EL ARRAYLIST DE LOS COMANDOS O SENTENCIAS SQL
          ArrayList<Comando> comandos = new ArrayList<Comando>();
          //CREAMOS EL PRIMER COMANDO QUE SERA AÃ‘ADIDO AL ARRAYLIST D COMANDOS
          Comando cmd= new Comando();
          //SETEAMOS LA FUNCION AL COMAND0
          cmd.setSetenciaSql("select * from public.enviados_editar(?,?,?,?,?)");
          //CREAMOS EL ARRALIST DE PARAMETROS PARA ASIGANR A MI PRIMER COMANDO
          ArrayList<Parametro> parametros = new ArrayList<Parametro>();
          //llenamos el arraylist con todos los parametros
          parametros.add(new Parametro(1, enviados.getId_enviados()));
          parametros.add(new Parametro(2, enviados.getId_documento()));
          parametros.add(new Parametro(3, enviados.getDescripcion()));
          parametros.add(new Parametro(4, enviados.getPersonal().getId_personal()));
          parametros.add(new Parametro(5, enviados.getCiudadanos().getId_ciudadano()));
          
          //llenar el comando con los parametros
          cmd.setLstParametros(parametros);
          comandos.add(cmd);
          //llamamos al funcion que ejecuta la transaccion en la base de datos
          respuesta= con.ejecutaPreparedTransaccion(comandos);

      } catch (SQLException e) {
          throw  new Exception(e.getMessage());
      }
      finally
      {
          con.desconectar();
      }
      return respuesta;

  }
    
     //Eliminar datos 
     public static boolean enviados_eliminar(int piid_enviados) throws Exception
  {
      boolean respuesta=false;
      Conexion con = new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      try {
          //CREAMOS EL ARRAYLIST DE LOS COMANDOS O SENTENCIAS SQL
          ArrayList<Comando> comandos = new ArrayList<Comando>();
          //CREAMOS EL PRIMER COMANDO QUE SERA AÃ‘ADIDO AL ARRAYLIST D COMANDOS
          Comando cmd= new Comando();
          //SETEAMOS LA FUNCION AL COMAND0
          cmd.setSetenciaSql("select * from public.enviados_eliminar(?)");
          //CREAMOS EL ARRALIST DE PARAMETROS PARA ASIGANR A MI PRIMER COMANDO
          ArrayList<Parametro> parametros = new ArrayList<Parametro>();
          //llenamos el arraylist con todos los parametros
          parametros.add(new Parametro(1, piid_enviados));
          //llenar el comando con los parametros
          cmd.setLstParametros(parametros);
          comandos.add(cmd);
          //llamamos al funcion que ejecuta la transaccion en la base de datos
          respuesta= con.ejecutaPreparedTransaccion(comandos);

      } catch (SQLException e) {
          throw  new Exception(e.getMessage());
      }
            finally
      {
          con.desconectar();
      }
      return respuesta;
}

}
