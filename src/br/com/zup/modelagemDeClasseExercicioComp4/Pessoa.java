
//2. Métodos: Envelhecer, engordar, emagrecer, crescer. Obs: Por padrão,
//a cada ano que nossa pessoa envelhece, sendo a idade dela menor
//que 21 anos, ela deve crescer 0,5 cm.
package br.com.zup.modelagemDeClasseExercicioComp4;

//Classe Pessoa: Crie uma classe que modele uma pessoa:
//1. Atributos:
public class Pessoa {
    String nome;
    int idade;
    double peso;
    double altura;

    public Pessoa(){

    }
    public Pessoa(String nome, int idade, double peso, double altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    //2. Métodos:
    // Envelhecer
    public void envelhecer(int anos){
        idade += anos;

    }
    // engordar
    public void engordar(double kg){
        peso += kg;
    }
    // emagrecer
    public void emagrecer(double kg){
        peso -= kg;
    }
    // crescer. Obs: Por padrão, a cada ano que nossa pessoa envelhece,
    // sendo a idade dela menor que 21 anos, ela deve crescer 0,5 cm.
    public void crescer(){
        if (idade<21){
            altura = (idade * 0.5);
        }
    }
    public void mostraDados(){
        System.out.println("O nome da pessoa é: " + nome);
        System.out.println("A idade da pessoa é: " + idade);
        System.out.println("O peso da pessoa é: " + peso);
        System.out.println("A altura da pessoa é: " + altura);
    }

}
