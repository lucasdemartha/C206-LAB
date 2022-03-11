public class Time {

    String nome, corCamisa;
    Jogador[] jogadores = new Jogador[20];
    Estadio estadio = new Estadio();
    double auxSalario = 0;



    void mostraInfo(){
        System.out.println("Time de futebol " + this.nome + " MG");
        System.out.println("Cor da camisa: " + this.corCamisa);
        estadio.mostraInfo();
        for (int i = 0; i < this.jogadores.length; i++){
            if(jogadores[i] != null){
                System.out.println("----------------------");
                System.out.println("Informações do jogador " + (i + 1));
                jogadores[i].mostraInfo();
            }
        }
    }

    void adicionaJogador(Jogador jogador){
            for (int i = 0; i < jogadores.length; i++){
                if(jogadores[i] == null){
                    jogadores[i] = jogador;
                    break;
                }
            }
    }

    double calculaTotalSalario(){
        for (int i = 0; i < this.jogadores.length; i++){
            if(jogadores[i] != null){
               auxSalario += jogadores[i].salario;
            }
        }
        return auxSalario;
    }

    void mostraJogadoresBase(){
        for (int i = 0; i < this.jogadores.length; i++){
            if(jogadores[i] != null){
                if (jogadores[i].base == true){
                    jogadores[i].mostraInfo();
                    System.out.println("----------------------------------");
                }
            }
         }
    }
}
