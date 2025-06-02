import Models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import javax.swing.*;
import java.awt.*;
import java.util.Locale;

public class GerenciadorProjetoApp extends JFrame {

    private static final String EMPT_SCREEN = "EMPT_SCREEN";
    private CardLayout cardLayout;
    private JPanel mainPanel;

    public GerenciadorProjetoApp(){
        setTitle("Gerenciador de Projetos");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel emptyPanel = new JPanel(new BorderLayout());
        emptyPanel.add(new JLabel("Bem-vindo! Use o menu para navegar!", SwingConstants.CENTER),
                BorderLayout.CENTER);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        mainPanel.add(emptyPanel, EMPT_SCREEN);

        JMenu menu = new JMenu("Menu");
        JMenuItem listUsersItem = new JMenuItem("Listar Usuários");
        JMenuItem exitItem = new JMenuItem("Sair");

        menu.add(listUsersItem);
        menu.add(exitItem);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);

        setJMenuBar(menuBar);

        exitItem.addActionListener(event -> {
            dispose();
        });


        add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GerenciadorProjetoApp().setVisible(true);
        });
    }
}
