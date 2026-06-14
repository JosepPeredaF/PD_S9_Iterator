import collection.ColeccionPedido;
import iterator.Agregado;
import iterator.Iterator;
import model.Pedido;

public class Main {
    public static void main(String[] args) {
        Agregado CPedido = new ColeccionPedido();
        procesarPedidos(CPedido);
    }

    private static void procesarPedidos(Agregado CPedido){
        Iterator itr = CPedido.createIterador();

        System.out.println("Lista de pedidos por fecha");
        while (itr.hasNext()){
            Pedido pe = (Pedido) itr.next();
            pe.setEstado("Aprobado");
            System.out.println("" + pe);
        }
    }
}
