package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Utilidad;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionAfiliado {

    Utilidad utilidad = new Utilidad();

    public ValidacionAfiliado() {
    }

    public Boolean validarId(Integer id) throws Exception {
        if (id < 0) {
            throw new Exception(Mensajes.ID_NEGATIVO.getMensaje());
        }
        return true;
    }

    public Boolean validarDocumento(String documento)throws Exception{
        if(documento.length()<7 || documento.length()>10){
            throw new Exception(Mensajes.DOCUMENTO_LONGITUD.getMensaje());
        }
        String expresionRegular="[0-9]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular,documento)){
            throw new Exception(Mensajes.DOCUMENTO_CARACTERES.getMensaje());
        }
        return true;
    }

    public Boolean validarNombre(String nombre) throws Exception {
        if (nombre.length() < 3 || nombre.length() > 40) {
            throw new Exception(Mensajes.NOMBRE_lONGITUD.getMensaje());
        }
        String expresionRegular = "[a-zA-Z ]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular, nombre)) {
            throw new Exception(Mensajes.NOMBRE_CARACTERES.getMensaje());
        }
        return true;
    }

    public Boolean validarApellido(String apellido) throws Exception {
        if (apellido.length() < 10 || apellido.length() > 50) {
            throw new Exception(Mensajes.APELLIDO_LONGITUD.getMensaje());
        }
        String expresionRegular = "[a-zA-Z]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular, apellido)) {
            throw new Exception(Mensajes.APELLIDO_CARACTERES.getMensaje());
        }
        return true;
    }

    public Boolean validarCiudad(Integer ciudad) throws Exception {
        if (ciudad < 0 || ciudad >= 1123) {
            throw new Exception(Mensajes.CIUDAD_LONGITUD.getMensaje());
        }
        String expresionRelugar = "^[0-9]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRelugar, ciudad.toString())) {
            throw new Exception(Mensajes.CIUDAD_CARACTERES.getMensaje());
        }
        return true;
    }

    public Boolean validarDepartamento(Integer departamento) throws Exception {
        if (departamento < 0 || departamento >= 32) {
            throw new Exception(Mensajes.DEPARTAMENTO_LONGITUD.getMensaje());
        }
        String expresionRelugar = "^[0-9]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRelugar, departamento.toString())) {
            throw new Exception(Mensajes.DEPARTAMENTO_CARACTERES.getMensaje());
        }
        return true;
    }

    public Boolean validarCorreoElectronico(String correoElectronico) throws Exception {
        if (correoElectronico.length() < 10 || correoElectronico.length() > 50) {
            throw new Exception(Mensajes.CORREO_ELECTRONICO_LONGITUD.getMensaje());
        }
        String expresionRegular = "^[A-Za-z0-9+_.-]+@(.+)$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular, correoElectronico)) {
            throw new Exception(Mensajes.CORREO_ELECTRONICO_CARACTERES.getMensaje());
        }
        return true;
    }

    public Boolean validarTelefono(String telefono) throws Exception {
        if (telefono.length() == 11) {
            throw new Exception(Mensajes.TELEFONO_LONGITUD.getMensaje());
        }
        String expresionRegular = "^[0-9]+$";

        if (!this.utilidad.buscarCoincidencia(expresionRegular, telefono)) {
            throw new Exception(Mensajes.TELEFONO_CARACTERES.getMensaje());
        }
        return true;
    }

}