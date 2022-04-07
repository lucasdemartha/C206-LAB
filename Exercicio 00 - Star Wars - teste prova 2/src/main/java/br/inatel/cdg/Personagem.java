package br.inatel.cdg;

public abstract class Personagem {

    public static int cont = 0;
    private String nome;
    private int id;
    private int poder;

    public Personagem(String nome, int id, int poder) {

        this.nome = nome;
        this.id = id;
        this.poder = poder;
        cont++;
    }


    public void mostraInfo(){

        System.out.println("Nome: " + this.nome);
        System.out.println("Id: " + this.id);
        System.out.println("Poder: " + this.poder);

    }


    public abstract void travarBatalha();

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

}
