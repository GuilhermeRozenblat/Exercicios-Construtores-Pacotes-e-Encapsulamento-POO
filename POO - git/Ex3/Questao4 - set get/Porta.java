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
public class Porta {
    int status;
    
    void abrir(){
        status = 1;
    }
    
    void fechar(){
        status = 0;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
     
}
