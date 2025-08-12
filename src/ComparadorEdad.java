import java.util.Scanner;

public class ComparadorEdad {


    public static void compararEdad()
    {
        int edad1, edad2;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite la edad de la persona 1");
            edad1 = input.nextInt();
        System.out.println("Digite la edad de la persona 2:");
       edad2= input.nextInt();

        if (edad1 > edad2) {
            System.out.println("La persona 1 es mayor que la persona 2.");
        } else if (edad1 < edad2) {
            System.out.println("La persona 1 es menor que la persona 2.");
        } else {
            System.out.println("Ambas personas tienen la misma edad.");
        }

    }
}
