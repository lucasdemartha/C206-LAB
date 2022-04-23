public class Main {
    public static void main(String[] args) {

        Personagem personagens[] = new Personagem[3];

        Astrologo astrologo = new Astrologo("Astrologo",10,10,10,new Arma("Cajado"));
        Samurai samurai = new Samurai("Samurai",10,10,10, new Arma("Espada"));
        Confessor confessor = new Confessor("Confessor",10,10,10,new Arma("Porrete"));

        personagens[0] = astrologo;
        personagens[1] = samurai;
        personagens[2] = confessor;

        for (int i = 0; i < personagens.length; i++) {

            if (personagens[i] != null) {
                if (personagens[i] instanceof Astrologo) {
                    System.out.println("Esta posição tem um Astrologo");
                    Astrologo a = (Astrologo)personagens[i];
                    a.passaLevel();
                    a.ganhaHabilidade();
                    a.aprendeFeitico();
                    a.usaFeitico(50);
                    a.aprendeCura();
                    a.curar();
                    a.mostraInfo();
                    System.out.println("\n");
                }

                else if (personagens[i] instanceof Samurai){
                    System.out.println("Esta posição tem um Samurai");
                    Samurai s = (Samurai) personagens[i];
                    s.passaLevel();
                    s.ganhaHabilidade();
                    s.aprendeCura();
                    s.curar();
                    s.mostraInfo();
                    System.out.println("\n");
                }

                else if (personagens[i] instanceof Confessor) {
                    System.out.println("Esta posição tem um Confessor");
                    Confessor c = (Confessor) personagens[i];
                    c.passaLevel();
                    c.ganhaHabilidade();
                    c.aprendeCura();
                    c.curar();
                    c.mostraInfo();
                    System.out.println("\n");
                }
            }
        }

        System.out.println("Total de personagens criados: " + Personagem.getContador());

    }
}
