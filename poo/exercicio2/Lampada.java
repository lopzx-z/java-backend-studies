package poo.exercicio2;

public class Lampada {
    public boolean ligada;

    public Lampada(boolean ligada) {
        this.ligada = ligada;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public String mostrarEstado() {
        if (ligada) {
            return "Lâmpada ligada";
        } else {
            return "Lâmpada desligada";
        }
    }
}
