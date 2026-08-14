package br.com.meusistema.main;
import br.com.meusistema.model.Carro;

public class Sistema{
    public static void main(String[] args){
        System.out.println("Iniciando o sistema...");

        Carro meuCarro = new Carro();
        meuCarro.setModelo("Civic");
        meuCarro.setCor("Prata");
        meuCarro.setVelocidade(-500);
        meuCarro.buzinar();

        Carro outroCarro = new Carro();
        outroCarro.setModelo("Gol");
        outroCarro.setCor("Preto");
        outroCarro.setVelocidade(200);
        outroCarro.buzinar();
    }
}