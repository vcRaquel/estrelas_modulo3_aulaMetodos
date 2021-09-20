



//- Sobe : para subir um andar (não deve subir se já estiver no último andar);
//- Desce : para descer um andar (não deve descer se já estiver no térreo);
package br.com.zup.modelagemDeClasseExercicio3;
//Crie uma classe denominada Elevador para armazenar as informações de um
//elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0),
//total de andares no prédio (desconsiderando o térreo), capacidade do elevador e
//quantas pessoas estão presentes nele.
public class Elevador {
    int andarAtual = 0;
    int totalAndares;
    int capacidadePessoas;
    int numeroPessoas;

    public Elevador(){

    }
    public Elevador(int andarAtual, int totalAndares, int capacidadePessoas, int numeroPessoas){
        this.andarAtual = andarAtual;
        this.totalAndares = totalAndares;
        this.capacidadePessoas = capacidadePessoas;
        this.numeroPessoas = numeroPessoas;
    }
    // A classe deve também disponibilizar os seguintes métodos:

    //- Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda
//houver espaço);
    public void entra(int pessoaEntra){
        if (capacidadePessoas > (numeroPessoas + pessoaEntra)){
            numeroPessoas += pessoaEntra;
        } else if (capacidadePessoas < (numeroPessoas + pessoaEntra)){
            System.out.println("Não é possível a entrada de " + pessoaEntra + " pessoa(s)");
            System.out.println("Já existem " + numeroPessoas + " pessoa(s) no elevador");
            System.out.println("O limite de capacidade é de " + capacidadePessoas + " pessoa(s)");
            System.out.println("------------------------------------------------------------------");
        }
    }
    //- Sai : para remover uma pessoa do elevador (só deve remover se houver alguém
//dentro dele);
    public void sai(int pessoaSai){
        if (numeroPessoas >0 ){
            if (numeroPessoas >= pessoaSai){
                numeroPessoas -= pessoaSai;
            }else {
                System.out.println("O número de pessoas informado " + "("+ pessoaSai + ")" + " é maior do que o número de pessoas no elevador");
            }
        }else{
            System.out.println("O elevador está vazio, não existem pessoas para sair");
        }
    }

    public void mostraDados(){
        System.out.println("O andar atual é: " + andarAtual);
        System.out.println ("O total de andares do prédio é: " + totalAndares);
        System.out.println ("A capacidade total é de " + capacidadePessoas + " pessoas");
        System.out.println ("O número atual de pessoas é de: " + numeroPessoas);
        System.out.println("--------------------------------------------------------------");
    }


}
