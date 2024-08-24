package visuals;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {

    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private JButton btnExit;

    public Login() {
        setTitle("Login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel lblUsername = new JLabel("Usuario:");
        txtUsername = new JTextField();

        JLabel lblPassword = new JLabel("Contraseña:");
        txtPassword = new JPasswordField();

        btnLogin = new JButton("Iniciar");
        btnExit = new JButton("Salir");

        panel.add(lblUsername);
        panel.add(txtUsername);
        panel.add(lblPassword);
        panel.add(txtPassword);
        panel.add(btnLogin);
        panel.add(btnExit);

        add(panel);

        // Action listener for Login button
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement login logic here
                String username = txtUsername.getText();
                String password = new String(txtPassword.getPassword());

                // Authentication logic
                if (authenticate(username, password)) {
                    // Proceed to main application window
                    MainWindow mainForm = new MainWindow();
                    mainForm.setVisible(true);
                    dispose(); // Close the login window
                } else {
                    JOptionPane.showMessageDialog(Login.this, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Action listener for Exit button
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private boolean authenticate(String username, String password) {
        // Add your authentication logic here (e.g., check against a database)
        return username.equals("admin") && password.equals("admin");
    }

}