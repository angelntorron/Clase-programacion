/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Caco
 */
public class PilaAcotadaTest {
    //static PilaAcotada pila;
    public PilaAcotadaTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        //pila=new PilaAcotada();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testVaciaInicial() {
        PilaAcotada pilaInicial=new PilaAcotada();
        assertEquals(true, pilaInicial.estaVacia());
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testEstaVaciaDespuesApilar(){
        PilaAcotada pila=new PilaAcotada();
        pila.apilar(1);
       assertEquals(false, pila.estaVacia());
    }
    @Test
    public void testEstaVacioDespuesDeApilarYDesapilar(){
        PilaAcotada pila=new PilaAcotada();
        pila.apilar(1);
        pila.desapilar();
        assertEquals(true,pila.estaVacia());
    }
   @Test
   public void testEstaLlenaPilaInicial(){
       PilaAcotada pila=new PilaAcotada();
       assertEquals(false, pila.estaLlena());
   }
    
}
