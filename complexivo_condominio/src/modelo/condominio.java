/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.excepciones_custom;
import java.util.LinkedList;

/**
 *
 * @author hack2
 */
public class condominio {
    private LinkedList<apartamento> apartamentos;
    private LinkedList<inquilino> inquilinos;

    public condominio(LinkedList<apartamento> apartamentos, LinkedList<inquilino> inquilinos) {
        this.apartamentos = apartamentos;
        this.inquilinos = inquilinos;
    }

    public condominio() {
        this.apartamentos = new LinkedList<>();
        this.inquilinos = new LinkedList<>();
    }
    
    public LinkedList<apartamento> getApartamentos() {
        return apartamentos;
    }

    public void setApartamentos(LinkedList<apartamento> apartamentos) {
        this.apartamentos = apartamentos;
    }

    public LinkedList<inquilino> getInquilinos() {
        return inquilinos;
    }
    
    public LinkedList<inquilino> getInquilinosAdultos() {
        LinkedList<inquilino> retorno = new LinkedList<>();
        
        for (inquilino i : inquilinos) {
            if(i.getClass().getSimpleName().toLowerCase().trim().equals("inq_adulto")){
                retorno.add(i);
            }
        }
        
        return retorno;
    }
    
    public LinkedList<inquilino> getInquilinosHijos() {
        LinkedList<inquilino> retorno = new LinkedList<>();
        
        for (inquilino i : inquilinos) {
            if(i.getClass().getSimpleName().toLowerCase().trim().equals("inq_hijo")){
                retorno.add(i);
            }
        }
        
        return retorno;
    }
    
    public LinkedList<inquilino> getInquilinosAdultosMayores() {
        LinkedList<inquilino> retorno = new LinkedList<>();
        
        for (inquilino i : inquilinos) {
            if(i.getClass().getSimpleName().toLowerCase().trim().equals("inq_adulto_mayor")){
                retorno.add(i);
            }
        }
        
        return retorno;
    }

    public void setInquilinos(LinkedList<inquilino> inquilinos) {
        this.inquilinos = inquilinos;
    }
    
    public void pushInquilinos(LinkedList<inquilino> inquilinos_push){
        for (inquilino i : inquilinos_push) {
            this.add_inquilino(i);
        }
    }

    /*--- cruds --*/
    
    public void add_apartamento(apartamento a){
        apartamentos.add(a);
    }
    public void remove_apartamento(apartamento a){
        apartamentos.remove(a);
    }
    public apartamento find_apartamento(apartamento a){
        for (apartamento object : apartamentos) {
            if(object.equals(a)){
                return object;
            }
        }
        return null;
    }
    public int size_apartamentos(){
        return apartamentos.size();
    }
    
    public void add_inquilino(inquilino i){
        inquilinos.add(i);
    }
    public void remove_inquilino(inquilino i){
        inquilinos.remove(i);
    }
    public inquilino find_inquilino(inquilino i){
        for (inquilino object : inquilinos) {
            if(object.equals(i)){
                return object;
            }
        }
        return null;
    }
    public int size_inquilinos(){
        return inquilinos.size();
    }
    
    public boolean ExisteInquilinoCedula(String cedula){
        for (inquilino i : inquilinos) {
            if(i.getCi().toLowerCase().trim().equals(cedula.toLowerCase().trim())){
                return true;
            }
        }
        return false;
    }
    
    
        // litearl 3
    
    public boolean debo_MultarInquilinos() throws excepciones_custom{
        int cont=0;
        
        for (inquilino i : inquilinos) {
            if(i.clasificacion_inquilino().toLowerCase().trim().equals("llamado de atención")){
                cont++;
            }
        }
        
        if(cont>10){
            throw new excepciones_custom("Multar a los inquilinos");
        }
        
        return false;
    }
    
    
    /// literal 4 
    
    public LinkedList<String> valor_alicuota_pagarDepartamentos(){
        LinkedList<String> retorno = new LinkedList<>();
        
        for (apartamento a : apartamentos) {
            retorno.add("numero de departamento : "+a.getNumero_apartamento()+" valor a pagar mensual : "+a.get_alicuota_paga_Mensual());
        }
 
        return retorno;
    }
    
    
    public void ImprimoInquilinos(){
        System.out.println("--> Impresion de Inquilinos");
        for (inquilino i : inquilinos) {
            System.out.println("Inquilino : "+i.getClass().getSimpleName()+" - "+i.getCi());
        }
        
    }
    
    
}
