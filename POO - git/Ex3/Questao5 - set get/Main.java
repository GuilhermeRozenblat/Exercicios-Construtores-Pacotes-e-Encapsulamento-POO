/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex5getset;

/**
 *
 * @author Guilherme
 */
public class Main {
    public static void main(String[] args){
        Televisao televisao = new Televisao();
        
        televisao.desligar();
        televisao.ligar();
        
        televisao.canalEspecifico(35);
        televisao.canalAnterior();
        televisao.canalAnterior();
        televisao.canalAnterior();
        televisao.canalPosterior();
        
        televisao.mudarVolume(8);
        televisao.Silenciar();
        
        televisao.estado();
        
    }
}
