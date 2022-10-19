package proyecto;
public class Cliente  {
    
    
    public enum membresia{BLACK,ORO,PLATA,CLASICO};

    
    private int nOrden;
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private int telefono;
    private membresia membresia;
    
    

    public Cliente(int nOrden, String nombre, String apellido, int edad, int dni, int telefono, membresia membresia) {
        this.nOrden = nOrden;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.telefono = telefono;
        this.membresia = membresia;
    }

    /**
     * @return the nOrden
     */
    public int getnOrden() {
        return nOrden;
    }

    /**
     * @param nOrden the nOrden to set
     */
    public void setnOrden(int nOrden) {
        this.nOrden = nOrden;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the dni
     */
    public int getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(int dni) {
        this.dni = dni;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the membresia
     */
    public membresia getMembresia() {
        return membresia;
    }

    /**
     * @param membresia the membresia to set
     */
    public void setMembresia(membresia membresia) {
        this.membresia = membresia;
    }
    
    
    
}
    
    