package br.com.meusistema.model;

public class Carro{
    private String modelo;
    private String cor;
    private int velocidade;

    

    public void buzinar(){
        System.out.println("O " + modelo + " " + cor + " fez: BIII BIII!");
    }
}