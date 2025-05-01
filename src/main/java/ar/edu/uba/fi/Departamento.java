package ar.edu.uba.fi;

public class Departamento extends Inmueble{
    private int metros;

    public Departamento(int direccion, int metros){
        super(direccion);
        this.metros = metros;
    }
    
    public Double alquilarPorDias(int dias){
        return Double.valueOf(dias * metros);
    }
}
