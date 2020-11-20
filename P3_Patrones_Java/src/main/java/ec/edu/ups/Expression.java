/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups;

/**
 *
 * @author ASUS
 */
public  abstract class Expression {
    public abstract  String one();
    public abstract String four();
    public abstract  String five();
    public abstract  String nine();
    public abstract  int multiplier();
    
    
    public void interpreter(Context context){
    
        if (context.entrada.startsWith(nine())) {
            context.salida  +=  9*multiplier();
            context.entrada = context.entrada.substring(2);
        } else if (context.entrada.startsWith(four())){
            context.salida += (4*multiplier());
            context.entrada = context.entrada.substring(2);
        }else if( context.entrada.startsWith(five())){
            context.salida += 5* multiplier();
            context.entrada = context.entrada.substring(1);
        }while (context.entrada.startsWith(one())){
        context.salida += 1*multiplier();
        context.entrada = context.entrada.substring(1);
        }
    }
}
