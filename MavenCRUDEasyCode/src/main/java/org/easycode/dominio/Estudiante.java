package org.easycode.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author programacion
 */
@Entity
@Table (name="estudiantes")
public class Estudiante implements Serializable {

    @Id
    @Column (name="codigoEstudiante")
    private int codigoEstudiante;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String edad;
    @Column
    private String fechaDeNacimiento;
    @Column
    private String carrera;
    @Column
    private String codigoTecnico;
    @Column
    private String codigoAcademico;

    public Estudiante() {
    }

    public Estudiante(int codigoEstudiante, String nombre, String apellido, String edad, String fechaDeNacimiento, String carrera, String codigoTecnico, String codigoAcademico) {
        this.codigoEstudiante = codigoEstudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.carrera = carrera;
        this.codigoTecnico = codigoTecnico;
        this.codigoAcademico = codigoAcademico;
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCodigoTecnico() {
        return codigoTecnico;
    }

    public void setCodigoTecnico(String codigoTecnico) {
        this.codigoTecnico = codigoTecnico;
    }

    public String getCodigoAcademico() {
        return codigoAcademico;
    }

    public void setCodigoAcademico(String codigoAcademico) {
        this.codigoAcademico = codigoAcademico;
    }
    
    


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codigoEstudiante;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudiante)) {
            return false;
        }
        Estudiante other = (Estudiante) object;
        if (this.codigoEstudiante != other.codigoEstudiante) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "codigoEstudiante=" + codigoEstudiante + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", fechaDeNacimiento=" + fechaDeNacimiento + ", carrera=" + carrera + ", codigoTecnico=" + codigoTecnico + ", codigoAcademico=" + codigoAcademico + '}';
    }


    
}
