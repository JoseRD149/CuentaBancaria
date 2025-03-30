package cuentabancaria;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CuentaCorrienteTest {
    @Test
    void testSobregiro() {
        CuentaCorriente cuenta = new CuentaCorriente(5000, 5);
        cuenta.retirar(7000);
        assertEquals(0, cuenta.saldo);
        assertEquals(2000, cuenta.sobregiro);
    }

    @Test
    void testConsignarCubrirSobregiro() {
        CuentaCorriente cuenta = new CuentaCorriente(5000, 5);
        cuenta.retirar(7000);
        cuenta.consignar(3000);
        assertEquals(1000, cuenta.saldo);
        assertEquals(0, cuenta.sobregiro);
    }
}
