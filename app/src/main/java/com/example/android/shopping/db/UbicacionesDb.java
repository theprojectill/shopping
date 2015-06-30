package com.example.android.shopping.db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by android on 25/06/2015.
 */
public class UbicacionesDb {

    public List<String> getUbicaciones(String sector) {
        String[] ubicacionesMall = {"Corrientes", "Anchorena", "Agüero", "1° Anchorena", "1° Agüero"};

        String[] ubicacionesPlaza = {"El Zorzal"};

        String[] ubicacionesEstacionamiento = {"0° Anchorena", "-1° Anchorena", "-2° Anchorena",
                "0° Agüero", "-1° Agüero", "-2° Agüero"};

        String[] ubicacionesBaños = {"Nivel 0 (Masc)", "Nivel 0 (Fem)", "Nivel 0 (Discap)", "Nivel PB (Masc)", "Nivel PB (Fem)", "Nivel PB (Discap)",
                "Nivel 1° Agüero (Masc)", "Nivel 1° Agüero (Fem)", "Nivel 1° Agüero (Discap)", "Nivel 1° Anchorena (Masc)", "Nivel 1° Anchorena (Fem)",
                "Nivel 1° Anchorena (Discap)", "Musimundo (Masc)", "Musimundo (Fem)", "Musimundo (Discap)", "Nivel 2° Agüero (Masc)",
                "Nivel 2° Agüero (Fem)", "Nivel 2° Agüero (Discap)", "Nivel 2° Agüero (Niños)", "Nivel 2° Anchorena (Masc)", "Nivel 2° Anchorena (Fem)",
                "Nivel 2° Anchorena (Discap)", "Nivel 2° Anchorena (Niños)"};

        String[] ubicacionesAscensor = {"Corrientes", "Anchorena", "Agüero", "Adidas/Cope"};

        String[] ubicacionesEscaleraMecanica = {"Ss a Pb Corrientes", "Pb a Ss Corrientes", "Pb a 1° Corrientes", "1° a Pb Corrientes", "1° a 2° Corrientes",
                "2° a 1° Corrientes", "Auditorio Museo Ascendente", "Auditorio Museo Descendente", "Ss a Pb Lavalle", "Pb a Ss Lavalle", "Pb a 1° Lavalle",
                "1° a Pb Lavalle", "1° a 2° Agüero", "2° a 1° Anchorena", "-1° a Ss Anchorena", "-2° a -1° Anchorena", "-1° a Ss Agüero", "-2° a -1° Agüero"};

        if (sector.equals("Mall"))
        {
            return new ArrayList<String>(Arrays.asList(ubicacionesMall));
        }

        else if (sector.equals("Plaza"))
        {
            return new ArrayList<String>(Arrays.asList(ubicacionesPlaza));
        }

        else if (sector.equals("Estacionamiento"))
        {
            return new ArrayList<String>(Arrays.asList(ubicacionesEstacionamiento));
        }

        else if (sector.equals("Baños"))
        {
            return new ArrayList<String>(Arrays.asList(ubicacionesBaños));
        }

        else if (sector.equals("Ascensor"))
        {
            return new ArrayList<String>(Arrays.asList(ubicacionesAscensor));
        }

        else if (sector.equals("Escalera Mecánica"))
        {
            return new ArrayList<String>(Arrays.asList(ubicacionesEscaleraMecanica));
        }


        return null;
    }
}
