package ar.edu.uba.fi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AlquilerInmueblesTest {
    @Test
    public void test01CreoUnaCabaniaConUnaDireccionYCantInquilinosYLaAlquiloPor3Dias() {
        Cabania cabania = new Cabania(1234, 4);
        Double esperado = Double.valueOf(3 * (4 * 4));
        Double resultado = cabania.alquilarPorDias(3);
        assertEquals(esperado , resultado);
    }

    @Test
    public void test02CreoUnDepartamentoConUnaDireccionYMetrosYLaAlquiloPor3Dias(){
        Departamento departamento = new Departamento(1235, 10);
        Double esperado = Double.valueOf(3 * 10);
        Double resultado = departamento.alquilarPorDias(3);
        assertEquals(esperado , resultado);
    }

    @Test
    public void test03CreoUnaHabitacionConUnaDireccionYCamasYLaAlquiloPor3Dias(){
        Habitacion habitacion = new Habitacion(1235, 4);
        Double esperado = Double.valueOf((3 + 500) * 4);
        Double resultado = habitacion.alquilarPorDias(3);
        assertEquals(esperado , resultado);
    }

    @Test
    public void test04AlRegistrarUnInmuebleConDireccionYaExistenteSeLanzaExcepcion() {
        Agencia agencia = new Agencia();
        Habitacion habitacion = new Habitacion(1235, 4);
        Cabania cabania = new Cabania(1235, 4);
        agencia.registrarAlquilable(habitacion);

        assertThrows(AlquilableYaRegistradoException.class, () -> {agencia.registrarAlquilable(cabania);});
    }

    @Test
    public void test05AlPedirLosAlquileresDeUnClienteDaElPrecioCorrecto() {
        Agencia agencia = new Agencia();
        Cliente cliente = new Cliente("Nombre");
        Habitacion habitacion = new Habitacion(1235, 4);
        Cabania cabania = new Cabania(1000, 4);

        agencia.registrarAlquilable(habitacion);
        agencia.registrarAlquilable(cabania);
        agencia.registrarCliente(cliente);

        agencia.registrarAlquiler(cliente, cabania, 4);
        agencia.registrarAlquiler(cliente, habitacion, 5);
        Double precioEsperado = Double.valueOf((4 * (5 + 500)) + ((4 * 4) * 4));
        Double precioObtenido = agencia.calcularAlquilerParaCliente(cliente);

        assertEquals(precioObtenido , precioEsperado);
    }
}