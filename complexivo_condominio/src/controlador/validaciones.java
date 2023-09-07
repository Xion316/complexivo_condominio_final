/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.LinkedList;

/**
 *
 * @author hack2
 */
public class validaciones {
    
    
 public boolean isNumeroPositivo(String numero){
     if (numero == null) {
            return false;
        }
        try {
            double casteo_prueba = Double.parseDouble(numero);
            
            if(casteo_prueba<0){
                return false;
            }
            
        } catch (NumberFormatException nfe) {
            return false;
        } 
    return true;
 }   
    
    
public boolean isNumero(String numero) {
        if (numero == null) {
            return false;
        }
        try {
            double casteo_prueba = Double.parseDouble(numero);
        } catch (NumberFormatException nfe) {
            return false;
        }
    return true;
}
    
    public boolean seeIfNumberIsInteger(String number){
        double numeroEncontrado;
        if (number == null) {
            return false;
        }
        
        try {
        double casteo_prueba = Double.parseDouble(number);
        numeroEncontrado=casteo_prueba;
        } catch (NumberFormatException nfe) {
            return false;
        }

        if(numeroEncontrado == (int)numeroEncontrado){
            return true;
        }
        return false;
    }
    
    
    public boolean seeIfNumberIsIntegerPositivo(String number){
        double numeroEncontrado;
        if (number == null) {
            return false;
        }
        try {
        double casteo_prueba = Double.parseDouble(number);
        numeroEncontrado=casteo_prueba;
        } catch (NumberFormatException nfe) {
            return false;
        }

        if(numeroEncontrado == (int)numeroEncontrado){
            if(numeroEncontrado>=0){
                return true;
            } 
        }
        return false;
    }
    
    public boolean is_CI_valida(String dato){
        
        String dato_analizar=dato.trim();
        /// que pais no tenga espacios en blanco
        if(dato_analizar.equals("")){
            return false;
        }
        
        char[] chars = dato_analizar.toCharArray();
        
        if(chars.length>11 || chars.length<10){ // puede aceptarse 1722713870-0
            return false;
        }
        
        LinkedList<String> resultado = new LinkedList<>();
        for (char aChar : chars) {
            if(this.seeIfNumberIsInteger(String.valueOf(aChar))){
                    resultado.add(String.valueOf(aChar));
            }
        }
        
        if(resultado.size()!=10){ //en result solo estan numeros como 1722713870
            return false;
        } 
 
        return true;
    }
    
    public boolean is_StringCualquieraValidoNotEmpty(String dato){
        
        String dato_analizar=dato.trim();
        /// que pais no tenga espacios en blanco
        if(dato_analizar.equals("")){
            return false;
        }
        return true;
    }
    
   public boolean isValidEmail(String email) {
      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
      return email.matches(regex);
   }
    
        public boolean is_RucValido(String ruc){
         String dato_analizar=ruc.trim();
        if(dato_analizar.equals("")){
            return false;
        }
        
        char[] chars = dato_analizar.toCharArray();
        
        if(chars.length!=13){
            return false;
        } 
        
         for (char character : chars) {
            if(!this.isNumeroPositivo(String.valueOf(character))){
               return false;
           } 
         }
         
         return true;
     }
    
    
}
