package Punto4;

import Estructuras.SimpleLinkedList;

import java.time.LocalDate;

public class SistemaCitas {
    private SimpleLinkedList<CitaMedica> citas;
    public SistemaCitas() {
        citas = new SimpleLinkedList();
    }


    public SimpleLinkedList<CitaMedica> getCitas() {
        return citas;
    }

    public void setCitas(SimpleLinkedList<CitaMedica> citas) {
        this.citas = citas;
    }
    public void agregarCita(CitaMedica cita){
        this.citas.addLast(cita);
    }
    public void confirmarCita(int numeroCita){
        for(CitaMedica cita: this.citas){
            if(cita.getNumeroCita() == numeroCita){
                cita.setConfirmacion(true);
            }
        }
    }
    public SimpleLinkedList<CitaMedica> obtenerMedicos(String medico){
        SimpleLinkedList<CitaMedica> medicosPorCita = new SimpleLinkedList<>();
        for(CitaMedica cita: this.citas){
            if(cita.getMedico().equals(medico)){
                medicosPorCita.addLast(cita);
            }
        }
        return medicosPorCita;
    }
    public void mostrarCitasConfirmadas(){
        for(CitaMedica cita: this.citas){
            if(cita.isConfirmacion()){
                System.out.println(cita);
            }
        }
    }
    public void cancelarCita(int numeroCita){
        for(CitaMedica cita: this.citas){
            if(cita.getNumeroCita() == numeroCita){
                this.citas.eliminarPrimeraCoincidencia(cita);
                return;
            }
        }
    }
    public SimpleLinkedList<CitaMedica> proximasCitas(String paciente){
        SimpleLinkedList<CitaMedica> proximasCitas = new SimpleLinkedList<>();
        LocalDate hoy = LocalDate.now();
        for(CitaMedica cita: this.citas){
            if(cita.getPaciente().equals(paciente) && cita.getFecha().isEqual(hoy)){
                proximasCitas.addLast(cita);
            }
        }
        return proximasCitas;
    }
    public void mostrarCitas(){
        for(CitaMedica cita: this.citas){
            System.out.println(cita);
        }
    }
}
