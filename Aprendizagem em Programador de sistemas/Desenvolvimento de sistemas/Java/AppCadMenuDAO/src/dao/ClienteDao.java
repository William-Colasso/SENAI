
package dao;

import model.Cliente;
import java.util.*;

public interface ClienteDao {
    void addCliente (Cliente cliente);
    Cliente getCliente(int codigo);
    List<Cliente> getAllClientes();
    void updateCliente(Cliente cliente);
    void deleteCliente(int codigo);
}
