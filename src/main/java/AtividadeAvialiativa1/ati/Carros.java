package AtividadeAvialiativa1.ati;

public class Carros {
    
//atribudo encapsulado 
    private String nome;


    //construtor alternativo.
    public Carros(String nome) {
        this.nome = nome;
	}


	public String getNome(){
        return nome;
    }

    public void setNome (String nome){
        this.nome = nome;
    }
    
    @Override
    public String toString(){
        return "Carro com nome [" + nome + "]";
    }
}
