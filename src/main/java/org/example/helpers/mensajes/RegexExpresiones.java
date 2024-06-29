package org.example.helpers.mensajes;

public enum RegexExpresiones {

    VALIDAR_SOLO_LETRAS_Y_ESPACIOS("^[a-zA-Z ]+$\n")
    ;

    private String expresionRegular;

    RegexExpresiones() {
    }


    public String getExpresionRegular() {
        return expresionRegular;
    }

    public void setExpresionRegular(String expresionRegular) {
        this.expresionRegular = expresionRegular;
    }
}
