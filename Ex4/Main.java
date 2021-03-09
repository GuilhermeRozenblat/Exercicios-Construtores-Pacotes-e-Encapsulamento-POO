/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guilherme
 */
public class Main {
    public static void main(String[] args){
        Data data1 = new Data(12,12,2021);
        Data data2 = new Data(30,3,1950);
        
        Data data3 = new Data("Dezembro",12,2021);
        Data data4 = new Data("Agosto",15,2006);
        
        Data data5 = new Data(365, 2021);
        Data data6 = new Data(100, 2003);
        
        data1.imprimir();
        data2.imprimir();
        data3.imprimir();
        data4.imprimir();
        data5.imprimir();
        data6.imprimir();
        
        
    }
}
