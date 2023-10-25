package ejercicio1;

import java.util.Random;

class CreacionHilo extends Thread{

	private int valor;
	
	public CreacionHilo(int valor) {
		this.valor=valor;
	}
	
	@Override
	public void run() {
		for(int i=valor;i>=0;i--) {
			System.out.printf("%s Valor %d \n",Thread.currentThread().getName(),i);
			try {
				Thread.sleep(new Random().nextInt(200));
			} catch (InterruptedException e) {
				
			}
		}
	}
}

public class CuentaRegresiva extends Thread{

	public static void main(String[] args) {
		int valor=10;
		Thread hilo = new Thread(new CreacionHilo(valor),"Hilo1");
		hilo.start();
		Thread hilo2 = new Thread(new CreacionHilo(valor),"Hilo2");
		hilo2.start();
		Thread hilo3 = new Thread(new CreacionHilo(valor),"Hilo3");
		hilo3.start();
		Thread hilo4 = new Thread(new CreacionHilo(valor),"Hilo4");
		hilo4.start();
		Thread hilo5 = new Thread(new CreacionHilo(valor),"Hilo5");
		hilo5.start();
		Thread hilo6 = new Thread(new CreacionHilo(valor),"Hilo6");
		hilo6.start();
		Thread hilo7 = new Thread(new CreacionHilo(valor),"Hilo7");
		hilo7.start();
		Thread hilo8 = new Thread(new CreacionHilo(valor),"Hilo8");
		hilo8.start();
		Thread hilo9 = new Thread(new CreacionHilo(valor),"Hilo9");
		hilo9.start();
		Thread hilo10 = new Thread(new CreacionHilo(valor),"Hilo10");
		hilo10.start();
	}
}
