/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp;

import java.util.Scanner;

/**
 *
 * @author XDark
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o saldo da sua conta:");
        double saldo = sc.nextDouble();
        System.out.println("Informe o curso para pagar sua mensalidade(ADS ou Odonto):");
        String curso = sc.next();
        FolhaDePagamento f = new FolhaDePagamento();
        Aluno aluno = new Aluno(saldo,curso);
        System.out.println("Informe a modalidade(ProuniMeia ou Normal):");
        String modalidade = sc.next();
        if(modalidade.equals("ProuniMeia")){
            aluno.setSaldo(f.pagarMensalidade(new ProuniMeia(), aluno));
        }else{
          aluno.setSaldo(f.pagarMensalidade(new Normal(), aluno));  
        }
        

        System.out.println("Novo saldo: "+aluno.getSaldo());
    }
}
