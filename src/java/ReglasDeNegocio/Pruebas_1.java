/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReglasDeNegocio;

import java.util.ArrayList;
import AccesoADatos.*;
import java.sql.*;
import java.util.*;
/**
 *
 * @author Cristian
 */
public class Pruebas_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
//        BUSCAR TODOS
 /*     ArrayList<Archivo> lista= new ArrayList<Archivo>();
        lista=Archivo.archivo_buscartodos();
         if (lista.size()!=0)
          {
               for(Archivo rec: lista)
                {
                         System.out.println(rec.getId_archivo());
                         System.out.println(rec.getFiel());   
                         System.out.println(rec.getRuta()); 
                         System.out.println(rec.getTipo()); 
                }
            }
          else
               {
               System.out.println("No hay registro");
               }*/
             
//    
//BUSCAR POR ID
/* ArrayList<Archivo> lista= new ArrayList<Archivo>();
        lista=Archivo.archivo_buscarporid(2);
       if (lista.size()!=0)
          {
               for(Archivo rec: lista)
                {
                         System.out.println(rec.getId_archivo());
                         System.out.println(rec.getFiel());   
                         System.out.println(rec.getRuta()); 
                         System.out.println(rec.getTipo());
                }
             }
            else
                {
                System.out.println("No hay registro");
                }*/


                         
////
////  INSERTAR
/*Archivo obj=new Archivo();
obj.setFiel("w");
obj.setRuta("d");
obj.setTipo("c");
Archivo.archivo_insertar(obj); */        
        
/*Sg_rol sg_rol = new Sg_rol();
Sg_rol sg_roles = sg_rol.sg_rol_buscarporid(2);
Sg_pagina sg_pagina = new Sg_pagina();
Sg_pagina sg_paginas = sg_pagina.sg_pagina_buscarporid(2);
obj.setSg_roles(sg_roles);
obj.setSg_paginas(sg_paginas);
    Sg_rolpagina.sg_rolespaginas_insertar(obj);
 */   
//
//    EDITAR
/*Archivo obj=new Archivo();
obj.setFiel("a");
obj.setRuta("m");
obj.setTipo("r");
obj.setId_archivo(1);
    Archivo.archivo_editar(obj);*/
    
//  ELIMINAR
//    Archivo.archivo_eliminar(1);

//        BUSCAR TODOS
 /*    ArrayList<Ciudadanos> lista= new ArrayList<Ciudadanos>();
        lista=Ciudadanos.ciudadano_buscartodos();
         if (lista.size()!=0)
          {
               for(Ciudadanos rec: lista)
                {
                         System.out.println(rec.getId_ciudadano());
                         System.out.println(rec.getNombre());   
                         System.out.println(rec.getApellido()); 
                         System.out.println(rec.getCedula()); 
                         System.out.println(rec.getCelular()); 
                         System.out.println(rec.getDireccion()); 
                }
            }
          else
               {
               System.out.println("No hay registro");
               }*/
             
//    
//BUSCAR POR ID
 /*ArrayList<Ciudadanos> lista= new ArrayList<Ciudadanos>();
        lista=Ciudadanos.ciudadano_buscarporid(2);
       if (lista.size()!=0)
          {
               for(Ciudadanos rec: lista)
                {
                          System.out.println(rec.getId_ciudadano());
                         System.out.println(rec.getNombre());   
                         System.out.println(rec.getApellido()); 
                         System.out.println(rec.getCedula()); 
                         System.out.println(rec.getCelular()); 
                         System.out.println(rec.getDireccion()); 
                }
             }
            else
                {
                System.out.println("No hay registro");
                }*/


                         
////
////  INSERTAR
/*Ciudadanos obj=new Ciudadanos();
obj.setNombre("w");
obj.setApellido("d");
obj.setCedula("c");
obj.setCelular("f");
obj.setDireccion("r");
Ciudadanos.ciudadano_insertar(obj);   */ 

/*Sg_rol sg_rol = new Sg_rol();
Sg_rol sg_roles = sg_rol.sg_rol_buscarporid(2);
Sg_pagina sg_pagina = new Sg_pagina();
Sg_pagina sg_paginas = sg_pagina.sg_pagina_buscarporid(2);
obj.setSg_roles(sg_roles);
obj.setSg_paginas(sg_paginas);
    Sg_rolpagina.sg_rolespaginas_insertar(obj);
 */   
//
//    EDITAR
/*Ciudadanos obj=new Ciudadanos();
obj.setNombre("a");
obj.setApellido("m");
obj.setCedula("r");
obj.setCelular("c");
obj.setDireccion("r");
obj.setId_ciudadano(1);
    Ciudadanos.ciudadano_editar(obj);*/
    
//  ELIMINAR
    //Ciudadanos.ciudadano_eliminar(1);

        
        //        BUSCAR TODOS
/*      ArrayList<Eliminacion> list= new ArrayList<Eliminacion>();
        list=Eliminacion.eliminacion_buscartodos();
         if (list.size()!=0)
          {
               for(Eliminacion rec: list)
                {
                         System.out.println(rec.getId_eliminacion());
                         System.out.println(rec.getId_documento());   
                         System.out.println(rec.getBase_legal()); 
                         System.out.println(rec.getDescrpcion()); 
                         System.out.println(rec.getDigitalizacion());
                         System.out.println(rec.getObservacion());   
                         System.out.println(rec.getPlazo()); 
                         System.out.println(rec.getTecnica_seleccion()); 
                }
            }
          else
               {
               System.out.println("No hay registro");
               }*/
             
//    
//BUSCAR POR ID
/* ArrayList<Eliminacion> lista= new ArrayList<Eliminacion>();
        lista=Eliminacion.eliminacion_buscarporid(2);
       if (lista.size()!=0)
          {
               for(Eliminacion rec: lista)
                {
                         System.out.println(rec.getId_eliminacion());
                         System.out.println(rec.getId_documento());   
                         System.out.println(rec.getBase_legal()); 
                         System.out.println(rec.getDescrpcion()); 
                         System.out.println(rec.getDigitalizacion());
                         System.out.println(rec.getObservacion());   
                         System.out.println(rec.getPlazo()); 
                         System.out.println(rec.getTecnica_seleccion());
                }
             }
            else
                {
                System.out.println("No hay registro");
                }*/

                         
////
////  INSERTAR
/*Eliminacion obj=new Eliminacion();
obj.setId_documento(1);
obj.setBase_legal("w");
obj.setDescrpcion("d");
obj.setDigitalizacion("c");
obj.setObservacion("f");
obj.setPlazo("r");
obj.setTecnica_seleccion("e");
Eliminacion.eliminacion_insertar(obj);*/         
/*Sg_rol sg_rol = new Sg_rol();
Sg_rol sg_roles = sg_rol.sg_rol_buscarporid(2);
Sg_pagina sg_pagina = new Sg_pagina();
Sg_pagina sg_paginas = sg_pagina.sg_pagina_buscarporid(2);
obj.setSg_roles(sg_roles);
obj.setSg_paginas(sg_paginas);
    Sg_rolpagina.sg_rolespaginas_insertar(obj);
 */   
//
//    EDITAR
/*Eliminacion obj=new Eliminacion();
obj.setBase_legal("a");
obj.setDescrpcion("m");
obj.setDigitalizacion("r");
obj.setId_documento(1);
obj.setObservacion("c");
obj.setPlazo("ec");
obj.setTecnica_seleccion("ri");
obj.setId_eliminacion(1);
    Eliminacion.eliminacion_editar(obj);*/
    
//  ELIMINAR
 //  Eliminacion.eliminacion_eliminar(1);

        
        
        //        BUSCAR TODOS
 /*     ArrayList<Enviados> list= new ArrayList<Enviados>();
        list=Enviados.enviados_buscartodos();
         if (list.size()!=0)
          {
               for(Enviados rec: list)
                {
                         System.out.println(rec.getId_enviados());
                         System.out.println(rec.getId_documento());   
                         System.out.println(rec.getDescripcion()); 
                         System.out.println(rec.getPersonal()); 
                         System.out.println(rec.getCiudadanos()); 
                }
            }
          else
               {
               System.out.println("No hay registro");
               }*/
             
//    
//BUSCAR POR ID
/*  ArrayList<Enviados> lista= new ArrayList<Enviados>();
        lista=Enviados.enviados_buscarporid(2);
       if (lista.size()!=0)
          {
               for(Enviados rec: lista)
                {
                         System.out.println(rec.getId_enviados());
                         System.out.println(rec.getId_documento());   
                         System.out.println(rec.getDescripcion()); 
                         System.out.println(rec.getPersonal()); 
                         System.out.println(rec.getCiudadanos());
                }
             }
            else
                {
                System.out.println("No hay registro");
                }*/


                         
////
////  INSERTAR
/*Enviados obj=new Enviados();
obj.setId_documento(1);
obj.setDescripcion("w");
Personal persona = new Personal();
Personal personal = persona.personal_buscarporid(1);
Ciudadanos ciudadanos = new Ciudadanos();
Ciudadanos ciudadano = ciudadanos.ciudadano_buscarporid(2);
obj.setPersonal(personal);
obj.setCiudadanos(ciudadano);
    Enviados.enviados_insertar(obj);*/
/*Sg_rol sg_rol = new Sg_rol();
Sg_rol sg_roles = sg_rol.sg_rol_buscarporid(2);
Sg_pagina sg_pagina = new Sg_pagina();
Sg_pagina sg_paginas = sg_pagina.sg_pagina_buscarporid(2);
obj.setSg_roles(sg_roles);
obj.setSg_paginas(sg_paginas);
    Enviados.enviados_insertar(obj);
 */   
//
//    EDITAR
/*Enviados obj=new Enviados();
obj.setId_documento(1);
obj.setDescripcion("");
Personal persona = new Personal();
Personal personal = persona.personal_buscarporid(2);
Ciudadanos ciudadanos = new Ciudadanos();
Ciudadanos ciudadano = ciudadanos.ciudadano_buscarporid(2);
obj.setPersonal(personal);
obj.setCiudadanos(ciudadano);
obj.setId_enviados(6);
    Enviados.enviados_editar(obj);*/
    
//  ELIMINAR
  // Enviados.enviados_eliminar(2);

        
        
        //        BUSCAR TODOS
/*      ArrayList<Folder> lista= new ArrayList<Folder>();
        lista=Folder.folder_buscartodos();
         if (lista.size()!=0)
          {
               for(Folder rec: lista)
                {
                         System.out.println(rec.getId_folder());
                         System.out.println(rec.getNombre());   
                         System.out.println(rec.getRecibidos()); 
                         System.out.println(rec.getTipo()); 
                }
            }
          else
               {
               System.out.println("No hay registro");
               }*/
             
//    
//BUSCAR POR ID
/*  ArrayList<Folder> lista= new ArrayList<Folder>();
        lista=Folder.folder_buscarporid(2);
       if (lista.size()!=0)
          {
               for(Folder rec: lista)
                {
                         System.out.println(rec.getId_folder());
                         System.out.println(rec.getNombre());   
                         System.out.println(rec.getRecibidos()); 
                         System.out.println(rec.getTipo()); 
                }
             }
            else
                {
                System.out.println("No hay registro");
                }*/


                         
////
////  INSERTAR
/*Folder obj=new Folder();
obj.setNombre("w");
obj.setTipo("c");
Recibidos recibido = new Recibidos();
Recibidos recibidos = recibido.recibidos_buscarporid(2);
obj.setRecibidos(recibidos);
    Folder.folder_insertar(obj);*/
/*Sg_rol sg_rol = new Sg_rol();
Sg_rol sg_roles = sg_rol.sg_rol_buscarporid(2);
Sg_pagina sg_pagina = new Sg_pagina();
Sg_pagina sg_paginas = sg_pagina.sg_pagina_buscarporid(2);
obj.setSg_roles(sg_roles);
obj.setSg_paginas(sg_paginas);
    Sg_rolpagina.sg_rolespaginas_insertar(obj);
 */   
//
//    EDITAR
/*Folder obj=new Folder();
obj.setNombre("w");
Recibidos recibido = new Recibidos();
Recibidos recibidos = recibido.recibidos_buscarporid(1);
obj.setRecibidos(recibidos); 
obj.setTipo("c");
obj.setId_folder(2);
    Folder.folder_editar(obj);*/
    
//  ELIMINAR
  //      Folder.folder_eliminar(2);

        
        
        //        BUSCAR TODOS
 /*     ArrayList<Personal> lista= new ArrayList<Personal>();
        lista=Personal.personal_buscartodos();
         if (lista.size()!=0)
          {
               for(Personal rec: lista)
                {
                         System.out.println(rec.getId_personal());
                         System.out.println(rec.getNombre());   
                         System.out.println(rec.getApellidos()); 
                         System.out.println(rec.getCargo()); 
                          System.out.println(rec.getCedula());
                }
            }
          else
               {
               System.out.println("No hay registro");
               }*/
             
//    
//BUSCAR POR ID
 /*ArrayList<Personal> lista= new ArrayList<Personal>();
        lista=Personal.personal_buscarporid(2);
       if (lista.size()!=0)
          {
               for(Personal rec: lista)
                {
                         System.out.println(rec.getId_personal());
                         System.out.println(rec.getNombre());   
                         System.out.println(rec.getApellidos()); 
                         System.out.println(rec.getCargo()); 
                          System.out.println(rec.getCedula());
                }
             }
            else
                {
                System.out.println("No hay registro");
                }*/


                         
////
////  INSERTAR
/*Personal obj=new Personal();
obj.setNombre("a");
obj.setApellidos("a");
obj.setCedula("c");
obj.setCargo("f");
 Personal.personal_insertar(obj);*/
/*Sg_rol sg_rol = new Sg_rol();
Sg_rol sg_roles = sg_rol.sg_rol_buscarporid(2);
Sg_pagina sg_pagina = new Sg_pagina();
Sg_pagina sg_paginas = sg_pagina.sg_pagina_buscarporid(2);
obj.setSg_roles(sg_roles);
obj.setSg_paginas(sg_paginas);
    Personal.sg_rolespaginas_insertar(obj);
 */   
//
//    EDITAR
/*Personal obj=new Personal();
obj.setNombre("a");
obj.setApellidos("m");
obj.setCedula("r");
obj.setCargo("c");
obj.setId_personal(1);
    Personal.personal_editar(obj);*/
    
//  ELIMINAR
 //   Personal.personal_eliminar(3);//

        
        
        //        BUSCAR TODOS
  /*    ArrayList<Prestamo> lista= new ArrayList<Prestamo>();
        lista=Prestamo.prestamo_buscartodos();
         if (lista.size()!=0)
          {
               for(Prestamo rec: lista)
                {
                         System.out.println(rec.getId_prestamo());
                         System.out.println(rec.getId_documento());   
                         System.out.println(rec.getNombre()); 
                         System.out.println(rec.getDependencia()); 
                         System.out.println(rec.getPersonal()); 
                         System.out.println(rec.getCiudadanos()); 
                }
            }
          else
               {
               System.out.println("No hay registro");
               }*/
             
//    
//BUSCAR POR ID
 /* ArrayList<Prestamo> lista= new ArrayList<Prestamo>();
        lista=Prestamo.prestamo_buscarporid(2);
       if (lista.size()!=0)
          {
               for(Prestamo rec: lista)
                {
                         System.out.println(rec.getId_prestamo());
                         System.out.println(rec.getId_documento());   
                         System.out.println(rec.getNombre()); 
                         System.out.println(rec.getDependencia()); 
                         System.out.println(rec.getPersonal()); 
                         System.out.println(rec.getCiudadanos()); 
                }
                }
             }
            else
                {
                System.out.println("No hay registro");
                }*/


                         
////
////  INSERTAR
/*Prestamo obj=new Prestamo();
obj.setId_documento(1);
obj.setNombre("");
obj.setDependencia("");
Personal persona = new Personal();
Personal personal = persona.personal_buscarporid(2);
Ciudadanos ciudadanos = new Ciudadanos();
Ciudadanos ciudadano = ciudadanos.ciudadano_buscarporid(2);
obj.setPersonal(personal);
obj.setCiudadanos(ciudadano);
Prestamo.prestamo_insertar(obj);*/
/*Sg_rol sg_rol = new Sg_rol();
Sg_rol sg_roles = sg_rol.sg_rol_buscarporid(2);
Sg_pagina sg_pagina = new Sg_pagina();
Sg_pagina sg_paginas = sg_pagina.sg_pagina_buscarporid(2);
obj.setSg_roles(sg_roles);
obj.setSg_paginas(sg_paginas);
    Prestamo.sg_rolespaginas_insertar(obj);
 */   
//
//    EDITAR
/*Prestamo obj=new Prestamo();
obj.setId_documento(1);
obj.setNombre("");
obj.setDependencia("");
Personal persona = new Personal();
Personal personal = persona.personal_buscarporid(2);
Ciudadanos ciudadanos = new Ciudadanos();
Ciudadanos ciudadano = ciudadanos.ciudadano_buscarporid(2);
obj.setPersonal(personal);
obj.setCiudadanos(ciudadano);
obj.setId_prestamo(6);
    Prestamo.prestamo_editar(obj);*/
    
//  ELIMINAR
//    Prestamo.prestamo_eliminar(6);

        
        
        
        //        BUSCAR TODOS
 /*     ArrayList<Recibidos> lista= new ArrayListRecibidos>();
        lista=Recibidos.recibido_buscartodos();
         if (lista.size()!=0)
          {
               for(Recibidos rec: lista)
                {
                         System.out.println(rec.getId_recibidos());
                         System.out.println(rec.getId_documento());   
                         System.out.println(rec.getAsunto()); 
                         System.out.println(rec.getDestinatario());
                         System.out.println(rec.getEliminacion());
                         System.out.println(rec.getFecha_ingreso());   
                         System.out.println(rec.getFecha_oficio()); 
                         System.out.println(rec.getPersonal());
                }
            }
          else
               {
               System.out.println("No hay registro");
               }
             */
//    
//BUSCAR POR ID
 /*ArrayList<Recibidos> lista= new ArrayList<Recibidos>();
        lista=Recibidos.archivo_buscarporid(2);
       if (lista.size()!=0)
          {
               for(Recibidos rec: lista)
                {
                         System.out.println(rec.getId_recibidos());
                         System.out.println(rec.getId_documento());   
                         System.out.println(rec.getAsunto()); 
                         System.out.println(rec.getDestinatario());
                         System.out.println(rec.getEliminacion());
                         System.out.println(rec.getFecha_ingreso());   
                         System.out.println(rec.getFecha_oficio()); 
                         System.out.println(rec.getPersonal());
                }
             }
            else
                {
                System.out.println("No hay registro");
                }*/


                         
////
////  INSERTAR
    
    
/*Recibidos obj=new Recibidos();
obj.setId_documento(1);
obj.setAsunto("w");
obj.setDestinatario("d");
Eliminacion eliminacion = new Eliminacion();
Eliminacion eliminaciones = eliminacion.eliminacion_buscarporid(2);
obj.setEliminacion(eliminaciones);
obj.setFecha_ingreso(2019-12-12);
obj.setFecha_oficio(2019-12-12);
Personal persona = new Personal();
Personal personal = persona.personal_buscarporid(2);
obj.setPersonal(personal);
    Recibidos.recibidos_insertar(obj);*/

/*Sg_rol sg_rol = new Sg_rol();
Sg_rol sg_roles = sg_rol.sg_rol_buscarporid(2);
Sg_pagina sg_pagina = new Sg_pagina();
Sg_pagina sg_paginas = sg_pagina.sg_pagina_buscarporid(2);
obj.setSg_roles(sg_roles);
obj.setSg_paginas(sg_paginas);
    Recibidos.sg_rolespaginas_insertar(obj);
 */   
//
//    EDITAR
/*Recibidos obj=new Recibidos();
obj.setId_documento(1);
obj.setAsunto("");
obj.setDestinatario("");
Eliminacion eliminacion = new Eliminacion();
Eliminacion eliminaciones = eliminaciones.eliminacion_buscarporid(2);
obj.setEliminacion(eliminacion);
obj.setFecha_ingreso(null);
obj.setFecha_oficio(null);
Personal persona = new Personal();
Personal personal = personal.personal_buscarporid(2);
obj.setPersonal(persona);
obj.setId_recibidos(6);
    Recibidos.recibidos_editar(obj);*/
    
//  ELIMINAR
//    Recibidos.recibidos_eliminar(6);

        
        
        
        //        BUSCAR TODOS
 /*    ArrayList<Respuestas> lista= new ArrayList<Respuestas();
        lista=Respuestas.respuestas_buscartodos();
         if (lista.size()!=0)
          {
               for(Respuestas rec: lista)
                {
                         System.out.println(rec.getId_respuesta());
                         System.out.println(rec.getId_documento());   
                         System.out.println(rec.getAsunto()); 
                         System.out.println(rec.getFecha_expira()); 
                         System.out.println(rec.getFecha_respuesta());
                         System.out.println(rec.getObservaciones());   
                         System.out.println(rec.getPersonal()); 
                         System.out.println(rec.getRuta());
                }
            }
          else
               {
               System.out.println("No hay registro");
               }*/
             
//    
//BUSCAR POR ID
 /* ArrayList<Respuestas> lista= new ArrayList<Respuestas>();
        lista=Respuestas.archivo_buscarporid(2);
       if (lista.size()!=0)
          {
               for(Respuestas rec: lista)
                {
                         System.out.println(rec.getId_respuesta());
                         System.out.println(rec.getId_documento());   
                         System.out.println(rec.getAsunto()); 
                         System.out.println(rec.getFecha_expira()); 
                         System.out.println(rec.getFecha_respuesta());
                         System.out.println(rec.getObservaciones());   
                         System.out.println(rec.getPersonal()); 
                         System.out.println(rec.getRuta());
                }
             }
            else
                {
                System.out.println("No hay registro");
                }*/


                         
////
////  INSERTAR
/*Respuestas obj=new Respuestas();
obj.setId_documento(1);
obj.setAsunto("");
obj.setFecha_expira(null);
obj.setFecha_respuesta(null);
obj.setObservaciones(null);
Personal persona = new Personal();
Personal personal = personal.personal_buscarporid(2);
obj.setPersonal(persona);
obj.setRuta("");
Respuestas.respuestas_insertar(obj);*/

/*Sg_rol sg_rol = new Sg_rol();
Sg_rol sg_roles = sg_rol.sg_rol_buscarporid(2);
Sg_pagina sg_pagina = new Sg_pagina();
Sg_pagina sg_paginas = sg_pagina.sg_pagina_buscarporid(2);
obj.setSg_roles(sg_roles);
obj.setSg_paginas(sg_paginas);
    Respuestas.sg_rolespaginas_insertar(obj);
 */   
//
//    EDITAR
/*Respuestas obj=new Respuestas();
obj.setId_documento(1);
obj.setAsunto("");
obj.setFecha_expira(null);
obj.setFecha_respuesta(null);
obj.setObservaciones(null);
Personal persona = new Personal();
Personal personal = personal.personal_buscarporid(2);
obj.setPersonal(persona);
obj.setRuta("");
obj.setId_respuesta(6);
    Respuestas.respuestas_editar(obj);*/
    
//  ELIMINAR
//    Respuestas.respuestas_eliminar(6);

        
        
  }  
}
   


