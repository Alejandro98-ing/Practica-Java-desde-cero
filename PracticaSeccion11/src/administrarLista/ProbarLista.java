package administrarLista;

import java.util.ArrayList;
import java.util.List;

public class ProbarLista {

	public static void main(String[] args) {
		List<Empleado> listaEmp = new ArrayList<>();
		DAOEmpleado daoEmpleado = new DAOEmpleado();
		Empleado emp = new Empleado();
		Empleado empM = new Empleado();
		emp = new Empleado("Alejandro",700);
		daoEmpleado.agregarEmpleado(emp);
		emp = new Empleado("Julian",900);
		daoEmpleado.agregarEmpleado(emp);
		emp = new Empleado("Solari",1000);
		daoEmpleado.agregarEmpleado(emp);
		emp = new Empleado("Nataly",700);
		daoEmpleado.agregarEmpleado(emp);
		
		listaEmp = daoEmpleado.obtenerEmpleados();
		for(Empleado empleado : listaEmp) {
			System.out.println("Id: "+empleado.getId()+" Nombre: "+empleado.getNombre()+" Salario: "+empleado.getSalario()+"\n");
		}
		empM = daoEmpleado.obtenerEmpleadoPorId(3);
		System.out.println("El empleado con id "+empM.getId()+" es:");
		System.out.println("Id: "+empM.getId()+" Nombre: "+empM.getNombre()+" Salario: "+empM.getSalario()+"\n");
		daoEmpleado.eliminarEmpleado(1);
		
	}

}
