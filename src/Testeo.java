import Estructura.Edificio;
import Estructura.EdificioDeOficinas;
import Estructura.Polideportivo;

import java.util.LinkedList;
import java.util.List;

public class Testeo {
    private LinkedList<Edificio> listaEdificios;

    public Testeo() {
        this.listaEdificios = new LinkedList<>();
    }

    public LinkedList<Edificio> getListaEdificios() {
        return listaEdificios;
    }

    public void setListaEdificios(LinkedList<Edificio> listaEdificios) {
        this.listaEdificios = listaEdificios;
    }

    public void cargarDatos()
    {
        listaEdificios.add(new EdificioDeOficinas(1500,35));
        listaEdificios.add(new EdificioDeOficinas(3500,50));

        listaEdificios.add(new Polideportivo(2300,"El Astilla"));
        listaEdificios.add(new Polideportivo(5400,"Aldosivi"));
        listaEdificios.add(new Polideportivo(1600,"Alvarado"));
    }

    public String mostrarListaEdificios()
    {
        String cadena="";
        for(Edificio aux : listaEdificios)
        {
            cadena+=aux.toString();
        }
        return cadena;
    }

    public String mostrarListaOficinas()
    {
        String cadena="";
        for(Edificio aux: listaEdificios)
        {
            if(aux instanceof EdificioDeOficinas)
            {
                cadena+=aux.toString();
            }
        }
        return cadena;
    }

    public String mostrarPolideportivo()
    {
        String cadena="";
        for(Edificio aux: listaEdificios)
        {
            if(aux instanceof Polideportivo)
            {
                cadena+=aux.toString();
            }
        }
        return cadena;
    }
}
