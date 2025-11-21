package Punto3;
import Estructuras.SimpleLinkedList;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {

        SimpleLinkedList<Reserva> reservas1 = new SimpleLinkedList<>();
        SimpleLinkedList<Reserva> reservas2 = new SimpleLinkedList<>();
    }
    public static void unirRecursos(SimpleLinkedList<Reserva> reservas1,SimpleLinkedList<Reserva> reservas2){
        SimpleLinkedList<Reserva> reservarsComunes = new SimpleLinkedList<>();
        SimpleLinkedList<String> recursos = new SimpleLinkedList<>();
        for (Reserva reserva : reservas1) {
            String recurso = reserva.getRecurso();
            recursos.addFirst(recurso);
        }
    }
}
