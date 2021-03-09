/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3getset;

/**
 *
 * @author Guilherme
 */
public class Main {
    public static void main(String[] args){
        Porta porta = new Porta();
        
        porta.abrir();
        porta.fechar();
        
        porta.setCor("verde");
        porta.setCor("azul");
        
        porta.setAltura(2);
        porta.setLargura(1);
        
        porta.estaAberta();
        porta.corPorta();
    }
}
