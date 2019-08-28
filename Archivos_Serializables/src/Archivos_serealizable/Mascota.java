
package Archivos_serealizable;

import java.io.Serializable;

public class Mascota implements Serializable{
    private String nombre;
    private int numero_de_patas;

    public Mascota() {
    }

    public Mascota(String nombre, int numero_de_patas) {
        this.nombre = nombre;
        this.numero_de_patas = numero_de_patas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero_de_patas() {
        return numero_de_patas;
    }

    public void setNumero_de_patas(int numero_de_patas) {
        this.numero_de_patas = numero_de_patas;
    }
    
}
