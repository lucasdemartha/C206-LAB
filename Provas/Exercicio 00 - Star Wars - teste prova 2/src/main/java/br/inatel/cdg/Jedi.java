package br.inatel.cdg;

public class Jedi extends Personagem implements Treinamento, Forca{
    private boolean mestre;

    Sabre sabre;

    public Jedi(String nome, int id, int poder, boolean mestre, Sabre sabre) {
        super(nome, id, poder);
        this.mestre = mestre;
        this.sabre = sabre;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        if(mestre)
            System.out.println("Mestre");
        else System.out.println("Não é mestre");
        System.out.println("Sabre: " + sabre.getCor() + "\n");
    }

    @Override
    public void travarBatalha(){

        System.out.println(this.getNome() + " travou uma batalha contra um Sith" );
        setPoder(getPoder()+1);

    }

    public void treinarPadawan() {

        if(mestre || getPoder()>70){
            System.out.println(getNome() + " treinou um Padawan");
        }
        else
            System.out.println(getNome() + " ainda nao consegue treinar Padawans");
    }


    @Override
    public void usarForca() {

        System.out.println(this.getNome() + " usou a forca para o bem");
        setPoder(getPoder() + 5);

    }

    @Override
    public void trocarSabre(String cor) {

        sabre.setCor("roxo");

    }
}
