package br.com.meusistema.main;
import br.com.meusistema.model.Carro;

public class Sistema{
    public static void main(String[] args){
        System.out.println("Iniciando o sistema...");

        Carro meuCarro = new Carro();
        meuCarro.modelo = "Civic";
        meuCarro.cor = "Prata";
        meuCarro.velocidade = -500;
        meuCarro.buzinar();

        Carro outroCarro = new Carro();
        outroCarro.modelo = "Gol";
        outroCarro.cor = "Preto";
        outroCarro.buzinar();
    }
}