package edu.unicartagena.poo.gui;

import edu.unicartagena.poo.clases.GestorLibros;
import edu.unicartagena.poo.clases.Libro;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class GuiLibros extends javax.swing.JDialog {
    
    

    public GuiLibros(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
 

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BotonGuardar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        BotonBuscar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BotonEditar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(".::: GESTION DE LIBROS:::.");
        setForeground(new java.awt.Color(51, 0, 51));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 2, true), "Gestion De Libros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 15), new java.awt.Color(0, 153, 153))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 3, 17)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("TITULO");

        jTextField1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 3, 17)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("AUTOR");

        jTextField2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 3, 17)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("ISBN");

        jTextField3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("FORMULARIOS DE GESTION DE LIBROS");

        BotonGuardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotonGuardar.setText("GUARDAR");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        BotonCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotonCancelar.setText("CANCELAR");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        BotonBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotonBuscar.setText("BUSCAR");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        BotonEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotonEliminar.setText("ELIMINAR");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        BotonEditar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotonEditar.setText("EDITAR");
        BotonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/unicartagena/poo/gui/iconos/icono Usuario o admin.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(290, 290, 290))
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(BotonEditar)
                .addGap(68, 68, 68)
                .addComponent(BotonEliminar)
                .addGap(30, 30, 30)
                .addComponent(BotonBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonCancelar)
                .addGap(75, 75, 75)
                .addComponent(BotonGuardar)
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BotonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BotonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void BotonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEditarActionPerformed
        try {
        
        String titulo = JOptionPane.showInputDialog(this, "Ingrese el título del libro que desea editar:", "Editar Libro", JOptionPane.QUESTION_MESSAGE);

        
        if (titulo == null || titulo.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el título de un libro para editarlo.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        
        Libro libroAEditar = gestorLibros.buscarLibroPorTitulo(titulo.trim());

        
        if (libroAEditar == null) {
            JOptionPane.showMessageDialog(this, "No se encontraron libros con ese título o los datos son incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // panel editar datos
        JPanel panelEdicion = new JPanel(new GridLayout(4, 2, 5, 5)); 
        JTextField campoTitulo = new JTextField(libroAEditar.getTitulo()); 
        JTextField campoAutor = new JTextField(libroAEditar.getAutor()); 
        JTextField campoISBN = new JTextField(libroAEditar.getIsbn());   

        
        panelEdicion.add(new JLabel("Título:"));
        panelEdicion.add(campoTitulo);
        panelEdicion.add(new JLabel("Autor:"));
        panelEdicion.add(campoAutor);
        panelEdicion.add(new JLabel("ISBN:"));
        panelEdicion.add(campoISBN);

        
        int resultado = JOptionPane.showConfirmDialog(
            this,
            panelEdicion,
            "Editar Libro",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE
        );

        
        if (resultado == JOptionPane.OK_OPTION) {
            
            String nuevoTitulo = campoTitulo.getText().trim();
            String nuevoAutor = campoAutor.getText().trim();
            String nuevoISBN = campoISBN.getText().trim();

            if (nuevoTitulo.isEmpty() || nuevoAutor.isEmpty() || nuevoISBN.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            
            libroAEditar.setTitulo(nuevoTitulo);
            libroAEditar.setAutor(nuevoAutor);
            libroAEditar.setIsbn(nuevoISBN);

            JOptionPane.showMessageDialog(this, "Los datos del libro se han actualizado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (HeadlessException e) {
        JOptionPane.showMessageDialog(this, "Ocurrió un error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_BotonEditarActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonCancelarActionPerformed
    private final GestorLibros gestorLibros = new GestorLibros();
    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
    try {
        
        String titulo = jTextField1.getText().trim(); 
        String autor = jTextField2.getText().trim();  
        String isbn = jTextField3.getText().trim();    

        
        if (titulo.isEmpty() || autor.isEmpty() || isbn.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Crear un nuevo libro
        Libro nuevoLibro = new Libro(titulo, autor, isbn);

        
        if (gestorLibros.existeLibro(nuevoLibro)) {
            JOptionPane.showMessageDialog(this, "Ya existe un libro con estos datos.", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            
            gestorLibros.agregarLibro(nuevoLibro);

            
            JOptionPane.showMessageDialog(this, "Libro guardado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

            
            limpiarCampos();
        }

    } catch (HeadlessException e) {
        JOptionPane.showMessageDialog(this, "Ocurrió un error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
 String tituloBuscado = jTextField1.getText().trim(); // Suponiendo que jTextField1 es el campo para el título

    // Validar que el campo no esté vacío
    if (tituloBuscado.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese el título del libro para buscar.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Buscar el libro en el gestor
    Libro libroEncontrado = gestorLibros.buscarLibroPorTitulo(tituloBuscado);

    // Verificar si se encontró el libro
    if (libroEncontrado == null) {
        JOptionPane.showMessageDialog(this, "No existe un libro con el título: " + tituloBuscado, "Error", JOptionPane.WARNING_MESSAGE);
    } else {
        // Mostrar los datos del libro encontrado
        String mensaje = "Título: " + libroEncontrado.getTitulo() + "\n" +
                         "Autor: " + libroEncontrado.getAutor() + "\n" +
                         "ISBN: " + libroEncontrado.getIsbn();
        JOptionPane.showMessageDialog(this, mensaje, "Datos del Libro", JOptionPane.INFORMATION_MESSAGE);
    }    
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        try {
        // Solicitar al usuario que ingrese el título del libro a eliminar
        String titulo = JOptionPane.showInputDialog(this, "Ingrese el título del libro que desea eliminar:", "Eliminar Libro", JOptionPane.QUESTION_MESSAGE);

        // Verificar que se ingresó un título
        if (titulo == null || titulo.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el título de un libro para eliminarlo.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Buscar el libro por título
        Libro libroAEliminar = gestorLibros.buscarLibroPorTitulo(titulo.trim());

        // Verificar si el libro existe
        if (libroAEliminar == null) {
            JOptionPane.showMessageDialog(this, "No se encontraron libros con ese título o los datos son incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Mostrar los datos del libro encontrado y confirmar eliminación
        int confirmacion = JOptionPane.showConfirmDialog(
            this,
            """
            \u00bfEst\u00e1 seguro de que desea eliminar este libro?
            
            T\u00edtulo: """ + libroAEliminar.getTitulo() + "\n" +
            "Autor: " + libroAEliminar.getAutor() + "\n" +
            "ISBN: " + libroAEliminar.getIsbn(),
            "Confirmar Eliminación",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE
        );

        // Si el usuario confirma, eliminar el libro
        if (confirmacion == JOptionPane.YES_OPTION) {
            gestorLibros.getLibros().remove(libroAEliminar);
            JOptionPane.showMessageDialog(this, "El libro ha sido eliminado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (HeadlessException e) {
        JOptionPane.showMessageDialog(this, "Ocurrió un error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_BotonEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(GuiLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            GuiLibros dialog = new GuiLibros(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonEditar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
    jTextField1.setText(""); // Limpiar campo de título
    jTextField2.setText(""); // Limpiar campo de autor
    jTextField3.setText(""); // Limpiar campo de ISBN
}
}
