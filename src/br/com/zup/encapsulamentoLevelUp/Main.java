package br.com.zup.encapsulamentoLevelUp;

public class Main {
    public static void main(String[] args) {
        Televisao televisao1 = new Televisao(2,4);
        ControleRemoto controleRemoto1 = new ControleRemoto(televisao1);
        controleRemoto1.mudaVolume(false);
        controleRemoto1.mudaCanal(false);
        controleRemoto1.mostraDados();
    }
}
