/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.TechQuiero.Java.View;

/**
 *
 * @author claudia11
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bottomLibrary = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buyBooksss = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        wordBox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TypeOfWord = new javax.swing.JComboBox<>();
        bAceptar = new javax.swing.JButton();
        cantidadBoooks = new javax.swing.JLabel();
        Librarybutton = new javax.swing.JButton();

        bottomLibrary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/TechQuiero/Java/Images/iconfinder_bookshelf_1055107.png"))); // NOI18N
        bottomLibrary.setText("jLabel4");
        bottomLibrary.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), null));
        bottomLibrary.setMaximumSize(new java.awt.Dimension(550, 512));
        bottomLibrary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bottomLibraryMouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(102, 204, 255));
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel1.setText(" Tech Quiero Book store");

        jLabel2.setText("Books in my car: ");

        buyBooksss.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        buyBooksss.setText("Buy book");
        buyBooksss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyBooksssActionPerformed(evt);
            }
        });

        jLabel3.setText("Search a book by: ");

        wordBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wordBoxMouseClicked(evt);
            }
        });
        wordBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordBoxActionPerformed(evt);
            }
        });
        wordBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                wordBoxKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel5.setText("Libry");

        TypeOfWord.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Autor" }));
        TypeOfWord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TypeOfWordMouseClicked(evt);
            }
        });
        TypeOfWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeOfWordActionPerformed(evt);
            }
        });

        bAceptar.setText("Search");
        bAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bAceptarMouseClicked(evt);
            }
        });
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        Librarybutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/TechQuiero/Java/Images/iconfinder_bookshelf_1055107.png"))); // NOI18N
        Librarybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibrarybuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cantidadBoooks, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(buyBooksss))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Librarybutton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(TypeOfWord, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(wordBox, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bAceptar)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(201, 201, 201))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cantidadBoooks, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buyBooksss, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wordBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(TypeOfWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAceptar))
                .addGap(18, 18, 18)
                .addComponent(Librarybutton)
                .addGap(16, 16, 16)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buyBooksssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyBooksssActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buyBooksssActionPerformed

    private void wordBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wordBoxActionPerformed

    private void bottomLibraryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bottomLibraryMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bottomLibraryMouseClicked

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
       
    }//GEN-LAST:event_bAceptarActionPerformed

    private void bAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAceptarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bAceptarMouseClicked

    private void TypeOfWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeOfWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TypeOfWordActionPerformed

    private void TypeOfWordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TypeOfWordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TypeOfWordMouseClicked

    private void wordBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wordBoxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_wordBoxMouseClicked

    private void wordBoxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wordBoxKeyTyped
     char c = evt.getKeyChar();
        //La siguiente linea si el carcter no es entre  y 9 se desecha
        if((c<'a'|| c>'z') && (c<'A'||c>'Z')) evt.consume();
        // TODO add your handling code here:
    }//GEN-LAST:event_wordBoxKeyTyped

    private void LibrarybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LibrarybuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LibrarybuttonActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Librarybutton;
    public javax.swing.JComboBox<String> TypeOfWord;
    public javax.swing.JButton bAceptar;
    public javax.swing.JLabel bottomLibrary;
    public javax.swing.JButton buyBooksss;
    public javax.swing.JLabel cantidadBoooks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JTextField wordBox;
    // End of variables declaration//GEN-END:variables
}
