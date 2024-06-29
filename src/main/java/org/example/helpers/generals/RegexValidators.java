package org.example.helpers.generals;

import java.util.regex.Pattern;

public class RegexValidators {



    public RegexValidators() {
    }

    public boolean validarRegex(String expresionRegular, String atributo) throws Exception {


        Pattern patron = Pattern.compile(expresionRegular);
        boolean coincidencia=patron.matcher(atributo).matches();

        if(!coincidencia){
            throw new Exception("error");

        }


        return true;
    }
    public boolean validarRegexNumber(String expresionRegular, Double atributo) throws Exception {

        String atributoStr = String.valueOf(atributo);
        Pattern patron = Pattern.compile(expresionRegular);
        boolean coincidencia=patron.matcher(atributoStr).matches();

        if(!coincidencia){
            throw new Exception("error");

        }


        return true;
    }



}
