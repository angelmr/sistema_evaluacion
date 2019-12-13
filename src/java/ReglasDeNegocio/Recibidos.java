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
public class Recibidos {
    private int id_documento;
    private Date fecha_oficio;
    private String asunto;
    private Personal personal;
    private String destinatario;
    private Date fecha_ingreso;
    private Eliminacion eliminacion;
    private int id_recibidos;

    public Recibidos() {
    }

    public Recibidos(int id_documento, Date fecha_oficio, String asunto, Personal personal, String destinatario, Date fecha_ingreso, Eliminacion eliminacion, int id_recibidos) {
        this.id_documento = id_documento;
        this.fecha_oficio = fecha_oficio;
        this.asunto = asunto;
        this.personal = personal;
        this.destinatario = destinatario;
        this.fecha_ingreso = fecha_ingreso;
        this.eliminacion = eliminacion;
        this.id_recibidos = id_recibidos;
    }

    public int getId_documento() {
        return id_documento;
    }

    public void setId_documento(int id_documento) {
        this.id_documento = id_documento;
    }

    public Date getFecha_oficio() {
        return fecha_oficio;
    }

    public void setFecha_oficio(Date fecha_oficio) {
        this.fecha_oficio = fecha_oficio;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Eliminacion getEliminacion() {
        return eliminacion;
    }

    public void setEliminacion(Eliminacion eliminacion) {
        this.eliminacion = eliminacion;
    }

    public int getId_recibidos() {
        return id_recibidos;
    }

    public void setId_recibidos(int id_recibidos) {
        this.id_recibidos = id_recibidos;
    }

    @Override
    public String toString() {
        return destinatario; //To change body of generated methods, choose Tools | Templates.
    }
    
    
        // Buscar todos
    public static ArrayList<Recibidos> recibido_buscartodos() throws Exception
    {
         //CREO LISTA QUE RECIBIRA LOS DATOS DEL RESULSET
       ArrayList<Recibidos> lista= new ArrayList<Recibidos>();
       Recibidos obj= new Recibidos();
       ResultSet rs= null;
      //LLAMO LA CONEXION
      Conexion con= new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      //DECLARO UN PREPAREDSTATEMENT QUE EJECUTARA LA SQL
      PreparedStatement preStm= null;

      try {
          //declaro mi sql
          String sql= "select * from public.recibidos_buscartodos()";
          //creo mi preparedstatement
          preStm=con.creaPreparedSmt(sql);
          //ejecuto el prepardestatement y le asigno a mi resulset
          
          rs= con.ejecutaPrepared(preStm);
          obj=null;
          while (rs.next()) {
              obj= new Recibidos();
              obj.setId_documento(rs.getInt("pid_documento"));
              obj.setFecha_oficio(rs.getDate("pfecha_oficio"));
              Personal personal = new Personal();
              Personal persona = Personal.personal_buscarporid(rs.getInt("pid_remitente "));
              obj.setPersonal(persona);
              obj.setDestinatario(rs.getString("pdestinatario"));
              obj.setFecha_ingreso(rs.getDate("pfecha_ingreso"));
              Eliminacion eliminacion = new Eliminacion();
              Eliminacion eliminaciones = Eliminacion.eliminacion_buscarporid(rs.getInt("pid_eliminacion "));
              obj.setEliminacion(eliminaciones);
              obj.setId_recibidos(rs.getInt("pid_recibido"));
              
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
    
    public static Recibidos recibidos_buscarporid(int piid_recibido) throws Exception
    {
         //CREO LISTA QUE RECIBIRA LOS DATOS DEL RESULSET
       ArrayList<Recibidos> lista= new ArrayList<Recibidos>();
       Recibidos obj= new Recibidos();
       ResultSet rs= null;
      //LLAMO LA CONEXION
      Conexion con= new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      //DECLARO UN PREPAREDSTATEMENT QUE EJECUTARA LA SQL
      PreparedStatement preStm= null;
       
      try {
          //declaro mi sql
          String sql= "select * from public.recibidos_buscarporid(?)";
          //creo mi preparedstatement
          preStm=con.creaPreparedSmt(sql);
          //ejecuto el prepardestatement y le asigno a mi resulset
          preStm.setInt(1, piid_recibido);
          rs= con.ejecutaPrepared(preStm);
          obj=null;
          while (rs.next()) {
              obj = new Recibidos();
              obj.setId_documento(rs.getInt("pid_documento"));
              obj.setFecha_oficio(rs.getDate("pfecha_oficio"));
              Personal personal = new Personal();
              Personal persona = Personal.personal_buscarporid(rs.getInt("pid_remitente "));
              obj.setPersonal(persona);
              obj.setDestinatario(rs.getString("pdestinatario"));
              obj.setFecha_ingreso(rs.getDate("pfecha_ingreso"));
              Eliminacion eliminacion = new Eliminacion();
              Eliminacion eliminaciones = Eliminacion.eliminacion_buscarporid(rs.getInt("pid_eliminacion "));
              obj.setEliminacion(eliminaciones);
              obj.setId_recibidos(rs.getInt("pid_recibido"));
              
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
    public static boolean recibidos_insertar(Recibidos recibidos) throws Exception
  {
      boolean respuesta=false;
      Conexion con = new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      try {
          //CREAMOS EL ARRAYLIST DE LOS COMANDOS O SENTENCIAS SQL
          ArrayList<Comando> comandos = new ArrayList<Comando>();
          //CREAMOS EL PRIMER COMANDO QUE SERA AÃ‘ADIDO AL ARRAYLIST D COMANDOS
          Comando cmd= new Comando();
          //SETEAMOS LA FUNCION AL COMAND0
          cmd.setSetenciaSql("select * from public.recibidos_insertar(?,?,?,?,?,?,?)");
          //CREAMOS EL ARRALIST DE PARAMETROS PARA ASIGANR A MI PRIMER COMANDO
          ArrayList<Parametro> parametros = new ArrayList<Parametro>();
          //llenamos el arraylist con todos los parametros
          parametros.add(new Parametro(1, recibidos.getId_documento()));
          parametros.add(new Parametro(2, recibidos.getFecha_oficio()));
          parametros.add(new Parametro(3, recibidos.getAsunto()));
          parametros.add(new Parametro(4, recibidos.getPersonal().getId_personal()));
          parametros.add(new Parametro(5, recibidos.getDestinatario()));
          parametros.add(new Parametro(6, recibidos.getFecha_ingreso()));          
          parametros.add(new Parametro(7, recibidos.getEliminacion().getId_eliminacion()));
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
    public static boolean recibidos_editar(Recibidos recibidos) throws Exception
  {
      boolean respuesta=false;
      Conexion con = new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      try {
          //CREAMOS EL ARRAYLIST DE LOS COMANDOS O SENTENCIAS SQL
          ArrayList<Comando> comandos = new ArrayList<Comando>();
          //CREAMOS EL PRIMER COMANDO QUE SERA AÃ‘ADIDO AL ARRAYLIST D COMANDOS
          Comando cmd= new Comando();
          //SETEAMOS LA FUNCION AL COMAND0
          cmd.setSetenciaSql("select * from public.recibidos_editar(?,?,?,?,?,?)");
          //CREAMOS EL ARRALIST DE PARAMETROS PARA ASIGANR A MI PRIMER COMANDO
          ArrayList<Parametro> parametros = new ArrayList<Parametro>();
          //llenamos el arraylist con todos los parametros
          parametros.add(new Parametro(1, recibidos.getId_recibidos()));
          parametros.add(new Parametro(2, recibidos.getId_documento()));
          parametros.add(new Parametro(3, recibidos.getFecha_oficio()));
          parametros.add(new Parametro(4, recibidos.getAsunto()));
          parametros.add(new Parametro(5, recibidos.getPersonal().getId_personal()));
          parametros.add(new Parametro(6, recibidos.getDestinatario()));
          parametros.add(new Parametro(7, recibidos.getFecha_ingreso()));          
          parametros.add(new Parametro(8, recibidos.getEliminacion().getId_eliminacion()));
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
     public static boolean recibidos_eliminar(int piid_recibido) throws Exception
  {
      boolean respuesta=false;
      Conexion con = new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      try {
          //CREAMOS EL ARRAYLIST DE LOS COMANDOS O SENTENCIAS SQL
          ArrayList<Comando> comandos = new ArrayList<Comando>();
          //CREAMOS EL PRIMER COMANDO QUE SERA AÃ‘ADIDO AL ARRAYLIST D COMANDOS
          Comando cmd= new Comando();
          //SETEAMOS LA FUNCION AL COMAND0
          cmd.setSetenciaSql("select * from public.recibidos_eliminar(?)");
          //CREAMOS EL ARRALIST DE PARAMETROS PARA ASIGANR A MI PRIMER COMANDO
          ArrayList<Parametro> parametros = new ArrayList<Parametro>();
          //llenamos el arraylist con todos los parametros
          parametros.add(new Parametro(1, piid_recibido));
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
