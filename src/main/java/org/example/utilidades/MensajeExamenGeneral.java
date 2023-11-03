package org.example.utilidades;

public enum MensajeExamenGeneral {
    ID_POSITIVO("El id debe ser entero positivo"),
    ID_LONGITUD("El Id no cumple los parametros"),
    NOMBRE_LONGITUD("El nombre del examen debe tener entre 10 y 150 caracteres"),
    NOMBRE_CARACTERES("El nombre del examen no cumple los parametros"),
    IMAGEN_LONGITUD("LA longitud maxima de la imagen es de 200 caracteres"),
    IMAGEN_CARACTERES("El nombre del examen no cumple los parametros"),
    ;
    private String mensajeExamenGeneral;

    MensajeExamenGeneral(String mensajeExamenGeneral) {
        this.mensajeExamenGeneral = mensajeExamenGeneral;
    }

    public String getMensajeExamenGeneral() {
        return mensajeExamenGeneral;
    }

    public void setMensajeExamenGeneral(String mensajeExamenGeneral) {
        this.mensajeExamenGeneral = mensajeExamenGeneral;
    }
}