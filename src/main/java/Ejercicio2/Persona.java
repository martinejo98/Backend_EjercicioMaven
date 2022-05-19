package Ejercicio2;

import java.util.Optional;

public class Persona {
    protected String nombre;
    protected String poblacion;
    protected Optional<Integer> edad;

    public Persona(String nombre, String poblacion, Optional <Integer> edad) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }

    public String getPoblacion(){
        return poblacion;
    }

    public Optional<Integer> getEdad(){
        return edad;
    }

    public String toString(){
        return "Nombre: "+nombre+", poblacion: "+poblacion+", edad: "+edad.get();
    }
}
