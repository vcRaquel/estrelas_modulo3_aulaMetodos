package br.com.zup.modelagemDeClasseExercicioComp2;
//Classe Quadrado: Crie uma classe que modele um quadrado:
//1. Atributos: Tamanho do lado
public class Quadrado {
    double tamanhoLado;

    public Quadrado(){

    }
    public Quadrado(double tamanhoLado){
        this.tamanhoLado = tamanhoLado;
    }

    //2. Métodos:
    // Mudar valor do Lado
    public void mudarValorDoLado(double valorLado){
        tamanhoLado = valorLado;
    }
    // Retornar valor do Lado
    public double retornarValorDoLado(){
        return tamanhoLado;
    }
    // calcular área;
    public void calculaAreaQuadrado(){
        double area = (tamanhoLado * tamanhoLado);
        System.out.println("O tamanho da área do quadrado é de: " + area);;
    }

    public void mostraDados(){
        System.out.println("O tamanho dos lados do quadrado é: " + tamanhoLado);

    }
}

