package marcos_vinicius.aula20200820;

public class App {

    public static void main(String[] args) {
        for (int contador = 0; contador < 10; contador++) {
            if (contador == 5) {
                System.out.println("Opa, olha o cinco ai !");
                ;
            } else {
                System.out.println("Hello World !!");
            }
        }
            Carro fusca = new Carro();
            Carro fiat147= new Carro();
            fusca.ligar();
            fusca.desligar();
            fiat147.ligar();
            System.out.println(" O fiat 147 está ligado? " + fusca.estáLigado());
            System.out.println(" O fiat 147 está ligado? " + fiat147.estáLigado());
        

    }
}