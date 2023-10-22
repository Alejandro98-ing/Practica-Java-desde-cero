package practicaexcepciones;

class TituloIncorrectoException extends RuntimeException{
	private static final long serialVersionUID = 4037539706838423051L;
	
	public TituloIncorrectoException(String error) {
		super(error);
	}
}

public class ExcepcionesPropias {
	static void crearCurso(String titulo) {
		if(!titulo.toUpperCase().equals(titulo)) {
			throw new TituloIncorrectoException("El título debe estar en mayúsculas");
		}
		System.out.println("Título correcto");
	}
	
	public static void main(String[] args) {
		try {
		crearCurso("JAVA desde CERO A PRODUNFIDAD");
		}catch(TituloIncorrectoException e) {
			System.out.println("Error "+e.getMessage());
		}
	}
}
