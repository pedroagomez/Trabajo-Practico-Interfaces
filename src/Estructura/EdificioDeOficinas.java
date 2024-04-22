package Estructura;

public class EdificioDeOficinas extends Edificio{

    private int cantidadOficinas;

    public EdificioDeOficinas(double superficie, int cantidadOficinas) {
        super(superficie);
        this.cantidadOficinas = cantidadOficinas;
    }

    public int getCantidadOficinas() {
        return cantidadOficinas;
    }

    public void setCantidadOficinas(int cantidadOficinas) {
        this.cantidadOficinas = cantidadOficinas;
    }

    @Override
    public String toString() {
        return   "\n \n Edificio : cantidadOficinas=" + cantidadOficinas +
                 super.toString();
    }
}
