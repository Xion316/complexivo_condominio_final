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
public class inq_hijo extends inquilino{
    private int edad,nivel_escolaridad;

    public inq_hijo(int edad, int nivel_escolaridad, String nombre, String ci, boolean is_desempleado, boolean if_asiste_reuniones_condominio, int cv_ausente_reunionesCondo) {
        super(nombre, ci, is_desempleado, if_asiste_reuniones_condominio, cv_ausente_reunionesCondo);
        this.edad = edad;
        this.nivel_escolaridad = nivel_escolaridad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNivel_escolaridad() {
        return nivel_escolaridad;
    }

    public void setNivel_escolaridad(int nivel_escolaridad) {
        this.nivel_escolaridad = nivel_escolaridad;
    }
    
    
}
