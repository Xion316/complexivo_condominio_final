/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import modelo.condominio;
import modelo.inquilino;




/**
 *
 * @author hack2
 */
public class FileHandler {
    
    
    /* salvo y cargo inquilino Adulto */
     public void SaveInquilinosAdultos(condominio EmpresaCondominio) throws FileNotFoundException, IOException{
        ObjectOutputStream sv=new ObjectOutputStream(new FileOutputStream("inquilinos_adultos.dat"));
        LinkedList<inquilino> componentes = EmpresaCondominio.getInquilinosAdultos();
        sv.writeObject(componentes);
        sv.close();
        System.out.println("Componentes salvados");
    }
    
     
     public LinkedList<inquilino> LoadInquilinosAdultos() throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream load=new ObjectInputStream(new FileInputStream("inquilinos_adultos.dat"));
        LinkedList<inquilino> componentes_cargados=(LinkedList<inquilino>)load.readObject();
        load.close();
        System.out.println("Componentes cargados");
        return componentes_cargados;
    }
     
      /* salvo y cargo inquilino hijo */
     public void SaveInquilinosHijos(condominio EmpresaCondominio) throws FileNotFoundException, IOException{
        ObjectOutputStream sv=new ObjectOutputStream(new FileOutputStream("inquilinos_hijos.dat"));
        LinkedList<inquilino> componentes = EmpresaCondominio.getInquilinosHijos();
        sv.writeObject(componentes);
        sv.close();
        System.out.println("Componentes salvados");
    }
    
     
     public LinkedList<inquilino> LoadInquilinosHijos() throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream load=new ObjectInputStream(new FileInputStream("inquilinos_hijos.dat"));
        LinkedList<inquilino> componentes_cargados=(LinkedList<inquilino>)load.readObject();
        load.close();
        System.out.println("Componentes cargados");
        return componentes_cargados;
    }
     
      /* salvo y cargo inquilinos adultos mayores*/
    public void SaveInquilinosAdultosMayores(condominio EmpresaCondominio) throws FileNotFoundException, IOException{
        ObjectOutputStream sv=new ObjectOutputStream(new FileOutputStream("inquilinos_adultos_mayores.dat"));
        LinkedList<inquilino> componentes = EmpresaCondominio.getInquilinosAdultosMayores();
        sv.writeObject(componentes);
        sv.close();
        System.out.println("Componentes salvados");
    }
    
     
     public LinkedList<inquilino> LoadInquilinosAdultosMayores() throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream load=new ObjectInputStream(new FileInputStream("inquilinos_adultos_mayores.dat"));
        LinkedList<inquilino> componentes_cargados=(LinkedList<inquilino>)load.readObject();
        load.close();
        System.out.println("Componentes cargados");
        return componentes_cargados;
    }
  
     
    
}
