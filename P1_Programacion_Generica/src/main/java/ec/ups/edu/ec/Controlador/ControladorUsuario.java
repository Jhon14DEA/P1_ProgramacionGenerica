/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.ec.Controlador;

import ec.ups.edu.ec.Modelo.Usuario;

import java.util.List;

/**
 *
 * @author ASUS
 */
public class ControladorUsuario extends ControladorGenerico<Usuario>{

    //private List<E> listaGenerica;
    
    public ControladorUsuario() {
        super(Usuario.class);
    }

    /*
     public Controlador() {
        listaGenerica = new ArrayList<>();
    }
     */
   public  boolean crearUsuario(String cedula, String nombre, String apellido, String correo,   String contraseña){
       Usuario nuevoUsuario = new Usuario(cedula, nombre, apellido, correo, contraseña);
       return super.crear(nuevoUsuario);
       
   }
  
    
    
    @Override
    public List<Usuario> findAll() {
       return getListado();
    }
    
}
