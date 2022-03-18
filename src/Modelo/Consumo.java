package Modelo;

public class Consumo {
    private int consumo;
    private CiudadPlantaElectrica cp;

    public Consumo(int consumo, CiudadPlantaElectrica cp) {
        this.consumo = consumo;
        this.cp = cp;
    }

    public Consumo() {
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public CiudadPlantaElectrica getCp() {
        return cp;
    }

    public void setCp(CiudadPlantaElectrica cp) {
        this.cp = cp;
    }
    
}
