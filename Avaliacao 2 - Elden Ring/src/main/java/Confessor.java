public class Confessor extends Personagem implements Cura{

    public Confessor(String nome, int vitalidade, int inteligencia, int fe, Arma arma) {
        super(nome, vitalidade, inteligencia, fe, arma);
        setInteligencia(getInteligencia()-2);
        setVitalidade(getVitalidade()-2);
        setFe(getFe()+5);
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
}
