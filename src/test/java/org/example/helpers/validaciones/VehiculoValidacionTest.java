package org.example.helpers.validaciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class VehiculoValidacionTest {


     /*
     * Arrange(prepare)
     * Act(Apunte y dispare)
     * Assert(verifique)*/




    private VehiculoValidacion vehiculoValidacion;

    //Configuracion inicial de la prueba

    @BeforeEach
    public  void setUp(){
        this.vehiculoValidacion=new VehiculoValidacion();
    }
    //pruebas unitarias para cada metodo de la clase que estoy probando}
    // validar id opera correctamente
    //validar id falla por id negativo

    @Test
    public void validarIdOperaCorrectamente() {
        //prepare
        Integer idPrueba = 20;
        //ejecute
        Assertions.assertDoesNotThrow(() -> this.vehiculoValidacion.validarId(idPrueba));
        //verifique
    }

    @Test
    public void validarIdLanzaError(){
        Integer idPrueba=-10;
        Assertions.assertThrows(Exception.class,()->this.vehiculoValidacion.validarId(idPrueba));
    }

}