package visuals;
import dto.Animal;
import services.ControladoraServicios;
import services.Servicios_Animal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.LinkedList;

public class AddAnimal extends JFrame {

    private JTextField txtNombre;
    private JTextField txtEspecie;
    private JTextField txtRaza;
    private JTextField txtEdad;
    private JTextField txtPeso;
    private JTextField txtDiasRefugio;
    private JTextField txtPrecioMantenimiento;
    private JTextField txtPrecioAdopcion;
    private JButton btnGuardar;
    private JButton btnCancelar;

    public AddAnimal() {
        setTitle("Añadir Animal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9, 2));

        panel.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panel.add(txtNombre);

        panel.add(new JLabel("Especie:"));
        txtEspecie = new JTextField();
        panel.add(txtEspecie);

        panel.add(new JLabel("Raza:"));
        txtRaza = new JTextField();
        panel.add(txtRaza);

        panel.add(new JLabel("Edad:"));
        txtEdad = new JTextField();
        panel.add(txtEdad);

        panel.add(new JLabel("Peso:"));
        txtPeso = new JTextField();
        panel.add(txtPeso);

        panel.add(new JLabel("Días en Refugio:"));
        txtDiasRefugio = new JTextField();
        panel.add(txtDiasRefugio);

        panel.add(new JLabel("Precio Mantenimiento"));
        txtPrecioMantenimiento = new JTextField();
        panel.add(txtPrecioMantenimiento);

        panel.add(new JLabel("Precio de Adopción:"));
        txtPrecioAdopcion = new JTextField();
        panel.add(txtPrecioAdopcion);

        btnGuardar = new JButton("Guardar");
        panel.add(btnGuardar);

        btnCancelar = new JButton("Cancelar");
        panel.add(btnCancelar);

        add(panel);

        // Action listener for the Save button
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String nombre = txtNombre.getText();
                    String especie = txtEspecie.getText();
                    String raza = txtRaza.getText();
                    int edad = Integer.parseInt(txtEdad.getText());
                    double peso = Double.parseDouble(txtPeso.getText());
                    int diasRefugio = Integer.parseInt(txtDiasRefugio.getText());
                    double precioMantenimiento = Double.parseDouble(txtPrecioMantenimiento.getText());
                    double precioAdopcion = Double.parseDouble(txtPrecioAdopcion.getText());

                    Servicios_Animal servicios_animal = ControladoraServicios.obtener_Servicios_Animal();
                    try {
                        LinkedList<Animal> lista = servicios_animal.get_Animales();
                        int indice = lista.size() + 1;
                        String id_animal = "AN" + String.valueOf(indice);


                        Animal newAnimal = new Animal(id_animal,nombre, especie, raza, edad, peso, diasRefugio,precioMantenimiento, precioAdopcion);
                        servicios_animal.create_Animal(newAnimal);


                        System.out.printf(String.valueOf(newAnimal));
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }


                }catch (Exception f){
                    JOptionPane.showMessageDialog(AddAnimal.this,"Por favor ingrese bien los datos","Error",JOptionPane.ERROR_MESSAGE);
                }

                // Save the animal to the database


                JOptionPane.showMessageDialog(null, "Animal agregado exitosamente.");
                dispose(); // Close the form
            }
        });

        // Action listener for the Cancel button
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddEntidad addEntityForm = new AddEntidad();
                addEntityForm.setVisible(true);
                dispose(); // Close the form
            }
        });
    }
}