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
            String[] aspectos2 = {"Limpieza", "Pisos", "Vidrios", "Estado Cestos", "Estética Del Cableado",
                    "Señalética / Graficas", "Aromatización", "Fumigación", "Estado", "Observación"};

            return new ArrayList<String>(Arrays.asList(aspectos2));
        }
        else if ("Estacionamiento".equals(sector))
        {
            String[] aspectos3 = {"Limpieza", "Pisos", "Vidrios", "Estado Cestos", "Estética Del Cableado",
                    "Señalética / Graficas", "Aromatización", "Fumigación", "Estado", "Observación"};

            return new ArrayList<String>(Arrays.asList(aspectos3));
        }
        else if ("Baños".equals(sector))
        {
            String[] aspectos4 = {"Limpieza", "Pisos", "Barandas", "Vidrios", "Estado Cestos", "Estética Del Cableado",
                    "Señalética / Graficas", "Aromatización", "Fumigación", "Estado", "Observación"};

            return new ArrayList<String>(Arrays.asList(aspectos4));
        }
        else if ("Ascensor".equals(sector))
        {
            String[] aspectos5 = {"Limpieza", "Pisos", "Barandas", "Vidrios", "Estética Del Cableado",
                    "Señalética / Graficas", "Funcionamiento", "Aromatización", "Fumigación", "Estado", "Observación"};

            return new ArrayList<String>(Arrays.asList(aspectos5));
        }
        else if ("Escalera Mecánica".equals(sector))
        {
            String[] aspectos6 = {"Limpieza", "Vidrios", "Estado Cestos", "Estética Del Cableado",
                    "Señalética / Graficas", "Funcionamiento", "Aromatización", "Estado", "Observación"};

            return new ArrayList<String>(Arrays.asList(aspectos6));
        }

        else if ("Escalera Fija".equals(sector))
        {
            String[] aspectos7 = {"Limpieza", "Pisos", "Barandas", "Vidrios", "Estado Cestos",
                    "Señalética / Graficas", "Aromatización", "Fumigación", "Estado", "Observación"};

            return new ArrayList<String>(Arrays.asList(aspectos7));
        }

        else if ("Rampa".equals(sector))
        {
            String[] aspectos7 = {"Limpieza", "Pisos", "Barandas", "Vidrios", "Estado Cestos",
                    "Señalética / Graficas", "Aromatización", "Fumigación", "Estado", "Observación"};

            return new ArrayList<String>(Arrays.asList(aspectos7));
        }

        else if ("Cajero".equals(sector))
        {
            String[] aspectos8 = {"Limpieza", "Vidrios", "Estado Cestos", "Estética Del Cableado",
                    "Señalética / Graficas", "Funcionamiento", "Estado", "Observación"};

            return new ArrayList<String>(Arrays.asList(aspectos8));
        }

        else if ("Telefonos".equals(sector))
        {
            String[] aspectos9 = {"Limpieza", "Vidrios", "Estética Del Cableado",
                    "Señalética / Graficas", "Funcionamiento", "Estado", "Observación"};

            return new ArrayList<String>(Arrays.asList(aspectos9));
        }

        else if ("Lockers".equals(sector))
        {
            String[] aspectos10 = {"Limpieza", "Señalética / Graficas", "Funcionamiento", "Estado", "Observación"};

            return new ArrayList<String>(Arrays.asList(aspectos10));
        }

        else if ("Maquinas Expendedoras".equals(sector))
        {
            String[] aspectos11 = {"Limpieza", "Señalética / Graficas", "Funcionamiento", "Insumos", "Estado", "Observación"};

            return new ArrayList<String>(Arrays.asList(aspectos11));
        }

        else if ("Vereda".equals(sector))
        {
            String[] aspectos12 = {"Limpieza", "Estado Cestos", "Fumigación", "Estado", "Observación"};

            return new ArrayList<String>(Arrays.asList(aspectos12));
        }

        else if ("Luces".equals(sector))
        {
            String[] aspectos13 = {"Vidrios", "Estética del cableado", "Estado", "Observación"};

            return new ArrayList<String>(Arrays.asList(aspectos13));
        }

        else if ("Puertas".equals(sector))
        {
            String[] aspectos14 = {"Limpieza", "Vidrios", "Señalética / Graficas", "Funcionamiento", "Estado", "Observación"};

            return new ArrayList<String>(Arrays.asList(aspectos14));
        }

        else if ("Publicidad".equals(sector))
        {
            String[] aspectos15 = {"Limpieza", "Vidrios", "Estética del cableado", "Estado", "Observación"};

            return new ArrayList<String>(Arrays.asList(aspectos15));
        }

        else if ("Paco".equals(sector))
        {
            String[] aspectos16 = {"Limpieza", "Señalética / Graficas", "Estado", "Observación"};

            return new ArrayList<String>(Arrays.asList(aspectos16));
        }

        else if ("Pasillo".equals(sector))
        {
            String[] aspectos17 = {"Limpieza", "Pisos", "Barandas", "Vidrios", "Estado Cestos", "Estética del cableado",
                    "Señalética / Graficas", "Aromatización", "Fumigación", "Estado", "Observación"};

            return new ArrayList<String>(Arrays.asList(aspectos17));
        }

        else if ("Lcd's".equals(sector))
        {
            String[] aspectos18 = {"Vidrios", "Servicios", "Información General", "Marcas", "Rubros", "Egresos e ingresos de locales",
                    "Definición de imagen en pantalla", "Mantenimiento", "Observación"};

            return new ArrayList<String>(Arrays.asList(aspectos18));
        }

        return null;
    }
}
