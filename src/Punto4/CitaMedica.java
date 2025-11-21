package Punto4;

import java.time.LocalDate;

public class CitaMedica implements Comparable<CitaMedica> {
    private int numeroCita;
    private String paciente;
    private String medico;
    private LocalDate fecha;
    private String especialidad;
    private boolean confirmacion;

    public CitaMedica(int numeroCita, String paciente,String medico, LocalDate fecha, String especialidad, boolean confirmacion)  {
        this.numeroCita = numeroCita;
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.especialidad = especialidad;
        this.confirmacion = confirmacion;
    }

    @Override
    public int compareTo(CitaMedica citaMedica) {
        return Integer.compare(this.numeroCita, citaMedica.numeroCita);
    }

    public int getNumeroCita() {
        return numeroCita;
    }

    public void setNumeroCita(int numeroCita) {
        this.numeroCita = numeroCita;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isConfirmacion() {
        return confirmacion;
    }

    public void setConfirmacion(boolean confirmacion) {
        this.confirmacion = confirmacion;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {
        return "Cita medica: paciente: " + getPaciente() + " medico: " + getMedico() + " fecha: " + getFecha() + " fecha" + getFecha() + " especialidad: " + getEspecialidad();
    }
}
