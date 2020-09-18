package marcos_vinicius.aula20200820;

public class Carro {
    private double combustivelNoTanque = 40.0;
    private boolean ligado = false;

    public void ligar() {
        // System.out.println("ligando...");
        ligado = true;
    }

    public void desligar() {
        // System.out.println("desligando...");
        ligado = false;
    }

    public boolean estáLigado() {
        return ligado;
    }
    
}
