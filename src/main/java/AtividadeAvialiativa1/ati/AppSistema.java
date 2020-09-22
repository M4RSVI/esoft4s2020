package AtividadeAvialiativa1.ati;



public class AppSistema {
    
public static void main (final String[] args) {
    final Carros marcasCarros = new Carros("BMW");

    final Carros marcasCarrosMaringá = new Carros(null);
  
    final Object carrosComoObject = new Carros("Teste");
    System.out.println(marcasCarros.getNome());
    System.out.println(marcasCarrosMaringá.getNome());
    System.out.println(((Carros) carrosComoObject).getNome());

}
}

