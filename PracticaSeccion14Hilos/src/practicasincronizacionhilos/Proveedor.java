package practicasincronizacionhilos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Proveedor implements Runnable{

	@Override
	public void run() {
		while(ProveedorFumador.cigarrillo<ProveedorFumador.max_cigarrillos) {
			try {
				Random random = new Random();
				List<Integer> numero = new ArrayList<>();
				for(int j=0;j<ProveedorFumador.ingrediente.length;j++) {
					numero.add(j);
				}
				
				int tamanio=numero.size();
				int dos;
				
				ProveedorFumador.mutex.acquire();
				ProveedorFumador.primero=random.nextInt(tamanio);
				numero.remove(ProveedorFumador.primero);
				tamanio--;
				dos=random.nextInt(tamanio);
				ProveedorFumador.segundo=numero.get(dos);
				
				numero.remove(dos);
				ProveedorFumador.tercero=numero.get(0);
				
				System.out.println("El proveedor pone "+ProveedorFumador.ingrediente[ProveedorFumador.primero]
						+" y "+ProveedorFumador.ingrediente[ProveedorFumador.segundo]+" encima de la mesa "
						+"y avisa al fumador que tiene "+ProveedorFumador.ingrediente[ProveedorFumador.tercero]);
				
				ProveedorFumador.notEmpty.release();
				Thread.sleep(100);
			}catch(InterruptedException ex) {
				Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		ProveedorFumador.notFull.release(3);
	}

}
