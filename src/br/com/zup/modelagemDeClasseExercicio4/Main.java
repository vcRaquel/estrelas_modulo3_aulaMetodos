



package br.com.zup.modelagemDeClasseExercicio4;

public class Main {
    public static void main(String[] args) {
        CartaoCredito cartao1 = new CartaoCredito(200,0,"Raquel");

        cartao1.aumentaLimite(20);
        cartao1.imprimeFatura();

        cartao1.diminuiLimite(70);
        cartao1.imprimeFatura();

        cartao1.realizaCompra(250);

        cartao1.realizaCompra(10);
        cartao1.imprimeFatura();
    }
}
