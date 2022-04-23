public class Heroi {

    String nome;
    float poder;
    boolean podeVoar;

    void mostraInfo(){
        System.out.println("-----------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Poder: " + poder);
        if(podeVoar)
            System.out.println("Pode voar");
        else
            System.out.println("Não pode voar");
    }

}