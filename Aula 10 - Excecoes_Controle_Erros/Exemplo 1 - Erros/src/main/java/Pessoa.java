public class Pessoa {
    public String nome;
    public int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        try{
            if(idade < 0){
                throw new IdadeException();
            }
            else
                this.idade = idade;
        }catch (IdadeException e){
            e.idadeIncorreta();
        }

    }
}
