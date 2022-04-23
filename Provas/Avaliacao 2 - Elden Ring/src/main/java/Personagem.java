public abstract class Personagem {

    public static int contador = 0;
    private String nome;
    private int vitalidade;
    private int inteligencia;
    private int fe;

    Arma arma;

    public Personagem(String nome, int vitalidade, int inteligencia, int fe, Arma arma) {
        this.nome = nome;
        this.vitalidade = vitalidade;
        this.inteligencia = inteligencia;
        this.fe = fe;
        this.arma = arma;
        contador++;

    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Vitalidade: " + vitalidade);
        System.out.println("Fé: " + fe);
        System.out.println("Arma: " + arma.getTipo());
    }

    public void passaLevel(){
        vitalidade ++;
        inteligencia++;
        fe++;
    }

    public abstract void ganhaHabilidade();

    public String getNome() {
        return nome;
    }

    public int getVitalidade() {
        return vitalidade;
    }

    public void setVitalidade(int vitalidade) {
        this.vitalidade = vitalidade;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getFe() {
        return fe;
    }

    public void setFe(int fe) {
        this.fe = fe;
    }

    public static int getContador() {
        return contador;
    }
}
