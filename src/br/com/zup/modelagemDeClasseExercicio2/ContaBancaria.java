
package br.com.zup.modelagemDeClasseExercicio2;
//Crie uma classe referente à uma conta bancária, que possui como atributos
// o seu número, saldo e o nome do correntista.
public class ContaBancaria {
    private int numeroDaConta;
    private double saldo;
    private String nomeCorrentista;

    public ContaBancaria(){

    }

    public ContaBancaria(int numeroDaConta, double saldo, String nomeCorrentista){
        this.nomeCorrentista = nomeCorrentista;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

//    public int getNumeroDaConta(){
//        return numeroDaConta;
//    }
//    public double getSaldo(){
//        return saldo;
//    }
//    public String getNomeCorrentista(){
//        return nomeCorrentista;
//    }
//
//    public void setNumeroDaConta(int numeroDaConta){
//        this.numeroDaConta = numeroDaConta;
//    }
//    public void setSaldo(double saldo){
//        this.saldo = saldo;
//    }
//    public void setNomeCorrentista(String nomeCorrentista){
//        this.nomeCorrentista = nomeCorrentista;
//    }

    // Crie também o método saque() que serve para retirar o certo valor do saldo,
    public void saque(double valorSaque){
        saldo -= valorSaque;
    }
    // o método depósito() que serve para adicionar um valor ao saldo
    public void deposito(double valorDeposito){
        saldo += valorDeposito;
    }
    // e o método extrato() que serve para mostrar na tela
    // o nome do correntista, o número da conta e o saldo.
    public void extrato(){
        System.out.println("Nome do Titular: " +nomeCorrentista);
        System.out.println("Numero de Conta: " + numeroDaConta);
        System.out.println("Saldo: R$ "+saldo);
        System.out.println("----------------------------------------------------------");
    }
}
