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
public class inq_adulto_mayor extends inquilino{
    private int edad;
    private boolean is_jubilado;

    public inq_adulto_mayor(int edad, boolean is_jubilado, String nombre, String ci, boolean is_desempleado, boolean if_asiste_reuniones_condominio, int cv_ausente_reunionesCondo) {
        super(nombre, ci, is_desempleado, if_asiste_reuniones_condominio, cv_ausente_reunionesCondo);
        this.edad = edad;
        this.is_jubilado = is_jubilado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isIs_jubilado() {
        return is_jubilado;
    }

    public void setIs_jubilado(boolean is_jubilado) {
        this.is_jubilado = is_jubilado;
    }
    
    
}
