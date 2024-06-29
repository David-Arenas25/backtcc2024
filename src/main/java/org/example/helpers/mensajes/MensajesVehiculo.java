package org.example.helpers.mensajes;

import org.example.helpers.generals.RegexValidators;

public enum MensajesVehiculo {
    ID_VEHICULO_ERRONEO("Revisa, no aceptamos id negativos","^\\\\d*\\\\.?\\\\d+$"),
    MARCA_VEHICULO_ERRONEO("Caracteres incorrectos","^[a-zA-Z ]+$"),
    //ID_VEHICULO_NO_EXISTE("Revisa el id no existe"),
    KILOMETRAJE_VEHICULO_ERRONEO("Ingrese números entre 0 y 99.999", "^([0-9]{1,4}(\\.[0-9]+)?|99999(\\.0+)?)$"),
    COLOR_VEHICULO_ERRONEO("solo letras y espacios y maximo 20 caracteres","^[a-zA-Z\\s]{1,20}$"),
    DESCRIPCION_VEHICULO_ERRONEA("maximo 100 caracteres","^[a-zA-Z\\s]{1,100}$"),
    TIPO_VEHICULO_ERRONEO("solo letras SIN ESPACIOS\n","^[a-zA-Z]+$"),
    AUTONOMIA_VEHICULO_ERRONEA("solo numeros positivos maximo 72","^(?!0)\\\\d{1,72}$"),
    CAPACIDAD_CARGA_VEHICULO_ERRONEA("solo numeros positivos y maximo 1000","^(?!0)[1-9]\\\\d{0,2}$"),
    AVALUO_VEHICULO_ERRONEO("solo positivos","^[1-9]\\\\d*$");

    private String mensajeError;
    private String regex;

    MensajesVehiculo(String mensajeError,String regex) {
        this.mensajeError = mensajeError;
        this.regex=regex;

    }

    MensajesVehiculo(String mensajeError) {
        this.mensajeError = mensajeError;
    }

    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }





}

