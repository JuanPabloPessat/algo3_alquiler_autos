package ar.edu.uba.fi;

public interface Alquilable {
    public Double alquilarPorDias(int dias);
    public boolean esIgualA(Alquilable otroAlquilable);
    public boolean esVehiculo();
    public boolean esInmueble();
}
