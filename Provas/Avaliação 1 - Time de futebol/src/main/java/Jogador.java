public class Jogador {

    String nome;
    double salario;
    int numCamisa;
    boolean base;

    void mostraInfo(){
        System.out.println("Nome do jogador: " + this.nome);
        System.out.println("Salario: " + this.salario);
        System.out.println("Número da camisa: " + this.numCamisa);
        if(base)
            System.out.println("Revelado na base");
        else
            System.out.println("Não foi revelado na base");
    }

}
