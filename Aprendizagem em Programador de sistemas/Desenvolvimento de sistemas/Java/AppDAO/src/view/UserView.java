    package view;

    import model.User;
    import dao.UserDao;
    import dao.UserDaoImpl;

    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.util.List;

    public class UserView extends JFrame {

        // Declaração do objeto UserDao para interagir com o banco de dados
        private UserDao userDao;

        // Campos de texto para entrada de nome e email
        private JTextField txtName;
        private JTextField txtEmail;

        // Área de texto para exibir os usuários
        private JTextArea txtUsers;

        // Construtor da interface gráfica
        public UserView() {
            // Instancia o UserDaoImpl, que gerencia os dados do usuário
            userDao = new UserDaoImpl();

            // Configurações da janela
            setTitle("User Management"); // Define o título da janela
            setSize(400, 300); // Define o tamanho da janela
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define o comportamento ao fechar a janela
            setLayout(new BorderLayout()); // Define o layout como BorderLayout

            // Painel para adicionar usuário com layout de grade (GridLayout)
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(3, 2)); // Cria um layout com 3 linhas e 2 colunas

            // Adiciona o rótulo "Name" e o campo de texto correspondente para inserção de
            // nome
            panel.add(new JLabel("Name:"));
            txtName = new JTextField(); // Campo de texto para o nome
            panel.add(txtName);

            // Adiciona o rótulo "Email" e o campo de texto correspondente para inserção de
            // email
            panel.add(new JLabel("Email:"));
            txtEmail = new JTextField(); // Campo de texto para o email
            panel.add(txtEmail);

            // Botão para adicionar o usuário
            JButton btnAdd = new JButton("Add User");
            panel.add(btnAdd); // Adiciona o botão ao painel

            // Área de texto onde os usuários serão listados (não editável)
            txtUsers = new JTextArea();
            txtUsers.setEditable(false); // Define como não editável
            JScrollPane scrollPane = new JScrollPane(txtUsers); // Adiciona barra de rolagem

            // Adiciona o painel de entrada de usuário na parte norte da janela
            add(panel, BorderLayout.NORTH);

            // Adiciona a área de exibição de usuários no centro da janela
            add(scrollPane, BorderLayout.CENTER);

            // Define a ação que ocorre ao clicar no botão "Add User"
            btnAdd.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Obtém o texto digitado nos campos de nome e email
                    String name = txtName.getText();
                    String email = txtEmail.getText();

                    // Adiciona um novo usuário ao banco de dados usando o DAO
                    userDao.addUser(new User(0, name, email));

                    // Recarrega a lista de usuários após a adição
                    loadUsers();

                    // Limpa os campos de texto após a inserção
                    txtName.setText("");
                    txtEmail.setText("");
                }
            });

            // Carrega e exibe a lista de usuários ao inicializar a interface
            loadUsers();
        }

        // Método para carregar os usuários do banco de dados e exibi-los na área de
        // texto
        private void loadUsers() {
            // Obtém a lista de todos os usuários
            List<User> users = userDao.getAllUsers();

            // StringBuilder para concatenar as informações dos usuários
            StringBuilder sb = new StringBuilder();

            // Itera pela lista de usuários e adiciona cada um ao StringBuilder
            for (User user : users) {
                sb.append("ID: ").append(user.getId())
                        .append(", Name: ").append(user.getName())
                        .append(", Email: ").append(user.getEmail()).append("\n");
            }

            // Exibe o texto construído na área de texto
            txtUsers.setText(sb.toString());
        }
    }
