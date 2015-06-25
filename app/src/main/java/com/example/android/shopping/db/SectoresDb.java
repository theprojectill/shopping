package com.example.android.shopping.db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by android on 25/06/2015.
 */
public class SectoresDb {

    public List<String> getSectores() {

        String[] sectores = {"Mall", "Estacionamiento", "Baños", "Ascensor", "Escalera Mecánica",
                "Escalera Fija", "Rampa", "Cajero", "Telefonos", "Lockers", "Maquinas Expendedoras",
                "Vereda", "Luces", "Puertas", "Publicidad", "Paco", "Pasillo", "Lcd's"};

        return new ArrayList<String>(Arrays.asList(sectores));
    }

}
