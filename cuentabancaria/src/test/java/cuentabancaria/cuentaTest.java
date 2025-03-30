package cuentabancaria;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {
    @Test
    void testConsignar() {
        Cuenta cuenta = new Cuenta(5000, 5);
        cuenta.consignar(2000);
        assertEquals(7000, cuenta.saldo);
        assertEquals(1, cuenta.numeroConsignaciones);
    }

    @Test
    void testRetirar() {
        Cuenta cuenta = new Cuenta(5000, 5);
        cuenta.retirar(2000);
        assertEquals(3000, cuenta.saldo);
        assertEquals(1, cuenta.numeroRetiros);
    }

    @Test
    void testCalcularInteresMensual() {
        Cuenta cuenta = new Cuenta(12000, 12);
        cuenta.calcularInteresMensual();
        assertEquals(12120, cuenta.saldo, 0.01);
    }
}
