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
public class AgendamentoConsulta {

    private Paciente paciente;
    private Calendar inicio;
    private Calendar fim;
    private Medico medico;

    public AgendamentoConsulta(Paciente paciente,Medico medico, Calendar inicio, Calendar fim) {
        this.paciente = paciente;
        this.medico = medico;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Calendar getInicio() {
        return inicio;
    }

    public void setInicio(Calendar inicio) {
        this.inicio = inicio;
    }

    public Calendar getFim() {
        return fim;
    }

    public void setFim(Calendar fim) {
        this.fim = fim;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
}
