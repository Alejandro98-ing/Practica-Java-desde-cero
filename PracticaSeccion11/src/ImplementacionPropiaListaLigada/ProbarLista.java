package ImplementacionPropiaListaLigada;

public class ProbarLista {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.agregar(4);
        lista.agregar(5);
        lista.agregar(6);
        lista.agregar(7);
        lista.agregar(8);
        lista.agregar(9);
        lista.agregar(10);

        System.out.print("Elementos en orden normal: ");
        lista.imprimir();
        System.out.print("Elementos en reversa: ");
        lista.imprimirReversa();
        System.out.print("Elemento encontrado: ");
        Nodo nodoEncontrado = lista.buscar(9);
        int valorEncontrado = nodoEncontrado.getValor();
        System.out.print(valorEncontrado+"\n");
        Nodo nodoParaBorrar = lista.buscar(6);
        lista.borrar(nodoParaBorrar);
        System.out.print("Elementos en la lista ligada despues de borrar un elemento: ");
        lista.imprimir();
        
	}

}
