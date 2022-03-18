package Modelo;

public class CiudadPlantaElectrica {
    private PlantaElectrica planta;
    private Ciudad ciudad;
    private double tarifa;

    public CiudadPlantaElectrica(PlantaElectrica planta, Ciudad ciudad, double tarifa) {
        this.planta = planta;
        this.ciudad = ciudad;
        this.tarifa = tarifa;
    }

    public CiudadPlantaElectrica() {
    }

    public PlantaElectrica getPlanta() {
        return planta;
    }

    public void setPlanta(PlantaElectrica planta) {
        this.planta = planta;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    
}
