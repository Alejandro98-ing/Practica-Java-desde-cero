package administrarLista;

import java.util.HashSet;

public class ProbarSet {

	public static void main(String[] args) {
		HashSet<Empleado> empSet = new HashSet<>();
		empSet.add(new Empleado(1,"Alejandro",900));
		empSet.add(new Empleado(2,"Julian",800));
		empSet.add(new Empleado(3,"Montiel",700));
		empSet.add(new Empleado(4,"Nataly",900));
		empSet.add(new Empleado(5,"Aleyda",800));
		
		for(Empleado emp:empSet) {
			System.out.println(emp.getId()+" "+emp.getNombre()+" "+emp.getSalario());
		}
	}

}
