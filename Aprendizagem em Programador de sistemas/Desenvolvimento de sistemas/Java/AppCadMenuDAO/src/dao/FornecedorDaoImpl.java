package dao;

import java.util.*;
import model.Fornecedor;
import java.sql.*;

/**
 *
 * @author william_c_pereira
 */
public class FornecedorDaoImpl implements FornecedorDao {

    private Connection connection;

    public FornecedorDaoImpl() {
        try {

            String url = "jdbc:mysql://localhost:3306/db_sccpf";
            String user = "root";
            String password = "";

            // Estabelece a conexão com o banco de dados usando os parâmetros obtidos
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            // Captura qualquer exceção que ocorra durante o processo de conexão
            // e imprime o stack trace para ajudar na depuração
            e.printStackTrace();
        }
    }

    @Override
    public void addFornecedor(Fornecedor fornecedor) {
        try {

            String query = "INSERT INTO Fornecedor (empresa, contato,fone, email) (?,?,?,?)";

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, fornecedor.getEmpresa());
            statement.setString(2, fornecedor.getContato());
            statement.setString(3, fornecedor.getFone());
            statement.setString(4, fornecedor.getEmail());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Fornecedor getFornecedor(int codigo) {
        Fornecedor fornecedor = null;
        try {
            
            String query = "SELECT * FROM Fornecedor WHERE codigo = ?";

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, codigo);
            
            ResultSet resultSet = statement.executeQuery();
            
            if(resultSet.next()){
                fornecedor = new Fornecedor(resultSet.getInt("codigo"), resultSet.getString("empresa"), resultSet.getString("contato"), resultSet.getString("fone"), resultSet.getString("email"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return fornecedor;
    }

    @Override
    public List<Fornecedor> getAllFornecedores() {

        List<Fornecedor> fornecedores = new ArrayList<>();

        try {
            
            String query = "SELECT * FROM Fornecedor";

            Statement statement = connection.createStatement();
 
            
            ResultSet resultSet = statement.executeQuery(query);
            
            while(resultSet.next()){
                fornecedores.add(new Fornecedor(resultSet.getInt("codigo"), resultSet.getString("empresa"), resultSet.getString("contato"), resultSet.getString("fone"), resultSet.getString("email")));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

      
        return fornecedores;
    }

    @Override
    public void updateFornecedor(Fornecedor fornecedor) {

        
    }

    @Override
    public void deleteFornecedor(int codigo) {

    }

}
