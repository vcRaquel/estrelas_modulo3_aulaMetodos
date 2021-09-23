package br.com.zup.herancaExercicioEmSala;

public class Magos extends Heroi {

    private double poderMagico;

    public Magos(String nome, double vida, double poderMagico) {
        super(nome, vida);
        this.poderMagico = poderMagico;
    }
    //Getters e Setters
    public double getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(double poderMagico) {
        this.poderMagico = poderMagico;
    }

    //Métodos
    public double aplicarMagia() {
        return poderMagico;
    }
}
