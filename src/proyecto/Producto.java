/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.Comparator;

/**
 *
 * @author ELIAS
 */
public class Producto  implements Comparable<Producto> {
    String nombre;
    int id;
    int id_categoria;
    double costo;
    double precio;
    int cantvendida;
    String nombre_categoria;

    
    @Override
    
    
    public int compareTo(Producto o) {
        
         return PRODUCTO_COMPARATOR_NATURAL_ORDER.compare(this, o);
    }
    
     private static final Comparator<Producto> PRODUCTO_COMPARATOR_NATURAL_ORDER = Comparator.comparing(Producto::getNombre);
           
     
//     private static final Comparator<Producto> CAT_COMPARATOR_NATURAL_ORDER = Comparator.comparing
    
    public Producto(String nombre, int id, int id_categoria, double costo, double precio, int cantvendida,String nombre_categoria) {
        this.nombre = nombre;
        this.id = id;
        this.id_categoria = id_categoria;
        this.costo = costo;
        this.precio = precio;
        this.cantvendida = cantvendida;
        this.nombre_categoria = nombre_categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    
    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantvendida() {
        return cantvendida;
    }

    public void setCantvendida(int cantvendida) {
        this.cantvendida = cantvendida;
    }
    
     @Override
    public String toString() {
        return "nombre = " + nombre + ", codigo = " + id + ", id_categoria = " + id_categoria 
                +", costo = "+costo +", precio = "+precio + ", cantidad vendida = " +cantvendida;
    }

    

    
}
