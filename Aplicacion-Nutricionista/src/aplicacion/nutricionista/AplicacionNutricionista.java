/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.nutricionista;

import AccesoDatos.PacienteData;
import Entidades.Paciente;

/**
 *
 * @author Ruben
 */
public class AplicacionNutricionista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Paciente paciente1 = new Paciente("Pepito", "De la Vega", 123456789, "CALLE 3", 29646464, 1,true);
           
           PacienteData pd = new PacienteData();
//             Paciente agregado
           pd.guardarPaciente(paciente1);
           
//              Paciente Modificado
           paciente1.setApellido("Benega");
           
           pd.modificarPaciente(paciente1);
            

//              Dar de baja a paciente
            paciente1.setEstado(false);
            
            pd.eliminarPaciente(1);
    }
    
}
