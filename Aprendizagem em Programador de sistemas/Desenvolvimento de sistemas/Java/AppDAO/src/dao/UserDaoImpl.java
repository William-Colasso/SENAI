package dao;


import java.sql.*;
import java.util.*;

import model.User;

public class UserDaoImpl implements UserDao {

    // Declara uma variável de conexão com o banco de dados
    private Connection connection;

    // Construtor da classe, responsável por inicializar a conexão com o banco de
    // dados
    public UserDaoImpl() {
        try {
           
            String url = "jdbc:mysql://localhost:3306/db_dao";
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

    // Implementação do método addUser para adicionar um usuário ao banco de dados
    @Override
    public void addUser(User user) {
        try {
            // Declara uma query SQL para inserir um novo usuário na tabela 'users'
            String query = "INSERT INTO users (name, email) VALUES (?, ?)";

            // Prepara a query para execução, substituindo os parâmetros pelos valores do
            // usuário
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, user.getName()); // Seta o nome do usuário
            statement.setString(2, user.getEmail()); // Seta o email do usuário

            // Executa a query de inserção
            statement.executeUpdate();
        } catch (SQLException e) {
            // Captura qualquer erro de SQL e imprime o stack trace
            e.printStackTrace();
        }
    }

    // Implementação do método getUser para buscar um usuário pelo ID
    @Override
    public User getUser(int id) {
        User user = null; // Inicializa um objeto User como nulo
        try {
            // Declara uma query SQL para selecionar um usuário com base no ID fornecido
            String query = "SELECT * FROM users WHERE id = ?";

            // Prepara a query para execução, substituindo o parâmetro pelo ID do usuário
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);

            // Executa a query e armazena o resultado
            ResultSet resultSet = statement.executeQuery();

            // Verifica se há resultados e, caso positivo, cria um objeto User com os dados
            // retornados
            if (resultSet.next()) {
                user = new User(resultSet.getInt("id"), resultSet.getString("name"),
                        resultSet.getString("email"));
            }
        } catch (SQLException e) {
            // Captura qualquer erro de SQL e imprime o stack trace
            e.printStackTrace();
        }
        // Retorna o usuário encontrado, ou null se não houver
        return user;
    }

    // Implementação do método getAllUsers para buscar todos os usuários no banco de
    // dados
    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>(); // Inicializa uma lista de usuários
        try {
            // Declara uma query SQL para selecionar todos os usuários
            String query = "SELECT * FROM users";

            // Cria um objeto Statement para executar a query
            Statement statement = connection.createStatement();

            // Executa a query e armazena o resultado
            ResultSet resultSet = statement.executeQuery(query);

            // Itera pelos resultados e adiciona cada usuário à lista
            while (resultSet.next()) {
                users.add(new User(resultSet.getInt("id"), resultSet.getString("name"),
                        resultSet.getString("email")));
            }
        } catch (SQLException e) {
            // Captura qualquer erro de SQL e imprime o stack trace
            e.printStackTrace();
        }
        // Retorna a lista de usuários
        return users;
    }

    // Implementação do método updateUser para atualizar os dados de um usuário
    @Override
    public void updateUser(User user) {
        try {
            // Declara uma query SQL para atualizar os dados de um usuário com base no ID
            String query = "UPDATE users SET name = ?, email = ? WHERE id = ?";

            // Prepara a query para execução, substituindo os parâmetros pelos valores do
            // usuário
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, user.getName()); // Seta o nome do usuário
            statement.setString(2, user.getEmail()); // Seta o email do usuário
            statement.setInt(3, user.getId()); // Seta o ID do usuário

            // Executa a query de atualização
            statement.executeUpdate();
        } catch (SQLException e) {
            // Captura qualquer erro de SQL e imprime o stack trace
            e.printStackTrace();
        }
    }

    // Implementação do método deleteUser para excluir um usuário com base no ID
    @Override
    public void deleteUser(int id) {
        try {
            // Declara uma query SQL para deletar um usuário com base no ID
            String query = "DELETE FROM users WHERE id = ?";

            // Prepara a query para execução, substituindo o parâmetro pelo ID do usuário
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);

            // Executa a query de exclusão
            statement.executeUpdate();
        } catch (SQLException e) {
            // Captura qualquer erro de SQL e imprime o stack trace
            e.printStackTrace();
        }
    }

}
