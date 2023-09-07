/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author hack2
 */
public class inquilino implements Serializable{
    private String nombre,ci;
    private boolean is_desempleado, if_asiste_reuniones_condominio;
    private int cv_ausente_reunionesCondo;

    public inquilino(String nombre, String ci, boolean is_desempleado, boolean if_asiste_reuniones_condominio, int cv_ausente_reunionesCondo) {
        this.nombre = nombre;
        this.ci = ci;
        this.is_desempleado = is_desempleado;
        this.if_asiste_reuniones_condominio = if_asiste_reuniones_condominio;
        this.cv_ausente_reunionesCondo = cv_ausente_reunionesCondo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public boolean isIs_desempleado() {
        return is_desempleado;
    }

    public void setIs_desempleado(boolean is_desempleado) {
        this.is_desempleado = is_desempleado;
    }

    public boolean isIf_asiste_reuniones_condominio() {
        return if_asiste_reuniones_condominio;
    }

    public void setIf_asiste_reuniones_condominio(boolean if_asiste_reuniones_condominio) {
        this.if_asiste_reuniones_condominio = if_asiste_reuniones_condominio;
    }

    

    public int getCv_ausente_reunionesCondo() {
        return cv_ausente_reunionesCondo;
    }

    public void setCv_ausente_reunionesCondo(int cv_ausente_reunionesCondo) {
        this.cv_ausente_reunionesCondo = cv_ausente_reunionesCondo;
    }


    public String clasificacion_inquilino(){
        String clasif;
        int cva = this.getCv_ausente_reunionesCondo();
        if(cva<1){
            clasif="excepcion imposible calcular ausencias muy bajas";
        }else if(cva>=1 && cva<=3){
            clasif="Normal";
        }else if(cva>=4 && cva<=10){
            clasif="Reincidente";
        }else{
            clasif="Llamado de Atención";
        }
        
        return clasif;
    }
   
    
    
   
    
}
