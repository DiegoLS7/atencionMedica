/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author PC
 */
public class Atencion {
    public String codigo;
    public String paciente;
    public String doctor;
    public int precio;
    public char categoria;

    public Atencion() {
    }

    public Atencion(String codigo, String paciente, String doctor, int precio, char categoria) {
        this.codigo = codigo;
        this.paciente = paciente;
        this.doctor = doctor;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Atencion{" + "codigo=" + codigo + ", paciente=" + paciente + ", doctor=" + doctor + ", precio=" + precio + ", categoria=" + categoria + '}';
    }
    
    
}
