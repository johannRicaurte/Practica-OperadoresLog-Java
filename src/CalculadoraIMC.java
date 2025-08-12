import java.util.Scanner;

public class CalculadoraIMC {



    public static void calcularIMC(){

        double peso;
        double altura;
        double imc;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite la altura en Metros");
        altura = input.nextDouble();
        System.out.println("Digite su peso en Metros:");
        peso = input.nextDouble();

        imc = (peso / (altura*altura));

        int imcEntero = (int) imc;

        System.out.println("IMC = " + imcEntero);
    }


}
