package br.inatel.cdg;

public class Droid extends Personagem {

    private boolean hostil;

    public void hackearSistema(){

        System.out.println(this.getNome() +" hackeou o sistema da Nave");


    }

    public Droid(String nome, int id, int poder, boolean hostil) {
        super(nome, id, poder);
        this.hostil = hostil;
    }


    @Override
    public void mostraInfo(){
        super.mostraInfo();
        if(hostil)
            System.out.println("Hostil");
        else System.out.println("Não é hostil"+"\n");
    }

    @Override
    public void travarBatalha(){
        if(hostil){
            System.out.println(this.getNome() + " travou uma batalha contra um Jedi" );
            setPoder(getPoder() + 1);
        }
        else{
            System.out.println(this.getNome() + " travou uma batalha contra um Sith" );
            setPoder(getPoder() + 1);
        }

    }
}
