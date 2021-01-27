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
public class Aluno {
    private double saldo;
    private String Curso;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public Aluno(double saldo, String Curso) {
        this.saldo = saldo;
        this.Curso = Curso;
    }
}
