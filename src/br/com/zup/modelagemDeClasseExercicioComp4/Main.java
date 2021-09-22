package br.com.zup.modelagemDeClasseExercicioComp4;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Guilherme",9,25,0.95);
        pessoa1.mostraDados();
        pessoa1.emagrecer(2);
        pessoa1.mostraDados();
        pessoa1.envelhecer(3);
        pessoa1.mostraDados();
        pessoa1.engordar(5);
        pessoa1.mostraDados();
    }
}
