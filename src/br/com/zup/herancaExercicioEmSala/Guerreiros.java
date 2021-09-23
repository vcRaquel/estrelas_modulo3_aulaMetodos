package br.com.zup.herancaExercicioEmSala;

public class Guerreiros extends Heroi {
    private double poderAtaque;


    public Guerreiros(String nome, double vida, double poderAtaque) {
        super(nome, vida);
        this.poderAtaque = poderAtaque;

    }

    public double getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(double poderAtaque) {
        this.poderAtaque = poderAtaque;
    }

    public double aplicarDano() {
        return poderAtaque;
    }
}
