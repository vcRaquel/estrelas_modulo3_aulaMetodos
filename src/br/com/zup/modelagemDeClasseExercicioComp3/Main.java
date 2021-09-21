
package br.com.zup.modelagemDeClasseExercicioComp3;

public class Main {
    public static void main(String[] args) {
        Retangulo moldura = new Retangulo(4,3);
        moldura.mostraDados();
        moldura.calcularArea();
        moldura.calcularPerimetro();
        moldura.mudarValorDosLados(4,2);
        moldura.mostraDados();
        moldura.calcularArea();
        moldura.calcularPerimetro();


    }
}
