package marcos_aula20200825;

public class Carro {
    private boolean ligado = false; 
    private double volumeDeCombustivelEmLitros = 0.00;
	public void abastecer(double volumeAbastecidoEmLitros) {
        volumeDeCombustivelEmLitros += volumeAbastecidoEmLitros;
	}
	public void ligar() {
        volumeDeCombustivelEmLitros -= 0.05;
        ligado = true;
    }
	public boolean isLigado() {
		return ligado;
	}
	public double getVolumeDeCombustívelNoTanqueEmLitros() {
		return volumeDeCombustivelEmLitros;
	}
    
}

