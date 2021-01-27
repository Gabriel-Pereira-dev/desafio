/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp;

/**
 *
 * @author XDark
 */
public class App {
    public static void main(String[] args) {
        Vaca vaca = new Vaca();
        Baleia baleia = new Baleia();
        System.out.println(vaca.andar()); 
        System.out.println(vaca.respirar());
        System.out.println(baleia.nadar());
        System.out.println(baleia.respirar());
    }
}
