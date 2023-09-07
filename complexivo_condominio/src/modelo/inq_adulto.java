/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author hack2
 */
public class inq_adulto extends inquilino{
    private int cantidad_hijos;
    private boolean is_casado;

    public inq_adulto(int cantidad_hijos, boolean is_casado, String nombre, String ci, boolean is_desempleado, boolean if_asiste_reuniones_condominio, int cv_ausente_reunionesCondo) {
        super(nombre, ci, is_desempleado, if_asiste_reuniones_condominio, cv_ausente_reunionesCondo);
        this.cantidad_hijos = cantidad_hijos;
        this.is_casado = is_casado;
    }


    public int getCantidad_hijos() {
        return cantidad_hijos;
    }

    public void setCantidad_hijos(int cantidad_hijos) {
        this.cantidad_hijos = cantidad_hijos;
    }

    public boolean isIs_casado() {
        return is_casado;
    }

    public void setIs_casado(boolean is_casado) {
        this.is_casado = is_casado;
    }
    
    
    
    
}
