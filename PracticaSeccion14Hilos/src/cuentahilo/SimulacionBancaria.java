package cuentahilo;

public class SimulacionBancaria {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1000);

        Cliente cliente1 = new Cliente(cuenta);
        Cliente cliente2 = new Cliente(cuenta);

        cliente1.start();
        cliente2.start();
    }
}

