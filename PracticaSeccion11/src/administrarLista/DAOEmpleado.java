package administrarLista;

import java.util.ArrayList;
import java.util.List;

public class DAOEmpleado {
	private int ultimoId=0;
	private List<Empleado> listaEmpleados = new ArrayList<>();
	
	public List<Empleado> obtenerEmpleados(){
		return listaEmpleados;
	}
		
	public Empleado obtenerEmpleadoPorId(int id) {
		for(Empleado empleado : listaEmpleados) {
			if(empleado.getId() == id) {
				return empleado;
			}
		}
		return null;
	}
	
	public boolean agregarEmpleado(Empleado empleado) {
		empleado.setId(++ultimoId);//en este  caso al autogenerar el id
								   //no se duplicaria al registrarlo
		return listaEmpleados.add(empleado);
	}
	
	public boolean eliminarEmpleado(int id) {
		Empleado empEliminar = obtenerEmpleadoPorId(id);
		if(empEliminar != null) {
			listaEmpleados.remove(empEliminar);
			System.out.println("El empleado con id "+id+" ha sido eliminado");
			return true;
		}
		return false;
	}
}
