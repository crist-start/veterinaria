/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import entidades.Ciudad;
import entidades.Cliente;
import entidades.Colonia;
import entidades.Estado;
import entidades.Mascota;
import entidades.Municipio;
import entidades.Producto;
import entidades.Servicio;
import entidades.Telefono;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class Conexion {
    String url="jdbc:mysql://localhost:3306/veterinaria";
    String user="veterinario";
    String paswword="baseDeDatosVeterinaria1";

    Connection conexion;

    public Conexion() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        conexion = DriverManager.getConnection(url, user, paswword);
    }

    public ArrayList<Estado> getEstados() throws SQLException {
        Statement solicitar = conexion.createStatement();
        String query = "select * from vista_estado";
        ResultSet datos = solicitar.executeQuery(query);
        ArrayList<Estado> tabla = new ArrayList<>();
        if (!datos.next()) {
            System.out.println("no hay datos");
        } else {
            do {
                Estado es = new Estado();
                es.setCEstado(datos.getInt(1));
                es.setEstado(datos.getString(2));
                tabla.add(es);
            } while (datos.next());
        }
        solicitar.close();
        datos.close();
        return tabla;
    }

    public ArrayList<Municipio> getMunicipios(int llave) throws SQLException {
        String query = "call retornaMunicipios(?)";
        CallableStatement solicitar = conexion.prepareCall(query);
        solicitar.setInt(1, llave);
        ResultSet datos = solicitar.executeQuery();
        ArrayList<Municipio> tabla = new ArrayList<>();
        if (!datos.next()) {
            System.out.println("no hay datos");
        } else {
            do {
                Municipio mn = new Municipio();
                mn.setCMnpio(datos.getInt(1));
                mn.setNMnpio(datos.getInt(2));
                mn.setMnpio(datos.getString(3));
                mn.setEstado(llave);
                tabla.add(mn);
            } while (datos.next());
        }
        solicitar.close();
        datos.close();
        return tabla;
    }

    public ArrayList<Ciudad> getCiudades(int llave) throws SQLException {
        String query = "call retornaCiudades(?)";
        CallableStatement solicitar = conexion.prepareCall(query);
        solicitar.setInt(1, llave);
        ResultSet datos = solicitar.executeQuery();
        ArrayList<Ciudad> tabla = new ArrayList<>();
        if (!datos.next()) {
            System.out.println("no hay datos");
        } else {
            do {
                Ciudad cd = new Ciudad();
                cd.setCCiudad(datos.getInt(1));
                cd.setNCiudad(datos.getInt(2));
                cd.setCiudad(datos.getString(3));
                cd.setMunicipio(llave);
                tabla.add(cd);
            } while (datos.next());
        }
        solicitar.close();
        datos.close();
        return tabla;
    }

    public ArrayList<Colonia> getColonias(int llave) throws SQLException {
        String query = "call retornaColonias(?)";
        CallableStatement solicitar = conexion.prepareCall(query);
        solicitar.setInt(1, llave);
        ResultSet datos = solicitar.executeQuery();
        ArrayList<Colonia> tabla = new ArrayList<>();
        if (!datos.next()) {
            System.out.println("no hay datos");
        } else {
            do {
                Colonia col = new Colonia();
                col.setCColonia(datos.getInt(1));
                col.setNColonia(datos.getInt(2));
                col.setColonia(datos.getString(3));
                col.setDCodigo(datos.getInt(4));
                col.setTipoColonia(datos.getInt(5));
                col.setCiudad(llave);
                tabla.add(col);
            } while (datos.next());
        }
        solicitar.close();
        datos.close();
        return tabla;
    }

    public void insertarPersona(Cliente cliente) throws SQLException {
        String query = "Call insertarPersona(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        CallableStatement solicitar = conexion.prepareCall(query);
        solicitar.setString(1, cliente.getUsuario());
        solicitar.setString(2, cliente.getPswd());
        solicitar.setString(3, cliente.getApellidoP());
        solicitar.setString(4, cliente.getApellidoM());
        solicitar.setString(5, cliente.getNombres());
        solicitar.setString(6, cliente.getCorreo());
        solicitar.setString(7, cliente.getCalle());
        solicitar.setString(8, cliente.getNumExt());
        solicitar.setString(9, cliente.getNumInt());
        solicitar.setString(10, cliente.getColonia());
        solicitar.setInt(11, cliente.getCodPostal());
        solicitar.setString(12, cliente.getCiudad());
        solicitar.setString(13, cliente.getMunicipio());
        solicitar.setString(14, cliente.getEstado());
        solicitar.setString(15, cliente.getGenero());
        ResultSet datos = solicitar.executeQuery();
        datos.close();
        solicitar.close();
    }

    public void insertarMascota(String nom, String tipo, String raza, int edad, String pers) throws SQLException {
        String query = "Call insertarMascota(?,?,?,?,?)";
        CallableStatement solicitar = conexion.prepareCall(query);
        solicitar.setString(1, nom);
        solicitar.setInt(2, edad);
        solicitar.setString(3, tipo);
        solicitar.setString(4, raza);
        solicitar.setString(5, pers);
        ResultSet datos = solicitar.executeQuery();
        datos.close();
        solicitar.close();
    }

    public void insertarTelefono(String pers, String tipo, String numero) throws SQLException {
        String query = "Call insertarTelefono(?,?,?)";
        CallableStatement solicitar = conexion.prepareCall(query);
        solicitar.setString(1, pers);
        solicitar.setString(2, tipo);
        solicitar.setString(3, numero);
        ResultSet datos = solicitar.executeQuery();
    }

    public ArrayList<Producto> getArticulos() throws SQLException {
        Statement solicitud = conexion.createStatement();
        String query = "select * from producto";
        ResultSet datos = solicitud.executeQuery(query);
        ArrayList<Producto> tabla = new ArrayList<>();
        if (!datos.next()) {
            System.out.println("no hay datos");
        } else {
            do {
                Producto pd=new Producto();
                pd.setIdProd(datos.getInt(1));
                pd.setProducto(datos.getString(2));
                pd.setPrecio(datos.getFloat(3));
                pd.setDisponibles(datos.getInt(4));
                tabla.add(pd);
            } while (datos.next());
        }
        solicitud.close();
        datos.close();
        return tabla;
    }

    public ArrayList<Cliente> getClientes() throws SQLException {
        Statement solicitar = conexion.createStatement();
        String query = "select * from cliente order by apellido_p,apellido_m,nombres asc";
        ResultSet datos = solicitar.executeQuery(query);
        ArrayList<Cliente> tabla = new ArrayList<>();
        if (!datos.next()) {
            System.out.println("no hay datos");
        } else {
            do {
                Cliente cliente = new Cliente();
                cliente.setUsuario(datos.getString(1));
                cliente.setPswd(datos.getString(2));
                cliente.setApellidoP(datos.getString(3));
                cliente.setApellidoM(datos.getString(4));
                cliente.setNombres(datos.getString(5));
                cliente.setCorreo(datos.getString(6));
                cliente.setCalle(datos.getString(7));
                cliente.setNumExt(datos.getString(8));
                cliente.setNumInt(datos.getString(9));
                cliente.setColonia(datos.getString(10));
                cliente.setCodPostal(datos.getInt(11));
                cliente.setCiudad(datos.getString(12));
                cliente.setMunicipio(datos.getString(13));
                cliente.setEstado(datos.getString(14));
                tabla.add(cliente);
            } while (datos.next());
        }
        solicitar.close();
        datos.close();
        return tabla;
    }
    
    public ArrayList<Telefono> obtenerTelefonos(String user) throws SQLException{
        String query="call obtenerNumeros(?)";
        CallableStatement solicitar=conexion.prepareCall(query);
        solicitar.setString(1, user);
        ResultSet datos=solicitar.executeQuery();
        ArrayList<Telefono> tabla=new ArrayList<>();
        if (!datos.next()) {
            System.out.println("no hay datos");
        } else {
            do {
                Telefono tel=new Telefono();
                tel.setIdTel(datos.getInt(1));
                tel.setCliente(user);
                tel.setTipo(datos.getString(3));
                tel.setNumero(datos.getString(4));
                tabla.add(tel);
            } while (datos.next());
        }
        solicitar.close();
        datos.close();
        return tabla;
    }
    
    public ArrayList<Mascota> obtenerMascota(String user) throws SQLException{
        String query="call obtenerMascota(?)";
        CallableStatement solicitar=conexion.prepareCall(query);
        solicitar.setString(1, user);
        ResultSet datos=solicitar.executeQuery();
        ArrayList<Mascota> tabla=new ArrayList<>();
        if (!datos.next()) {
            System.out.println("no hay datos");
        } else {
            do {
                Mascota mascota=new Mascota();
                mascota.setIdMascota(datos.getInt(1));
                mascota.setNombre(datos.getString(2));
                mascota.setEdad(datos.getInt(3));
                mascota.setTipo(datos.getString(4));
                mascota.setRaza(datos.getString(5));
                mascota.setCliente(user);
                tabla.add(mascota);
            } while (datos.next());
        }
        solicitar.close();
        datos.close();
        return tabla;
    }
    
    public ArrayList<Servicio> getServicios() throws SQLException{
        Statement solicitar = conexion.createStatement();
        String query = "select * from servicio";
        ResultSet datos = solicitar.executeQuery(query);
        ArrayList<Servicio> tabla = new ArrayList<>();
        if (!datos.next()) {
            System.out.println("no hay datos");
        } else {
            do {
                Servicio s=new Servicio();
                s.setIdServicio(datos.getInt(1));
                s.setMotivo(datos.getString(2));
                s.setCosto(datos.getFloat(3));
                s.setDuracion(datos.getTime(4));
                tabla.add(s);
            } while (datos.next());
        }
        solicitar.close();
        datos.close();
        return tabla;
    }
    
    public void insertarCita(Timestamp inicio, Timestamp fin, String user4, Integer serv) throws SQLException {
        String query = "Call insertarCita(?,?,?,?)";
        CallableStatement solicitar = conexion.prepareCall(query);
        solicitar.setTimestamp(1, inicio);
        solicitar.setTimestamp(2, fin);
        solicitar.setString(3, user4);
        solicitar.setInt(4, serv);
        ResultSet datos = solicitar.executeQuery();
    }
}
