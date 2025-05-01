package ar.edu.uba.fi;

public abstract class Vehiculo implements Alquilable{
    protected String patente;

    public Vehiculo(String patente) {
        this.patente = patente;
    }

    public abstract Double alquilarPorDias(int dias);

    public boolean esIgualA(Alquilable otroAlquilable){
        if (!(otroAlquilable instanceof Vehiculo)){return false;}
        Vehiculo unVehiculo = (Vehiculo)otroAlquilable;
        return unVehiculo.tieneMismaPatente(this.patente);
    }

    private boolean tieneMismaPatente(String patente){
        return (this.patente == patente);
    }
}
