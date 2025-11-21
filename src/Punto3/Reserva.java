package Punto3;
import java.time.LocalDate;

public class Reserva implements Comparable<Reserva> {
    private int codigo;
    private String recurso;
    private LocalDate fecha;
    private String solicitante;

    public Reserva(int codigo, String recurso, LocalDate fecha, String solicitante) {
        this.codigo = codigo;
        this.recurso = recurso;
        this.fecha = fecha;
        this.solicitante = solicitante;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getRecurso() {
        return recurso;
    }

    public void setRecurso(String recurso) {
        this.recurso = recurso;
    }
    public int compareTo(Reserva reserva) {
        return this.getCodigo() - reserva.getCodigo();
    }
}
