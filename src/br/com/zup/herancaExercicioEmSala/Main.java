package br.com.zup.herancaExercicioEmSala;

public class Main {
    public static void main(String[] args) {
        Guerreiros guerreiro1 = new Guerreiros("Passo Largo",200,75);
        Rasteiros rasteiro1 = new Rasteiros("Lingua de Cobra", 100, 30);
        //testando dano do rasteiro
        guerreiro1.receberDano(rasteiro1.aplicarDano());
        System.out.println(guerreiro1.exibirVida());

        //testando método trocar nome
        guerreiro1.trocarNome( "Aragorn");
        System.out.println(guerreiro1.getNome());

        //testando dano do guerreiro
        rasteiro1.receberDano(guerreiro1.aplicarDano());
        System.out.println(rasteiro1.exibirVida());

        Magos mago1 = new Magos("Radagast", 100, 50);
        Voadores voador1 = new Voadores("Nazgul Alado", 300, 80);

    }
}
