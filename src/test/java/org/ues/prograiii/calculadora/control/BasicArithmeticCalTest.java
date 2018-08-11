/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ues.prograiii.calculadora.control;

import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kevin
 */
public class BasicArithmeticCalTest {
    
    /**
     * Test of sumar method, of class BasicArithmeticCal.
     */
    @Test(expected = IllegalAccessException.class)
    public void testSumarExecption() throws Exception {
        System.out.println("sumarException");
        Integer param1 = null;
        Integer param2 = null;
        BasicArithmeticCal instance = new BasicArithmeticCal();
        Integer expResult = null;
        Integer result = instance.sumar(param1, param2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSumar(){
    
        System.out.println("sumar");
        Integer param1 = 1;
        Integer param2 = 2;
        BasicArithmeticCal instance = new BasicArithmeticCal();
        Integer expResult = 3;
        Integer result = instance.sumar(param1, param2);
        assertEquals(expResult, result);
    }
    
}
