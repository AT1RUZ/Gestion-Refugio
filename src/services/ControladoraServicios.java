package services;

import dto.Proveedor_Servicios_Complementarios;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;

public class ControladoraServicios {

    private static Servicios_Actividad servicios_actividad = null;
    private static Servicios_Adopcion servicios_adopcion = null;
    private static Servicios_Animal servicios_animal = null;
    private static Servicios_Contratado servicios_contratado = null;
    private static Servicios_Contrato servicios_contrato = null;
    private static Servicios_Donacion servicios_donacion = null;
    private static Servicios_Proveedor_Alimentos servicios_proveedor_alimentos = null;
    private static Servicios_Proveedor_Servicios_Complementarios serviciosProveedorServiciosComplementarios = null;
    private static Servicios_Provincias servicios_provincias = null;
    private static Servicios_Tipo_Alimento servicios_tipo_alimento = null;
    private static Servicios_Tipo_Servicio servicios_tipo_servicio = null;
    private static Servicios_Transporte servicios_transporte = null;
    private static Servicios_Veterinario servicios_veterinario = null;



    public ControladoraServicios(){

    }

    public static Connection getConexion() {
        utils.Conexion connection = null;

        try {
            connection = new utils.Conexion("localhost", "Gestion Refugio", "postgres", "asd");
        } catch (ClassNotFoundException var2) {
            var2.printStackTrace();
        } catch (SQLException var3) {
            var3.printStackTrace();
        }

        return connection.getConnection();
    }

    public static Servicios_Actividad obtener_servicios_Actividad(){
        if(servicios_actividad == null)
            servicios_actividad = new Servicios_Actividad();
        return servicios_actividad;
    }

    public static Servicios_Adopcion obtener_Servicios_Adopcion(){
        if(servicios_adopcion == null)
            servicios_adopcion = new Servicios_Adopcion();
        return servicios_adopcion;
    }

    public static Servicios_Animal obtener_Servicios_Animal(){
        if(servicios_animal == null)
            servicios_animal = new Servicios_Animal();
        return servicios_animal;
    }

    public static Servicios_Contratado obtener_Servicios_Contratado(){
        if(servicios_contratado == null)
            servicios_contratado = new Servicios_Contratado();
        return servicios_contratado;
    }

    public static Servicios_Contrato obtener_Servicios_Contrato(){
        if(servicios_contrato == null)
            servicios_contrato = new Servicios_Contrato();
        return servicios_contrato;
    }

    public static Servicios_Donacion obtener_Servicios_Donacion(){
        if(servicios_donacion == null)
            servicios_donacion = new Servicios_Donacion();
        return servicios_donacion;
    }

    public static Servicios_Proveedor_Alimentos obtener_Servicios_Proveedor_Alimentos(){
        if(servicios_proveedor_alimentos == null)
            servicios_proveedor_alimentos = new Servicios_Proveedor_Alimentos();
        return servicios_proveedor_alimentos;
    }

    public static Servicios_Proveedor_Servicios_Complementarios obtener_Servicios_Proveedores_Servicios_Complementarios(){
        if(serviciosProveedorServiciosComplementarios == null)
            serviciosProveedorServiciosComplementarios = new Servicios_Proveedor_Servicios_Complementarios();
        return serviciosProveedorServiciosComplementarios;
    }

    public static Servicios_Provincias obtener_Servicios_Provincias(){
        if(servicios_provincias == null)
            servicios_provincias = new Servicios_Provincias();
        return servicios_provincias;
    }

    public static Servicios_Tipo_Alimento obtener_Servicios_Tipo_Alimento(){
        if(servicios_tipo_alimento == null)
            servicios_tipo_alimento = new Servicios_Tipo_Alimento();
        return servicios_tipo_alimento;
    }

    public static Servicios_Tipo_Servicio obtener_Servicios_Tipo_Servicio(){
        if(servicios_tipo_servicio == null)
            servicios_tipo_servicio = new Servicios_Tipo_Servicio();
        return servicios_tipo_servicio;
    }

    public static Servicios_Transporte obtener_Servicios_Transporte(){
        if(servicios_transporte == null)
            servicios_transporte = new Servicios_Transporte();
        return servicios_transporte;
    }

    public static Servicios_Veterinario obtener_Servicios_Veterinario(){
        if(servicios_veterinario == null)
            servicios_veterinario = new Servicios_Veterinario();
        return servicios_veterinario;
    }






}
