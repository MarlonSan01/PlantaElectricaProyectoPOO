package Controlador;

import Interface.IPlantaElectrica;
import Modelo.PlantaElectrica;


public class ConPlantaElectrica implements IPlantaElectrica{
    public void agregar(PlantaElectrica d){
        lista.add(d);
        
    }
}

