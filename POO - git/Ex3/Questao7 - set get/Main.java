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
public class Main {
    public static void main(String[] args){
        
        Estoque mercado = new Estoque();
        mercado.adicionarEstoque("arroz", 4, 3);
        mercado.adicionarEstoque("feijao", 2, 8);
        mercado.adicionarEstoque("batata", 1, 3);
        mercado.adicionarEstoque("carne", 5, 7);
        mercado.adicionarEstoque("agua", 2, 9);
        
        Pedido pedido = new Pedido();
        pedido.pedirItem("carne", 1, mercado);
        pedido.pedirItem("arroz", 2, mercado);
        pedido.pedirItem("batata", 1, mercado);
 
        System.out.println("Preço Total: " + pedido.getPrecoTotal());
    }
}
