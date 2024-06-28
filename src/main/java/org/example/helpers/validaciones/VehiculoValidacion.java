package org.example.helpers.validaciones;

import org.example.helpers.generals.RegexValidators;
import org.example.helpers.mensajes.MensajesVehiculo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VehiculoValidacion {
    private RegexValidators regexValidators = new RegexValidators();



    public boolean validarId(Integer id)throws Exception{



        if(id<0){
            throw new Exception(MensajesVehiculo.ID_VEHICULO_ERRONEO.getMensajeError());
        }

        return true;
    }
    public boolean validar(String regex,String attribute)throws Exception {

        if(!this.regexValidators.validarRegex(regex,attribute)){
            throw new Exception("caracteres incorrectos para la");
        }
        if(attribute.length()>50){
            throw  new Exception("Excedió el número de caracteres");


        }
        return true;



    }
    public boolean validarModelo(String fechaModelo)throws Exception{return true;}



    //



}
