package Estructura;

public abstract class Edificio {
    private double superficie;

    public Edificio(double superficie) {
        this.superficie = superficie;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return
                "Superficie=" + superficie
                ;
    }
}
