package proyecto2;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PrioridadCliente{

    Comparator <Cliente> porMembresia= Comparator.comparing(Cliente::getMembresia);
    Comparator <Cliente> porNombre=Comparator.comparing(Cliente::getNombre); 
    Comparator <Cliente> porEdad=Comparator.comparing(Cliente::getEdad); 
    Comparator <Cliente> porNumOrden=Comparator.comparing(Cliente::getnOrden);
    
    
    Comparator<Cliente> total=porMembresia.thenComparing(porNombre).thenComparing(porEdad).thenComparing(porNumOrden);
            
    Queue<Cliente> cola = new PriorityQueue<>(total);
}