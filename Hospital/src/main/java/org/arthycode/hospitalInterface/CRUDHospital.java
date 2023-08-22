package org.arthycode.hospitalInterface;

import org.arthycode.Paciente.Paciente;

import java.util.List;

public interface CRUDHospital {

    default public void saludar() {
        System.out.println("Saludando...");
    }
    public void ingresarPaciente(Paciente paciente);
    public List<Paciente> getPacientes();
    public Boolean getPaciente(Paciente paciente);
    public List<Paciente> popPaciente(Paciente paciente);
}
