/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ues.prograiii.calculadora.boundary;

import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import org.ues.prograiii.calculadora.control.BasicArithmeticCal;

/**
 *
 * @author kevin
 */

public class CalcServletTest {
    
  
    /**
     * Test of processRequest method, of class CalcServlet.
     */
    
    @Test
    public void testProcessRequest() throws Exception {
        System.out.println("processRequest");
        BasicArithmeticCal calculadora = new BasicArithmeticCal();
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        Mockito.when(request.getContextPath()).thenReturn("/IntruduccionTecnologiasWeb");
        
        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
        
        StringWriter sw= new StringWriter();
        PrintWriter pw= new PrintWriter(sw);
        
        Mockito.when(response.getWriter()).thenReturn(pw);
        
        CalcServlet instance = new CalcServlet();
        instance.calculadora=calculadora;
        instance.processRequest(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doGet method, of class CalcServlet.
     */
    @Test
    public void testDoGet() throws Exception {
        System.out.println("doGet");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        CalcServlet instance = new CalcServlet();
        instance.doGet(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doPost method, of class CalcServlet.
     */
    @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        CalcServlet instance = new CalcServlet();
        instance.doPost(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServletInfo method, of class CalcServlet.
     */
    @Test
    public void testGetServletInfo() {
        System.out.println("getServletInfo");
        CalcServlet instance = new CalcServlet();
        String expResult = "";
        String result = instance.getServletInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
