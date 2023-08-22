package org.arthycode;

import org.arthycode.Paciente.Paciente;
import org.arthycode.hospitalInterface.CRUDHospital;
import org.arthycode.service.PacienteServicios;

import java.time.Instant;
import java.util.Date;

/**
 * CRUD para hospital!
 *
 */
public class Main {
    public static void main( String[] args ) {

        System.out.println( "CRUD Hospital!" );
        CRUDHospital crudHD = new PacienteServicios();

        crudHD.saludar();
        Paciente pac1 = new Paciente("Annie35353", "Annie", Date.from(Instant.now()),
                "Alergia", "Paracetamol");
        crudHD.ingresarPaciente(new Paciente("Ari35353", "Arianna", Date.from(Instant.now()),
                "Dolor de estomago", "Paracetamol"));
        crudHD.ingresarPaciente(pac1);
        System.out.println(crudHD.getPacientes());
        System.out.println(crudHD.getPaciente(pac1));
        crudHD.popPaciente(pac1);
        System.out.println(crudHD.getPacientes());
    }
}
