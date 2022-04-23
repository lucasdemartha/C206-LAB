public class Carro {

    String cor, marca, modelo;
    double velocidadeMax, velocidadeAtual;
    Motor motor;

    Carro() {
        motor = new Motor();
    }
    void ligar(){
        System.out.println("Carro " + modelo + " ligado");
    }

    void acelerar(){
        System.out.println(modelo +" Acelerando");
    }


    void mostraInfo(){
        System.out.println("Cor do carro: " + cor);
        System.out.println("Marca do carro: " + marca);
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Velocidade Maxima do carro: " + velocidadeMax + " Km/h");
        System.out.println("Velocidade Atual: " + velocidadeAtual + " Km/h");
        System.out.println("Potencia do motor: " + motor.potencia + " CV");
        System.out.println("Tipo do motor: " + motor.tipo);
    }

}
