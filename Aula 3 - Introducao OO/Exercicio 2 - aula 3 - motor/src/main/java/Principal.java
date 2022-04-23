public class Principal {
    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.cor = "Cinza";
        carro.marca = "Fiat";
        carro.modelo = "Uno";
        carro.velocidadeAtual = 52;
        carro.velocidadeMax = 140;
        carro.motor.potencia = 100;
        carro.motor.tipo = "1.O";

        Carro carro2 = new Carro();

        carro2.cor = "Vermelho";
        carro2.marca = "Jeep";
        carro2.modelo = "Renegade";
        carro2.velocidadeAtual = 80;
        carro2.velocidadeMax = 180;
        carro2.motor.potencia = 200;
        carro2.motor.tipo = "1.8";

        carro.mostraInfo();
        System.out.println("-----------------------");
        carro2.mostraInfo();
        System.out.println("-----------------------");

        System.out.println("Ações:");
        carro.ligar();
        carro.acelerar();
        carro2.ligar();
        carro2.acelerar();

    }
}
