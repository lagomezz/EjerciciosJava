package NivelesDeAcceso;

import java.util.ArrayList;
// modificadores de acceso 
public class Granja {
    private String nombre;
    private int numeroAnimales;
    private boolean estaEnVenta;

    private ArrayList<Animal> animales = new ArrayList<Animal>();

    public Granja(String nombre) {
        this.nombre = nombre;
    }

    public void imprimirNombre() {
        System.out.println("El nombre de la granja es: " + nombre);
    }

    public void añadirAnimal(Animal animal) {
        animales.add(animal);
    }

    public void muestraAnimales() {
        for (int i = 0; i < animales.size(); i++)
            System.out.println(animales.get(i).getNombre() + " con peso "
                    + animales.get(i).getEdad());
    }
}