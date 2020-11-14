/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.ec.Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author ASUS
 */
public class Usuario {
    
    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String contraseña;
    //metodos de agregacion
    private List<Telefono>ListaTelefonos;

    public Usuario() {
       ListaTelefonos = new ArrayList<>();
    }

    public Usuario(String cedula, String nombre, String apellido, String correo,
            String contraseña) {
       this.cedula = cedula;
       this.nombre = nombre;
       this.apellido = apellido;
       this.correo = correo;
       this.contraseña = contraseña;
       ListaTelefonos=new ArrayList<>();
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    //métodos de la agregación
    public void agregarTelefono(Telefono telefono) {
        ListaTelefonos.add(telefono);
    }

    public void actualizarTelefono(Telefono telefono) {
        if (ListaTelefonos.contains(telefono)) {
            int index = ListaTelefonos.indexOf(telefono);
            ListaTelefonos.set(index, telefono);
        }
    }

    public void eliminarTelefono(Telefono telefono) {
        if (ListaTelefonos.contains(telefono)) {
            int index = ListaTelefonos.indexOf(telefono);
            ListaTelefonos.remove(index);
        }
    }

    public List<Telefono> getListaTelefonos() {
        return ListaTelefonos;
    }

    public Telefono buscar(int codigo) {

        return ListaTelefonos.get(codigo);

    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.correo);
        hash = 97 * hash + Objects.hashCode(this.contraseña);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        if (!Objects.equals(this.contraseña, other.contraseña)) {
            return false;
        }
        return true;
    }
   
}
