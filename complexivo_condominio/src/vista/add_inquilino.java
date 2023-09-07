/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.FileHandler;
import controlador.validaciones;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.condominio;
import modelo.inq_adulto;
import modelo.inq_adulto_mayor;
import modelo.inq_hijo;
import modelo.inquilino;

/**
 *
 * @author hack2
 */
public class add_inquilino extends javax.swing.JFrame {

    private static main InterfazPrincipal ;
    private condominio EmpresaCondominio;
    private FileHandler handlerFile;
    /**
     * Creates new form add_inquilino
     */
    public add_inquilino(main m) {
        initComponents();
        InterfazPrincipal = m;
        String inquilinioSeleccionado = tipo_inquilino.getSelectedItem().toString().toLowerCase().trim();

        switch(inquilinioSeleccionado){
            case "seleccionar":
                panel_comun.setVisible(false);
                panel_adulto.setVisible(false);
                panel_hijo.setVisible(false);
                panel_adulto_mayor.setVisible(false);
            break;
            case "adulto":
                panel_comun.setVisible(true);
                panel_adulto.setVisible(true);
                panel_hijo.setVisible(false);
                panel_adulto_mayor.setVisible(false);
            break;
            case "hijo":
                panel_comun.setVisible(true);
                panel_adulto.setVisible(false);
                panel_hijo.setVisible(true);
                panel_adulto_mayor.setVisible(false);
            break;
            case "adulto mayor":
                panel_comun.setVisible(true);
                panel_adulto.setVisible(false);
                panel_hijo.setVisible(false);
                panel_adulto_mayor.setVisible(true);
            break;
        }
        
        
        EmpresaCondominio = new condominio();
        
        // aqui salvo y cargo de los ficheros
        handlerFile = new FileHandler();
        
        try {
            EmpresaCondominio.pushInquilinos(handlerFile.LoadInquilinosAdultos());
        } catch (IOException ex) {
            System.out.println("Aun no existe el archivo a ser cargado de inquilinos adultos");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error en tipo de dato a cargar de inquilinos adultos");
        }
        
        try {
            EmpresaCondominio.pushInquilinos(handlerFile.LoadInquilinosHijos());
        } catch (IOException ex) {
            System.out.println("Aun no existe el archivo a ser cargado de inquilinos hijos");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error en tipo de dato a cargar de inquilinos hijos");
        }
        
        try {
            EmpresaCondominio.pushInquilinos(handlerFile.LoadInquilinosAdultosMayores());
        } catch (IOException ex) {
            System.out.println("Aun no existe el archivo a ser cargado de inquilinos adultos mayores");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error en tipo de dato a cargar de inquilinos adultos mayores");
        }
        
        EmpresaCondominio.ImprimoInquilinos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tipo_inquilino = new javax.swing.JComboBox<>();
        panel_comun = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        inq_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inq_ci = new javax.swing.JTextField();
        inq_isdesempleado = new javax.swing.JCheckBox();
        inq_ifasistereuniones = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        inq_cantAusenciasreuniones = new javax.swing.JSpinner();
        panel_adulto = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        inq_a_cantidadhijos = new javax.swing.JSpinner();
        inq_a_iscasado = new javax.swing.JCheckBox();
        add_adulto = new javax.swing.JButton();
        panel_hijo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        inq_h_edad = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        inq_h_nivelescolar = new javax.swing.JSpinner();
        add_hijo = new javax.swing.JButton();
        panel_adulto_mayor = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        inq_am_edad = new javax.swing.JSpinner();
        inq_am_isjubilado = new javax.swing.JCheckBox();
        add_adulto_mayor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        regresar.setText("Regresar");
        regresar.setToolTipText("");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Tipo Inquilino:");

        tipo_inquilino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Adulto", "Hijo", "Adulto Mayor" }));
        tipo_inquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_inquilinoActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("CI:");

        inq_isdesempleado.setText("Esta desempleado ?");

        inq_ifasistereuniones.setText("Asiste a las reuniones del condominio?");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Cantidad de ausencias a la resuniones del condominio :");

        inq_cantAusenciasreuniones.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout panel_comunLayout = new javax.swing.GroupLayout(panel_comun);
        panel_comun.setLayout(panel_comunLayout);
        panel_comunLayout.setHorizontalGroup(
            panel_comunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_comunLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_comunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_comunLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inq_cantAusenciasreuniones, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_comunLayout.createSequentialGroup()
                        .addGroup(panel_comunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(inq_isdesempleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel_comunLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inq_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panel_comunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_comunLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inq_ci, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_comunLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(inq_ifasistereuniones, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_comunLayout.setVerticalGroup(
            panel_comunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_comunLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_comunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_comunLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panel_comunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inq_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inq_ci, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(panel_comunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inq_isdesempleado)
                    .addComponent(inq_ifasistereuniones, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_comunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inq_cantAusenciasreuniones, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Cantidad Hijos:");

        inq_a_cantidadhijos.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        inq_a_iscasado.setText("Esta casado?");

        add_adulto.setText("Añadir");
        add_adulto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_adultoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_adultoLayout = new javax.swing.GroupLayout(panel_adulto);
        panel_adulto.setLayout(panel_adultoLayout);
        panel_adultoLayout.setHorizontalGroup(
            panel_adultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_adultoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inq_a_cantidadhijos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inq_a_iscasado, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_adultoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add_adulto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_adultoLayout.setVerticalGroup(
            panel_adultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_adultoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_adultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inq_a_cantidadhijos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inq_a_iscasado))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(add_adulto)
                .addContainerGap())
        );

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Edad :");

        inq_h_edad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 120, 1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Nivel Escolaridad :");

        inq_h_nivelescolar.setModel(new javax.swing.SpinnerNumberModel(1, 1, 4, 1));

        add_hijo.setText("Añadir");
        add_hijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_hijoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_hijoLayout = new javax.swing.GroupLayout(panel_hijo);
        panel_hijo.setLayout(panel_hijoLayout);
        panel_hijoLayout.setHorizontalGroup(
            panel_hijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_hijoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inq_h_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inq_h_nivelescolar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_hijoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add_hijo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_hijoLayout.setVerticalGroup(
            panel_hijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_hijoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_hijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inq_h_nivelescolar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inq_h_edad)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(add_hijo)
                .addContainerGap())
        );

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Edad :");

        inq_am_edad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 120, 1));

        inq_am_isjubilado.setText("Esta jubilado?");

        add_adulto_mayor.setText("Añadir");
        add_adulto_mayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_adulto_mayorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_adulto_mayorLayout = new javax.swing.GroupLayout(panel_adulto_mayor);
        panel_adulto_mayor.setLayout(panel_adulto_mayorLayout);
        panel_adulto_mayorLayout.setHorizontalGroup(
            panel_adulto_mayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_adulto_mayorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inq_am_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inq_am_isjubilado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_adulto_mayorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add_adulto_mayor, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_adulto_mayorLayout.setVerticalGroup(
            panel_adulto_mayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_adulto_mayorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_adulto_mayorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inq_am_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inq_am_isjubilado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(add_adulto_mayor)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_comun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tipo_inquilino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panel_adulto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_hijo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_adulto_mayor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tipo_inquilino, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regresar, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_comun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_adulto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_hijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_adulto_mayor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        InterfazPrincipal.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
        InterfazPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void tipo_inquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_inquilinoActionPerformed
        // TODO add your handling code here:
        
        String inquilinioSeleccionado = tipo_inquilino.getSelectedItem().toString().toLowerCase().trim();

        switch(inquilinioSeleccionado){
            case "seleccionar":
                panel_comun.setVisible(false);
                panel_adulto.setVisible(false);
                panel_hijo.setVisible(false);
                panel_adulto_mayor.setVisible(false);
                cleanInputs();
            break;
            case "adulto":
                panel_comun.setVisible(true);
                panel_adulto.setVisible(true);
                panel_hijo.setVisible(false);
                panel_adulto_mayor.setVisible(false);
                cleanInputs();
            break;
            case "hijo":
                panel_comun.setVisible(true);
                panel_adulto.setVisible(false);
                panel_hijo.setVisible(true);
                panel_adulto_mayor.setVisible(false);
                cleanInputs();
            break;
            case "adulto mayor":
                panel_comun.setVisible(true);
                panel_adulto.setVisible(false);
                panel_hijo.setVisible(false);
                panel_adulto_mayor.setVisible(true);
                cleanInputs();
            break;
        }
        
    }//GEN-LAST:event_tipo_inquilinoActionPerformed

    private void add_adultoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_adultoActionPerformed
        // TODO add your handling code here:
        validaciones v = new validaciones();
        
        if(v.is_StringCualquieraValidoNotEmpty(inq_nombre.getText())){
                if(v.is_CI_valida(inq_ci.getText()) && !EmpresaCondominio.ExisteInquilinoCedula(inq_ci.getText())){
                        boolean inquilinoDesempleado = inq_isdesempleado.isSelected();
                        boolean inquilinoAsisteReuniones = inq_ifasistereuniones.isSelected();
                        if(v.seeIfNumberIsIntegerPositivo(inq_cantAusenciasreuniones.getValue().toString())){
                            if(v.seeIfNumberIsIntegerPositivo(inq_a_cantidadhijos.getValue().toString())){
                                boolean inquilinoCasado = inq_a_iscasado.isSelected();
                                
                                inquilino inqTemp = new inq_adulto(Integer.parseInt(inq_a_cantidadhijos.getValue().toString()),inquilinoCasado, inq_nombre.getText(),inq_ci.getText(), inquilinoDesempleado, inquilinoAsisteReuniones, Integer.parseInt(inq_cantAusenciasreuniones.getValue().toString()));
                                EmpresaCondominio.add_inquilino(inqTemp);
                                
                                try {
                                    handlerFile.SaveInquilinosAdultos(EmpresaCondominio);
                                } catch (IOException ex) {
                                    showMsg("Error al salvar el fichero inquilinos adultos");
                                }
                                
                                EmpresaCondominio.ImprimoInquilinos();
                                cleanInputs();
                                showMsg("Ingresado con exito");
                                
                            }else{
                                showMsg("Ingrese la cantidad de hijos del inquilino (mayor o igual a cero)");
                            }
                        }else{
                            showMsg("Ingrese la cantidad de ausencias del inquilino a las reuniones (mayor o igual a cero)");
                        }
                }else{
                    showMsg("Ingrese una cedula para el inquilino cedula ya repetida = "+EmpresaCondominio.ExisteInquilinoCedula(inq_ci.getText()));
                }
        }else{
            showMsg("Ingrese un nombre para el inquilino");
        }
    }//GEN-LAST:event_add_adultoActionPerformed

    private void add_hijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_hijoActionPerformed
        // TODO add your handling code here:
        validaciones v = new validaciones();
        
        if(v.is_StringCualquieraValidoNotEmpty(inq_nombre.getText())){
                if(v.is_CI_valida(inq_ci.getText()) && !EmpresaCondominio.ExisteInquilinoCedula(inq_ci.getText())){
                        boolean inquilinoDesempleado = inq_isdesempleado.isSelected();
                        boolean inquilinoAsisteReuniones = inq_ifasistereuniones.isSelected();
                        if(v.seeIfNumberIsIntegerPositivo(inq_cantAusenciasreuniones.getValue().toString())){
                            if(v.seeIfNumberIsIntegerPositivo(inq_h_edad.getValue().toString()) && Integer.parseInt(inq_h_edad.getValue().toString())>0 && Integer.parseInt(inq_h_edad.getValue().toString())<=120){
                                if(v.seeIfNumberIsIntegerPositivo(inq_h_nivelescolar.getValue().toString()) && Integer.parseInt(inq_h_nivelescolar.getValue().toString())>=1 && Integer.parseInt(inq_h_nivelescolar.getValue().toString())<=4){
                                
                                    inquilino inqTemp = new inq_hijo(Integer.parseInt(inq_h_edad.getValue().toString()),Integer.parseInt(inq_h_nivelescolar.getValue().toString()), inq_nombre.getText(),inq_ci.getText(), inquilinoDesempleado, inquilinoAsisteReuniones, Integer.parseInt(inq_cantAusenciasreuniones.getValue().toString()));
                                    EmpresaCondominio.add_inquilino(inqTemp);

                                    try {
                                        handlerFile.SaveInquilinosHijos(EmpresaCondominio);
                                    } catch (IOException ex) {
                                        showMsg("Error al salvar el fichero inquilinos hijos");
                                    }
                                    
                                    EmpresaCondominio.ImprimoInquilinos();
                                    cleanInputs();
                                    showMsg("Ingresado con exito");
                                
                                
                                }else{
                                  showMsg("Ingrese el nivel de escolaridad debe ser de 1 a 4 siendo (basica,elemental,media,superior");  
                                }
                                
                            }else{
                              showMsg("Ingrese la edad (debe ser mayor que cero y menor que 120)");  
                            }
                        }else{
                            showMsg("Ingrese la cantidad de ausencias del inquilino a las reuniones (mayor o igual a cero)");
                        }
                }else{
                    showMsg("Ingrese una cedula para el inquilino cedula ya repetida = "+EmpresaCondominio.ExisteInquilinoCedula(inq_ci.getText()));
                }
        }else{
            showMsg("Ingrese un nombre para el inquilino");
        }
    }//GEN-LAST:event_add_hijoActionPerformed

    private void add_adulto_mayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_adulto_mayorActionPerformed
        // TODO add your handling code here:
        validaciones v = new validaciones();
        
        if(v.is_StringCualquieraValidoNotEmpty(inq_nombre.getText())){
                if(v.is_CI_valida(inq_ci.getText()) && !EmpresaCondominio.ExisteInquilinoCedula(inq_ci.getText())){
                        boolean inquilinoDesempleado = inq_isdesempleado.isSelected();
                        boolean inquilinoAsisteReuniones = inq_ifasistereuniones.isSelected();
                        if(v.seeIfNumberIsIntegerPositivo(inq_cantAusenciasreuniones.getValue().toString())){
                            if(v.seeIfNumberIsIntegerPositivo(inq_am_edad.getValue().toString()) && Integer.parseInt(inq_am_edad.getValue().toString())>59 && Integer.parseInt(inq_am_edad.getValue().toString())<=120){
                                boolean jubilado = inq_am_isjubilado.isSelected();
                                
                                inquilino inqTemp = new inq_adulto_mayor(Integer.parseInt(inq_am_edad.getValue().toString()),jubilado, inq_nombre.getText(),inq_ci.getText(), inquilinoDesempleado, inquilinoAsisteReuniones, Integer.parseInt(inq_cantAusenciasreuniones.getValue().toString()));
                                EmpresaCondominio.add_inquilino(inqTemp);
                                
                                try {
                                    handlerFile.SaveInquilinosAdultosMayores(EmpresaCondominio);
                                } catch (IOException ex) {
                                    showMsg("Error al salvar el fichero inquilinos adultos mayores");
                                }
                                
                                EmpresaCondominio.ImprimoInquilinos();
                                cleanInputs();
                                showMsg("Ingresado con exito");
                                
                                
                            }else{
                              showMsg("Ingrese la edad (debe ser mayor que 59 y menor que 120)");  
                            }   
                        }else{
                            showMsg("Ingrese la cantidad de ausencias del inquilino a las reuniones (mayor o igual a cero)");
                        }
                }else{
                    showMsg("Ingrese una cedula para el inquilino cedula ya repetida = "+EmpresaCondominio.ExisteInquilinoCedula(inq_ci.getText()));
                }
        }else{
            showMsg("Ingrese un nombre para el inquilino");
        }
    }//GEN-LAST:event_add_adulto_mayorActionPerformed

    public void showMsg(String msg){
        JOptionPane.showMessageDialog(rootPane, msg);
    }
    
    public void cleanInputs(){
        inq_nombre.setText("");
        inq_ci.setText("");
        inq_isdesempleado.setSelected(false);
        inq_ifasistereuniones.setSelected(false);
        inq_cantAusenciasreuniones.setValue(0);
        inq_a_cantidadhijos.setValue(0);
        inq_a_iscasado.setSelected(false);
        inq_h_edad.setValue(0);
        inq_h_nivelescolar.setValue(1);
        inq_am_edad.setValue(0);
        inq_am_isjubilado.setSelected(false);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(add_inquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_inquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_inquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_inquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_inquilino(InterfazPrincipal).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_adulto;
    private javax.swing.JButton add_adulto_mayor;
    private javax.swing.JButton add_hijo;
    private javax.swing.JSpinner inq_a_cantidadhijos;
    private javax.swing.JCheckBox inq_a_iscasado;
    private javax.swing.JSpinner inq_am_edad;
    private javax.swing.JCheckBox inq_am_isjubilado;
    private javax.swing.JSpinner inq_cantAusenciasreuniones;
    private javax.swing.JTextField inq_ci;
    private javax.swing.JSpinner inq_h_edad;
    private javax.swing.JSpinner inq_h_nivelescolar;
    private javax.swing.JCheckBox inq_ifasistereuniones;
    private javax.swing.JCheckBox inq_isdesempleado;
    private javax.swing.JTextField inq_nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel panel_adulto;
    private javax.swing.JPanel panel_adulto_mayor;
    private javax.swing.JPanel panel_comun;
    private javax.swing.JPanel panel_hijo;
    private javax.swing.JButton regresar;
    private javax.swing.JComboBox<String> tipo_inquilino;
    // End of variables declaration//GEN-END:variables
}
