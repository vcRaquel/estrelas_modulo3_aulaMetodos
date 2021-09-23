package br.com.zup.herancaExercicioEmSala;

public class Magos extends Heroi{

    private double poderMagico;
    private double aplicarMagia;


    public Magos(String nome, double vida, double poderMagico, double aplicarMagia) {
        super(nome, vida);
        this.poderMagico = poderMagico;
        this.aplicarMagia = aplicarMagia;
    }

    public double getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(double poderMagico) {
        this.poderMagico = poderMagico;
    }

    public double getAplicarMagia() {
        return aplicarMagia;
    }

    public void setAplicarMagia(double aplicarMagia) {
        this.aplicarMagia = aplicarMagia;
    }

    private double aplicarMagia(){}
}
