package br.com.zup.modelagemDeClasseExercicio4;
//Crie uma classe que represente um cartão de crédito, que deve ter como
//atributos o seu limite, o saldo da fatura e nome do cliente.
public class CartaoCredito {
    double limite;
    double saldoFatura;
    String nomeCliente;

    public CartaoCredito(){

    }

    public CartaoCredito(double limite, double saldoFatura, String nomeCliente){
        this.limite = limite;
        this.saldoFatura = saldoFatura;
        this.nomeCliente = nomeCliente;
    }
    // Crie também os métodos
    // aumentaLimite()
    public void aumentaLimite(double valor){
        limite += valor;
    }
    // diminuiLimite()
    public void diminuiLimite(double valor){
        limite -= valor;
    }
    // realizaCompra() que não deve permitir uma compra caso o limite tenha sido atingido
    public void realizaCompra(double compra){
        if (compra <= limite){
            saldoFatura += compra;
            limite = limite - compra;  //ver como usar o método diminuiLimite pra isso
        }else {
            System.out.println("Esse valor excede o limite");
            System.out.println("------------------------------");
        }
    }
    // e o imprimeFatura() que imprime na tela o valor da fatura.
    public void imprimeFatura(){
        System.out.println("Titular do Cartão: " + nomeCliente);
        System.out.println("Limite disponível: " + limite);
        System.out.println("Saldo da Fatura: " + saldoFatura);
        System.out.println("-------------------------------------");
    }

}
