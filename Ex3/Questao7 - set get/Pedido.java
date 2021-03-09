/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex7getset;

/**
 *
 * @author Guilherme
 */
public class Pedido {
    private Produto[] pedido = new Produto[50];
    private String pagamento;
    private int i = 0;
    private float precoTotal = 0;

    public float getPrecoTotal() {
        return precoTotal;
    }
    
    
    void pedirItem(String prod, int qtd, Estoque estoque){
        
        pedido[i] = new Produto();
        pedido[i].setNome(prod);
        pedido[i].setQtd(qtd);
        
        for(int j = 0; j < 5;j++){
            if(pedido[i].getNome().equals(estoque.produtos[j].getNome())){
                estoque.produtos[j].setQtd(estoque.produtos[j].getQtd() - qtd);
                this.precoTotal += estoque.produtos[j].getPreco() * qtd;
                        
            }
        }
        i++;
    }
}
