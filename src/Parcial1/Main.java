package Parcial1;

import Estructuras.SimpleLinkedList;

public class Main {
    public static void main(String[] args) {
        SimpleLinkedList<Venta> ventaGenerales = new SimpleLinkedList<Venta>();
    }
    //A
    public static double calcularPromedioLista(SimpleLinkedList<Venta> ventaGenerales){
        double productoVendidosTotales = 0;
        for(Venta venta : ventaGenerales){
            int cantidad = venta.getCantidadProductosVendidos();
            productoVendidosTotales += cantidad;
        }
        double promedioTotal = productoVendidosTotales / ventaGenerales.size();
        return promedioTotal;
    }
    public static void vendedoresSuperanPromedio(SimpleLinkedList<Venta> ventaGenerales, double promedioTotal){
        for(Venta venta : ventaGenerales){
            if(venta.getCantidadProductosVendidos()>promedioTotal){
                System.out.println("El vendedor " + venta.getNombreVendedor() + " ha superado el promedio de productos vendidos!");
            }
        }
    }
    //B
    public static SimpleLinkedList<String> clientesSuperanGastoMaximo(SimpleLinkedList<Venta> ventasGenerales, double gastoMaximo){
        double gastoTotal;
        SimpleLinkedList<String> clientesSuperanGastoMaximo = new SimpleLinkedList<String>();
        for(Venta venta : ventasGenerales){
            gastoTotal = venta.getPrecioProducto() * venta.getCantidadProductosVendidos();
            if(gastoTotal>gastoMaximo){
                clientesSuperanGastoMaximo.addLast(venta.getNombreCliente());
            }
        }
        return clientesSuperanGastoMaximo;

    }

}
