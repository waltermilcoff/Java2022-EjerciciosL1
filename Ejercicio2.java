import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner entradaPorConsola = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros:");
        int num1 = entradaPorConsola.nextInt();
        int num2 = entradaPorConsola.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));

    }
}
