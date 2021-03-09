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
public class Estoque {
    Produto[] produtos = new Produto[5];
    private int qtd;
    private float preco;
    private int i = 0;
    
    void adicionarEstoque(String nome, int qtd, float preco){
        
        produtos[i] = new Produto();
        produtos[i].setNome(nome);
        produtos[i].setQtd(qtd);
        produtos[i].setPreco(preco);
        i++;
    }

    public Produto[] getProdutos() {
        return produtos;
    }


    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    
    
}
