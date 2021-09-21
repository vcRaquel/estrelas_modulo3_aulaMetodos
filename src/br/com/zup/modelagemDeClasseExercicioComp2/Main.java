
package br.com.zup.modelagemDeClasseExercicioComp2;

public class Main {
    public static void main(String[] args) {
        Quadrado bobEsponja = new Quadrado(2);
        bobEsponja.mostraDados();
        bobEsponja.calculaAreaQuadrado();
        bobEsponja.mudarValorDoLado(3);
        bobEsponja.mostraDados();
        bobEsponja.calculaAreaQuadrado();
    }
}
