public class Carta {

    String nome, tipo;
    double poder;

    Arma arma = new Arma();

    void mostraInfo(){
        System.out.println("----------------------");
        System.out.println("Nome da carta: " + this.nome);
        System.out.println("Tipo da carta: " + this.tipo);
        System.out.println("Poder da carta: " + this.poder);
        System.out.println("Arma: " + this.arma.tipo);
    }

}
