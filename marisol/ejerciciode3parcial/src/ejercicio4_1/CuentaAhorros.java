package ejercicio4_1;

public class CuentaAhorros extends Cuenta {
    private boolean activa;

    public CuentaAhorros(float saldo, float tasa) {
        super(saldo, tasa);
        if (saldo < 10000)
            activa = false;
        else
            activa = true;
    }

    public void retirar(float cantidad) {
        if (activa)
            super.retirar(cantidad);
    }

    public void consignar(float cantidad) {
        if (activa)
            super.consignar(cantidad);
    }
    /**
     * Método que genera el extracto mensual de una cuenta de ahorros
     */
    public void extractoMensual() {

        if (númeroRetiros > 4) {
            comisiónMensual += (númeroRetiros - 4) * 1000;
        }
        super.extractoMensual();

        if ( saldo < 10000 )
            activa = false;
    }

    public void imprimir() {
        System.out.println("su Saldo = $ " + saldo);
        System.out.println("la Comisión mensual = $ " +
                comisiónMensual);
        System.out.println("Número de transacciones = "+
                (númeroConsignaciones + númeroRetiros));
        System.out.println();
    }
}