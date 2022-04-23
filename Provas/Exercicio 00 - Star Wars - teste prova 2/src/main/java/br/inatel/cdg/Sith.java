package br.inatel.cdg;

public class Sith extends Personagem implements Forca {

    private boolean darth;
    Sabre sabre;

    public Sith(String nome, int id, int poder, boolean darth, Sabre sabre) {
        super(nome, id, poder);
        this.darth = darth;
        this.sabre = sabre;
    }


    @Override
    public void mostraInfo(){
        super.mostraInfo();
        if(darth)
            System.out.println("Darth");
        else System.out.println("Não é darth");
        System.out.println("Sabre: " + sabre.getCor());

    }

    @Override
    public void travarBatalha(){

        System.out.println(this.getNome() + " travou uma batalha contra um Jedi" );
        setPoder(getPoder() + 1);

    }

    public void corromperJedi(){
        if(isDarth()&&getPoder()>60)
            System.out.println(this.getNome() + " levou um jedi para o lado negro da forca");
        else System.out.println(this.getNome() + " ainda nao consegue corromper jedis");

    }



    public boolean isDarth() {
        return darth;
    }

    public void setDarth(boolean darth) {
        this.darth = darth;
    }

    public Sabre getSabre() {
        return sabre;
    }

    public void setSabre(Sabre sabre) {
        this.sabre = sabre;
    }

    @Override
    public void usarForca() {
        System.out.println(this.getNome() + " usou o lado negro da forca");
        setPoder(getPoder() + 3);
    }

    @Override
    public void trocarSabre(String cor) {

        sabre.setCor("preto");

    }
}
