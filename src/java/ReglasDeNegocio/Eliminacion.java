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
public class Eliminacion {
  private int id_eliminacion ;
  private int id_documento ;
  private String descrpcion;
  private String plazo ;
  private String base_legal;
  private String tecnica_seleccion ;
  private String digitalizacion;
  private String observacion;
  
  public Eliminacion (){
  
  }

    public Eliminacion(int id_eliminacion, int id_documento, String descrpcion, String plazo, String base_legal, String tecnica_seleccion, String digitalizacion, String observacion) {
        this.id_eliminacion = id_eliminacion;
        this.id_documento = id_documento;
        this.descrpcion = descrpcion;
        this.plazo = plazo;
        this.base_legal = base_legal;
        this.tecnica_seleccion = tecnica_seleccion;
        this.digitalizacion = digitalizacion;
        this.observacion = observacion;
    }
  
    public int getId_eliminacion() {
        return id_eliminacion;
    }

    public void setId_eliminacion(int id_eliminacion) {
        this.id_eliminacion = id_eliminacion;
    }

    public int getId_documento() {
        return id_documento;
    }

    public void setId_documento(int id_documento) {
        this.id_documento = id_documento;
    }

    public String getDescrpcion() {
        return descrpcion;
    }

    public void setDescrpcion(String descrpcion) {
        this.descrpcion = descrpcion;
    }

    public String getPlazo() {
        return plazo;
    }

    public void setPlazo(String plazo) {
        this.plazo = plazo;
    }

    public String getBase_legal() {
        return base_legal;
    }

    public void setBase_legal(String base_legal) {
        this.base_legal = base_legal;
    }

    public String getTecnica_seleccion() {
        return tecnica_seleccion;
    }

    public void setTecnica_seleccion(String tecnica_seleccion) {
        this.tecnica_seleccion = tecnica_seleccion;
    }

    public String getDigitalizacion() {
        return digitalizacion;
    }

    public void setDigitalizacion(String digitalizacion) {
        this.digitalizacion = digitalizacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public String toString() {
        return descrpcion; //To change body of generated methods, choose Tools | Templates.
    }

    
    
        // Buscar todos
    public static ArrayList<Eliminacion> eliminacion_buscartodos() throws Exception
    {
         //CREO LISTA QUE RECIBIRA LOS DATOS DEL RESULSET
       ArrayList<Eliminacion> lista= new ArrayList<Eliminacion>();
       Eliminacion obj= new Eliminacion();
       ResultSet rs= null;
      //LLAMO LA CONEXION
      Conexion con= new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      //DECLARO UN PREPAREDSTATEMENT QUE EJECUTARA LA SQL
      PreparedStatement preStm= null;

      try {
          //declaro mi sql
          String sql= "select * from public.eliminacion_buscartodos()";
          //creo mi preparedstatement
          preStm=con.creaPreparedSmt(sql);
          //ejecuto el prepardestatement y le asigno a mi resulset
          
          rs= con.ejecutaPrepared(preStm);
          obj=null;
          while (rs.next()) {
              obj= new Eliminacion();
              obj.setId_eliminacion(rs.getInt("pid_eliminacion"));
              obj.setId_documento(rs.getInt("pid_documento"));
              obj.setDescrpcion(rs.getString("pdescrpcion"));
              obj.setPlazo(rs.getString("pplazo"));
              obj.setBase_legal(rs.getString("pbase_legal"));
              obj.setTecnica_seleccion(rs.getString("ptecnica_seleccion"));
              obj.setDigitalizacion(rs.getString("pdigitalizacion"));
              obj.setObservacion(rs.getString("pobservacion"));
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
    
    public static Eliminacion eliminacion_buscarporid(int piid_eliminacion) throws Exception
    {
         //CREO LISTA QUE RECIBIRA LOS DATOS DEL RESULSET
       ArrayList<Eliminacion> lista= new ArrayList<Eliminacion>();
       Eliminacion obj= new Eliminacion();
       ResultSet rs= null;
      //LLAMO LA CONEXION
      Conexion con= new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      //DECLARO UN PREPAREDSTATEMENT QUE EJECUTARA LA SQL
      PreparedStatement preStm= null;
       
      try {
          //declaro mi sql
          String sql= "select * from public.eliminacion_buscarporid(?)";
          //creo mi preparedstatement
          preStm=con.creaPreparedSmt(sql);
          //ejecuto el prepardestatement y le asigno a mi resulset
          preStm.setInt(1, piid_eliminacion);
          rs= con.ejecutaPrepared(preStm);
          obj=null;
          while (rs.next()) {
              obj = new Eliminacion();
              obj.setId_eliminacion(rs.getInt("pid_eliminacion"));
              obj.setId_documento(rs.getInt("pid_documento"));
              obj.setDescrpcion(rs.getString("pdescrpcion"));
              obj.setPlazo(rs.getString("pplazo"));
              obj.setBase_legal(rs.getString("pbase_legal"));
              obj.setTecnica_seleccion(rs.getString("ptecnica_seleccion"));
              obj.setDigitalizacion(rs.getString("pdigitalizacion"));
              obj.setObservacion(rs.getString("pobservacion"));
              
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
    public static boolean eliminacion_insertar(Eliminacion eliminacion) throws Exception
  {
      boolean respuesta=false;
      Conexion con = new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      try {
          //CREAMOS EL ARRAYLIST DE LOS COMANDOS O SENTENCIAS SQL
          ArrayList<Comando> comandos = new ArrayList<Comando>();
          //CREAMOS EL PRIMER COMANDO QUE SERA AÃ‘ADIDO AL ARRAYLIST D COMANDOS
          Comando cmd= new Comando();
          //SETEAMOS LA FUNCION AL COMAND0
          cmd.setSetenciaSql("select * from public.eliminacion_insertar(?,?,?,?,?,?,?)");
          //CREAMOS EL ARRALIST DE PARAMETROS PARA ASIGANR A MI PRIMER COMANDO
          ArrayList<Parametro> parametros = new ArrayList<Parametro>();
          //llenamos el arraylist con todos los parametros
          parametros.add(new Parametro(1, eliminacion.getId_documento()));
          parametros.add(new Parametro(2, eliminacion.getDescrpcion()));
          parametros.add(new Parametro(3, eliminacion.getPlazo()));
          parametros.add(new Parametro(4, eliminacion.getBase_legal()));
          parametros.add(new Parametro(5, eliminacion.getTecnica_seleccion()));
          parametros.add(new Parametro(6, eliminacion.getDigitalizacion()));
          parametros.add(new Parametro(7, eliminacion.getObservacion()));
          
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
    public static boolean eliminacion_editar(Eliminacion eliminacion) throws Exception
  {
      boolean respuesta=false;
      Conexion con = new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      try {
          //CREAMOS EL ARRAYLIST DE LOS COMANDOS O SENTENCIAS SQL
          ArrayList<Comando> comandos = new ArrayList<Comando>();
          //CREAMOS EL PRIMER COMANDO QUE SERA AÃ‘ADIDO AL ARRAYLIST D COMANDOS
          Comando cmd= new Comando();
          //SETEAMOS LA FUNCION AL COMAND0
          cmd.setSetenciaSql("select * from public.eliminacion_editar(?,?,?,?,?,?,?,?)");
          //CREAMOS EL ARRALIST DE PARAMETROS PARA ASIGANR A MI PRIMER COMANDO
          ArrayList<Parametro> parametros = new ArrayList<Parametro>();
          //llenamos el arraylist con todos los parametros
          parametros.add(new Parametro(1, eliminacion.getId_eliminacion()));
          parametros.add(new Parametro(2, eliminacion.getId_documento()));
          parametros.add(new Parametro(3, eliminacion.getDescrpcion()));
          parametros.add(new Parametro(4, eliminacion.getPlazo()));
          parametros.add(new Parametro(5, eliminacion.getBase_legal()));
          parametros.add(new Parametro(6, eliminacion.getTecnica_seleccion()));
          parametros.add(new Parametro(7, eliminacion.getDigitalizacion()));
          parametros.add(new Parametro(8, eliminacion.getObservacion()));
          
          
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
     public static boolean eliminacion_eliminar(int piid_eliminacion) throws Exception
  {
      boolean respuesta=false;
      Conexion con = new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      try {
          //CREAMOS EL ARRAYLIST DE LOS COMANDOS O SENTENCIAS SQL
          ArrayList<Comando> comandos = new ArrayList<Comando>();
          //CREAMOS EL PRIMER COMANDO QUE SERA AÃ‘ADIDO AL ARRAYLIST D COMANDOS
          Comando cmd= new Comando();
          //SETEAMOS LA FUNCION AL COMAND0
          cmd.setSetenciaSql("select * from public.eliminacion_eliminar(?)");
          //CREAMOS EL ARRALIST DE PARAMETROS PARA ASIGANR A MI PRIMER COMANDO
          ArrayList<Parametro> parametros = new ArrayList<Parametro>();
          //llenamos el arraylist con todos los parametros
          parametros.add(new Parametro(1, piid_eliminacion));
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
