//Crie uma classe que represente um carro, que tenha como características o
//nome, o peso, a fabricante, a cor e o valor do carro.
// Crie também o método darDesconto() que servirá para diminuir o preço do carro
// e o método pintar(), que será responsável por mudar a cor do carro.
// Crie um carro no seu programa principal, utilize os métodos criados
// e mostre na tela o preço e a cor do carro antes e depois da utilização dos métodos.

package br.com.zup.modelagemDeClasseExercicio1;

public class Carro {
    String nome;
    double peso;
    String fabricante;
    String cor;
    double valor;

    public Carro(){

    }

    public Carro(String nome, double peso, String fabricante, String cor, double valor) {
        this.nome = nome;
        this.peso = peso;
        this.fabricante = fabricante;
        this.cor = cor;
        this.valor = valor;
    }

    public double darDesconto(double desconto) {
        double descontoASerAplicado = valor * desconto;
        valor = valor - descontoASerAplicado;
        return valor;
    }


    public void pintar(String cor) {
        this.cor = cor;
        mostrarDados();
    }

    public void mostrarDados() {
        System.out.println("Nome do Carro: " + nome);
        System.out.println("Peso do Carro: " + peso);
        System.out.println("Fabricante do Carro: " + fabricante);
        System.out.println("Cor do Carro: : " + cor);
        System.out.println("Valor do Carro: " + valor);
    }


}
