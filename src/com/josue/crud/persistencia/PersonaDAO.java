package com.josue.crud.persistencia;

import com.josue.crud.datos.Persona;
import com.josue.crud.db.ConexionOracle;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

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
    
    
    
}
