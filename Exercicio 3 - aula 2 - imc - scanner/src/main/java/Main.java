import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        float peso, altura;
        float imc;

        System.out.println("Digite seu peso em KG: ");
        peso = teclado.nextFloat();
        System.out.println("Digite sua altura em CM: ");
        altura = teclado.nextFloat();

        altura = altura * 0.01f;
        imc = peso / (altura * altura);

        if (imc < 18.5){
            System.out.println("IMC = " + imc);
            System.out.println("Abaixo do peso");
        }
        else if ((imc >= 18.5) && (imc < 25)){
            System.out.println("IMC = " + imc);
            System.out.println("Peso Normal");
        }
        else if ((imc >= 25) && (imc < 30)){
            System.out.println("IMC = " + imc);
            System.out.println("Sobrepeso");
        }
        else if (imc >= 30 && imc < 35){
            System.out.println("IMC = " + imc);
            System.out.println("Obesidade grau I");
        }
        else if (imc >= 35 && imc < 40){
            System.out.println("IMC = " + imc);
            System.out.println("Obesidade grau II");
        }
        else if (imc >= 40){
            System.out.println("IMC = " + imc);
            System.out.println("Obesidade grau III ou Morbida");
        }


    }
}
