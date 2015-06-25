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

        String[] ubicacionesEstacionamiento = {"0° Anchorena", "-1° Anchorena", "-2° Anchorena",
                "0° Agüero", "-1° Agüero", "-2° Agüero"};

        if (sector.equals("Mall")) {
            return new ArrayList<String>(Arrays.asList(ubicacionesMall));
        } else if (sector.equals("Estacionamiento")) {
            return new ArrayList<String>(Arrays.asList(ubicacionesEstacionamiento));
        }

        return null;
    }
}
