package Archivos_serealizable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Leer_Y_Escribir {

    public void escribir_srchivo(String ruta, Persona persona) {
        try {
            //Out: Escribir en el archivo 
            ObjectOutputStream ejemplo = new ObjectOutputStream(new FileOutputStream(ruta));
            ejemplo.writeObject(persona);
            ejemplo.close();
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }

    public static void main(String[] args) {
        Leer_Y_Escribir objeto = new Leer_Y_Escribir();
        Persona objeto1 = new Persona("Jonathan", "Castillo", 20, new Mascota("Firulais", 4));
//        objeto.escribir_srchivo("C:\\Users\\dell\\Desktop\\name.txt", objeto1);
//        objeto.Leer_archivo("C:\\Users\\dell\\Desktop\\name.txt");
        Persona objeto2 = new Persona("Juan ", " Eras", 18, new Mascota("Firu", 4));
        Persona objeto3 = new Persona("Carlos", "Salazar", 23, new Mascota("Gato", 4));
        Persona objeto4 = new Persona("Bryan", "Montaño", 22, new Mascota("Tobi", 4));
        List<Persona> lista = new ArrayList<>();
        lista.add(objeto1);
        lista.add(objeto2);
        lista.add(objeto3);
        lista.add(objeto4);
        objeto.escribir_lista("C:\\Users\\dell\\Desktop\\name.txt", lista);
        objeto.Leer_archivo("C:\\Users\\dell\\Desktop\\name.txt");
        List<Persona> lista1 = objeto.lista("C:\\Users\\dell\\Desktop\\name.txt");
        for (Persona persona : lista1) {
            System.out.println(persona.getApellido());

        }
    }

    public void Leer_archivo(String ruta) {
        try {
            //In: Leer en el archivo
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream(ruta));
            Object auxiliar = leer.readObject();
//            System.out.println(persona.getNombre());
//            System.out.println(persona.getMascota());
//            System.out.println(auxiliar);
            while (auxiliar != null) {
                Persona persona = (Persona) auxiliar;
                System.out.println(persona.getMascota().getNombre());
                auxiliar = leer.readObject();
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }

    public void escribir_lista(String direccion_archivo, List<Persona> listaPersona) {
        try {
            ObjectOutputStream leer = new ObjectOutputStream(new FileOutputStream(direccion_archivo));
            for (Persona persona : listaPersona) {
                leer.writeObject(persona);
            }
        } catch (Exception e) {
        }
    }

    public List<Persona> lista(String direccion) {
        List<Persona> lista = new ArrayList<Persona>();
        try {
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = leer.readObject();
            while (auxiliar != null) {
                Persona persona = (Persona) auxiliar;
                lista.add(persona);
                auxiliar = leer.readObject();
            }
        } catch (Exception e) {
        }
        return lista;
    }
}
