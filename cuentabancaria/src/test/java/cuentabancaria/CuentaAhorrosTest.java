package cuentabancaria;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CuentaAhorrosTest {
    @Test
    void testCuentaActiva() {
        CuentaAhorros cuenta = new CuentaAhorros(12000, 5);
        assertTrue(cuenta.activa);
    }

    @Test
    void testCuentaInactiva() {
        CuentaAhorros cuenta = new CuentaAhorros(8000, 5);
        assertFalse(cuenta.activa);
    }

    @Test
    void testExtractoMensual() {
        CuentaAhorros cuenta = new CuentaAhorros(15000, 5);
        for (int i = 0; i < 5; i++) {
            cuenta.retirar(1000);
        }
        cuenta.extractoMensual();
        assertEquals(9037.5, cuenta.saldo, 0.01);

    }
}