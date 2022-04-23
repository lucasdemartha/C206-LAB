public class Principal {

    public static void main(String[] args) {

        Curso[] curso = new Curso[9];


        curso[0] = new Curso("Matematica", "Aplicada", "Noturno");
        curso[1] = new Curso("Portugues", "Leitura", "Noturno");
        curso[2] = new Curso("Geografica", "Paises", "Noturno");

        curso[0].disciplina[0] = new Disciplina("Roberto", "MA", "MatematicaAplicada");
        curso[1].disciplina[1] = new Disciplina("Rodrigo", "PL", "PortuguesLeituras");
        curso[2].disciplina[2] = new Disciplina("Robson", "GP", "GeografiaPaises");

        curso[0].disciplina[0].aluno[0] = new Aluno("Felipe", 0, 20);
        curso[0].disciplina[0].aluno[1] = new Aluno("Fonseca", 1, 20);
        curso[0].disciplina[0].aluno[2] = new Aluno("Fernando", 2, 20);
        curso[1].disciplina[1].aluno[3] = new Aluno("Fernanda", 3, 20);
        curso[1].disciplina[1].aluno[4] = new Aluno("Felps", 4, 20);
        curso[1].disciplina[1].aluno[5] = new Aluno("Felicio", 5, 20);
        curso[2].disciplina[2].aluno[6] = new Aluno("Fabricio", 6, 20);
        curso[2].disciplina[2].aluno[7] = new Aluno("Fabio", 7, 20);
        curso[2].disciplina[2].aluno[8] = new Aluno("Francine", 8, 20);

        int p = curso.length; //contador

        //Para solucionar o Null Pointer Exception:
        //Verificar se a posição do array não é nula:

        for (int i = 0; i < p; i++) {
            if(curso[i] != null) {
                System.out.println(" ");
                System.out.println("Nome do curso: " + curso[i].nome + " Tipo: " + curso[i].tipo + " Turno: " + curso[i].turno);
                System.out.println(" ");
                System.out.println("Nome da disciplina: " + curso[i].disciplina[i].nomeDisciplina + " Sigla: " + curso[i].disciplina[i].sigla + " Professor Responsavel: " + curso[i].disciplina[i].profResponsavel);
                System.out.println(" ");
                for (int k = 0; k < p ; k++) {
                    if (curso[i].disciplina[i].aluno[k] != null) {
                        System.out.println("Aluno: " + curso[i].disciplina[i].aluno[k].nome + " Matricula: " + curso[i].disciplina[i].aluno[k].matricula + " Idade: " +curso[i].disciplina[i].aluno[k].idade);
                        System.out.println(" ");
                    }
                }
              }
            }
        }

    }
