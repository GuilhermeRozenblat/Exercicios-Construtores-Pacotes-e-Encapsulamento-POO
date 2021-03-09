/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex4getset;

/**
 *
 * @author Guilherme
 */
public class Casa {
    private String cor;
    public Porta porta1 = new Porta();
    public Porta porta2 = new Porta();
    public Porta porta3 = new Porta();
    
    void PintarCasa(String x){
        cor = x;
        System.out.println("Cor da casa: "+ cor);
    }
    
    void quantasPortasEstaoAbertas(){
        int totalPortasAbertas = 0;
        if (porta1.status == 1){
            totalPortasAbertas++;
        }
        if (porta2.status == 1){
            totalPortasAbertas++;
        }
        if (porta3.status == 1){
            totalPortasAbertas++;
        }
        System.out.print("Total de portas abertas: " + totalPortasAbertas);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
}
