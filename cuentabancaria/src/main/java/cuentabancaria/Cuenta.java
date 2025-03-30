package cuentabancaria;

public class Cuenta {
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;

    public Cuenta(float saldo,float tasaAnual){
        this .saldo = saldo;
        this.tasaAnual = tasaAnual;
}

    public void consignar(float cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            numeroConsignaciones++;

        }
    }

    public void retirar(float cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            numeroRetiros++;
        }
    }

    public void calcularInteresMensual() {
        float interesMensual = (saldo * (tasaAnual / 100)) / 12;
        saldo += interesMensual;
    }

    public void extractoMensual() {
        saldo -= comisionMensual;
        calcularInteresMensual();
    }

    public String imprimir() {
        return "Saldo: " + saldo + ", Consignaciones: " + numeroConsignaciones + ", Retiros: " + numeroRetiros
                + ", Comisión mensual: " + comisionMensual;
    }
}
