/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import excepcionDePilaVacia.ExcepcionDePilaLlena;
import excepcionDePilaVacia.ExcepcionDePilaVacia;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public void testEstaVaciaDespuesApilar() throws ExcepcionDePilaLlena{
        PilaAcotada pila=new PilaAcotada();
        pila.apilar(1);
       assertEquals(false, pila.estaVacia());
    }
    @Test
    public void testEstaVacioDespuesDeApilarYDesapilar() throws ExcepcionDePilaVacia, ExcepcionDePilaLlena{
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
   public void testEstaLlenaPilaQueHeLlenado(){
       PilaAcotada pila=new PilaAcotada();
       for(int i=1;i<=100;i++){
           try {
               pila.apilar(i);
           } catch (ExcepcionDePilaLlena ex) {
               Logger.getLogger(PilaAcotadaTest.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       }
       assertEquals(true, pila.estaLlena());
   }
     @Test
   public void testEstaLlenaPilaCasiLlena(){
       PilaAcotada pila=new PilaAcotada();
       for(int i=1;i<=99;i++){
           try {
               pila.apilar(i);
           } catch (ExcepcionDePilaLlena ex) {
               Logger.getLogger(PilaAcotadaTest.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       }
       assertEquals(false, pila.estaLlena());
   }
   
   @Test
   public void testEstaLlenaPilaQueSeHaVaciadoUnPoco(){
        try {
            PilaAcotada pila=new PilaAcotada();
            for(int i=1;i<=100;i++){
                try {
                    pila.apilar(i);
                } catch (ExcepcionDePilaLlena ex) {
                    Logger.getLogger(PilaAcotadaTest.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            pila.desapilar();
            assertEquals(false, pila.estaLlena());
        } catch (ExcepcionDePilaVacia ex) {
            Logger.getLogger(PilaAcotadaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   @Test
   public void testEstaVaciaPilaQueHeLlenadoUnPoco(){
       PilaAcotada pila=new PilaAcotada();
       for(int i=1;i<=100;i++){
           try {
               pila.apilar(i);
           } catch (ExcepcionDePilaLlena ex) {
               Logger.getLogger(PilaAcotadaTest.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       assertEquals(false, pila.estaVacia());
   }
   
   @Test
   public void testTamañoPilaLlena(){
       try{
       PilaAcotada pila=new PilaAcotada();
       for(int i=1;i<=100;i++){
               pila.apilar(i);
           } 
           assertEquals(100, pila.ObtenerTamaño());
       }
       catch (ExcepcionDePilaLlena ex) {
               Logger.getLogger(PilaAcotadaTest.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       }
       @Test
   public void testTamañoPilaQueLlenoYLeDesapiloUno(){
        PilaAcotada pila=new PilaAcotada();
       try{
        for(int i=1;i<=100;i++){
               pila.apilar(i);
           } 
            try {
                pila.desapilar();
            } catch (ExcepcionDePilaVacia ex) {
                Logger.getLogger(PilaAcotadaTest.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
        catch (ExcepcionDePilaLlena ex) {
               Logger.getLogger(PilaAcotadaTest.class.getName()).log(Level.SEVERE, null, ex);
           }
           assertEquals(99, pila.ObtenerTamaño());
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
    
    public void testTamañoPilaConElementos() throws ExcepcionDePilaLlena{
        PilaAcotada pila=new PilaAcotada();
        pila.apilar(1);
        pila.apilar(2);
        assertEquals(2, pila.ObtenerTamaño());
    }
    @Test
    public void testObtenerCimaPilaConElementos() throws ExcepcionDePilaVacia, ExcepcionDePilaLlena{
        PilaAcotada pila=new PilaAcotada();
        pila.apilar(1);
        pila.apilar(2);
        assertEquals(2, pila.cima());
    }
     @Test
    public void testObtenerCimaPilaConUnElementos() throws ExcepcionDePilaVacia, ExcepcionDePilaLlena{
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
    @Test(expected=ExcepcionDePilaLlena.class)
    public void testApilarEnUnaPilaLlena() throws ExcepcionDePilaLlena{
        PilaAcotada pila=new PilaAcotada();
        for(int i=1;i<=101;i++){
            pila.apilar(i);
        }
    }
    
    @Test
    public void testApilarDesapilarDejaLaPilaIgual(){
        try {
            PilaAcotada pila=new PilaAcotada();
            pila.apilar(1);
            int cimaA=(Integer) pila.cima();
            pila.apilar(2);
            pila.desapilar();
            boolean iguales=cimaA== (Integer) pila.cima();
            assertEquals(true,iguales);
        } catch (ExcepcionDePilaLlena ex) {
            Logger.getLogger(PilaAcotadaTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExcepcionDePilaVacia ex) {
            Logger.getLogger(PilaAcotadaTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
