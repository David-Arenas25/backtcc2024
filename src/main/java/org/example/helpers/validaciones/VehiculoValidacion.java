package org.example.helpers.validaciones;
import org.example.helpers.generals.RegexValidators;
import org.example.helpers.mensajes.RegexExpresiones;

public class VehiculoValidacion {
    private RegexValidators regexValidator = new RegexValidators();

    public boolean validarMarca(String marca)throws Exception{
        if(!regexValidator.validarRegex(marca, RegexExpresiones.VALIDAR_SOLO_LETRAS_Y_ESPACIOS.getExpresionRegular())){
           throw new Exception("error en el formato del nombre de la marca");
        }
        if(marca.length()>50){
            throw new Exception("error en el tamaño de caracteres de la marca");
        }
        return true;

    }



    public boolean validarModelo(String fechaModelo)throws Exception{return true;}



    //



}
