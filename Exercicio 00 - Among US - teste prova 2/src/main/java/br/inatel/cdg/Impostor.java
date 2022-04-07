package br.inatel.cdg;

public class Impostor extends Astronauta implements Missao,Sabotar,Executar {

    public Impostor(String cor, String nome, int qtdMortes) {
        super(cor, nome);
        this.qtdMortes = qtdMortes;
    }

    @Override
    public void reportar() {
        System.out.println(nome + " fez um self report");
    }

    @Override
    public void reparar() {
        System.out.println(nome + "fingiu que fez um reparo");
    }

    private int qtdMortes;

    public int getQtdMortes() {
        return qtdMortes;
    }

    public void setQtdMortes(int qtdMortes) {
        this.qtdMortes = qtdMortes;
    }

    public void usarVentoinha(){
        System.out.println("O impostor se escondeu na ventilação");
    }

    public void trancarPortas(String local){
        System.out.println("O impostor trancou as portas do(a) " + local);
    }

    @Override
    public void executar() {
        System.out.println(nome + " matou um tripulante");
        setQtdMortes(qtdMortes+1);
    }

    @Override
    public void fazerMissao() {
        System.out.println(nome + " fez uma tarefa falsa");
    }

    @Override
    public void sabotarLuz() {
        System.out.println("O impostor sabotou a luz");
    }

    @Override
    public void sabotarOxigenio() {
        System.out.println("O impostor sabotou o oxigenio");
    }

    @Override
    public void sabotarReator() {
        System.out.println("O impostor sabotou o reator");
    }

    @Override
    public void sabotarComunicacao() {
        System.out.println("O impostor sabotou a comunicação");
    }
}
