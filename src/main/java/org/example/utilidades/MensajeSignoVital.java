package org.example.utilidades;

public enum MensajeSignoVital {

    ID_NEGATIVO("El Id no puede ser negativo."),
    NOMBRE_LONGITUD("El nombre debe tener entre 10 y 100 caracteres"),
    NOMBRE_CARACTERES("El nombre no cumple con los parametros"),
    UNIDAD_MEDIDA_ENTERO_POSITIVO("La unidad de medida debe ser un numero entero positivo."),
    UNIDAD_MEDIDA_CARACTERES("La unudad de medida no cumple los parametros"),
    ;
    private String MensajeSignoVital;
    MensajeSignoVital(String mensajeSignoVital) {MensajeSignoVital = mensajeSignoVital;}
    public String getMensajeSignoVital() {return MensajeSignoVital;}
    public void setMensajeSignoVital(String mensajeSignoVital) {MensajeSignoVital = mensajeSignoVital;}
}
