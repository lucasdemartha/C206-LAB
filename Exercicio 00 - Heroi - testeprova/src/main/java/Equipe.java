public class Equipe {

    String capitao;
    Heroi[] herois = new Heroi[30];
    double maisForte = 0;
    String nomeMaisForte;
    double qtdVoadores = 0;
    double qtdHerois = 0;

    void adicionarHeroi(Heroi heroi){
        for (int i = 0; i < this.herois.length; i++) {
            if(herois[i] == null){
                herois[i] = heroi;
                qtdHerois++;
                break;
            }

        }
    }

    void mostraInfo(){
        System.out.println("Capitao da Equipe: " + capitao);
        System.out.println("-----------------------------------");
        System.out.println("Herois da Equipe");
        for (int i = 0; i < this.herois.length; i++) {
            if(herois[i] != null){
                herois[i].mostraInfo();
            }
        }
    }

    void mostraMaisForte(){
        for (int i = 0; i < this.herois.length; i++) {
            if (herois[i] != null) {
                if (i == 0) {
                    maisForte = herois[i].poder;
                } else if (herois[i].poder > maisForte) {
                    maisForte = herois[i].poder;
                    nomeMaisForte = herois[i].nome;
                }
            }
        }
        System.out.println("-----------------------------------");
        System.out.println("Heroi mais forte: " + nomeMaisForte);
        System.out.println("-----------------------------------");
    }

    void calculaVoadores(){
        for (int i = 0; i < this.herois.length; i++) {
            if(herois[i] != null){
                if(herois[i].podeVoar){
                    qtdVoadores++;
                }
            }
        }
        double porcentagemQueVoam = (qtdVoadores / qtdHerois) * 100;
        System.out.println("-----------------------------------");
        System.out.println("Porcentagem dos heróis da equipe que voam: " + porcentagemQueVoam + "%");
        System.out.println("-----------------------------------");
    }




}
