package ar.edu.uba.fi;

public class Habitacion extends Inmueble{
    private int camas;

    public Habitacion(int direccion, int camas) {
        super(direccion);
        this.camas = camas;
    }

    public Double alquilarPorDias(int dias) {
        return Double.valueOf(((dias + 500) * camas));
    }

}
