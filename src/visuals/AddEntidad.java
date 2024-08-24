package visuals;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddEntidad extends JFrame {

    private JButton btnAddAnimal;
    private JButton btnAddVeterinario;
    private JButton btnAddContratado;
    private JButton btnAddContratos;
    private JButton btnAddAdopciones;
    private JButton btnAddDonaciones;
    private JButton btnAddProveedorAlimentos;
    private JButton btnAddProveedorServicios;
    private JButton btnAddTransporte;
    private JButton btnBack;

    public AddEntidad() {
        setTitle("Add Entity");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        btnAddAnimal = new JButton("Añadir Animal");
        btnAddVeterinario = new JButton("Añadir Veterinario");
        btnAddContratado = new JButton("Añadir Contratado");
        btnAddContratos = new JButton("Añadir Contratos");
        btnAddAdopciones = new JButton("Añadir Adopciones");
        btnAddDonaciones = new JButton("Añadir Donaciones");
        btnAddProveedorAlimentos = new JButton("Añadir Proveedor Alimentos");
        btnAddProveedorServicios = new JButton("Añadir Proveedor Servicios");
        btnAddTransporte = new JButton("Añadir Transporte");
        btnBack = new JButton("Regresar");

        panel.add(btnAddAnimal);
        panel.add(btnAddVeterinario);
        panel.add(btnAddContratado);
        panel.add(btnAddContratos);
        panel.add(btnAddAdopciones);
        panel.add(btnAddDonaciones);
        panel.add(btnAddProveedorAlimentos);
        panel.add(btnAddProveedorServicios);
        panel.add(btnAddTransporte);
        panel.add(btnBack);

        add(panel);

        // Action listener for Add Animal button
        btnAddAnimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddAnimal addAnimalForm = new AddAnimal();
                addAnimalForm.setVisible(true);
                dispose(); // Close the current window
            }
        });
//
//        // Action listener for Add Veterinario button
//        btnAddVeterinario.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                AddVeterinarioForm addVeterinarioForm = new AddVeterinarioForm();
//                addVeterinarioForm.setVisible(true);
//                dispose(); // Close the current window
//            }
//        });
//
//        // Action listener for Add Contratado button
//        btnAddContratado.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                AddContratadoForm addContratadoForm = new AddContratadoForm();
//                addContratadoForm.setVisible(true);
//                dispose(); // Close the current window
//            }
//        });
//
//        // Action listener for Add Contratos button
//        btnAddContratos.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                AddContratosForm addContratosForm = new AddContratosForm();
//                addContratosForm.setVisible(true);
//                dispose(); // Close the current window
//            }
//        });
//
//        // Action listener for Add Adopciones button
//        btnAddAdopciones.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                AddAdopcionesForm addAdopcionesForm = new AddAdopcionesForm();
//                addAdopcionesForm.setVisible(true);
//                dispose(); // Close the current window
//            }
//        });
//
//        // Action listener for Add Donaciones button
//        btnAddDonaciones.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                AddDonacionesForm addDonacionesForm = new AddDonacionesForm();
//                addDonacionesForm.setVisible(true);
//                dispose(); // Close the current window
//            }
//        });
//
//        // Action listener for Add Proveedor Alimentos button
//        btnAddProveedorAlimentos.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                AddProveedorAlimentosForm addProveedorAlimentosForm = new AddProveedorAlimentosForm();
//                addProveedorAlimentosForm.setVisible(true);
//                dispose(); // Close the current window
//            }
//        });
//
//        // Action listener for Add Proveedor Servicios button
//        btnAddProveedorServicios.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                AddProveedorServiciosForm addProveedorServiciosForm = new AddProveedorServiciosForm();
//                addProveedorServiciosForm.setVisible(true);
//                dispose(); // Close the current window
//            }
//        });
//
//        // Action listener for Add Transporte button
//        btnAddTransporte.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                AddTransporteForm addTransporteForm = new AddTransporteForm();
//                addTransporteForm.setVisible(true);
//                dispose(); // Close the current window
//            }
//        });
//
//        // Action listener for Back to Main Menu button
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainWindow mainForm = new MainWindow();
                mainForm.setVisible(true);
                dispose(); // Close the current window
            }
        });
    }
}