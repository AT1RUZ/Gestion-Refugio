package visuals;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    private JButton btnAddEntity;
    private JButton btnViewListings;
    private JButton btnLogout;

    public MainWindow() {
        setTitle("Main Menu");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        btnAddEntity = new JButton("Añadir");
        btnViewListings = new JButton("Reportes");
        btnLogout = new JButton("Cerrar Sesión");

        panel.add(btnAddEntity);
        panel.add(btnViewListings);
        panel.add(btnLogout);

        add(panel);

        // Action listener for Add Entity button
        btnAddEntity.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddEntidad addEntityForm = new AddEntidad();
                addEntityForm.setVisible(true);
                dispose(); // Close the main window
            }
        });

//        // Action listener for View Listings button
//        btnViewListings.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                ViewListingsForm viewListingsForm = new ViewListingsForm();
//                viewListingsForm.setVisible(true);
//                dispose(); // Close the main window
//            }
//        });

        // Action listener for Logout button
        btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login2 loginForm = new Login2();
                loginForm.setVisible(true);
                dispose(); // Close the main window
            }
        });
    }
}