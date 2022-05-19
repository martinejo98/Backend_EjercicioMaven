package Ejercicio2;

import java.io.*;
import java.util.*;

public class Ejercicio2 {

    public static void main(String Args[]){
        List <Persona> listaPersonas = new ArrayList<Persona>();
        String texto [];
        String linea;
        Optional longitud;
        File file = new File("C:\\Users\\alejandro.mperez\\Documents\\Backend\\Ejercicio1\\Ejercicio1.txt");
        //Creamos un obteto de tipo File para poder trabajar con el fichero
        try {
            BufferedReader bufRead = new BufferedReader(new FileReader(file));
            //Abrimos el fichero y leemos su contenido (por lineas)
            while ((linea = bufRead.readLine()) != null) {
                texto=linea.split(":");
                if(texto.length == 3){
                    //comprobamos que haya 3 posiciones en el array (nombre, población, edad)
                    if(Integer.parseInt(texto[2]) < 25){
                        //comprobamos que las edades sean menor que 25
                        Persona persona = new Persona(texto[0],texto[1].equals("")?"desconocida":texto[1], Optional.of(Integer.parseInt(texto[2])));
                        //
                        listaPersonas.add(persona);
                    }
                }
            }
            bufRead.close();

        }catch(Exception e){
            e.printStackTrace();
        }

        listaPersonas.stream().forEach(System.out::println);
    }
}
