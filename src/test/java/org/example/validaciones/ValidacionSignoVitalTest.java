package org.example.validaciones;

import org.example.utilidades.MensajeSignoVital;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidacionSignoVitalTest {
    private ValidacionSignoVital validacionSignoVital;

    @BeforeEach
    public void prepararPriebasSignoVital(){this.validacionSignoVital=new ValidacionSignoVital();}

    @Test
    public void valiidarIdCorrecto(){
        Integer idPrueba=50;
        Boolean resultado= Assertions.assertDoesNotThrow(()->this.validacionSignoVital.validarId(idPrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void validarIdIncorrecto(){
        Integer idPrueba=-50;
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionSignoVital.validarId(idPrueba));
        Assertions.assertEquals(MensajeSignoVital.ID_NEGATIVO,resultado.getMessage());
    }


    @Test
    public void valiidarNombreCorrecto(){
        String nombrePrueba="O";
        Boolean resultado= Assertions.assertDoesNotThrow(()->this.validacionSignoVital.validarNombre(nombrePrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void validarNombreIncorrectoPorLongitud(){
        Integer idPrueba=-50;
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionSignoVital.validarId(idPrueba));
        Assertions.assertEquals(MensajeSignoVital.ID_NEGATIVO,resultado.getMessage());
    }
    @Test
    public void validarNombreIncorrectoPorCaracteres(){
        Integer nombrePrueba=-50;
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionSignoVital.validarId(nombrePrueba));
        Assertions.assertEquals(MensajeSignoVital.ID_NEGATIVO,resultado.getMessage());
    }


    @Test
    public void validarUnidadMedidaCorrecto(){
        Integer unidadMedidaPrueba=2;
        Boolean resultado=Assertions.assertDoesNotThrow(()->this.validacionSignoVital.validarUnidadMedida(unidadMedidaPrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void validarUnidadMedidaIncorrectoPorLongitud(){
        Integer unidadMedidaPrueba=-2;
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionSignoVital.validarUnidadMedida(unidadMedidaPrueba));
        Assertions.assertEquals(MensajeSignoVital.UNIDAD_MEDIDA_CARACTERES,resultado.getMessage());
    }


}