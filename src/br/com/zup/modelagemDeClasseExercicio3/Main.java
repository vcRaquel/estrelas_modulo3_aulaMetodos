package br.com.zup.modelagemDeClasseExercicio3;

public class Main {
    public static void main(String[] args) {
        Elevador edificio1 = new Elevador(2,12,6,3);
        edificio1.mostraDados();
        edificio1.entra(2);
        edificio1.mostraDados();
        edificio1.entra(4);

    }
}
