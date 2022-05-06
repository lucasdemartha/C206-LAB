public class Artista implements Comparable<Artista>{

    private String nome;
    private int ouvintesMensais;
    private String musicaMaisFamosa;
    private boolean internacional;

    public Artista() {
        this.nome = nome;
        this.ouvintesMensais = ouvintesMensais;
        this.musicaMaisFamosa = musicaMaisFamosa;
        this.internacional = internacional;
    }


    public String getNome() {
        return nome;
    }

    public int getOuvintesMensais() {
        return ouvintesMensais;
    }

    public String getMusicaMaisFamosa() {
        return musicaMaisFamosa;
    }

    public boolean isInternacional() {
        return internacional;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setOuvintesMensais(int ouvintesMensais) {
        this.ouvintesMensais = ouvintesMensais;
    }

    public void setMusicaMaisFamosa(String musicaMaisFamosa) {
        this.musicaMaisFamosa = musicaMaisFamosa;
    }

    public void setInternacional(boolean internacional) {
        this.internacional = internacional;
    }

    public void semFamaSuficiente(){
        System.out.println("Sem fama");
    }

    @Override
    public int compareTo(Artista o) {
        return nome.compareTo(o.nome);
    }
}
