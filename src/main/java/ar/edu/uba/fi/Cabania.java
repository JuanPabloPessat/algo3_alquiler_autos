package ar.edu.uba.fi;

public class Cabania extends Inmueble {
    private int inquilinos;

    public Cabania(int direccion, int inquilinos) {
        super(direccion);
        this.inquilinos = inquilinos;
    }

    public Double alquilarPorDias(int dias) {
        return Double.valueOf(dias * (inquilinos * inquilinos));
    }
}
