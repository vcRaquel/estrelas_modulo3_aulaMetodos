package br.com.zup.modelagemDeClasseExercicio1;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Marquinhos", 1201.85, "Pixar", "vermelho", 200000.95);

        carro1.mostrarDados();
        System.out.println();

        carro1.darDesconto(0.2);
        carro1.pintar("verde");

        carro1.mostrarDados();
        System.out.println();


    }
}
