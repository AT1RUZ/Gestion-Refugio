package visuals.principal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

import visuals.paneles.MenuItem;

/**
 *
 * @author RavenPC
 */
public class PantallaPrincipal extends JFrame {

    /**
     * Creates new form Main
     */
    public PantallaPrincipal() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        execute();
    }

    private void execute() {
        MenuItem menuGestion = getMenuGestion();

        MenuItem menuContratados = getMenuContratados();

        MenuItem menuOtros = getMenuOtros();

        addMenu(menuGestion, menuContratados, menuOtros);


        //  create submenu staff
//        MenuItem menuStaff1 = new MenuItem(iconSubMenu, "Staff 001", new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                panelBody.add(new Panel1());
//                panelBody.repaint();
//                panelBody.revalidate();
//            }
//        });
//       

    }

    private MenuItem getMenuOtros() {
        ImageIcon iconoOtros = new ImageIcon("src/visuals/imagenes/otros.png");
        ImageIcon iconoAlimentos = new ImageIcon("src/visuals/imagenes/alimento.png");
        ImageIcon iconoServicios = new ImageIcon("src/visuals/imagenes/servicio.png");
        ImageIcon iconoTransporte = new ImageIcon("src/visuals/imagenes/transport.png");
        ImageIcon iconoProvincias = new ImageIcon("src/visuals/imagenes/provincias.png");

        MenuItem menuAlimentos = new MenuItem(iconoAlimentos, "Alimentos", null);
        MenuItem menuServicio = new MenuItem(iconoServicios, "Servicios", null);
        MenuItem menuTransporte = new MenuItem(iconoTransporte,"Transporte",null);
        MenuItem menuProvincias = new MenuItem(iconoProvincias, "Provincias",null);

        return new MenuItem(iconoOtros, "Otros", null, menuAlimentos, menuServicio, menuTransporte, menuProvincias);
    }

    private MenuItem getMenuContratados() {
        ImageIcon iconoContratado = new ImageIcon("src/visuals/imagenes/contratados.png");
        ImageIcon iconoVeterinarios = new ImageIcon("src/visuals/imagenes/veterinarios.png");
        ImageIcon iconoProveedorAlimentos = new ImageIcon("src/visuals/imagenes/proveedor_alimentos.png");
        ImageIcon iconoMenuServiciosCOmplementarios = new ImageIcon("src/visuals/imagenes/proveedor_servicios_complementarios.png");

        ///////////////////
        ImageIcon imageIcon = new ImageIcon("src/visuals/imagenes/flecha.png");
        //////////////////

        MenuItem menuVeterinarios = new MenuItem(iconoVeterinarios, "Veterinarios", null);
        MenuItem menuServiciosComplementarios = new MenuItem(iconoMenuServiciosCOmplementarios, "Servicios Complementarios", null);
        MenuItem menuProveedorAlimentos = new MenuItem(iconoProveedorAlimentos, "Proveedor de Alimentos", null);
        return new MenuItem(iconoContratado, "Contratados", null, menuVeterinarios, menuProveedorAlimentos, menuServiciosComplementarios);
    }

    private static MenuItem getMenuGestion() {
        ImageIcon iconoGestion = new ImageIcon("src/visuals/imagenes/gestion.png");
        ImageIcon iconoActividades = new ImageIcon("src/visuals/imagenes/actividades.png");
        ImageIcon iconoAdpociones = new ImageIcon("src/visuals/imagenes/adopciones.png");
        ImageIcon iconoAnimales = new ImageIcon("src/visuals/imagenes/animales.png");
        ImageIcon iconoContratos = new ImageIcon("src/visuals/imagenes/contratos.png");
        ImageIcon iconoDonaciones = new ImageIcon("src/visuals/imagenes/donaciones.png");

        ImageIcon imageIcon = new ImageIcon("src/visuals/imagenes/flecha.png");


//////////////////////Creacion CRUD Actividad/////////////////////
        MenuItem createActividad = new MenuItem(imageIcon, "Añadir Actividad", null);
        MenuItem readActividad = new MenuItem(imageIcon, "Buscar Actividad", null);
        MenuItem updateActividad = new MenuItem(imageIcon, "Modificar Actividad", null);
        MenuItem deleteActividad = new MenuItem(imageIcon, "Eliminar Actividad", null);
        MenuItem mostrarActividaes = new MenuItem(imageIcon, "Mostrar Actividades", null);
        MenuItem menuActividades = new MenuItem(iconoActividades, "Actividades", null, createActividad, readActividad, updateActividad, deleteActividad, mostrarActividaes);
/////////////////////////////////////////////////////////////////


///////////////////// CRUD Adopciones
        MenuItem createAdopciones = new MenuItem(imageIcon, "Añadir Adopciones", null);
        MenuItem readAdopciones = new MenuItem(imageIcon, "Buscar Adopciones", null);
        MenuItem updateAdopciones = new MenuItem(imageIcon, "Modificar Adopciones", null);
        MenuItem deleteAdopciones = new MenuItem(imageIcon, "Eliminar Adopciones", null);
        MenuItem mostrarAdopciones = new MenuItem(imageIcon, "Mostrar Adopciones", null);
        MenuItem menuAdopciones = new MenuItem(iconoAdpociones, "Adopciones", null,createAdopciones,readAdopciones,updateAdopciones,deleteAdopciones,mostrarAdopciones );
//////////////////////////////////////////////////////////////////


///////////////////// CRUD ANIMALES
        MenuItem createAnimales = new MenuItem(imageIcon, "Añadir Animales", null);
        MenuItem readAnimales = new MenuItem(imageIcon, "Buscar Animales", null);
        MenuItem updateAnimales = new MenuItem(imageIcon, "Modificar Animales", null);
        MenuItem deleteAnimales = new MenuItem(imageIcon, "Eliminar Animales", null);
        MenuItem mostrarAnimales = new MenuItem(imageIcon, "Mostrar Animales", null);
        MenuItem menuAnimales = new MenuItem(iconoAnimales, "Animales", null,createAnimales,readAnimales,updateAnimales,deleteAnimales,mostrarAnimales);
/////////////////////////////////////////////////////////////////


////////////////////  CRUD CONTRATOS
        MenuItem createContratos = new MenuItem(imageIcon, "Añadir Contratos", null);
        MenuItem readContratos = new MenuItem(imageIcon, "Buscar Contratos", null);
        MenuItem updateContratos = new MenuItem(imageIcon, "Modificar Contratos", null);
        MenuItem deleteContratos = new MenuItem(imageIcon, "Eliminar Contratos", null);
        MenuItem mostrarContratos = new MenuItem(imageIcon, "Mostrar Contratos", null);
        MenuItem menuContratos = new MenuItem(iconoContratos, "Contratos", null,createContratos,readContratos,updateContratos,deleteContratos,mostrarContratos);
/////////////////////////////////////////////////////////////////


////////////////////  CRUD DONACIONES
        MenuItem createDonaciones = new MenuItem(imageIcon, "Añadir Donaciones", null);
        MenuItem readDonaciones = new MenuItem(imageIcon, "Buscar Donaciones", null);
        MenuItem updateDonaciones = new MenuItem(imageIcon, "Modificar Donaciones", null);
        MenuItem deleteDonaciones = new MenuItem(imageIcon, "Eliminar Donaciones", null);
        MenuItem mostrarDonaciones = new MenuItem(imageIcon, "Mostrar Donaciones", null);
        MenuItem menuDonaciones = new MenuItem(iconoDonaciones, "Donaciones", null,createDonaciones,readDonaciones,updateDonaciones,deleteDonaciones,mostrarDonaciones);
////////////////////////////////////////////////////////////////

        MenuItem menuGestion = new MenuItem(iconoGestion, "Gestión", null, menuActividades, menuAdopciones, menuAnimales, menuContratos, menuDonaciones);
        return menuGestion;
    }

    private void addMenu(MenuItem... menu) {
        for (int i = 0; i < menu.length; i++) {
            menus.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem m : subMenu) {
                addMenu(m);
            }
        }
        menus.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new JPanel();
        panelMenu = new JPanel();
        jScrollPane1 = new JScrollPane();
        menus = new JPanel();
        panelBody = new JPanel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panelHeader.setBackground(new Color(45, 113, 248));
        panelHeader.setPreferredSize(new Dimension(561, 50));

        GroupLayout panelHeaderLayout = new GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
                panelHeaderLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 855, Short.MAX_VALUE)
        );
        panelHeaderLayout.setVerticalGroup(
                panelHeaderLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(panelHeader, BorderLayout.PAGE_START);

        panelMenu.setBackground(new Color(115, 120, 230));
        panelMenu.setPreferredSize(new Dimension(250, 384));

        jScrollPane1.setBorder(null);

        menus.setBackground(new Color(204, 204, 204));
        menus.setLayout(new BoxLayout(menus, BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menus);

        GroupLayout panelMenuLayout = new GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
                panelMenuLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
                panelMenuLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
        );

        getContentPane().add(panelMenu, BorderLayout.LINE_START);

        panelBody.setBackground(new Color(255, 255, 255));
        panelBody.setLayout(new BorderLayout());
        getContentPane().add(panelBody, BorderLayout.CENTER);

        setSize(new Dimension(871, 473));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JScrollPane jScrollPane1;
    private JPanel menus;
    private JPanel panelBody;
    private JPanel panelHeader;
    private JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
