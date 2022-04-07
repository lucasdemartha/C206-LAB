package br.inatel.cdg;

public class Tripulante extends Astronauta implements Missao {

    public Tripulante(String cor, String nome, int qtdMissoes) {
        super(cor, nome);
        this.qtdMissoes = qtdMissoes;
    }

    public int getQtdMissoes() {
        return qtdMissoes;
    }

    public void setQtdMissoes(int qtdMissoes) {
        this.qtdMissoes = qtdMissoes;
    }

    private int qtdMissoes;

    @Override
    public void reportar() {
        System.out.println(nome + " reportou um corpo");
    }

    @Override
    public void reparar() {
        System.out.println(nome + " fez um reparo");
    }

    @Override
    public void fazerMissao() {
        System.out.println(nome + " fez uma missão");
        qtdMissoes--;
    }
}
