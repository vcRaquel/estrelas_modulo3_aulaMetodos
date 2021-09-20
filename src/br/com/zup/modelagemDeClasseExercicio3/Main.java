package br.com.zup.modelagemDeClasseExercicio3;

public class Main {
    public static void main(String[] args) {
        //criando objeto
        Elevador edificio1 = new Elevador(2,12,6,3);

        //testando método entra
        edificio1.mostraDados();
        edificio1.entra(2);
        edificio1.mostraDados();
        edificio1.entra(4);

        //testando método sai
        edificio1.sai(4);
        edificio1.mostraDados();
        edificio1.sai(2);

        //testando método sobe
        edificio1.sobe(5);
        edificio1.mostraDados();

        edificio1.sobe(10);

        //testando método desce
        edificio1.desce(3);
        edificio1.mostraDados();

        edificio1.desce(5);

    }
}
