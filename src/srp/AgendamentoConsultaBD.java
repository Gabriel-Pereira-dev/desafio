/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srp;

import java.util.Calendar;

/**
 *
 * @author XDark
 */
public class AgendamentoConsultaBD {
    private static Paciente[] pacientes;
    private static Medico[] medicos;
    private static Calendar[] horarioInicio;
    private static Calendar[] horarioFim;
    private static int indice;
    
    public static void agendar(AgendamentoConsulta consulta){
        if(indice == 0){
            pacientes = new Paciente [100];
            medicos = new Medico [100];
            horarioInicio = new Calendar [100];
            horarioFim = new Calendar [100];

        }
           
            pacientes[indice] = consulta.getPaciente();
            medicos[indice] = consulta.getMedico();
            horarioInicio[indice] = consulta.getInicio();
            horarioFim[indice] = consulta.getFim();
            indice++;
        }
  
    
}
