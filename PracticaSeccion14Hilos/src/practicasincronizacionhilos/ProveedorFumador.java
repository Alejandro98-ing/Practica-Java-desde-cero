package practicasincronizacionhilos;

import java.util.concurrent.Semaphore;

public class ProveedorFumador {
	static volatile int cigarrillo=0;
	static public Semaphore notEmpty=new Semaphore(0);
	static public Semaphore mutex=new Semaphore(1);
	static public Semaphore notFull=new Semaphore(10);
	static public int fumadores=3;
	
	static String ingrediente[]= {"tabaco", "papel", "cerillas"};
	static final int max_cigarrillos=10;
	static volatile int cont1=0;
	static volatile int cont2=0;
	static volatile int cont3=0;
	
	static int primero;
	static int segundo;
	static int tercero;
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("El proveedor a llegado");
		System.out.println("Hay un fumador que tiene TABACO");
		System.out.println("Hay un fumador que tiene PAPEL");
		System.out.println("Hay un fumador que tiene CERILLAS\n");
		
		Thread[] fumador = new Thread[fumadores];
		Thread proveedor;
		int i;
		
		proveedor = new Thread(new Proveedor());
		proveedor.start();
		
		for(i=0;i<fumadores;i++) {
			fumador[i] = new Thread(new Fumador());
			fumador[i].start();
		}
		
		proveedor.join();
		
		System.out.println("El proveedor se va");
		
		for(i=0;i<fumadores;i++) {
			fumador[i].join();
		}
		
		System.out.println("El fumador que tiene tabaco se va. Se ha fumado "+ProveedorFumador.cont1+" cigarrillos");
		System.out.println("El fumador que tiene papel se va. Se ha fumado "+ProveedorFumador.cont2+" cigarrillos");
		System.out.println("El fumador que tiene cerilla se va. Se ha fumado "+ProveedorFumador.cont3+" cigarrillos");
	}
}
