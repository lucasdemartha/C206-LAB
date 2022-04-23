public class Disciplina {

    String profResponsavel, sigla, nomeDisciplina;

    Aluno[] aluno = new Aluno[9];

    Disciplina(String profResponsavel, String sigla, String nomeDisciplina){
        this.profResponsavel = profResponsavel;
        this.sigla = sigla;
        this.nomeDisciplina = nomeDisciplina;
    }
}
