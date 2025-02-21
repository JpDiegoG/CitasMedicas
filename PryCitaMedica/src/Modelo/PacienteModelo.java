package Modelo;

public class PacienteModelo {
    public String nombres;
    public String cedula;
    public int edad;
    public boolean sexo;

    public PacienteModelo(String nombres, String cedula, int edad, boolean sexo) {
        this.nombres = nombres;
        this.cedula = cedula;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombre) {
        this.nombres = nombres;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
    
    public String getSexo() {
        return sexo?"HOMBRE" : "MUJER"; //if mejorado
        
    }
}
