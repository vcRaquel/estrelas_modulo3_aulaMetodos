package br.com.zup.herancaExercicioEmSala;

public class Guerreiros extends Heroi{
    private double poderAtaque;
    private double aplicarDano;


    public Guerreiros(String nome, double vida, double poderAtaque, double aplicarDano) {
        super(nome, vida);
        this.poderAtaque = poderAtaque;
        this.aplicarDano = aplicarDano;
    }

    public double getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(double poderAtaque) {
        this.poderAtaque = poderAtaque;
    }

    public double getAplicarDano() {
        return aplicarDano;
    }

    public void setAplicarDano(double aplicarDano) {
        this.aplicarDano = aplicarDano;
    }

    private double aplicarDano(){}
}
