package org.example.helpers.mensajes;

import org.example.helpers.generals.RegexValidators;

public enum MensajesVehiculo {
    ID_VEHICULO_ERRONEO("Revisa, no aceptamos id negativos"),
    MARCA_VEHICULO_ERRONEO("Caracteres incorrectos","^[a-zA-Z ]+$"),
    ID_VEHICULO_NO_EXISTE("Revisa el id no existe");


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

