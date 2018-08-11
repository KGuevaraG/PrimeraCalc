package org.ues.prograiii.calculadora.control;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author kevin
 */

@Stateless
@LocalBean
public class BasicArithmeticCal {
    /**
     * 
     * @param param1
     * @param param2
     * @return la suma de los parametros
     * @throws IllegalArgumentException  si alguno de los parametros es nulo
     */
    
    public Integer sumar(Integer param1, Integer param2) throws IllegalArgumentException{
    
        if(param1 !=null && param2 !=null){
        
            return param1+param2;
        }
        throw new IllegalArgumentException("Los parametros no deben ser nulos");
    }
    
}
