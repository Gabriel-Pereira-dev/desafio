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
public class FuncionarioClt implements Pagamento{
    private double saldo;
    @Override
    public double getSaldo() {
        return saldo;
    }
    @Override
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    @Override
    public double remuneracao() {
        return 1100.0;
    }
    
}
