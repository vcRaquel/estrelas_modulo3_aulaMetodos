package br.com.zup.encapsulamentoLevelUp;

public class ControleRemoto {
    Televisao tv;

    public ControleRemoto() {

    }

    public ControleRemoto(Televisao tv) {
        this.tv = tv;
    }

    //-  Aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
    public void mudaVolume(boolean aumentaOuDiminuiVolume) {
        if (aumentaOuDiminuiVolume) {
            int volume = tv.getVolume();
            int volumeAtualizado = volume + 1;
            tv.setVolume(volumeAtualizado);
        } else if (aumentaOuDiminuiVolume == false) {
            int volume = tv.getVolume();
            int volumeAtualizado = volume - 1;
            tv.setVolume(volumeAtualizado);
        }
    }

    //- Aumentar e diminuir o número do canal em uma unidade;
    public void mudaCanal(boolean aumentaOuDiminuiCanal) {
        if (aumentaOuDiminuiCanal) {
            int canal = tv.getCanal();
            int canalAtualizado = canal + 1;
            tv.setCanal(canalAtualizado);
        } else if (aumentaOuDiminuiCanal == false) {
            int canal = tv.getCanal();
            int canalAtualizado = canal - 1;
            tv.setCanal(canalAtualizado);
        }
    }

    //- Trocar para um canal indicado;
    public void substituiCanal(int canal) {
        tv.setCanal(canal);
    }

    //- Consultar o valor do volume de som e o canal selecionado;
    public void mostraDados() {
        System.out.println("O canal atual é: " + tv.getCanal());
        System.out.println("O volume atual é: " + tv.getVolume());
        System.out.println("--------------------------------------");
    }
}
