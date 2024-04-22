package Estructura;

import Estructura.Edificio;
import Interface.IinstalacionDeportiva;

public class Polideportivo extends Edificio implements IinstalacionDeportiva {

    private String nombre;

    public Polideportivo(double superficie, String nombre) {
        super(superficie);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getTipoDeInstalacion() {
        return 1;
    }

    @Override
    public String toString() {
        return  "\n \n Polideportivo: " +
                "nombre='" + nombre + '\''
                +  super.toString() + " Tipo de instalacion : "+getTipoDeInstalacion();
    }
}
