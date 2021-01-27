/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp;

/**
 *
 * @author XDark
 */
public class Normal implements Modalidade{



    @Override
    public double mensalidade(double valorPago, String curso) {
        double valorDoCurso;
        if(curso.equals("ADS")){
            valorDoCurso = 600.0;
            if(valorDoCurso > valorPago){
                throw new IllegalArgumentException("Valor pago insuficiente");
            }
            return valorPago - valorDoCurso;
        }else if(curso.equals("Odonto")){
            valorDoCurso = 1000.0;
            if(valorDoCurso > valorPago){
                throw new IllegalArgumentException("Valor pago insuficiente");
            }
            return valorPago - valorDoCurso;
        }
        return 0;
    }


    
}
