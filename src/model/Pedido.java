package model;

public class Pedido {
    private String id;
    private String fecha;
    private String cliente;
    private double precioTotal;
    private String estado; // pendiente, rechazada o aprobado

    public Pedido(String id, String fecha, String cliente, double precioTotal, String estado) {
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
        this.precioTotal = precioTotal;
        this.estado = "Pendiente";
    }

    public String getId() {
        return id;
    }

    public String getFecha() {
        return fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id='" + id + '\'' +
                ", fecha='" + fecha + '\'' +
                ", cliente='" + cliente + '\'' +
                ", Total: S/" + precioTotal +
                ", estado='" + estado + '\'' +
                '}';
    }
}
