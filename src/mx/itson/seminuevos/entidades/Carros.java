/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.seminuevos.entidades;

import java.util.List;
import mx.itson.seminuevos.enumeradores.Cilindros;
import mx.itson.seminuevos.enumeradores.Transmision;

/**
 *
 * @author hector
 */
public class Carros {
    
    
    /**
     * @return the nombre
     */
    private String nombre;
    
    /**
     * @return the description
     */
    private String descripcion;
    
    /**
     * @return the color 
     */
    private String color;
    
    /**
     * @return the anio 
     */
    private int anio;
    
    /**
     * @return the list of seguridad
     */
    private List <Seguridad> seguridad;
    
    /**
     * @return the list of defectos
     */
    private List <Defectos> defectos;

    /**
     * @return the seguridad
     */
    public List<Seguridad> getSeguridad() {
        return seguridad;
    }
    
    /**
     * @param seguridad the seguridad to set
     */
    public void setSeguridad(List<Seguridad> seguridad) {
        this.seguridad = seguridad;
    }
    
    /**
     * @return the defectos
     */
    public List<Defectos> getDefectos() {
        return defectos;
    }
    
    /**
     * @param defectos the defectos to set
     */
    public void setDefectos(List<Defectos> defectos) {
        this.defectos = defectos;
    }
    
    /**
     * @return the modelo
     */
    private Modelo modelo;
    
    /**
     * @return the transmision
     */
    private Transmision transmision;
    
    /**
     * @return the cilindros
     */
    private Cilindros cilindros;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * @return the modelo
     */
    public Modelo getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the transmision to set
     */
    public Transmision getTransmision() {
        return transmision;
    }

    /**
     * @param transmision the transmision to set
     */
    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }

    /**
     * @return the cilindros
     */
    public Cilindros getCilindros() {
        return cilindros;
    }
    
    /**
     * @param cilindros the cilindros to set
     */
    public void setCilindros(Cilindros cilindros) {
        this.cilindros = cilindros;
    }

    
    
}
