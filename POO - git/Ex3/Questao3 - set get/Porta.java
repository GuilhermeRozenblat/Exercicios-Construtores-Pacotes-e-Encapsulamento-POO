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
public class Porta {
    private String status;
    private String cor;
    private int altura;
    private int largura;

    void abrir(){
        status = "aberta";
    }
    
    void fechar(){
        status = "fechada";
    }
    
    void pintar(String x){
        cor = x ;  
    }
    
    void estaAberta(){
        System.out.println("A porta está " + status);
    }
    
    void corPorta(){
        System.out.println("A cor da porta é " + cor);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }
    
    
}
