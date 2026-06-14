package collection;

import iterator.Iterator;
import model.Pedido;

import java.util.ArrayList;
import java.util.List;

public class IteradorLista implements Iterator {
    private List<Pedido>listaOrdenada;
    private int posicion = 0;

    public IteradorLista(List<Pedido> listaO) {
        this.listaOrdenada = new ArrayList<>(listaO);
        this.listaOrdenada.sort((p1,p2)->p1.getFecha().compareTo(p2.getFecha()));
    }

    @Override
    public boolean hasNext() {
        return posicion < listaOrdenada.size();
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            return null;
        }
        return listaOrdenada.get(posicion++);
    }

}
