package org.arthycode.Paciente;

import java.util.Date;

public class Paciente {

    private String dpi;
    private String nombre;
    private Date fecha_Ingreso;
    private String enfermedad;
    private String tratamiento;
    private String fecha_Egreso;

    public Paciente(){};
    public Paciente(String dpi, String nombre, Date fecha_Ingreso, String enfermedad, String tratamiento) {
        this.dpi = dpi;
        this.nombre = nombre;
        this.fecha_Ingreso = fecha_Ingreso;
        this.enfermedad = enfermedad;
        this.tratamiento = tratamiento;
    }

    public String getDpi() {
      return dpi;
    }
    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_Ingreso() {
        return fecha_Ingreso;
    }

    public void setFecha_Ingreso(Date fecha_Ingreso) {
        this.fecha_Ingreso = fecha_Ingreso;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getFecha_Egreso() {
        return fecha_Egreso;
    }

    public void setFecha_Egreso(String fecha_Egreso) {
        this.fecha_Egreso = fecha_Egreso;
    }
    @Override
    public String toString() {
        return "Paciente{" +
                "dpi='" + dpi + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fecha_Ingreso='" + fecha_Ingreso + '\'' +
                ", enfermedad='" + enfermedad + '\'' +
                ", tratamiento='" + tratamiento + '\'' +
                ", fecha_Egreso='" + fecha_Egreso + '\'' +
                '}';
    }
}
