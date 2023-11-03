package org.example.utilidades;

public enum Mensajes {

    ID_NEGATIVO("El id no puede ser negativo"),
    DOCUMENTO_LONGITUD("El documento debe tener una longitud entre 7 y 10 caracteres"),
    DOCUMENTO_CARACTERES("El documento no cumple con los parametros"),
    NOMBRE_lONGITUD("El nombre debe tener entre 3 y 40 caracteres"),
    NOMBRE_CARACTERES("el nombre no cumple los parametros"),
    APELLIDO_LONGITUD("El apellido debe tener entre 10 y 50 caracteres"),
    APELLIDO_CARACTERES("El apellido no cumple los parametros"),
    CIUDAD_LONGITUD("La ciudad debe estar entre 1 y 1123"),
    CIUDAD_CARACTERES("La ciudad no cumple los parametros"),
    DEPARTAMENTO_LONGITUD("El departamento debe estar entre 1 y 32"),
    DEPARTAMENTO_CARACTERES("El departamento no cumple los parametros"),
    CORREO_ELECTRONICO_LONGITUD("El correo electronico entre 10 y 50 caracteres incluyendo arroba y extencion"),
    CORREO_ELECTRONICO_CARACTERES("El correo electronico no cumple los parametros"),
    TELEFONO_LONGITUD("El teléfono unicamente debe tener 10 numeros"),
    TELEFONO_CARACTERES("El teléfono no cumple los parametros"),
    ;


    private String Mensaje;

    Mensajes(String mensaje) {
        Mensaje = mensaje;
    }


    public String getMensaje() {
        return Mensaje;
    }
    public void setMensaje(String mensaje) {
        Mensaje = mensaje;
    }


}
