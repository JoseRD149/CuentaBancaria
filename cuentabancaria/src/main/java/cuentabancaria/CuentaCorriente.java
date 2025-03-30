package cuentabancaria;
class CuentaCorriente extends Cuenta {
    private float sobregiro = 0;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    @Override
    public void retirar(float cantidad) {
        if (cantidad > saldo) {
            sobregiro += (cantidad - saldo);
            saldo = 0;
        } else {
            saldo -= cantidad;
        }
        numeroRetiros++;
    }

    @Override
    public void consignar(float cantidad) {
        if (sobregiro > 0) {
            if (cantidad >= sobregiro) {
                cantidad -= sobregiro;
                sobregiro = 0;
            } else {
                sobregiro -= cantidad;
                cantidad = 0;
            }
        }
        super.consignar(cantidad);
    }

    @Override
    public String imprimir() {
        return super.imprimir() + ", Sobregiro: " + sobregiro;
    }
}

