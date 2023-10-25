public class Identificadores{
	public static void main(String args[]){
		double $sueldo=100000.45;
		double _comision=0.3;
		double sueldoTotal;
		sueldoTotal = ($sueldo)+(($sueldo)*(_comision));
		System.out.println("El sueldo total es: "
			+ String.format("%.2f",sueldoTotal));
	}
}