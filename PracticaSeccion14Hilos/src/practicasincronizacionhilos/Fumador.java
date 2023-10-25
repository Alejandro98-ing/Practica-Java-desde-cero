package practicasincronizacionhilos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Fumador implements Runnable{

	@Override
	public void run() {
		while(true) {
			try {
				ProveedorFumador.notFull.acquire();
				if(ProveedorFumador.cigarrillo<ProveedorFumador.max_cigarrillos) {
					ProveedorFumador.notEmpty.acquire();
					
					System.out.println("El proveedor pone "+ProveedorFumador.ingrediente[ProveedorFumador.primero]
							+" y "+ProveedorFumador.ingrediente[ProveedorFumador.segundo]+" encima de la mesa "
							+"y avisa al fumador que tiene "+ProveedorFumador.ingrediente[ProveedorFumador.tercero]);
					
					ProveedorFumador.cigarrillo++;
					System.out.println("\n Total de cigarrillos fumados "+ProveedorFumador.cigarrillo+"\n");
					
					if(ProveedorFumador.tercero==0)ProveedorFumador.cont1++;
					else if (ProveedorFumador.tercero==1)ProveedorFumador.cont2++;
					else ProveedorFumador.cont3++;
					
					Thread.sleep(100);
					
					ProveedorFumador.mutex.release();
				}else break;
			}catch(InterruptedException ex) {
				Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}
}

