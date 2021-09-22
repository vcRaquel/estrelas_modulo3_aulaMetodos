package br.com.zup.encapsulamentoExercicio3;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Raquel", 1985,1.61);
        pessoa1.mostraDados();
        pessoa1.calculaIdade(2021);
        pessoa1.mostraDados();
        pessoa1.setAltura(1.7);
        pessoa1.setDataNascimento(1987);
        pessoa1.setNome("Maria");
        pessoa1.mostraDados();


    }
}
