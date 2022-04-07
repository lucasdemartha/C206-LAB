package br.inatel.cdg;

public abstract class Astronauta {

    public static int cont;
    protected String cor;
    protected String nome;
    Skin skin;
    Pet pet;

    public Astronauta(String cor, String nome) {
        cont++;
        this.cor = cor;
        this.nome = nome;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Cor: " + cor);
        if(skin != null)
            System.out.println("Skin: " + skin.getTipo());
        else System.out.println("Não tem skin");

        if (pet != null)
            System.out.println("Pet: " + pet.getNome());
        else System.out.println("Não tem pet");
    }

    public void verCameras(){
        System.out.println(nome + " olhou as câmeras");
    }

    public abstract void reportar();

    public abstract void reparar();

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
