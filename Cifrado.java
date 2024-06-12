package ProyectoModulo1;

import org.w3c.dom.ls.LSOutput;

public class Cifrado {

    private String mensaje;
    private int desplazamiento;


    static String Alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ .,;:¡?´-0123456789áéíóúÁÉÍÓÚñÑ&%$#";
    //a b c d e f g h i j  k   l  m  n  o  p  q  r  s  t  u  v  w  x  y  z  A  B  C  D  E  F  G  H  I  J  K  L  M  N  O  P  Q  R  S  T  U  V  W  X  Y  Z    .   ,  :  ¡  ?  ´  -
    //1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(int desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    public Cifrado (String mensaje, int desplazamiento){
        mensaje = this.mensaje;
        desplazamiento = this.desplazamiento;
    }

    public static String CifrarMensaje(String mensaje, int desplazamiento) {
        String mensajeCifrado = "";
        for (int i = 0; i < mensaje.length(); i++) {
            for (int j = 0; j < Alphabet.length(); j++) {
                if (mensaje.charAt(i) == Alphabet.charAt(j)) {
                    if (j + desplazamiento >= Alphabet.length()) {
                        mensajeCifrado = mensajeCifrado + Alphabet.charAt((j + desplazamiento) % Alphabet.length());
                    } else {
                        mensajeCifrado = mensajeCifrado + Alphabet.charAt(j + desplazamiento);
                    }
                } else {

                }
            }
        }
        return mensajeCifrado;
    }

    public static String DescifrarMensaje(String mensaje, int desplazamiento) {
        String mensajeDescifrado = "";
        for (int i = 0; i < mensaje.length(); i++) {
            for (int j = 0; j < Alphabet.length(); j++) {
                if (mensaje.charAt(i) == Alphabet.charAt(j)) {
                    if (j - desplazamiento < 0) {
                        mensajeDescifrado = mensajeDescifrado + Alphabet.charAt(Alphabet.length() - (desplazamiento - j));
                    } else {
                        mensajeDescifrado = mensajeDescifrado + Alphabet.charAt(j - desplazamiento);
                    }
                } else {
                }


            }
        }
        return mensajeDescifrado;
    }
}
