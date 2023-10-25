package cuentahilo;

public class Cliente extends Thread {
    private Cuenta cuenta;

    public Cliente(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void run() {
        cuenta.depositar(100);
        cuenta.retirar(50);
        cuenta.retirar(50);
        cuenta.retirar(50);
        cuenta.retirar(50);
        cuenta.retirar(50);
        cuenta.retirar(1000);
        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}

