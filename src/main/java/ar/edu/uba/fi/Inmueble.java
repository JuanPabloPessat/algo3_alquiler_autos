package ar.edu.uba.fi;

public abstract class Inmueble implements Alquilable {
    protected int direccion;

    public Inmueble(int direccion) {
        this.direccion = direccion;
    }

    public boolean esInmueble() {
        return true;
    }

    public boolean esVehiculo() {
        return false;
    }

    public abstract Double alquilarPorDias(int dias);

    private boolean tieneMismaDireccion(int direccion){
        return direccion == this.direccion;
    }

    public boolean esIgualA(Alquilable unAlquilable){
        if (!(unAlquilable.esInmueble())){ return false; }
        Inmueble unInmueble = (Inmueble) unAlquilable;
        return unInmueble.tieneMismaDireccion(this.direccion);
    }
}
