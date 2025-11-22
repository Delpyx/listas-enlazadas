package Parcial1;

public class Venta implements Comparable<Venta> {
    private int codigoVenta;
    private String nombreCliente;
    private String emailCliente;
    private String nombreVendedor;
    private int cantidadProductosVendidos;
    private double precioProducto;

    public Venta(int codigoVenta, String nombreCliente, String emailCliente, String nombreVendedor, int cantidadProductosVendidos, double precioProducto) {
        this.codigoVenta = codigoVenta;
        this.nombreCliente = nombreCliente;
        this.emailCliente = emailCliente;
        this.nombreVendedor = nombreVendedor;
        this.cantidadProductosVendidos = cantidadProductosVendidos;
        this.precioProducto = precioProducto;

    }

    public int getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public int getCantidadProductosVendidos() {
        return cantidadProductosVendidos;
    }

    public void setCantidadProductosVendidos(int cantidadProductosVendidos) {
        this.cantidadProductosVendidos = cantidadProductosVendidos;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    @Override
    public int compareTo(Venta venta) {
        return 0;
    }
}
