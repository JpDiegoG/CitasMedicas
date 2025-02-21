package Controlador;

import Modelo.PacienteModelo;
import java.util.ArrayList;

public class PacienteControlador {
    public ArrayList<PacienteModelo>pacienteModelosLista;
    private static PacienteControlador instancia;

    public PacienteControlador() {
        this.pacienteModelosLista = new ArrayList<>();
    }
    
    public static PacienteControlador getInstancia(){
    if(instancia==null){
        instancia= new PacienteControlador();
    }
    return instancia;
    }
    
    public PacienteModelo guardarDatos(String cedula, String nombres,int edad, boolean sexo){
    PacienteModelo modeloPaciente=new PacienteModelo(nombres, cedula, edad, sexo);
    pacienteModelosLista.add(modeloPaciente);
    return modeloPaciente;
    
    }
    public ArrayList<PacienteModelo>listadoCompleto(){
    return pacienteModelosLista;
    }
    
}
