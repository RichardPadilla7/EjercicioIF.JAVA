//Richard Padilla
import java.util.Scanner;

public class EjercicioIF {
    public static void main(String[] args) {

        int edad;

        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        edad = input.nextInt();

        if (edad >= 18){
            System.out.println("Usted es mayor de edad :)");
        }  else if (edad < 18){
            System.out.println("Usted es menor de edad :(");
        }
    }
}
