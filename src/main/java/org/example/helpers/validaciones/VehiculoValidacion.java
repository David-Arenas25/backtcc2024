package org.example.helpers.validaciones;

import org.example.helpers.generals.RegexValidators;
import org.example.helpers.mensajes.MensajesVehiculo;

public class VehiculoValidacion {
    private RegexValidators regexValidators = new RegexValidators();



    public boolean validarNumero(String regex, Double attribute) throws Exception {
        String attributeStr = Double.toString(attribute);

        if (!attributeStr.matches(regex)) {
            throw new Exception("Formato incorrecto para la cantidad");
        } else {
            return true;
        }
    }
    public boolean validar(String regex,String attribute)throws Exception {

        if(!this.regexValidators.validarRegex(regex,attribute)) {
            throw new Exception("caracteres incorrectos para la");


        }else {
            return true;
        }

    }
    public boolean validarModelo(String fechaModelo)throws Exception{return true;}



    //



}
