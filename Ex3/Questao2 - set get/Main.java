/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2getset;

/**
 *
 * @author Guilherme
 */
public class Main {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Guilherme",20);
   
        pessoa.aniversario();
        pessoa.aniversario();
        pessoa.aniversario();
        
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
