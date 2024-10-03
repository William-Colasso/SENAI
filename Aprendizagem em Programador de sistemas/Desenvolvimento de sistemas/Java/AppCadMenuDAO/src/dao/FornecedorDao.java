
package dao;

import model.Fornecedor;
import java.util.*;

public interface FornecedorDao {
  void addFornecedor(Fornecedor fornecedor);  
  Fornecedor getFornecedor(int codigo);
  List<Fornecedor> getAllFornecedores();
  void updateFornecedor (Fornecedor fornecedor);
  void deleteFornecedor(int codigo);
}
