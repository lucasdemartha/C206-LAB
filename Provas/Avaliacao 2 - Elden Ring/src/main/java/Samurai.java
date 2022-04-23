public class Samurai extends Personagem implements Cura{

    public Samurai(String nome, int vitalidade, int inteligencia, int fe, Arma arma) {
        super(nome, vitalidade, inteligencia, fe, arma);
        setInteligencia(getInteligencia()-2);
        setVitalidade(getVitalidade()+5);
        setFe(getFe()-2);
    }

    private int honra = 0;

    public int getHonra() {
        return honra;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Honra: " + getHonra());
    }

    @Override
    public void passaLevel() {
        super.passaLevel();
        honra++;
    }

    @Override
    public void ganhaHabilidade() {
        System.out.println(getNome() + " aprendeu uma nova habilidade");
    }

    @Override
    public void aprendeCura() {
        System.out.println(getNome() + " aprendeu a curar");
    }

    @Override
    public void curar() {
        System.out.println(getNome() + " usou a cura");
    }
}
