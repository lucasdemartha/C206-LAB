public class Deck {

    String dono;
    Carta[] cartas = new Carta[30];
    int contCart = 0;

    void mostraInfo(){
        System.out.println("-------------------------");
        System.out.println("Cartas do Deck de " + dono);
        System.out.println("-------------------------");
        for (int i = 0; i < this.cartas.length; i++){
            if(cartas[i] != null){
                System.out.println("Informações da carta " + (i + 1));
                cartas[i].mostraInfo();
            }
        }
    }

    void addCarta(Carta carta){
        for (int i = 0; i < cartas.length; i++){
            if(cartas[i] == null){
                cartas[i] = carta;
                contCart++;
            }
        }

    }

    String maiorQuantidade(){
        int soldadoQtd = 0;
        int arqueiroQtd = 0;
        int pesadoQtd = 0;

        String maiorQtdTipo = " ";

        for (int i = 0; i < cartas.length; i++){
            if(cartas[i] == null) {
                    if(cartas[i].tipo.equals("soldado")){
                        soldadoQtd++;
                    }
                    else if (cartas[i].tipo.equals("arqueiro")){
                        arqueiroQtd++;
                    }
                    else if (cartas[i].tipo.equals("pesado")){
                        pesadoQtd++;
                    }
                }
            }

        if(soldadoQtd > arqueiroQtd && soldadoQtd > pesadoQtd )
            maiorQtdTipo = "Soldado";

        if(arqueiroQtd > soldadoQtd &&  arqueiroQtd > pesadoQtd)
            maiorQtdTipo = "Arqueiro";

        if(pesadoQtd > arqueiroQtd && pesadoQtd > soldadoQtd)
            maiorQtdTipo = "Pesado";

        return maiorQtdTipo;
    }

   void mediaTipos() {

       double soldadoPoder = 0;
       double arqueiroPoder = 0;
       double pesadoPoder = 0;
       double totalPoder = 0;

       for (int i = 0; i < this.cartas.length; i++) {
           if (cartas[i] != null) {
               if(cartas[i].tipo.equals("soldado")) {
                   soldadoPoder = soldadoPoder + cartas[i].poder;
                   totalPoder = totalPoder + cartas[i].poder;
               }
               else if (cartas[i].tipo.equals("arqueiro")) {
                   arqueiroPoder = soldadoPoder + cartas[i].poder;
                   totalPoder = totalPoder + cartas[i].poder;
               }
               else if (cartas[i].tipo.equals("pesado")) {
                   pesadoPoder = soldadoPoder + cartas[i].poder;
                   totalPoder = totalPoder + cartas[i].poder;
               }

           }

       }

       double mediaSoldado = (soldadoPoder/totalPoder);
       double mediaArqueiro = (arqueiroPoder/totalPoder);
       double mediaPesado = (pesadoPoder/totalPoder);

       System.out.println("Média aritmética de poder de cada tipo: ");

       System.out.println("Soldado: " + mediaSoldado);
       System.out.println("Arqueiro: " + mediaArqueiro);
       System.out.println("Pesado: " + mediaPesado);


   }

}
