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
public class Televisao {
    private String energia;
    private int volume;
    private int canal;
    
    void ligar(){
        energia = "Ligada";  
    }
    void desligar(){
        energia = "Desligada";
    }
    void canalEspecifico(int x){
        canal = x;
    }
    void canalAnterior(){
        canal--;
    }
    void canalPosterior(){
        canal++;
    }
    void Silenciar(){
        volume = 0;
    }
    void mudarVolume(int x){
        volume = x;
    }
    void estado(){
        System.out.println("Energia: " + getEnergia());
        System.out.println("Canal: " + getCanal());
        if (volume == 0){
            System.out.println("Volume: Modo Silencioso");
        }
        else{
            System.out.println("Volume: " + getVolume());
        }
        
    }

    public String getEnergia() {
        return energia;
    }

    public void setEnergia(String energia) {
        this.energia = energia;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }
    
}
