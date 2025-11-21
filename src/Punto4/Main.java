package Punto4;

import Estructuras.SimpleLinkedList;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaCitas sistemaCitas = new SistemaCitas();
        System.out.print("Bienvenido al sistema de citas medicas");
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("Elija una opcion: ");
            System.out.println("1. Agregar una cita");
            System.out.println("2. Confirmar una cita");
            System.out.println("3. Obtener citas de un medico");
            System.out.println("4. Mostrar citas confirmadas");
            System.out.println("5. Mostrar citas medicas");
            System.out.println("6. Cancelar una cita");
            System.out.println("7. Mostrar citas futuras de un paciente");
            System.out.println("8. Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingresar numero: ");
                    int numeroCita = sc.nextInt();
                    System.out.println("Paciente: ");
                    String paciente = sc.next();
                    System.out.println("Medico: ");
                    String medico = sc.next();
                    System.out.println("Ingrese la fecha de la cita (Formato AAAA-MM-DD): ");
                    String fechaTexto = sc.next();
                    LocalDate fechaCita = LocalDate.parse(fechaTexto);
                    System.out.println("Especialidad: ");
                    String especialidad = sc.next();
                    System.out.println("Confirmado si o no?");
                    String pregunta = sc.next();
                    boolean confirmacion;
                    if(pregunta.equalsIgnoreCase("si")) {
                        confirmacion = true;
                    } else{
                        confirmacion = false;
                    }
                    CitaMedica cita = new CitaMedica(numeroCita,paciente,medico,fechaCita,especialidad,confirmacion);
                    sistemaCitas.agregarCita(cita);
                    break;
                case 2:
                    System.out.println("Cual es el numero de la cita que quiere confirmar? ");
                    int numeroCitaBuscado = sc.nextInt();
                    sistemaCitas.confirmarCita(numeroCitaBuscado);
                    break;
                case 3:
                    System.out.println("Ingrese medico: ");
                    String medicoBuscado = sc.next();
                    SimpleLinkedList<CitaMedica> citasPorMedico = new SimpleLinkedList<>();
                    citasPorMedico =  sistemaCitas.obtenerMedicos(medicoBuscado);
                    for (CitaMedica c : citasPorMedico) {
                        System.out.println(c);
                    }
                    break;
                case 4:
                    sistemaCitas.mostrarCitasConfirmadas();
                    break;
                case 5:
                    sistemaCitas.mostrarCitas();
                    break;
                case 6:
                    System.out.println("Cual es el numero de la cita que quiere eliminar? ");
                    numeroCitaBuscado = sc.nextInt();
                    sistemaCitas.cancelarCita(numeroCitaBuscado);
                    break;
                case 7:
                    System.out.println("Ingrese el paciente para ver sus citas futuras: ");
                    String pacienteBuscado = sc.next();
                    SimpleLinkedList<CitaMedica> proximasCitas = new SimpleLinkedList<>();
                    proximasCitas = sistemaCitas.proximasCitas(pacienteBuscado);
                    for (CitaMedica c : proximasCitas) {
                        System.out.println(c);
                    }
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while(opcion != 8);
    }
}
