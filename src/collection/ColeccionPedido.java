package collection;

import iterator.Agregado;
import iterator.Iterator;
import model.Pedido;


import java.util.ArrayList;
import java.util.List;

public class ColeccionPedido implements Agregado {
    private List<Pedido> lista;

    public ColeccionPedido() {
        this.lista = new ArrayList<>();

        agregar(new Pedido("P03", "2026-06-13 18:00", "Luis", 450.0));
        agregar(new Pedido("P01", "2026-06-13 09:30", "Carlos", 120.0));
        agregar(new Pedido("P02", "2026-06-13 14:15", "Ana", 85.0));
        agregar(new Pedido("P04", "2026-06-14 10:00", "María", 200.0));
    }

    public void agregar(Pedido p){
        lista.add(p);
    }


    @Override
    public Iterator createIterador() {
        return new IteradorLista(lista);
    }

}
