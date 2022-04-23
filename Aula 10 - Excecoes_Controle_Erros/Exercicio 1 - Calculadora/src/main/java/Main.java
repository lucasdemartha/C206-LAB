public class Main {
    public static void main(String[] args) {

        //Soma
        try{
            System.out.println("Soma: " + (1+7));
        }catch (Exception e){
            System.out.println("Erro: " + e);
        }

        //Subtracao
        try{
            System.out.println("Soma: " + (3-2));
        }catch (Exception e){
            System.out.println("Erro: " + e);
        }

        //Multiplicacao
        try{
            System.out.println("Soma: " + (2*2));
        }catch (Exception e){
            System.out.println("Erro: " + e);
        }

        //Divisao
        try{
            System.out.println("Soma: " + (5/0));
        }catch (Exception e){
            System.out.println("Erro: " + e);
        }
    }
}
