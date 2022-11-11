package models.entities;

public class Cliente  {
    
    
    public enum membresia{BLACK,ORO,PLATA,CLASICO};

    

    int cliente_id;
    int membresia_id;
    String  cliente_orden;
    private String cliente_nombres;
    private String cliente_apellidos;
    private int edad;
    private String telefono;
    private membresia membresia;
    
    public Cliente() {
        
    }

    public Cliente(int cliente_id, int membresia_id, String cliente_orden, String cliente_nombres, String cliente_apellidos, int edad, String telefono, membresia membresia) {
        this.cliente_id = cliente_id;
        this.membresia_id = membresia_id;
        this.cliente_orden = cliente_orden;
        this.cliente_nombres = cliente_nombres;
        this.cliente_apellidos = cliente_apellidos;
        this.edad = edad;
        this.telefono = telefono;
        this.membresia = membresia;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public int getMembresia_id() {
        return membresia_id;
    }

    public void setMembresia_id(int membresia_id) {
        this.membresia_id = membresia_id;
    }

    public String getCliente_orden() {
        return cliente_orden;
    }

    public void setCliente_orden(String cliente_orden) {
        this.cliente_orden = cliente_orden;
    }

    public String getCliente_nombres() {
        return cliente_nombres;
    }

    public void setCliente_nombres(String cliente_nombres) {
        this.cliente_nombres = cliente_nombres;
    }

    public String getCliente_apellidos() {
        return cliente_apellidos;
    }

    public void setCliente_apellidos(String cliente_apellidos) {
        this.cliente_apellidos = cliente_apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(membresia membresia) {
        this.membresia = membresia;
    }
    
    
}
    
    