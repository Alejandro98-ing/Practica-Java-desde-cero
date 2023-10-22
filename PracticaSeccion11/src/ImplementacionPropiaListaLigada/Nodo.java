package ImplementacionPropiaListaLigada;

public class Nodo {
    private int valor;
    private Nodo sig;
    private Nodo ant;

    public Nodo(int valor) {
        this.valor = valor;
        this.sig = null;
        this.ant = null;
    }

    public int getValor() {
        return valor;
    }

    public Nodo getSig() {
        return sig;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }
}

