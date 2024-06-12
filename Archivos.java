package ProyectoModulo1;

import java.io.*;

public class Archivos {


    public static void CrearYEscribirArchivo(File archivo, String mensajeCifrado) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(mensajeCifrado);
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String readText(File archivo) {
        String linea = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            linea = br.readLine();
            while ((linea != null)) {
                System.out.println(linea);
                linea = br.readLine();
                br.close();
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo " + e.getMessage());

        }
        return linea;
    }
}


