package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;

import static org.junit.jupiter.api.Assertions.*;

class ValidacionAfiliadoTest {
    private ValidacionAfiliado validacionAfiliado;
    @BeforeEach //establecer las condiciones iniciales de C/U
    public void prepararPruebas() {
        this.validacionAfiliado = new ValidacionAfiliado();
    }


    @Test
    public void validarIdCorrecto() {
        //1.Preparar

        Integer idPrueba = 50;

        //2.Ejecutar

        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionAfiliado.validarId(idPrueba));

        //3.Verificar
        Assertions.assertTrue(resultado);
    }
    @Test
    public void validarIdIncorrecto() {
        Integer idPrueba = -50;
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarId(idPrueba));
        Assertions.assertEquals(Mensajes.ID_NEGATIVO,resultado.getMessage());
    }


    @Test
    public void validarDocumentoCorrecto() {
        String documentoPrueba = "1015066206";
        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionAfiliado.validarDocumento(documentoPrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void validarDocumentoIncorrectoPorLongitud() {
        String documentoPrueba = "10150662061";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarDocumento(documentoPrueba));
        Assertions.assertEquals("El documento debe tener una longitud entre 7 y 10 caracteres", resultado.getMessage());
    }
    @Test
    public void validarDocumentoIncorrectoPorTipoCaracteres() {
        String documentoPrueba = "1015g";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarDocumento(documentoPrueba));
        Assertions.assertEquals("Revise el formato ingresado", resultado.getMessage());
    }


    @Test
    public void validarNombreCorrecto() {
        String nombrePrueba = "Deiby Stiven";
        Boolean resultado = Assertions/*verifique*/.assertDoesNotThrow/*no deberia haber ninguna exception*/(() -> this.validacionAfiliado.validarNombre/*se llama el objeto con this.nombre de validacion y lo que voy a validar*/(nombrePrueba));
        Assertions.assertTrue(resultado);/* Verificar.assertTrue porque es booleano (el nombre de la variable boolean)*/
    }
    @Test
    public void validarNombreIncorrectoPorTipoCaracteres(){
        String nombrePrueba="Deiby71";
        Exception resultado =Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarNombre(nombrePrueba));
        Assertions.assertEquals("el nombre no cumple los parametros", resultado.getMessage());
    }
    @Test
    public void validarNombreIncorrectoPorLongitud(){
        String nombrePrueba = "es";
        Exception resultado =Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarNombre(nombrePrueba));
        Assertions.assertEquals("El nombre debe tener entre 3 y 40 caracteres",resultado.getMessage());
    }

    @Test
    public void validarApellidoCorrecto(){
        String apellidoPrueba="Gomez Paez";
        Boolean resultado= Assertions.assertDoesNotThrow(()->this.validacionAfiliado.validarApellido(apellidoPrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void validarApellidoIncorrectoPorCaracteres(){
        String apellidoPrueba="Frieda Kahlo 12";
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarApellido(apellidoPrueba));
        Assertions.assertEquals(Mensajes.APELLIDO_CARACTERES,resultado.getMessage());
    }
    @Test
    public void validarApellidoIncorrectoPorLongitud(){
        String apellidoPrueba="Magdalena Carmen Frieda Kahlo Calderón del Perpetuo Socorro Aldear Carmen Frieda Kahlo";
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarApellido(apellidoPrueba));
        Assertions.assertEquals(Mensajes.APELLIDO_LONGITUD,resultado.getMessage());
    }


    @Test
    public void validarCiudadCorrecto(){
        Integer ciudadPrueba=23;
        Boolean resultado=Assertions.assertDoesNotThrow(()->this.validacionAfiliado.validarCiudad(ciudadPrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void validarCiudadIncorrecto(){
        Integer ciudadPrueba=234345;
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarCiudad(ciudadPrueba));
        Assertions.assertEquals(Mensajes.CIUDAD_LONGITUD,resultado.getMessage());
    }

    @Test
    public void validarDepartamentoCorrecto(){
        Integer departamentoPrueba=30;
        Boolean resultado=Assertions.assertDoesNotThrow(()->this.validacionAfiliado.validarDepartamento(departamentoPrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void validarDepartamentoIncorrecto(){
        Integer departamentoPrueba=50;
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarDepartamento(departamentoPrueba));
        Assertions.assertEquals(Mensajes.DEPARTAMENTO_LONGITUD,resultado.getMessage());
    }

    @Test
    public void validarCorreoElectronicoCorrecto(){
        String correoElectronicoPrueba="hola@gmail.com";
        Boolean resultado=Assertions.assertDoesNotThrow(()->this.validacionAfiliado.validarCorreoElectronico(correoElectronicoPrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void validarCorreoElectronicoIncorrecto(){
        String correoElectronicoPrueba="holawenascomoestas@holawenascomoestas.edu.com.co";
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarCorreoElectronico(correoElectronicoPrueba));
        Assertions.assertEquals(Mensajes.CORREO_ELECTRONICO_LONGITUD,resultado.getMessage());
    }


    @Test
    public void validarTelefonoCorrecto(){
        String telefono="3167277987";
        Boolean resultado=Assertions.assertDoesNotThrow(()->this.validacionAfiliado.validarTelefono(telefono));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void validarTelefonoIncorrecto(){
        String telefono="Hola";
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarTelefono(telefono));
        Assertions.assertEquals(Mensajes.TELEFONO_LONGITUD,resultado.getMessage());
    }





}