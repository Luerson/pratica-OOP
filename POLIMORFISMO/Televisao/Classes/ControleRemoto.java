package Televisao.Classes;

public class ControleRemoto {
    Televisao televisao = new Televisao();
    public void aumentarVolume() {
        televisao.setVolume(televisao.getVolume()+1);
    }

    public void diminuirVolume() {
        if(televisao.getVolume() > 0)
            televisao.setVolume(televisao.getVolume()-1);
        else
            System.out.println("O volume já está no mínimo possível.");
    }

    public void aumentarCanal() {
        televisao.setCanal(televisao.getCanal()+1);
    }

    public void diminuirCanal() {
        televisao.setCanal(televisao.getCanal()-1);
    }

    public void mudarCanal(int canal) {
        televisao.setCanal(canal);
    }

    public void mostraInfo() {
        System.out.printf("Informações sobre a TV:\nCanal: %d\nVolume: %d\n", televisao.getCanal(), televisao.getVolume());
    }
}
