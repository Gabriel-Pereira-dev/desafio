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
public class Empresa {
    private double saldo;
    public Empresa(){
        this.saldo = 5000.0;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void pagarFuncionario(Pagamento funcionario){
        funcionario.setSaldo(funcionario.getSaldo() +funcionario.remuneracao());
        this.setSaldo(this.getSaldo() - funcionario.remuneracao());
    }
}
