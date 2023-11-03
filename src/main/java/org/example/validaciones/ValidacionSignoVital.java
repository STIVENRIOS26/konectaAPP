package org.example.validaciones;

import org.example.utilidades.MensajeExamenGeneral;
import org.example.utilidades.MensajeSignoVital;
import org.example.utilidades.Utilidad;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidacionSignoVital {
    Utilidad utilidad = new Utilidad();

    public ValidacionSignoVital(){
    }

    public Boolean validarId(Integer id) throws Exception{
        if (id<0){
            throw new Exception(MensajeSignoVital.ID_NEGATIVO.getMensajeSignoVital());
        }
        return true;
    }

    public Boolean validarNombre(String nombre) throws Exception {
        if (nombre.length() < 10 || nombre.length() > 100) {
            throw new Exception(MensajeSignoVital.NOMBRE_LONGITUD.getMensajeSignoVital());
        }
        String expresionRegular = "[a-zA-Z ]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular, nombre)){
            throw new Exception(MensajeSignoVital.NOMBRE_CARACTERES.getMensajeSignoVital());
        }
        return true;
    }

    public Boolean validarUnidadMedida(Integer unidadMedida) throws Exception {
        if (unidadMedida <0) {
            throw new Exception(MensajeSignoVital.UNIDAD_MEDIDA_ENTERO_POSITIVO.getMensajeSignoVital());
        }
        String expresionRelugar ="^[0-9]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRelugar, unidadMedida.toString())) {
            throw new Exception(MensajeSignoVital.UNIDAD_MEDIDA_CARACTERES.getMensajeSignoVital());
        }
        return true;
    }



}
