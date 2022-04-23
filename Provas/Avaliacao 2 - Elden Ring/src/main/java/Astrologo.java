public class Astrologo extends Personagem implements Magia, Cura {


    public Astrologo(String nome, int vitalidade, int inteligencia, int fe, Arma arma) {
        super(nome, vitalidade, inteligencia, fe, arma);
        setInteligencia(getInteligencia()+5);
        setVitalidade(getVitalidade()-2);
        setFe(getFe()-2);
    }


    @Override
    public void mostraInfo() {
        super.mostraInfo();
    }

    @Override
    public void passaLevel() {
        super.passaLevel();
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

    @Override
    public void aprendeFeitico() {
        System.out.println(getNome() + " aprendeu novo feitiço");
    }

    @Override
    public void usaFeitico(int dano) {
        System.out.println(getNome() + " usou seu feitiço");
        System.out.println("Dano causado: " + dano);
    }
}
