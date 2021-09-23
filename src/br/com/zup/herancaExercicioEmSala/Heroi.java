package br.com.zup.herancaExercicioEmSala;

public class Heroi {
    private String nome;
    private double vida;

    public Heroi() {

    }

    public Heroi(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }
    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    // Métodos
    public void trocarNome(String nome) {
        this.nome = nome;
    }
    public void receberDano(double dano) {
        this.vida = this.vida - dano;
    }
    public double exibirVida() {
        return this.vida;
    }
}
