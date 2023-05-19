package Televisao.Classes;

public class Televisao {
    private int volume,canal;

    public Televisao() {
        this.canal = 17;
        this.volume = 20;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public int getCanal() {
        return canal;
    }

}
