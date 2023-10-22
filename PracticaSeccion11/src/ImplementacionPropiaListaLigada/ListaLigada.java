package ImplementacionPropiaListaLigada;

public class ListaLigada {
    private Nodo primero;
    private Nodo ultimo;

    public ListaLigada() {
    	primero = null;
    	ultimo = null;
    }

    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (primero == null) {
        	primero = nuevoNodo;
        	ultimo = nuevoNodo;
        } else {
            nuevoNodo.setAnt(ultimo);
            ultimo.setSig(nuevoNodo);
            ultimo = nuevoNodo;
        }
    }

    public void imprimir() {
        Nodo actual = primero;
        while (actual != null) {
            System.out.print(actual.getValor() + " ");
            actual = actual.getSig();
        }
        System.out.println();
    }

    public void imprimirReversa() {
        Nodo actual = ultimo;
        while (actual != null) {
            System.out.print(actual.getValor() + " ");
            actual = actual.getAnt();
        }
        System.out.println();
    }
    
    public Nodo buscar(int valor) {
        Nodo actual = primero;
        while (actual != null) {
            if (actual.getValor() == valor) {
                return actual;
            }
            actual = actual.getSig();
        }
        return null;
    }

    public void borrar(Nodo nodo) {
        if (nodo == null) {
            return;
        }
        Nodo nodoAnt = nodo.getAnt();
        Nodo nodoSig = nodo.getSig();

        if (nodoAnt != null) {
            nodoAnt.setSig(nodoSig);
        } else {
            primero = nodoSig;
        }

        if (nodoSig != null) {
            nodoSig.setAnt(nodoAnt);
        } else {
            ultimo = nodoAnt;
        }
    }

}

