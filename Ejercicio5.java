import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner entradaPorConsola = new Scanner(System.in);
        System.out.println("Ingrese el PRIMER nro para multiplicar por sumas sucesivas:");
        int nroMultiSuma1 = entradaPorConsola.nextInt();
        System.out.println("Ingrese el SEGUNDO nro para multiplicar por sumas sucesivas:");
        int nroMultiSuma2 = entradaPorConsola.nextInt();
        int resultadoMultPorSumaSucesivas = 0;
        for (int i = 0; i < nroMultiSuma2; i++) {
            resultadoMultPorSumaSucesivas += nroMultiSuma1;
        }
        System.out.println(nroMultiSuma1 + " x " + nroMultiSuma2 + " = " + resultadoMultPorSumaSucesivas);
        entradaPorConsola.close();
    }
}
