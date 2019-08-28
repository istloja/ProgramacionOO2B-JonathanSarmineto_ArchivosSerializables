package ejercicios;

public class Ejercicios {

    public static void main(String[] args) {
        Ejercicios objeto = new Ejercicios();
        String cadena = "hola";
        System.out.println(cadena.length());
        System.out.println(cadena.compareTo("chao"));
        System.out.println(cadena.compareTo("chao"));
        System.out.println(cadena.equals("chao"));
        System.out.println(cadena.contains("d"));
        objeto.verificarletra(cadena, 'o');
    }

    public boolean verificarletra(String cadena, char letra) {
        boolean bandera = false;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                bandera = true;
            }

        }
        return bandera;
    }
}
