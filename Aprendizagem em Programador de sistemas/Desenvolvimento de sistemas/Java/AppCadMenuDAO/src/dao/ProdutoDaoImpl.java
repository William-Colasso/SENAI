package dao;

import java.util.*;
import java.sql.*;
import model.Produto;

public class ProdutoDaoImpl implements ProdutoDao {

    private Connection connection;

    public ProdutoDaoImpl() {
        try {

            String url = "jdbc:mysql://localhost:3306/db_sccpf";
            String user = "root";
            String password = "";

            // Estabelece a conexão com o banco de dados usando os parâmetros obtidos
            connection = DriverManager.getConnection(url, user, password);
            if (connection == null) {
                throw new SQLException("Falha em conecectar ao mySQL.");
            }

        } catch (SQLException e) {
            // Captura qualquer exceção que ocorra durante o processo de conexão
            // e imprime o stack trace para ajudar na depuração
            e.printStackTrace();
        }

    }

    @Override
    public void addProduto(Produto produto) {
        try {
            String query = "INSERT INTO Produto (descricao,unidade,quantidade,preco) VALUES (?,?,?,?)";

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, produto.getDescricao());
            statement.setString(2, produto.getUnidade());
            statement.setFloat(3, produto.getQtd());
            statement.setFloat(4, produto.getPreco());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Produto getProduto(int codigo) {
        Produto produto = null;
        try {
            String query = "SELECT * FROM Produto WHERE codigo = ?";

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, codigo);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                produto = new Produto(resultSet.getInt("codigo"), resultSet.getString("descricao"), resultSet.getString("unidade"), resultSet.getFloat("quantidade"), resultSet.getFloat("preco"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return produto;
    }

    @Override
    public List<Produto> getAllProdutos() {
        List<Produto> produtos = new ArrayList<>();
        try {
            String query = "SELECT * FROM Produto";

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                produtos.add(new Produto(resultSet.getInt("codigo"), resultSet.getString("descricao"), resultSet.getString("unidade"), resultSet.getFloat("quantidade"), resultSet.getFloat("preco")));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }

    @Override
    public void updateProduto(Produto produto) {
        try {
            String query = "UPDATE Produto SET descricao = ?, unidade = ?, quantidade = ?, preco = ? WHERE codigo = ?";

            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, produto.getDescricao());
            statement.setString(2, produto.getUnidade());
            statement.setFloat(3, produto.getQtd());
            statement.setFloat(4, produto.getPreco());
            statement.setInt(5, produto.getCod());  // Corrigido
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteProduto(int codigo) {
        try {
            String query = "DELETE FROM Produto WHERE codigo = ?";

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, codigo);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
