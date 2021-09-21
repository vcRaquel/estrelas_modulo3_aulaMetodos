//Classe Bola: Crie uma chamada Jabulani

package br.com.zup.modelagemDeClasseExercicioComp1;
//1. Atributos: Cor, circunferência, material
public class Bola {
    String cor;
    double circunferencia;
    String material;

    public Bola(){

    }
    public Bola(String cor, double circunferencia, String material){
        this.cor = cor;
        this.circunferencia = circunferencia;
        this.material = material;
    }
    //2. Métodos:
    // trocaCor
    public void trocaCor(String coloracao){
        cor = coloracao;
    }
    // e mostraCor
    public void mostraCor(){
        System.out.println("A cor da bola é: " + cor);
    }
}

