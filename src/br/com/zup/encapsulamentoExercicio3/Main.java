package br.com.zup.encapsulamentoExercicio3;

public class Main {
    public static void main(String[] args) {
        Data dataNascimento = new Data(06, "março", 1985);
        Pessoa pessoa1 = new Pessoa("Raquel", dataNascimento, 1.61);
        pessoa1.mostraDados();
        pessoa1.calculaIdade(2021);
        pessoa1.mostraDados();
        pessoa1.setAltura(1.7);
        dataNascimento.setDia(19);
        dataNascimento.setMes("abril");
        dataNascimento.setAno(1987);
        pessoa1.calculaIdade(2021);
        pessoa1.setNome("Maria");
        pessoa1.mostraDados();


    }
}
