/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip;

/**
 *
 * @author XDark
 */
public class App {
       public static void main(String[] args) {
           Empresa empresa = new Empresa();
           System.out.println("Saldo da Empresa: "+ empresa.getSaldo());
           Estagiario estagiario = new Estagiario();
           empresa.pagarFuncionario(estagiario);
           System.out.println("*Pagando estagiario*");
           System.out.println("Novo saldo da Empresa: "+empresa.getSaldo());
           System.out.println("Novo Saldo do Estagiario: "+estagiario.getSaldo());
           FuncionarioClt FuncClt = new FuncionarioClt();
           empresa.pagarFuncionario(FuncClt);
           System.out.println("*Pagando funcionario clt*");
           System.out.println("Novo saldo da Empresa: "+empresa.getSaldo());
           System.out.println("Novo Saldo do Funcionario Clt: "+FuncClt.getSaldo());
       }
}
