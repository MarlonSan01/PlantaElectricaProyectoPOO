package Controlador;

import Interface.ICiudadPlantaElectrica;
import Modelo.CiudadPlantaElectrica;

public class ConCiudadPlantaElectrica implements ICiudadPlantaElectrica {
    
    public void agregar(CiudadPlantaElectrica d){
        lista.add(d);
    }
}
