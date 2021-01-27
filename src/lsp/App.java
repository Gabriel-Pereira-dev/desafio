/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lsp;

import java.util.Scanner;

/**
 *
 * @author XDark
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um Instrumento para tocar:\n"
                + "1 - Instrumento Comum\n"
                + "2 - Violao\n"
                + "3 - Flauta");
        int opcao = sc.nextInt();
        switch(opcao){
            case 1:
                tocar(new Instrumento());
                break;
            case 2:
                tocar(new Violao());
                break;
            case 3:
                tocar(new Flauta());
                break;
        }
    }
    public static void tocar(Instrumento i){
        i.getSom();
    }
}
