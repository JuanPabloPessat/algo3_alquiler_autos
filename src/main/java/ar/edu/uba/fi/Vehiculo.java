package ar.edu.uba.fi;

public abstract class Vehiculo implements Alquilable{
    protected String patente;

    public Vehiculo(String patente) {
        this.patente = patente;
    }

    public boolean esInmueble() {
        return false;
    }

    public boolean esVehiculo() {
        return true;
    }

    public abstract Double alquilarPorDias(int dias);

    public boolean esIgualA(Alquilable otroAlquilable){
        if (!(otroAlquilable.esVehiculo())){return false;}
        Vehiculo unVehiculo = (Vehiculo)otroAlquilable;
        return unVehiculo.tieneMismaPatente(this.patente);
    }

    private boolean tieneMismaPatente(String patente){
        return (this.patente == patente);
    }
}
