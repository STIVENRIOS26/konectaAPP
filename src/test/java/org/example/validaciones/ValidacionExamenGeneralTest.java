package org.example.validaciones;

import org.example.utilidades.MensajeExamenGeneral;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidacionExamenGeneralTest {
    private ValidacionExamenGeneral validacionExamenGeneral;

    @BeforeEach
    public void prepararPruebasExamenGeneral() {
        this.validacionExamenGeneral = new ValidacionExamenGeneral();
    }

    @Test
    public void validarIdCorrecto() {
        String idPrueba = "50";
        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionExamenGeneral.validarId(idPrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarIdIncorrecto() {
        String idPrueba = "-50";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionExamenGeneral.validarId(idPrueba));
        Assertions.assertEquals(MensajeExamenGeneral.ID_POSITIVO, resultado.getMessage());
    }

    @Test
    public void validarNombreExamenCorrecto() {
        String nombreExamenPrueba = "Glucosa";
        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionExamenGeneral.validarNombreExamen(nombreExamenPrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarNombreExamenIncorrectoPorLongitud() {
        String nombreExamenPrueba = "Glucosa Ecografia Colonoscopia Endoscopia Radiografia Resonancia Electroencefalograma ecocardiografia Glucosa Ecografia Colonoscopia Endoscopia Radiografia Resonancia Electroencefalograma ecocardiografia";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionExamenGeneral.validarNombreExamen(nombreExamenPrueba));
        Assertions.assertEquals(MensajeExamenGeneral.NOMBRE_LONGITUD, resultado.getMessage());
    }

    @Test
    public void validarNombreExamenIncorrectoPorCaracteres() {
        String nombreExamenPrueba = "glucosa, ecografia 123, colonoscopia#1.";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionExamenGeneral.validarNombreExamen(nombreExamenPrueba));
        Assertions.assertEquals(MensajeExamenGeneral.NOMBRE_LONGITUD, resultado.getMessage());
    }

    @Test
    public void validarImagenExamenCorrecto(){
        String imagenExamenPrueba = "imagenlogosura.png";
        Boolean resultado = Assertions.assertDoesNotThrow(()->this.validacionExamenGeneral.validarImagenExamen(imagenExamenPrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void validarImagenExamenPruebaIncorrectoPorLongitud() {
        String imagenExamenPrueba = "-50px";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionExamenGeneral.validarImagenExamen(imagenExamenPrueba));
        Assertions.assertEquals(MensajeExamenGeneral.IMAGEN_LONGITUD, resultado.getMessage());
    }
    @Test
        public void validarImagenExamenPruebaIncorrectoPorCaracteres(){
            String imagenExamenPrueba="-50.png*@12=20";
            Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionExamenGeneral.validarImagenExamen(imagenExamenPrueba));
            Assertions.assertEquals(MensajeExamenGeneral.IMAGEN_CARACTERES,resultado.getMessage());
        }
}