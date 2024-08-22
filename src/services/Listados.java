package services;

import dto.*;

import java.sql.*;
import java.util.LinkedList;

public class Listados {
    public Listados(){

    }

    public LinkedList<Contrato_Proveedor_Servicios_Complementarios> listadoContratosServiciosComplementarios() {
        LinkedList<Contrato_Proveedor_Servicios_Complementarios> lista = new LinkedList<>();

        String sql = "SELECT * FROM public.listado_contratos_servicios_complementarios()";

        try (Connection conexion = ControladoraServicios.getConexion();
             PreparedStatement pstmt = conexion.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                Contrato_Proveedor_Servicios_Complementarios contratoServiciosComplementarios = new Contrato_Proveedor_Servicios_Complementarios();
                contratoServiciosComplementarios.setFechaInicioContrato(rs.getDate("fecha_inicio_contrato"));
                contratoServiciosComplementarios.setFechaTerminacionContrato(rs.getDate("fecha_terminacion_contrato"));
                contratoServiciosComplementarios.setFechaConciliacion(rs.getDate("fecha_conciliacion"));
                contratoServiciosComplementarios.setDescripcionContrato(rs.getString("descripcion_contrato"));
                contratoServiciosComplementarios.setTipoServicio(rs.getString("tipo_servicio"));
                contratoServiciosComplementarios.setProvincia(rs.getString("provincia"));

                lista.add(contratoServiciosComplementarios);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al obtener el listado de contratos de servicios complementarios: " + e.getMessage());
        }

        return lista;
    }

    public LinkedList<Contrato_Proveedor_Alimentos> listadoContratosProveedoresAlimentos() {
        LinkedList<Contrato_Proveedor_Alimentos> lista = new LinkedList<>();

        String sql = "SELECT * FROM public.listado_contratos_proveedores_alimentos()";

        try (Connection conexion = ControladoraServicios.getConexion();
             PreparedStatement pstmt = conexion.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                Contrato_Proveedor_Alimentos contratoProveedorAlimentos = new Contrato_Proveedor_Alimentos();
                contratoProveedorAlimentos.setNombreProveedor(rs.getString("nombre_proveedor"));
                contratoProveedorAlimentos.setTipoAlimento(rs.getString("tipo_alimento"));
                contratoProveedorAlimentos.setIdProvincia(rs.getString("id_provincia"));
                contratoProveedorAlimentos.setDireccion(rs.getString("direccion"));
                contratoProveedorAlimentos.setFechaInicio(rs.getDate("fecha_inicio"));
                contratoProveedorAlimentos.setFechaTerminacion(rs.getDate("fecha_terminacion"));
                contratoProveedorAlimentos.setFechaConciliacion(rs.getDate("fecha_conciliacion"));
                contratoProveedorAlimentos.setDescripcion(rs.getString("descripcion"));

                lista.add(contratoProveedorAlimentos);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al obtener el listado de contratos de proveedores de alimentos: " + e.getMessage());
        }

        return lista;
    }

    public LinkedList<Contrato_Veterinario> listadoContratosVeterinarios() {
        LinkedList<Contrato_Veterinario> contratosVeterinarios = new LinkedList<>();

        Connection conexion = ControladoraServicios.getConexion();
        String sql = "SELECT * FROM public.listado_contratos_veterinarios()";

        try (PreparedStatement stmt = conexion.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Contrato_Veterinario contrato = new Contrato_Veterinario(
                        rs.getString("nombre_veterinario"),
                        rs.getString("clinica_veterinario"),
                        rs.getString("id_provincia"),
                        rs.getString("direccion_veterinario"),
                        rs.getString("especialidad_veterinario"),
                        rs.getDate("fecha_inicio"),
                        rs.getDate("fecha_terminacion"),
                        rs.getDate("fecha_conciliacion"),
                        rs.getString("descripcion")
                );
                contratosVeterinarios.add(contrato);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al obtener el listado de contratos de veterinarios: " + e.getMessage());
        }

        return contratosVeterinarios;
    }

    public LinkedList<Veterinario_Activo> listadoVeterinariosActivos(String clinica, String provincia) {
        LinkedList<Veterinario_Activo> veterinariosActivos = new LinkedList<>();

        Connection conexion = ControladoraServicios.getConexion();
        String sql = "SELECT * FROM public.listado_veterinarios_activos(?, ?)";

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, clinica);
            stmt.setString(2, provincia);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Veterinario_Activo veterinario = new Veterinario_Activo(
                            rs.getDate("fecha"),
                            rs.getString("nombre_veterinario"),
                            rs.getString("clinica_veterinario"),
                            rs.getString("provincia"),
                            rs.getString("especialidad_veterinario"),
                            rs.getString("telefono"),
                            rs.getString("fax"),
                            rs.getString("correo_electronico"),
                            rs.getString("distancia_ciudad"),
                            rs.getString("modalidades_servicio")
                    );
                    veterinariosActivos.add(veterinario);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al obtener el listado de veterinarios activos: " + e.getMessage());
        }

        return veterinariosActivos;
    }

    public LinkedList<Programa_Actividades_Animal> programaActividadesAnimal(String idAnimal) throws SQLException {
        LinkedList<Programa_Actividades_Animal> actividades = new LinkedList<>();

        String sql = "SELECT * FROM programa_actividades_animal(?)";

        Connection connection = ControladoraServicios.getConexion();
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, idAnimal);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Programa_Actividades_Animal actividad = new Programa_Actividades_Animal(
                            rs.getString("nombre_animal"),
                            rs.getString("especie"),
                            rs.getString("raza"),
                            rs.getInt("edad"),
                            rs.getDouble("peso"),
                            rs.getInt("dias_refugio"),
                            rs.getDate("dia").toString(),
                            rs.getTime("hora").toString(),
                            rs.getString("descripcion_actividad"),
                            rs.getDouble("precio_actividad"),
                            rs.getString("nombre_veterinario"),
                            rs.getString("tipo_alimento"),
                            rs.getDouble("precio_total_cuidado_veterinario"),
                            rs.getDouble("precio_transporte"),
                            rs.getDouble("precio_total_mantenimiento")
                    );
                    actividades.add(actividad);
                }
            }
        }

        return actividades;
    }

    public LinkedList<Plan_Ingresos_Adopciones_Donaciones> planIngresosAdopcionesDonaciones() {
        LinkedList<Plan_Ingresos_Adopciones_Donaciones> ingresosList = new LinkedList<>();

        try (Connection conn = ControladoraServicios.getConexion();
             Statement stmt = conn.createStatement()) {

            String sql = "SELECT * FROM public.plan_ingresos_adopciones_donaciones();";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String nombreAnimal = rs.getString("nombre_animal");
                String especie = rs.getString("especie");
                String raza = rs.getString("raza");
                int edad = rs.getInt("edad");
                double costoTotalMantenimiento = rs.getDouble("costo_total_mantenimiento");
                double precioTotalAdopcion = rs.getDouble("precio_total_adopcion");
                double donacionesRecibidas = rs.getDouble("donaciones_recibidas");
                double montoTotalIngresos = rs.getDouble("monto_total_ingresos");

                Plan_Ingresos_Adopciones_Donaciones ingreso = new Plan_Ingresos_Adopciones_Donaciones(
                        nombreAnimal, especie, raza, edad, costoTotalMantenimiento, precioTotalAdopcion, donacionesRecibidas, montoTotalIngresos);
                ingresosList.add(ingreso);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ingresosList;
    }

}


