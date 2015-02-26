
package pilas;

import excepcionDePilaVacia.ExcepcionDePilaVacia;
/**
 *
 * @author Caco
 */

/**
 * 1.Creo test
 * 2.Veo fallar el test
 * 3.Codifico lo mínimo para hacer funcionar el test
 * 4.Creo otro test
 * 5.Ejecuto el test
 * 6.Abstraigo para poder pasar los dos test
 * 
 */

public class PilaAcotada {
    protected int tamMax=100, tam=0;
    protected Object[] array=new Object[tamMax];
    
    public boolean estaVacia(){
        return tam==0;
    }
    public void apilar(Object objeto){
        array[tam]=objeto;
        tam++;
        
    }
    public void desapilar() throws ExcepcionDePilaVacia{
        if(tam==0){
            throw new ExcepcionDePilaVacia("Esta intentando desapilar una pila vacia");
        }
        tam--;
    }
    public boolean estaLlena(){
        return tam==tamMax;
    }
    public int ObtenerTamaño(){
        return tam;
    }
    public Object cima(){
       
        return array[tam-1];
    }
}
