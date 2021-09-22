
package br.com.zup.encapsulamentoExercicio3;
//Crie uma classe para representar uma pessoa, com os atributos privados de
// nome, data de nascimento e altura.
public class Pessoa {
    private String nome;
    private Data dataNascimento;
    int idade;
    private double altura;

    public Pessoa(){

    }
    public Pessoa(String nome, Data dataNascimento, double altura){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }
    // Crie os métodos públicos necessários para sets e gets e
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public Data getDataNascimento(){
        return dataNascimento;
    }
    public void setDataNascimento(Data dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    // também um método para imprimir todos dados de uma pessoa.
    public void mostraDados(){
        System.out.println("O nome da pessoa é: " + nome);
        System.out.println("A data de nascimento da pessoa é: " + dataNascimento.getDia() + " de " + dataNascimento.getMes() + " de " + dataNascimento.getAno());
        System.out.println("A idade da pessoa é: " + idade);
        System.out.println("A altura da pessoa é: " + altura);
    }
    // Crie um método para calcular a idade da pessoa.
    public void calculaIdade(int anoAtual){
        idade = anoAtual - (dataNascimento.getAno());
    }

}
