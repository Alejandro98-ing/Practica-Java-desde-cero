package practicaclasesinternas;

abstract class FiguraAnonima{
	abstract void foo();
}
public class ClasesAnonimasAbstractas {
	public static void main(String[] args) {
		FiguraAnonima figura = new FiguraAnonima() {
			
			@Override
			void foo() {
				System.out.println("Foo");
			}
		};
		figura.foo();
	}
}
