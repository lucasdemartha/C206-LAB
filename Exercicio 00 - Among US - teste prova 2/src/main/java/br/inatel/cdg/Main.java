package br.inatel.cdg;

public class Main {
    public static void main(String[] args) {

        Tripulante t1 = new Tripulante("Azul", "Feijão", 5);
        Skin s1 = new Skin("peixonauta");

        t1.setSkin(s1);

        Impostor i1 = new Impostor("Rosa", "Leao", 0);
        Pet p1 = new Pet("Alemao");

        i1.setPet(p1);

        Astronauta[] astronautas = new Astronauta[10];

        astronautas[0] = t1;
        astronautas[1] = i1;

        for (Astronauta astronauta: astronautas){
            if (astronauta instanceof Tripulante){
                Tripulante tripulante = (Tripulante) astronauta;
                tripulante.reportar();
                tripulante.reparar();
                tripulante.verCameras();
                System.out.println(tripulante.getQtdMissoes());
                tripulante.fazerMissao();
                System.out.println(tripulante.getQtdMissoes());
                tripulante.mostraInfo();
            }
        }

        for (Astronauta astronauta: astronautas){
            if (astronauta instanceof Impostor){
                Impostor impostor = (Impostor) astronauta;
                impostor.sabotarReator();
                impostor.sabotarLuz();
                System.out.println(impostor.getQtdMortes());
                impostor.executar();
                System.out.println(impostor.getQtdMortes());
                impostor.fazerMissao();
            }
        }
/*
        System.out.println(t1.getQtdMissoes());
        t1.fazerMissao();
        System.out.println(t1.getQtdMissoes());
        t1.reportar();
        t1.mostraInfo();


        System.out.println(i1.getQtdMortes());
        i1.sabotarReator();
        i1.executar();
        System.out.println(i1.getQtdMortes());
        i1.mostraInfo();
*/
    }
}
