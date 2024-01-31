package cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1, cuenta2;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio Lopez","1000-2365-85-1230456789",2500,0);
        cuenta2 = new CCuenta("Manuel Vega","1000-2365-85-1230456790",1500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual de cuenta1 es "+ saldoActual );

        operativa_cuenta(cuenta1, cuenta2, 2300, 695, 500); // Transferir 500 de cuenta1 a cuenta2
    }

    public static void operativa_cuenta(CCuenta cuenta1, CCuenta cuenta2, float cantidadRetirar, float cantidadIngresar, float cantidad) {
        try {
            cuenta1.retirar(cantidadRetirar);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidadIngresar);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }

        // Transferir 'cantidad' de cuenta1 a cuenta2
        try {
            System.out.println("Transferencia de cuenta");
            cuenta1.retirar(cantidad); // Retirar 'cantidad' de cuenta1
            cuenta2.ingresar(cantidad); // Ingresar 'cantidad' a cuenta2
        } catch (Exception e) {
            System.out.print("Fallo al transferir");
        }
    }
}
