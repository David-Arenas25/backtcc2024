package org.example.helpers.generals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidators {



    public RegexValidators() {
    }

    public boolean validarRegex(String atributo,String expresionRegular ) throws Exception {


        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia=patron.matcher(atributo);

        if(!coincidencia.matches()){
            return false;

        }else{
            return true;
        }


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
