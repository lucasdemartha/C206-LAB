import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        try{
            System.out.println("5/0" + 5/0);
        }catch (Exception e){
            System.out.println("Erro: " + e);
            JOptionPane.showMessageDialog(null,"Erro:" + e);
        }

        Pessoa p1 = new Pessoa("Joao", 24);
        Pessoa p2 = new Pessoa("Jose", -32);

        Pessoa [] pessoas = new Pessoa[10];

        try{
            pessoas[0] = p1;
            pessoas[11] = p2;
        }catch (Exception e){
            System.out.println("Erro: " + e);
        }

        for (int i = 0; i < pessoas.length; i++){
            try{
                System.out.println("Nome: " + pessoas[i].nome);
                System.out.println("Idade: " + pessoas[i].idade);
            }catch (Exception e){
                System.out.println("Erro: " + e);
            }finally {
                System.out.println("Passou por aqui");
            }
        }

        System.out.println("CHEGOU AO FIM");


    }
}
