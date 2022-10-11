/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.seminuevos.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.seminuevos.entidades.Carros;
import mx.itson.seminuevos.entidades.Defectos;
import mx.itson.seminuevos.entidades.Modelo;
import mx.itson.seminuevos.entidades.Seguridad;
import mx.itson.seminuevos.enumeradores.Cilindros;
import mx.itson.seminuevos.enumeradores.Transmision;

/**
 *
 * @author hector
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Se le atribuye el valor a cada variable
        Carros carro = new Carros();
        carro.setNombre("Challenger");
        carro.setDescripcion("El Challenger Hellcat 2020 de Dodge entra en una esta era en donde, no solo los muscle cars siguen existiendo, sino que además se renuevan estando mejores que nunca.");
        carro.setAnio(2020);
        carro.setColor("Rojo");
        
        //Se crea la lista de caracteristicas de seguridad
        List<Seguridad> seguridad = new ArrayList<>();
        
        Seguridad seguridad1 = new Seguridad();
        seguridad1.setCaracteristicas("Bolsas de aire de impacto frontal y lateral");
        seguridad.add(seguridad1);
        
        Seguridad seguridad2 = new Seguridad();
        seguridad2.setCaracteristicas("Bolsas de aire laterales de cortina adicionales");
        seguridad.add(seguridad2);
        
        Seguridad seguridad3 = new Seguridad();
        seguridad3.setCaracteristicas("Control de tracción");
        seguridad.add(seguridad3);
        
        Seguridad seguridad4 = new Seguridad();
        seguridad4.setCaracteristicas("Asistencia de frenado");
        seguridad.add(seguridad4);
        
        carro.setSeguridad(seguridad);
        
        //Se crea la lista de las descripciones de los defectos
        List<Defectos> defecto = new ArrayList<>();
        
        Defectos defecto1 = new Defectos();
        defecto1.setDescripcion("Tiene un pequeño rayon de 4cm en la puerta del conductor");
        defecto.add(defecto1);
        
        Defectos defecto2 = new Defectos();
        defecto2.setDescripcion("La camara de reversa no funciona");
        defecto.add(defecto2);
        
        Defectos defecto3 = new Defectos();
        defecto3.setDescripcion("La llanta de enfrente a la derecha está parcheada");
        defecto.add(defecto3);
        
        carro.setDefectos(defecto);
        
        Modelo modelo = new Modelo();
        modelo.setNombre("Hellcat");
        
        carro.setModelo(modelo);
        
        carro.setCilindros(Cilindros.V8);
        carro.setTransmision(Transmision.AUTOMATICA);
        
        //Lo que se mostrará en consola
        System.out.println("***** Agencia de carros semi nuevos *****");
        System.out.println("Carros disponibles: "+carro.getNombre());
        System.out.println("Modelo: "+carro.getModelo().getNombre());
        System.out.println("Descripcion: "+carro.getDescripcion());
        System.out.println("Color: "+carro.getColor());
        System.out.println("Anio: "+carro.getAnio());
        System.out.println("Cilindros: "+carro.getCilindros());
        System.out.println("Transmision: "+carro.getTransmision());
        
        System.out.println("\nDefectos:");
        for(Defectos d : carro.getDefectos()){
            System.out.println("- "+d.getDescripcion());
        }
        
        System.out.println("\nCaracteristicas de seguridad:");
        for(Seguridad s : carro.getSeguridad()){
            System.out.println("- "+s.getCaracteristicas());
        }
        
    }
    
}
