package Controlador;

import Interface.IConsumo;
import Modelo.Consumo;

public class ConConsumo implements IConsumo {

    public void agregar(Consumo d) {
        lista.add(d);
    }

    public void ConsumoTotalPlanta(int id) {
        boolean ff = false;
        String name = "";
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCp().getPlanta().getId() == id) {
                suma = suma + (lista.get(i).getConsumo() * lista.get(i).getCp().getTarifa());
                name = lista.get(i).getCp().getPlanta().getNombre();
                ff = true;
            }
        }
        if (ff) {
            System.out.println("EL CONSUMO TOTAL DE LA PLANTA " + name + " ES: " + suma);

        } else {
            System.out.println("NO EXISTE ESA PLANTA");
        }

        System.out.println("");
        System.out.println("");

    }

    public void ConsumoTotalCiudad(int id) {
        boolean ff = false;
        String name = "";
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCp().getCiudad().getId() == id) {
                suma = suma + (lista.get(i).getConsumo() * lista.get(i).getCp().getTarifa());
                name = lista.get(i).getCp().getCiudad().getNombre();
                ff = true;
            }
        }
        if (ff) {
            System.out.println("EL CONSUMO TOTAL DE LA CIUDAD " + name + " ES: " + suma);

        } else {
            System.out.println("NO EXISTE ESA CIUDAD");
        }

        System.out.println("");
        System.out.println("");

    }

    public void ConsumoTotalPlantaCiudad(int idp, int idc) {
        boolean ff = false;
        String name = "";
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            if ((lista.get(i).getCp().getCiudad().getId() == idc) && (lista.get(i).getCp().getPlanta().getId() == idp)) {
                suma = suma + (lista.get(i).getConsumo() * lista.get(i).getCp().getTarifa());
                name = lista.get(i).getCp().getPlanta().getNombre() + " , " + lista.get(i).getCp().getCiudad().getNombre();
                ff = true;
            }
        }
        if (ff) {
            System.out.println("EL CONSUMO TOTAL DE LA PLANTA CIUDAD " + name + " ES: " + suma);

        } else {
            System.out.println("NO EXISTE ESA CIUDAD");
        }

        System.out.println("");
        System.out.println("");

    }

    public void ConsumoTotalRegion() {

        String name = "";
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCp().getCiudad().getRegion().getId() == 1) {
                suma = suma + (lista.get(i).getConsumo() * lista.get(i).getCp().getTarifa());

            }
        }

        System.out.println("REGIÓN COSTA : " + suma);
        suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCp().getCiudad().getRegion().getId() == 2) {
                suma = suma + (lista.get(i).getConsumo() * lista.get(i).getCp().getTarifa());

            }
        }

        System.out.println("REGIÓN SIERRA: " + suma);
        suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCp().getCiudad().getRegion().getId() == 3) {
                suma = suma + (lista.get(i).getConsumo() * lista.get(i).getCp().getTarifa());
                name = lista.get(i).getCp().getCiudad().getRegion().getNombre();

            }
        }

        System.out.println("REGIÓN ORIENTE : " + suma);
        suma = 0;
        System.out.println("");
        System.out.println("");
    }

}
