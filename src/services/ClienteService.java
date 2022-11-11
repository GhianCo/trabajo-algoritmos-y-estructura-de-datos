package services;

import java.util.List;
import models.entities.Cliente;

public interface ClienteService {
    public void crear(Cliente producto);
    
    public Cliente buscar(Object id);
    public List<Cliente> listar();
    
    public void update(Cliente cliente);
    public void borrar(Object id);
}
