package com.josue.crud.persistencia;

import com.josue.crud.datos.Persona;
import com.josue.crud.db.ConexionOracle;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class PersonaDAO {
    
    private Connection connection;
    
    public PersonaDAO(){
        this.connection=ConexionOracle.getConnection();
    }
    
    public String insertarPersona(Persona p){
        String comandoSql = """
                            INSERT INTO PERSONA(
                            ID_PERSONA,
                            NOMBRES,
                            APELLIDOS,
                            FECHA_NACIMIENTO,
                            DIRECCION,
                            NUMERO_DOCUMENTO
                            ) VALUES (
                            seq_persona.NEXTVAL,?,?,?,?,?
                            )
                            """;
        try(PreparedStatement ps = connection.prepareStatement(comandoSql)){
            ps.setString(1, p.getNombres());
            ps.setString(2, p.getApellidos());
            ps.setString(3, p.getFechaNacimiento());
            ps.setString(4, p.getDireccion());
            ps.setInt(5, p.getNumeroDocumetos());
            //ejecutar
            ps.execute();
            connection.commit();
            return "Persona Creada con Éxito";
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (Exception ex) {
            }
            return "Persona no Creada: " + e.getMessage();
        }
    }
    
    public String eliminarPerseona(int idPersona){
        String query =  """
                        DELETE  FROM PERSONA
                        WHERE ID_PERSONA = ?
                        """;
        try(PreparedStatement ps = connection.prepareStatement(query)){
            ps.setInt(1, idPersona);
            //ejecutar
            ps.execute();
            connection.commit();
            return "Persona Eliminada con Éxito";
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (Exception ex) {
            }
            return "Persona no Eliminada: " + e.getMessage();
        }
    }
    
    
    public List<Persona> listarPersona(){
        
        List<Persona> listaPersonas = new ArrayList<>();
        
        String query = """
                       SELECT 
                       id_persona,
                       p.NOMBRES ,
                       apellidos,
                       fecha_nacimiento,
                       p.NUMERO_DOCUMENTO,
                       direccion,
                       TO_CHAR(FECHA_NACIMIENTO, 'DD-MM-YYYY') FROM PERSONA p
                       """;
        try(Statement st = connection.createStatement();
                ResultSet rs = st.executeQuery(query) ) {
            
            while(rs.next()){
                Persona p = new Persona();
                p.setIDPersona(rs.getInt("ID_PERSONA"));
                p.setNombres(rs.getString("NOMBRES"));
                p.setApellidos(rs.getString("APELLIDOS"));
                p.setFechaNacimiento(rs.getString("FECHA_NACIMIENTO"));
                p.setNumeroDocumetos(rs.getInt("NUMERO_DOCUMENTO"));
                p.setDireccion(rs.getString("DIRECCION"));
                listaPersonas.add(p);
            }
        } catch (SQLException e) {
            System.out.println("ERRRRRRRRROR: "+e.getMessage());
        }
       return listaPersonas;
    }
    
    public String actualizarPersona (Persona p){
        String query  ="""
                       UPDATE PERSONA p 
                       SET 
                       NOMBRES = ?,
                       APELLIDOS = ?,
                       FECHA_NACIMIENTO=?,
                       NUMERO_DOCUMENTO=?,
                       DIRECCION= ?
                       WHERE
                       ID_PERSONA =?
                       """;
        try(PreparedStatement ps = connection.prepareStatement(query)){
            ps.setString(1, p.getNombres());
            ps.setString(2, p.getApellidos());
            ps.setString(3, p.getFechaNacimiento());
            ps.setInt(4, p.getNumeroDocumetos());
            ps.setString(5, p.getDireccion());
            ps.setInt(6, p.getIDPersona());
            //ejecutar
            ps.execute();
            connection.commit();
            return "Persona actualizada con Éxito";
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (Exception ex) {
            }
            return "Persona no Actualizada: " + e.getMessage();
        }
    }
    
        
    }

