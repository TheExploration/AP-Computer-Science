

public class GuessFrame extends javax.swing.JFrame {
    String hidden = "";
    private String guessWord = "";
    boolean started = false;
    private String guess = "";
    private WordManager wm = new WordManager();
    
    
    public GuessFrame() {
        initComponents();
        guessStart.setEnabled(false);
        guessResult.setEditable(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guessField = new javax.swing.JTextField();
        guessStart = new javax.swing.JButton();
        guessResult = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        generateWord = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        guessField.setText("Guess Here");
        guessField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessFieldActionPerformed(evt);
            }
        });
        guessField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                guessFieldKeyTyped(evt);
            }
        });

        guessStart.setText("Guess");
        guessStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessStartActionPerformed(evt);
            }
        });

        guessResult.setText("Generate Word First!");
        guessResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessResultActionPerformed(evt);
            }
        });

        jMenu1.setText("Guess Game");

        generateWord.setText("Generate Word");
        generateWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateWordActionPerformed(evt);
            }
        });
        jMenu1.add(generateWord);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(guessResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(129, 129, 129)
                            .addComponent(guessField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(156, 156, 156)
                            .addComponent(guessStart))))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(guessField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(guessStart)
                .addGap(26, 26, 26)
                .addComponent(guessResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guessFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guessFieldActionPerformed

    private void guessStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessStartActionPerformed
        guess = guessField.getText();
        
        for (int i = 0; i < guessWord.length(); i++) {
            if (guess.equals(guessWord.substring(i, i+1))) {
                hidden = hidden.substring(0, i) + guess + hidden.substring(i+1);
                guessResult.setText(hidden);
            }
        }
        if (hidden.equals(guessWord)) {
         
            guessField.setText("YOU WIN!");
            guessField.setEditable(false);
            guessStart.setEnabled(false);
            
            
        }
        
    }//GEN-LAST:event_guessStartActionPerformed

    private void generateWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateWordActionPerformed
        guessWord = "waqfs";
        guessField.setEditable(true);
        guessStart.setText("Guess");
        guessStart.setEnabled(true);
        hidden = "";
        for (int i = 0; i < guessWord.length(); i++) {
            hidden = hidden + "-";
        }
        guessResult.setText(hidden);
        started = true;
        guessField.setText("");
    }//GEN-LAST:event_generateWordActionPerformed

    private void guessResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessResultActionPerformed
        
        
    }//GEN-LAST:event_guessResultActionPerformed

    private void guessFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_guessFieldKeyTyped
      
        guessField.setText("");
       
    }//GEN-LAST:event_guessFieldKeyTyped

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
            java.util.logging.Logger.getLogger(GuessFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuessFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuessFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuessFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuessFrame().setVisible(true);
            }
        });
    }
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem generateWord;
    private javax.swing.JTextField guessField;
    private javax.swing.JTextField guessResult;
    private javax.swing.JButton guessStart;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
