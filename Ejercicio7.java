import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner entradaPorConsola = new Scanner(System.in);
        System.out.println("Introduzca un texto:");
        String texto = entradaPorConsola.nextLine();
        String textoMayuscula = " ";
        for (char ch : texto.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                ch += 'A' - 'a';
            }
            textoMayuscula = textoMayuscula.concat(String.valueOf(ch));
        }
        System.out.println(textoMayuscula);
        entradaPorConsola.close();
    }

}
