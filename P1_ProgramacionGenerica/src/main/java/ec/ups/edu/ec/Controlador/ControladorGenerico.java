/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.ec.Controlador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public abstract class ControladorGenerico<E>{
    private List<E> listado;
    private Class<E> tipo;


    public ControladorGenerico( Class<E> tipo) {
        this.listado = new ArrayList<>();
        this.tipo = tipo;
        this.listado = findAll();
    }
    
    
    public boolean crear(E obj){
       return listado.add(obj);
    }
    
    public boolean eliminar(E obj){
         return listado.remove(obj);  
    }
    
    public E buscar(E objeto){
        return listado.stream().filter(obj -> obj.equals(objeto)).findFirst().get();

    }
     public boolean actualizar(E obj, E nuevoObjeto){
        E objeto = buscar(obj);
         for (int i = 0; i < listado.size(); i++) {
             if (listado.get(i)== objeto){
                 listado.set(i, nuevoObjeto);
                 return true;
                 
             }else{
                 return false;
             }
         }
         return false;
     }
    public abstract List<E> findAll();

    public List<E> getListado() {
        return listado;
    }

    public void setListado(List<E> listado) {
        this.listado = listado;
    }

    public Class<E> getTipo() {
        return tipo;
    }

    public void setTipo(Class<E> tipo) {
        this.tipo = tipo;
    }
    
}
