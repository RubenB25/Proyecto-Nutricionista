/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Entidades.Dieta;
import java.util.Comparator;

/**
 *
 * @author Ruben
 */
public class Comparador implements Comparator<Dieta>{

    @Override
    public int compare(Dieta t, Dieta t1) {
        if(t.isEstado()&&!t1.isEstado()){
         return -1;   
        }else if(!t.isEstado()&&t1.isEstado()){
            return 1;
        }
        return 0;
    }   
    
}
