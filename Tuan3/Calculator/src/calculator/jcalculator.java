/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author HaiApple.Com
 */
public class jcalculator extends javax.swing.JFrame {

    /**
     * Creates new form jcalculator
     */
    
    double num,ans;
    int caculation;
    
    public jcalculator() {
        initComponents();
        jRadioButton1.setEnabled(false);
    }
    
    public void arithmetic_operation()
    {
    switch(caculation)
    {
        case 1:
            ans = num + Double.parseDouble(jTextField1.getText());
            jTextField1.setText(Double.toString(ans));
            break;
            
            case 2:
            ans = num - Double.parseDouble(jTextField1.getText());
            jTextField1.setText(Double.toString(ans));
            break;
            
         case 3:
            ans = num * Double.parseDouble(jTextField1.getText());
            jTextField1.setText(Double.toString(ans));
            break;
            
        case 4:
            ans = num  / Double.parseDouble(jTextField1.getText());
            jTextField1.setText(Double.toString(ans));
            break;
            
        
    }
    }
    
    
    public void enable()
    {
    jTextField1.setEnabled(true);
    
    jRadioButton1.setEnabled(false);
    jRadioButton2.setEnabled(true);
    so0.setEnabled(true);
    so1.setEnabled(true);
    so2.setEnabled(true);
    so3.setEnabled(true);
    so4.setEnabled(true);
    so5.setEnabled(true);
    so6.setEnabled(true);
    so7.setEnabled(true);
    so8.setEnabled(true);
    so9.setEnabled(true);
    chia.setEnabled(true);
    sqrt.setEnabled(true);
    nhan.setEnabled(true);
    phantram.setEnabled(true);
    tru.setEnabled(true);
    thapphan.setEnabled(true);
    congtru.setEnabled(true);
    xoa.setEnabled(true);
    cham.setEnabled(true);
    bang.setEnabled(true);
    }
public void disable()
{
    jRadioButton1.setEnabled(true);     //on
    jRadioButton2.setEnabled(false);    //off
jTextField1.setEnabled(false);
so0.setEnabled(false);
so1.setEnabled(false);
so2.setEnabled(false);
so3.setEnabled(false);
so4.setEnabled(false);
so5.setEnabled(false);
so6.setEnabled(false);
so7.setEnabled(false);
so8.setEnabled(false);
so9.setEnabled(false);
chia.setEnabled(false);
sqrt.setEnabled(false);
tru.setEnabled(false);
nhan.setEnabled(false);
phantram.setEnabled(false);
thapphan.setEnabled(false);
congtru.setEnabled(false);
xoa.setEnabled(false);
cham.setEnabled(false);
bang.setEnabled(false);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        so1 = new javax.swing.JButton();
        so2 = new javax.swing.JButton();
        so3 = new javax.swing.JButton();
        chia = new javax.swing.JButton();
        sqrt = new javax.swing.JButton();
        so4 = new javax.swing.JButton();
        so5 = new javax.swing.JButton();
        so6 = new javax.swing.JButton();
        nhan = new javax.swing.JButton();
        phantram = new javax.swing.JButton();
        so7 = new javax.swing.JButton();
        so8 = new javax.swing.JButton();
        so9 = new javax.swing.JButton();
        tru = new javax.swing.JButton();
        thapphan = new javax.swing.JButton();
        so0 = new javax.swing.JButton();
        congtru = new javax.swing.JButton();
        xoa = new javax.swing.JButton();
        cham = new javax.swing.JButton();
        bang = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLocation(new java.awt.Point(500, 500));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("ON");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("OFF");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(4, 5));

        so1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        so1.setText("1");
        so1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so1ActionPerformed(evt);
            }
        });
        jPanel1.add(so1);

        so2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        so2.setText("2");
        so2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so2ActionPerformed(evt);
            }
        });
        jPanel1.add(so2);

        so3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        so3.setText("3");
        so3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so3ActionPerformed(evt);
            }
        });
        jPanel1.add(so3);

        chia.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        chia.setText("/");
        chia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chiaActionPerformed(evt);
            }
        });
        jPanel1.add(chia);

        sqrt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sqrt.setText("sqrt");
        sqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtActionPerformed(evt);
            }
        });
        jPanel1.add(sqrt);

        so4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        so4.setText("4");
        so4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so4ActionPerformed(evt);
            }
        });
        jPanel1.add(so4);

        so5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        so5.setText("5");
        so5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so5ActionPerformed(evt);
            }
        });
        jPanel1.add(so5);

        so6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        so6.setText("6");
        so6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so6ActionPerformed(evt);
            }
        });
        jPanel1.add(so6);

        nhan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nhan.setText("x");
        nhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhanActionPerformed(evt);
            }
        });
        jPanel1.add(nhan);

        phantram.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        phantram.setText("%");
        phantram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phantramActionPerformed(evt);
            }
        });
        jPanel1.add(phantram);

        so7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        so7.setText("7");
        so7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so7ActionPerformed(evt);
            }
        });
        jPanel1.add(so7);

        so8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        so8.setText("8");
        so8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so8ActionPerformed(evt);
            }
        });
        jPanel1.add(so8);

        so9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        so9.setText("9");
        so9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so9ActionPerformed(evt);
            }
        });
        jPanel1.add(so9);

        tru.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tru.setText("-");
        tru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truActionPerformed(evt);
            }
        });
        jPanel1.add(tru);

        thapphan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        thapphan.setText("+");
        thapphan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thapphanActionPerformed(evt);
            }
        });
        jPanel1.add(thapphan);

        so0.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        so0.setText("0");
        so0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so0ActionPerformed(evt);
            }
        });
        jPanel1.add(so0);

        congtru.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        congtru.setText("+/-");
        congtru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                congtruActionPerformed(evt);
            }
        });
        jPanel1.add(congtru);

        xoa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        xoa.setText("C");
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });
        jPanel1.add(xoa);

        cham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cham.setText(".");
        cham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chamActionPerformed(evt);
            }
        });
        jPanel1.add(cham);

        bang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bang.setText("=");
        bang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangActionPerformed(evt);
            }
        });
        jPanel1.add(bang);

        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jRadioButton1)
                                    .addGap(33, 33, 33)
                                    .addComponent(jRadioButton2))
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void so1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so1ActionPerformed
    jTextField1.setText(jTextField1.getText()+"1");
    }//GEN-LAST:event_so1ActionPerformed

    private void so2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"2");
    }//GEN-LAST:event_so2ActionPerformed

    private void so3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so3ActionPerformed
        // TODO add your handling code here:
         jTextField1.setText(jTextField1.getText()+"3");
    }//GEN-LAST:event_so3ActionPerformed

    private void so4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so4ActionPerformed
        // TODO add your handling code here:
         jTextField1.setText(jTextField1.getText()+"4");
    }//GEN-LAST:event_so4ActionPerformed

    private void so5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so5ActionPerformed
        jTextField1.setText(jTextField1.getText()+"5");
    }//GEN-LAST:event_so5ActionPerformed

    private void so6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so6ActionPerformed
 jTextField1.setText(jTextField1.getText()+"6");
    }//GEN-LAST:event_so6ActionPerformed

    private void so7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so7ActionPerformed
 jTextField1.setText(jTextField1.getText()+"7");        
    }//GEN-LAST:event_so7ActionPerformed

    private void so8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so8ActionPerformed
 jTextField1.setText(jTextField1.getText()+"8");      
    }//GEN-LAST:event_so8ActionPerformed

    private void so9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so9ActionPerformed
 jTextField1.setText(jTextField1.getText()+"9");        // TODO add your handling code here:
    }//GEN-LAST:event_so9ActionPerformed

    private void so0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so0ActionPerformed
        jTextField1.setText(jTextField1.getText()+"0");
    }//GEN-LAST:event_so0ActionPerformed

    private void chiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chiaActionPerformed
     num = Double.parseDouble(jTextField1.getText());
 caculation = 4;
 jTextField1.setText("");
 jLabel1.setText(num + "/");
    }//GEN-LAST:event_chiaActionPerformed

    private void sqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrtActionPerformed
       jTextField1.setText(jTextField1.getText()+"Sqrt");
    }//GEN-LAST:event_sqrtActionPerformed

    private void nhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhanActionPerformed
      num = Double.parseDouble(jTextField1.getText());
 caculation = 3;
 jTextField1.setText("");
 jLabel1.setText(num + "*");
    }//GEN-LAST:event_nhanActionPerformed

    private void phantramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phantramActionPerformed
      jTextField1.setText(jTextField1.getText()+"%");
    }//GEN-LAST:event_phantramActionPerformed

    private void truActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_truActionPerformed
  num = Double.parseDouble(jTextField1.getText());
 caculation = 2;
 jTextField1.setText("");
 jLabel1.setText(num + "-");       // TODO add your handling code here:
    }//GEN-LAST:event_truActionPerformed

    private void thapphanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thapphanActionPerformed
   
 num = Double.parseDouble(jTextField1.getText());
 caculation = 1;
 jTextField1.setText("");
 jLabel1.setText(num + "+");
 
    }//GEN-LAST:event_thapphanActionPerformed

    private void congtruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_congtruActionPerformed
 jTextField1.setText(jTextField1.getText()+"-");        // TODO add your handling code here:
    }//GEN-LAST:event_congtruActionPerformed

    private void chamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chamActionPerformed
 jTextField1.setText(jTextField1.getText()+".");        // TODO add your handling code here:
    }//GEN-LAST:event_chamActionPerformed

    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed
       
       int length= jTextField1.getText().length();
       int number= jTextField1.getText().length()-1;
       String store;
       
       if(length > 0)
       {
           StringBuffer back = new StringBuffer(jTextField1.getText());
           back.deleteCharAt(number);
           store=back.toString();
           jTextField1.setText(store);
       } 
    }//GEN-LAST:event_xoaActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
      disable();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
       enable();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void bangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangActionPerformed
       arithmetic_operation();
       jLabel1.setText("");
    }//GEN-LAST:event_bangActionPerformed

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
            java.util.logging.Logger.getLogger(jcalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jcalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jcalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jcalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jcalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bang;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cham;
    private javax.swing.JButton chia;
    private javax.swing.JButton congtru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton nhan;
    private javax.swing.JButton phantram;
    private javax.swing.JButton so0;
    private javax.swing.JButton so1;
    private javax.swing.JButton so2;
    private javax.swing.JButton so3;
    private javax.swing.JButton so4;
    private javax.swing.JButton so5;
    private javax.swing.JButton so6;
    private javax.swing.JButton so7;
    private javax.swing.JButton so8;
    private javax.swing.JButton so9;
    private javax.swing.JButton sqrt;
    private javax.swing.JButton thapphan;
    private javax.swing.JButton tru;
    private javax.swing.JButton xoa;
    // End of variables declaration//GEN-END:variables
}