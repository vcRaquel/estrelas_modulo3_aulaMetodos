package br.com.zup.herancaExercicioEmSala;

public class Inimigos {
    private String nome;
    private  double vida;

    public Inimigos() {

    }
    public Inimigos(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

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

    public void trocarNome(String nome){}
    public void receberDano(double dano){}
    public double exibirVida(){}
}
