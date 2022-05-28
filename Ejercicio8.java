import java.util.Scanner;

public class Ejercicio8 {

    public static void DatosPersona(String nombreYapellido, int edad, String direccion, String ciudad) {

        System.out.println(ciudad + " " + direccion + " " + edad + " " + nombreYapellido);
   
    }

    
    public static void main(String[] args) {
        
        Scanner entradaPorConsola = new Scanner(System.in);
        
        String nombreYapellido = " ";
        int edad = 0;
        String direccion = " ";
        String ciudad = " ";
        
        System.out.println("Ingresa tu nombre y apellido:");
        nombreYapellido = entradaPorConsola.nextLine();
        System.out.println("Ingresa tu edad:");
        edad = entradaPorConsola.nextInt();
        entradaPorConsola.nextLine(); // problemas con nextline me toma como un return asi que agrege otra linea
        System.out.println("Ingresa tu direccion:");
        direccion = entradaPorConsola.nextLine();
        System.out.println("Ingresa tu ciudad:");
        ciudad = entradaPorConsola.nextLine();
        entradaPorConsola.close();

        DatosPersona(nombreYapellido, edad, direccion, ciudad);

    }
}
