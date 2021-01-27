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
public class FolhaDePagamento {
    protected double saldoRestante;
    public double pagarMensalidade(Modalidade modalidade,Aluno aluno){
        return this.saldoRestante = modalidade.mensalidade(aluno.getSaldo(), aluno.getCurso());
    }
}
