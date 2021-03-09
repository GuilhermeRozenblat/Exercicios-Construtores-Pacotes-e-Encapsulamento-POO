/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guilherme
 */
public class Data {

    int dia;
    int mes;
    String mesEscrito;
    int ano;
    int opcao;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        opcao = 1;
    }

    public Data(String mesEscrito, int dia, int ano) {
        this.mesEscrito = mesEscrito;
        this.dia = dia;
        this.ano = ano;
        opcao = 2;
    }

    public Data(int dia, int ano) {
        this.dia = dia;
        this.ano = ano;
        opcao = 3;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public String getMesEscrito() {
        return mesEscrito;
    }

    public int getAno() {
        return ano;
    }
    
    public void imprimir(){
        if (opcao == 1){
            System.out.println(getDia() + "/" + getMes() + "/" + getAno());
        }
        if (opcao == 2){
            System.out.println(getMesEscrito() + " " + getDia() + ", " + getAno()); 
        }
        if (opcao == 3){
            System.out.println(getDia() + " " + getAno());
        }
    }

}
