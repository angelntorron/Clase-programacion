/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import excepcionDePilaVacia.ExcepcionDePilaVacia;
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
    public void testEstaVacioDespuesDeApilarYDesapilar() throws ExcepcionDePilaVacia{
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
    @Test
    public void testTamañoPila(){
        PilaAcotada pila=new PilaAcotada();
        assertEquals(0, pila.ObtenerTamaño());
    }
    @Test
    public void testTamañoPilaVacia(){
        PilaAcotada pila=new PilaAcotada();
        assertEquals(0, pila.ObtenerTamaño());
    }
    public void testTamañoPilaConElementos(){
        PilaAcotada pila=new PilaAcotada();
        pila.apilar(1);
        pila.apilar(2);
        assertEquals(2, pila.ObtenerTamaño());
    }
    @Test
    public void testObtenerCimaPilaConElementos() throws ExcepcionDePilaVacia{
        PilaAcotada pila=new PilaAcotada();
        pila.apilar(1);
        pila.apilar(2);
        assertEquals(2, pila.cima());
    }
     @Test
    public void testObtenerCimaPilaConUnElementos() throws ExcepcionDePilaVacia{
        PilaAcotada pila=new PilaAcotada();
        pila.apilar(1);
        assertEquals(1, pila.cima());
    }
    @Test(expected=ExcepcionDePilaVacia.class)
    public void testDesapilarDeUnaPilaVacia() throws ExcepcionDePilaVacia{
        PilaAcotada pila=new PilaAcotada();
        pila.desapilar();
    }
    @Test(expected=ExcepcionDePilaVacia.class)
    public void testObtenerCimaDeUnaPilaVacia() throws ExcepcionDePilaVacia{
        PilaAcotada pila=new PilaAcotada();
        pila.cima();
    }
    
}
