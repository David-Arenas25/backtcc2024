package org.example.helpers.generals;

import java.util.regex.Pattern;

public class RegexValidators {



    public RegexValidators() {
    }

    public boolean validarRegex(String expresionRegular, String marca) throws Exception {


        Pattern patron = Pattern.compile(expresionRegular);
        boolean coincidencia=patron.matcher(marca).matches();

        if(!coincidencia){
            throw new Exception("error");

        }


        return true;
    }



}
