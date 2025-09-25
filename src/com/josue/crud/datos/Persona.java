package com.josue.crud.datos;


public class Persona {
    
    private int IDPersona;
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private String Direccion;
    private int numeroDocumetos;

    public Persona(int IDPersona, String nombres, String apellidos, String fechaNacimiento, String Direccion, int numeroDocumetos) {
        this.IDPersona = IDPersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.Direccion = Direccion;
        this.numeroDocumetos = numeroDocumetos;
    }
    
    

    public int getIDPersona() {
        return IDPersona;
    }

    public void setIDPersona(int IDPersona) {
        this.IDPersona = IDPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getNumeroDocumetos() {
        return numeroDocumetos;
    }

    public void setNumeroDocumetos(int numeroDocumetos) {
        this.numeroDocumetos = numeroDocumetos;
    }
    
    
}
