package ProyectoModulo1;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

import static ProyectoModulo1.Archivos.*;
import static ProyectoModulo1.Cifrado.CifrarMensaje;
import static ProyectoModulo1.Cifrado.DescifrarMensaje;

public class CifradoCesar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mensaje = "";
        String nombre = "";
        int desplazamiento;
        String mensajeCifrado1 = "";

        System.out.println("ingresa tu nombre: ");
        nombre = scanner.nextLine();

        System.out.println("ingresa tu mensaje: ");
        mensaje = scanner.nextLine();

        System.out.println("ingresa el numero de desplazamientos: ");
        desplazamiento = scanner.nextInt();

        mensajeCifrado1 = CifrarMensaje(mensaje, desplazamiento);
        System.out.println("Mensaje cifrado: " + mensajeCifrado1);

        File archivo = new File("C:\\Users\\ANDRE\\Repositorios\\ProyectoModulo1\\" + nombre + ".txt");
        CrearYEscribirArchivo(archivo, mensajeCifrado1);

        String mensajeDescifrado = DescifrarMensaje(mensajeCifrado1, desplazamiento);
        System.out.println("mensaje descifrado: " + mensajeDescifrado);

        //System.out.println(readText(archivo));
        // este metodo para leer texto desde archivo me regresa null



    }
}
