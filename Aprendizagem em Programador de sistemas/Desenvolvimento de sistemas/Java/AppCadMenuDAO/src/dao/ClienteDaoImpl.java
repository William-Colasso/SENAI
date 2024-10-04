package dao;

import java.util.*;
import model.Cliente;
import java.sql.*;
import javax.swing.JOptionPane;

public class ClienteDaoImpl implements ClienteDao {

    private Connection connection;

    public ClienteDaoImpl() {
        try {
            String url = "jdbc:mysql://localhost:3306/db_sccpf";
            String user = "root";
            String password = "";

            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados.");
            e.printStackTrace();
        }

    }

    @Override
    public void addCliente(Cliente cliente) {
        try {

            String query = "INSERT INTO CLIENTE (nome, fone, email, endereco) VALUES (?, ?,?,?)";

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, cliente.getNome());
            statement.setString(2, cliente.getFone());
            statement.setString(3, cliente.getEmail());
            statement.setString(4, cliente.getEndereco());

            statement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados.");
            e.printStackTrace();
        }
    }

    @Override
    public Cliente getCliente(int codigo) {
        Cliente cliente = null;

        try {
            String query = "SELECT * FROM Cliente WHERE codigo = ?";

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, codigo);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                cliente = new Cliente(resultSet.getInt("codigo"),resultSet.getString("nome"), resultSet.getString("fone"), resultSet.getString("email"),resultSet.getString("endereco"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados.");
            e.printStackTrace();
        }

        return cliente;
    }

    @Override
    public List<Cliente> getAllClientes() {
        List<Cliente> clientes = new ArrayList<>();
        try {
            String query = "SELECT * FROM Cliente";

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                clientes.add(new Cliente(resultSet.getInt("codigo"),resultSet.getString("nome"), resultSet.getString("fone"), resultSet.getString("email"),resultSet.getString("endereco")));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados.");
            e.printStackTrace();
        }
        return clientes;
    }

    @Override
    public void updateCliente(Cliente cliente) {
        try {
            String query = "UPDATE Cliente SET nome = ?,  fone = ?,  email = ?,  endereco = ? WHERE codigo = ?";

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, cliente.getNome());
            statement.setString(2, cliente.getFone());
            statement.setString(3, cliente.getEmail());
            statement.setString(4, cliente.getEndereco());
            statement.setInt(5, cliente.getCodigo());

            statement.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados.");
            e.printStackTrace();
        }

    }

    @Override
    public void deleteCliente(int codigo) {
        try {
            String query = "DELETE FROM Cliente WHERE codigo = ? ";
            
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, codigo);
            statement.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados.");
            e.printStackTrace();
        }
    }

}
