package br.inatel.cdg;

public class Main {
    public static void main(String[] args) {

        Nave nave = new Nave();

        Jedi jedi = new Jedi("jedi",1,80,true,new Sabre("azul"));
        Sith sith = new Sith("sith", 2,50,true,new Sabre("vermelho"));
        Droid droid = new Droid("droid",3,40,false);

        nave.personagens[0] = jedi;
        nave.personagens[1] = sith;
        nave.personagens[2] = droid;

        System.out.println("Personagens Criados: " + sith.getCont());
        System.out.println("\n");

        for (int i = 0; i < nave.personagens.length; i++) {

            if(nave.personagens[i] != null){
                if(nave.personagens[i] instanceof Jedi) {
                    System.out.println("Esta posicao tem um Jedi");
                    Jedi j = (Jedi) nave.personagens[i];
                    j.mostraInfo();
                    System.out.println(j.getPoder());
                    j.travarBatalha();
                    System.out.println(j.getPoder());
                    j.treinarPadawan();
                    j.usarForca();
                    System.out.println(j.getPoder());
                    j.trocarSabre("roxo");
                    System.out.println("Novo sabre: " + j.sabre.getCor());
                    System.out.println("\n");

                } else if(nave.personagens[i] instanceof Sith){
                    System.out.println("Esta posicao tem um Sith");
                    Sith s = (Sith) nave.personagens[i];
                    s.mostraInfo();
                    System.out.println(s.getPoder());
                    s.travarBatalha();
                    System.out.println(s.getPoder());
                    s.corromperJedi();
                    s.usarForca();
                    System.out.println(s.getPoder());
                    s.trocarSabre("preto");
                    System.out.println("Novo sabre: " + s.sabre.getCor());
                    System.out.println("\n");
                }else{

                    System.out.println("Esta posicao tem Droid");
                    Droid d = (Droid) nave.personagens[i];
                    d.mostraInfo();
                    System.out.println(d.getPoder());
                    d.travarBatalha();
                    System.out.println(d.getPoder());
                    d.hackearSistema();
                    System.out.println("\n");

                }
            }

        }

    }
}
