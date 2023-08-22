package org.arthycode.service;

import org.arthycode.Paciente.Paciente;
import org.arthycode.hospitalInterface.CRUDHospital;

import java.util.ArrayList;
import java.util.List;

public class PacienteServicios implements CRUDHospital {
    List<Paciente> pacientes = new ArrayList<>();
    @Override
    public void ingresarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }
    @Override
    public List<Paciente> getPacientes() {
        return pacientes;
    }

    @Override
    public Boolean getPaciente(Paciente paciente) {

        return pacientes.contains(paciente);
    }

    @Override
    public List<Paciente> popPaciente(Paciente paciente) {
        if (pacientes.contains(paciente)) {
            pacientes.remove(paciente);
        }
        return pacientes;
    }
}
