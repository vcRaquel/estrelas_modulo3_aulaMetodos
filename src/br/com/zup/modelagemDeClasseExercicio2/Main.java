package br.com.zup.modelagemDeClasseExercicio2;

public class Main {
    public static void main(String[] args) {
// Crie um programa principal e demonstre a utilização dos métodos implementados.
        ContaBancaria conta1 = new ContaBancaria(12345, 120.54, "Raquel");

        conta1.extrato();
        conta1.saque(100);
        conta1.extrato();
        conta1.deposito(1000);
        conta1.extrato();
    }
}
