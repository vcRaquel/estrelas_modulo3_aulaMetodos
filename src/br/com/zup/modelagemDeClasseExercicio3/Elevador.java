





package br.com.zup.modelagemDeClasseExercicio3;
//Crie uma classe denominada Elevador para armazenar as informações de um
//elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0),
//total de andares no prédio (desconsiderando o térreo), capacidade do elevador e
//quantas pessoas estão presentes nele.
public class Elevador {
    private int andarAtual = 0;
    private int totalAndares;
    private int capacidadePessoas;
    private int numeroPessoas;

    public Elevador(){

    }
    public Elevador(int andarAtual, int totalAndares, int capacidadePessoas, int numeroPessoas){
        this.andarAtual = andarAtual;
        this.totalAndares = totalAndares;
        this.capacidadePessoas = capacidadePessoas;
        this.numeroPessoas = numeroPessoas;
    }
    public int getAndarAtual(){
        return andarAtual;
    }
    public int getTotalAndares(){
        return totalAndares;
    }
    public int getCapacidadePessoas(){
        return capacidadePessoas;
    }
    public int getNumeroPessoas(){
        return numeroPessoas;
    }

    public void setAndarAtual(){
        this.andarAtual = andarAtual;
    }
    public void setTotalAndares(){
        this.totalAndares = totalAndares;
    }
    public void setCapacidadePessoas(){
        this.capacidadePessoas = capacidadePessoas;
    }
    public void setNumeroPessoas(){
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
                System.out.println("-----------------------------------------------------------------------------------------------------------");
            }
        }else{
            System.out.println("O elevador está vazio, não existem pessoas para sair");
            System.out.println("-------------------------------------------------------");
        }
    }

    public void sobe(int andar){
        if (andar>totalAndares){
            System.out.println("Não é possível ir até o andar " + andar +" o edifício tem " + totalAndares + " andares");
        }else{
            andarAtual = andar;
        }
    }

    public void desce(int andar){
        if (andar < 0 || andarAtual == 0){
            System.out.println("Não é possível ir até o andar " + andar + " Ainda não construímos o tobogã pro inferno");
        }else{
            andarAtual = andar;
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
