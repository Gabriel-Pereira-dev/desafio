/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srp;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author XDark
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        boolean repetir = true;
        while(repetir == true)
        {
            marcarConsulta();
            System.out.println("Deseja marcar outra consulta?(S/N)");
            String resp = sc.next();
            if(resp.equals("N")){
                repetir = false;
            }

        }
        

        
        
        
        
        
        
        
    }
    public static void marcarConsulta(){
        Medico medico1 = new Medico("Lux","Odontologia");
        Medico medico2 = new Medico("Cladio","Dermatologia");
        Medico medico3 = new Medico("Taina","Cardiologia");
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Infomrme o nome do paciente a ser consultado:");
        Paciente paciente;
        paciente = new Paciente(sc.next());
        System.out.println("Infomre o médico que vai realizar a consulta:\n"
                + "Id - Nome - Especialidade\n"
                +"1 - "+medico1.getNome()+" - "+medico1.getEspecialidade()+"\n"
                +"2 - "+medico2.getNome()+" - "+medico2.getEspecialidade()+"\n"
                +"3 - "+medico3.getNome()+" - "+medico3.getEspecialidade()+"\n");
        int opcaoMedico = sc.nextInt();
        Medico medicoConsulta = null;
        switch(opcaoMedico){
            case 1:
                medicoConsulta = medico1;
                break;
            case 2:
                medicoConsulta = medico2;
                break;
            case 3:
                medicoConsulta = medico3;
                break;
                
        }
        System.out.println("Infomre dia para a realizacao da consulta:");
        int dia = sc.nextInt();
        System.out.println("Infomre mes para a realizacao da consulta:(1 - 12)");
        int mes = sc.nextInt();
        System.out.println("Infomre horario para a realizacao da consulta:\n"
                + "Id - Inicio - Fim\n"
                + "1 - 12:00 - 13:00\n"
                + "2 - 13:00 - 14:00\n"
                + "3 - 14:00 - 15:00\n"
                + "4 - 15:00 - 16:00\n"
                + "5 - 16:00 - 17:00\n");
        int opcaoHorario = sc.nextInt();
        Calendar horarioInicio = Calendar.getInstance();
        Calendar horarioFim = Calendar.getInstance();
                switch(opcaoHorario){
            case 1:
                horarioInicio.set(Calendar.DAY_OF_MONTH,dia);
                horarioInicio.set(Calendar.MONTH,mes);
                horarioInicio.set(Calendar.HOUR_OF_DAY,12);
     
                horarioFim.set(Calendar.DAY_OF_MONTH,dia);
                horarioFim.set(Calendar.MONTH,mes);
                horarioFim.set(Calendar.HOUR_OF_DAY,13);
                break;
            case 2:
                horarioInicio.set(Calendar.DAY_OF_MONTH,dia);
                horarioInicio.set(Calendar.MONTH,mes);
                horarioInicio.set(Calendar.HOUR_OF_DAY,13);
     
                horarioFim.set(Calendar.DAY_OF_MONTH,dia);
                horarioFim.set(Calendar.MONTH,mes);
                horarioFim.set(Calendar.HOUR_OF_DAY,14);
                break;
            case 3:
                horarioInicio.set(Calendar.DAY_OF_MONTH,dia);
                horarioInicio.set(Calendar.MONTH,mes);
                horarioInicio.set(Calendar.HOUR_OF_DAY,14);
     
                horarioFim.set(Calendar.DAY_OF_MONTH,dia);
                horarioFim.set(Calendar.MONTH,mes);
                horarioFim.set(Calendar.HOUR_OF_DAY,15);
                break;
            case 4:
                horarioInicio.set(Calendar.DAY_OF_MONTH,dia);
                horarioInicio.set(Calendar.MONTH,mes);
                horarioInicio.set(Calendar.HOUR_OF_DAY,15);
     
                horarioFim.set(Calendar.DAY_OF_MONTH,dia);
                horarioFim.set(Calendar.MONTH,mes);
                horarioFim.set(Calendar.HOUR_OF_DAY,16);
                break;
            case 5:
                horarioInicio.set(Calendar.DAY_OF_MONTH,dia);
                horarioInicio.set(Calendar.MONTH,mes);
                horarioInicio.set(Calendar.HOUR_OF_DAY,16);
     
                horarioFim.set(Calendar.DAY_OF_MONTH,dia);
                horarioFim.set(Calendar.MONTH,mes);
                horarioFim.set(Calendar.HOUR_OF_DAY,17);
                break;
                
        }
        AgendamentoConsulta consulta = new AgendamentoConsulta(paciente,medicoConsulta,horarioInicio,horarioFim);
        AgendamentoConsultaBD.agendar(consulta);
        System.out.println("Consulta marcada!");
    }
    
}
