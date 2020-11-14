/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.ec.Controlador;

import ec.ups.edu.ec.Modelo.Telefono;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class ControaldorTelefono extends ControladorGenerico<Telefono>{

    public ControaldorTelefono() {
        super(Telefono.class);
    }
    
    public  boolean crearTelefono(String numero, String tipo, String operadora, String codigo){
        Telefono nuevoTelefono = new Telefono(numero, tipo, operadora, codigo);
        return super.crear(nuevoTelefono);
        
    }
    @Override
    public List<Telefono> findAll() {
        return getListado();
    }
    
}
