import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner entradaPorConsola = new Scanner(System.in);
        System.out.println("Ingresa el numero que deseas factoriar: ");
        int numeroFactoriar = entradaPorConsola.nextInt();
        int resultadoFactoriar = 1;
        for (int i = numeroFactoriar; i > 0; i--) {
            resultadoFactoriar = resultadoFactoriar * i;
        }
        System.out.println("El factorial de " + numeroFactoriar + " es " + resultadoFactoriar);
        entradaPorConsola.close();

    }

}
