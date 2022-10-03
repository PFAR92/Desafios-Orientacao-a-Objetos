public class ControleRemoto implements Controlador{
    //atributos
    private int volume;
    private boolean ligado;
    private boolean desligado;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.desligado = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isDesligado() {
        return desligado;
    }

    public void setDesligado(boolean desligado) {
        this.desligado = desligado;
    }

    
    
}
