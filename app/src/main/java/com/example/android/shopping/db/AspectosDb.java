package com.example.android.shopping.db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by android on 25/06/2015.
 */
public class AspectosDb {

    /* TODOS LOS ASPECTOS A EVALUAR
    Limpieza
    Pisos
    Barandas
    Vidrios
    Estado Cestos
    Estética Del Cableado
    Señalética / Graficas
    Funcionamiento
    Insumos
    Aromatización
    Fumigación
    Estado
    Servicios
    Información General
    Marcas
    Rubros
    Egresos E Ingresos De Locales
    Definición De Imagen En Pantalla
    Mantenimiento
    Observación
    */

    public List<String> getAspectos(String sector, String ubicacion) {
        if ("Mall".equals(sector))
        {
            String[] aspectos = {"Limpieza", "Pisos", "Vidrios", "Estado Cestos", "Estética Del Cableado",
                    "Señalética / Graficas", "Aromatización", "Fumigación", "Estado", "Observación"};

            return new ArrayList<String>(Arrays.asList(aspectos));
        }
        else if ("Plaza".equals(sector))
        {
            String[] aspectos = {"Limpieza", "Pisos", "Vidrios", "Estado Cestos", "Estética Del Cableado",
                    "Señalética / Graficas", "Aromatización", "Fumigación", "Estado", "Observación"};

            return new ArrayList<String>(Arrays.asList(aspectos));
        }
        else if ("Estacionamiento".equals(sector))
        {
            String[] aspectos = {"Limpieza", "Pisos", "Vidrios", "Estado Cestos", "Estética Del Cableado",
                    "Señalética / Graficas", "Aromatización", "Fumigación", "Estado", "Observación"};

            return new ArrayList<String>(Arrays.asList(aspectos));
        }
        else if ("Baños".equals(sector))
        {
            String[] aspectos = {"Limpieza", "Pisos", "Barandas", "Vidrios", "Estado Cestos", "Estética Del Cableado",
                    "Señalética / Graficas", "Aromatización", "Fumigación", "Estado", "Observación"};

            return new ArrayList<String>(Arrays.asList(aspectos));
        }
        else if ("Ascensor".equals(sector))
        {
            String[] aspectos = {"Limpieza", "Pisos", "Barandas", "Vidrios", "Estética Del Cableado",
                    "Señalética / Graficas", "Funcionamiento", "Aromatización", "Fumigación", "Estado", "Observación"};

            return new ArrayList<String>(Arrays.asList(aspectos));
        }
        else if ("Escalera Mecánica".equals(sector))
        {
            String[] aspectos = {"Limpieza", "Vidrios", "Estado Cestos", "Estética Del Cableado",
                    "Señalética / Graficas", "Funcionamiento", "Aromatización", "Estado", "Observación"};

            return new ArrayList<String>(Arrays.asList(aspectos));
        }

        return null;
    }
}
