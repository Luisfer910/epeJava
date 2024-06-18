
package taller_java_epe;

import java.sql.SQLException;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() { 
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jText_rut = new javax.swing.JTextField();
        jText_nombre = new javax.swing.JTextField();
        jText_apellido = new javax.swing.JTextField();
        jText_correo = new javax.swing.JTextField();
        btGuardarP = new javax.swing.JButton();
        btBuscarP = new javax.swing.JButton();
        btEliminarP = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        btSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pacientes"));

        jLabel1.setText("Rut");

        jLabel2.setText("Nombre");

        jLabel3.setText("Correo");

        jLabel4.setText("Apellido");

        jText_rut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_rutActionPerformed(evt);
            }
        });

        jText_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_nombreActionPerformed(evt);
            }
        });

        btGuardarP.setText("Guardar");
        btGuardarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarPActionPerformed(evt);
            }
        });

        btBuscarP.setText("Buscar");
        btBuscarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarPActionPerformed(evt);
            }
        });

        btEliminarP.setText("Eliminar");
        btEliminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarPActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jText_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jText_rut, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jText_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jText_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btBuscarP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btGuardarP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btEliminarP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jText_rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jText_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jText_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jText_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btGuardarP)
                        .addGap(18, 18, 18)
                        .addComponent(btBuscarP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEliminarP)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setText("Registo Sistema Medico");

        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(btSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190)
                .addComponent(btSalir)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jText_rutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_rutActionPerformed
    
    }//GEN-LAST:event_jText_rutActionPerformed

    private void jText_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_nombreActionPerformed
      
    }//GEN-LAST:event_jText_nombreActionPerformed

    private void btBuscarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarPActionPerformed
    String rut = this.jText_rut.getText(); 
    
    try {  if (rut.isEmpty()) {
            // Mostrar todos los pacientes si el campo de búsqueda está vacío
            String pacientesInfo = Pacientes.mostrarTodos();
            this.jTextArea1.setText("Lista de Pacientes.\n\n" + pacientesInfo);
        } else {
            // Instanciar un nuevo objeto Pacientes solo con el rut
            Pacientes objPac = new Pacientes(rut, "", "", ""); // Solo necesitas el rut para buscar
            objPac.cargarRutPaciente();
            
            // Actualiza JTextArea o JTextField con la información del paciente
            this.jTextArea1.setText(objPac.toString()); // JTextArea para mostrar los datos
        }
    } catch (SQLException e) {   // Maneja la excepción adecuadamente
        System.out.println("Error al buscar paciente: " + e.getMessage());
   
    }    }//GEN-LAST:event_btBuscarPActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btSalirActionPerformed

    private void btGuardarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarPActionPerformed
                        //instancio un nuevo objeto                  
    Pacientes objPac = new Pacientes(this.jText_rut.getText(), this.jText_nombre.getText(), this.jText_apellido.getText(), this.jText_correo.getText());
        
    try {
        objPac.guardarPaciente(); // Guardar el paciente en la base de datos
        
        // Obtener la lista actualizada de todos los pacientes y mostrarla en el JTextArea
        String pacientesInfo = Pacientes.mostrarTodos();
        this.jTextArea1.setText("Datos Actualizados.\n\n" + pacientesInfo);
        
        jText_rut.setText("");
        jText_nombre.setText("");
        jText_apellido.setText("");
        jText_correo.setText("");
        
    } catch (SQLException e) {
        // Manejar excepciones de SQL
        System.out.println("Error al guardar paciente en la base de datos: " + e.getMessage());
        
    } catch (Exception e) {
        // Manejar cualquier otra excepción
        System.out.println("Error al guardar paciente: " + e.getMessage());
    
    }
    }//GEN-LAST:event_btGuardarPActionPerformed

    private void btEliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarPActionPerformed
        try {
          Pacientes objPac = new Pacientes(this.jText_rut.getText(), this.jText_nombre.getText(), this.jText_apellido.getText(), this.jText_correo.getText());
          objPac.eliminar();
          String pacientesInfo = Pacientes.mostrarTodos();
        this.jTextArea1.setText("Datos Actualizados.\n\n" + pacientesInfo);
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_btEliminarPActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarP;
    private javax.swing.JButton btEliminarP;
    private javax.swing.JButton btGuardarP;
    private javax.swing.JButton btSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jText_apellido;
    private javax.swing.JTextField jText_correo;
    private javax.swing.JTextField jText_nombre;
    private javax.swing.JTextField jText_rut;
    // End of variables declaration//GEN-END:variables
}
