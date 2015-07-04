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

        String[] ubicacionesEscaleraFija = {"Agüero", "Anchorena", "Museo De Los Niños"};

        String[] ubicacionesRampa = {"Nivel 4/3", "Nivel 3/2", "Nivel 2/1"};

        String[] ubicacionesCajero = {"Estacionamiento Ss Lavalle", "Hsbc Ss Lavalle", "Hipotecario Pb Anchorena", "Hipotecario 2° Corrientes",
                "City 2° Corrientes"};

        String[] ubicacionesTelefonos = {"Ss Anchorena", "Pb Anchorena", "1° Agüero", "1° Anchorena", "1° Lavalle", "2° Anchorena"};

        String[] ubicacionesLockers = {"1° Lavalle"};

        String[] ubicacionesMaquinasExpendedoras = {"Ss Anchorena", "Pb Anchorena", "1° Anchorena", "1° Agüero", "2° Agüero"};

        String[] ubicacionesVereda = {"Corrientes", "Anchorena", "Agüero", "Lavalle"};

        String[] ubicacionesLuces = {"Corrientes", "Anchorena", "Agüero", "Lavalle"};

        String[] ubicacionesPuertas = {"Corrientes", "Pb Anchorena", "1° Anchorena", "Pb Agüero", "1° Agüero"};

        String[] ubicacionesPublicidad = {"Corrientes", "Anchorena", "Agüero", "Lavalle"};

        String[] ubicacionesPaco = {"Mesas Corrientes", "Mesas Anchorena", "Mesas Agüero", "Mesas Lavalle", "Mesas Centro", "Sillas Corrientes",
                "Sillas Anchorena", "Sillas Agüero", "Sillas Lavalle", "Sillas Centro"};

        String[] ubicacionesPasillo = {"Ss Corrientes", "Ss Anchorena", "Ss Agüero", "Ss Lavalle", "Pb Anchorena", "Pb Agüero", "Pb Lavalle",
                "1° Corrientes", "1° Anchorena", "1° Agüero", "1° Lavalle", "2° Corrientes", "2° Anchorena", "2° Agüero", "2° Lavalle"};

        String[] ubicacionesLcds = {"Ss", "Pb", "1°", "2°"};

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

        else if (sector.equals("Escalera Fija"))
        {
            return new ArrayList<String>(Arrays.asList(ubicacionesEscaleraFija));
        }

        else if (sector.equals("Rampa"))
        {
            return new ArrayList<String>(Arrays.asList(ubicacionesRampa));
        }

        else if (sector.equals("Cajero"))
        {
            return new ArrayList<String>(Arrays.asList(ubicacionesCajero));
        }

        else if (sector.equals("Telefonos"))
        {
            return new ArrayList<String>(Arrays.asList(ubicacionesTelefonos));
        }

        else if (sector.equals("Lockers"))
        {
            return new ArrayList<String>(Arrays.asList(ubicacionesLockers));
        }

        else if (sector.equals("Maquinas Expendedoras"))
        {
            return new ArrayList<String>(Arrays.asList(ubicacionesMaquinasExpendedoras));
        }

        else if (sector.equals("Vereda"))
        {
            return new ArrayList<String>(Arrays.asList(ubicacionesVereda));
        }

        else if (sector.equals("Luces"))
        {
            return new ArrayList<String>(Arrays.asList(ubicacionesLuces));
        }

        else if (sector.equals("Puertas"))
        {
            return new ArrayList<String>(Arrays.asList(ubicacionesPuertas));
        }

        else if (sector.equals("Publicidad"))
        {
            return new ArrayList<String>(Arrays.asList(ubicacionesPublicidad));
        }

        else if (sector.equals("Paco"))
        {
            return new ArrayList<String>(Arrays.asList(ubicacionesPaco));
        }

        else if (sector.equals("Pasillo"))
        {
            return new ArrayList<String>(Arrays.asList(ubicacionesPasillo));
        }

        else if (sector.equals("Lcd's"))
        {
            return new ArrayList<String>(Arrays.asList(ubicacionesLcds));
        }

        return null;
    }
}
