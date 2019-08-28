package Archivos_serealizable;

import java.io.Serializable;

public class Persona implements Serializable {

    private String nombre;
    private String apellido;
    private int edad;
    private Mascota mascota;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, Mascota mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public static void main(String[] args) {
        Persona objeto = new Persona("Jonathan", "Castillo", 20, new Mascota("Firulais", 4));
        Persona objeto2 = new Persona("Gonzalo", "Sarmiento", 20, new Mascota("gato", 4));
        Mascota name = new Mascota("firulais", 4);
        Persona objeto3 = new Persona("Pablo", "Abrigo", 20, name);
        System.out.println("La mascota de: " + objeto.getNombre() + "se llama " + objeto.getMascota().getNombre());
    }

}
