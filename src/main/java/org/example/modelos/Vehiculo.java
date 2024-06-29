package org.example.modelos;

import org.example.helpers.mensajes.MensajesVehiculo;
import org.example.helpers.validaciones.VehiculoValidacion;

import java.time.LocalDate;

import static org.example.helpers.mensajes.MensajesVehiculo.*;

public class Vehiculo {

    //Inyectando una dependencia de la clase vehiculo validacion

    private VehiculoValidacion vehiculoValidacion= new VehiculoValidacion();

    //id
    private Integer id; //solo numeros positivos

    //marca
    private String marca; //solo letras y espacios y maximo 50 caracteres sin caracteres especiales

    //modelo
    private LocalDate modelo; //CON EL PROFE

    //kilometraje
    private Double kilometraje; //solo positivos y maximo 100.000

    //color
    private String color; //solo letras y espacios y maximo 20 caracteres

    //descripcion
    private String descripcion; //maximo 100 caracteres

    //tipo
    private String tipo; //solo letras SIN ESPACIOS

    //autonomia
    private Integer autonomia; //solo numeros positivos maximo 72

    //capacidadCarga
    private Double capacidadCarga; // solo numeros positivos y maximo 1000

    //avaluo
    private Integer avaluo; //solo positivos

    //CONSTRUCTORES DE LA CLASE


    public Vehiculo() {
    }

    public Vehiculo(Integer id, String marca, LocalDate modelo, Double kilometraje, String color, String descripcion, String tipo, Integer autonomia, Double capacidadCarga, Integer avaluo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.color = color;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.autonomia = autonomia;
        this.capacidadCarga = capacidadCarga;
        this.avaluo = avaluo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        try {
            if (id > 0) {
                System.out.println("Tdo bien agonia");
            }
        }
        catch (Exception e){
            System.out.println(ID_VEHICULO_ERRONEO.getMensajeError()+e.getMessage());

        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {

        try {
            if (this.vehiculoValidacion.validar(MARCA_VEHICULO_ERRONEO.getRegex(), marca)) {
                System.out.println("Tdo bien agonia");
            }
        }

        catch (Exception e){
            System.out.println(MensajesVehiculo.MARCA_VEHICULO_ERRONEO+e.getMessage());

        }
    }

    public LocalDate getModelo() {
        return modelo;
    }

    public void setModelo(LocalDate modelo) {
        this.modelo = modelo;
    }

    public Double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(Double kilometraje) {
        try {
            if (this.vehiculoValidacion.validarNumero(KILOMETRAJE_VEHICULO_ERRONEO.getRegex(), kilometraje)) {
                System.out.println("Tdo bien agonia");
            }
        }

        catch (Exception e){
            System.out.println(MensajesVehiculo.KILOMETRAJE_VEHICULO_ERRONEO.getMensajeError());

        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        try {
            if (this.vehiculoValidacion.validar(COLOR_VEHICULO_ERRONEO.getRegex(), color)) {
                System.out.println("Tdo bien agonia");
            }
        }

        catch (Exception e){
            System.out.println(MensajesVehiculo.COLOR_VEHICULO_ERRONEO.getMensajeError());

        }

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        try {
            if (this.vehiculoValidacion.validar(DESCRIPCION_VEHICULO_ERRONEA.getRegex(), descripcion)) {
                System.out.println("Tdo bien agonia");
            }
        }

        catch (Exception e){
            System.out.println(MensajesVehiculo.DESCRIPCION_VEHICULO_ERRONEA.getMensajeError());

        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        try {
            if (this.vehiculoValidacion.validar(TIPO_VEHICULO_ERRONEO.getRegex(), descripcion)) {
                System.out.println("Tdo bien agonia");
            }
        }

        catch (Exception e){
            System.out.println(MensajesVehiculo.TIPO_VEHICULO_ERRONEO.getMensajeError());

        }
    }

    public Integer getAutonomia() {
        try {
            if (this.vehiculoValidacion.validar(AUTONOMIA_VEHICULO_ERRONEA.getRegex(), descripcion)) {
                System.out.println("Tdo bien agonia");
            }
        }

        catch (Exception e){
            System.out.println(MensajesVehiculo.AUTONOMIA_VEHICULO_ERRONEA.getMensajeError());

        }
    }

    public void setAutonomia(Integer autonomia) {
        this.autonomia = autonomia;
    }

    public Double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(Double capacidadCarga) {
        try {
            if (this.vehiculoValidacion.validar(CAPACIDAD_CARGA_VEHICULO_ERRONEA.getRegex(), descripcion)) {
                System.out.println("Tdo bien agonia");
            }
        } catch (Exception e) {
            System.out.println(MensajesVehiculo.CAPACIDAD_CARGA_VEHICULO_ERRONEA.getMensajeError());

        }

    }

    public Integer getAvaluo() {
        return avaluo;
    }

    public void setAvaluo(Integer avaluo) {
        try {
            if (this.vehiculoValidacion.validar(AVALUO_VEHICULO_ERRONEO.getRegex(), descripcion)) {
                System.out.println("Tdo bien agonia");
            }
        } catch (Exception e) {
            System.out.println(MensajesVehiculo.AVALUO_VEHICULO_ERRONEO.getMensajeError());

        }
    }
}
