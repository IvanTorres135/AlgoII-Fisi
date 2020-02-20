package pe.unmsm;

public class Calculadora extends javax.swing.JFrame {
Libreria obj=new Libreria();
    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);//aparece la ventana en el centro
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        Btn2 = new javax.swing.JButton();
        Btn1 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        Btn7 = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        Btn0 = new javax.swing.JButton();
        Btnpunto = new javax.swing.JButton();
        Btnigual = new javax.swing.JButton();
        Btn_mas = new javax.swing.JButton();
        Btn_menos = new javax.swing.JButton();
        Btn_por = new javax.swing.JButton();
        Btn_division = new javax.swing.JButton();
        BtnC = new javax.swing.JButton();
        Btn10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setName("calc"); // NOI18N

        Btn2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Btn2.setText("2");
        Btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn2MouseClicked(evt);
            }
        });

        Btn1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Btn1.setText("1");
        Btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn1MouseClicked(evt);
            }
        });

        Btn3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Btn3.setText("3");
        Btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn3MouseClicked(evt);
            }
        });

        Btn4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Btn4.setText("4");
        Btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn4MouseClicked(evt);
            }
        });

        Btn5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Btn5.setText("5");
        Btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn5MouseClicked(evt);
            }
        });

        Btn6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Btn6.setText("6");
        Btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn6MouseClicked(evt);
            }
        });

        Btn7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Btn7.setText("7");
        Btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn7MouseClicked(evt);
            }
        });

        Btn8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Btn8.setText("8");
        Btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn8MouseClicked(evt);
            }
        });

        Btn9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Btn9.setText("9");
        Btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn9MouseClicked(evt);
            }
        });

        Btn0.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Btn0.setText("0");
        Btn0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn0MouseClicked(evt);
            }
        });

        Btnpunto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Btnpunto.setText(".");
        Btnpunto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnpuntoMouseClicked(evt);
            }
        });

        Btnigual.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Btnigual.setText("=");
        Btnigual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnigualMouseClicked(evt);
            }
        });

        Btn_mas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Btn_mas.setText("+");
        Btn_mas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_masMouseClicked(evt);
            }
        });

        Btn_menos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Btn_menos.setText("-");
        Btn_menos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_menosMouseClicked(evt);
            }
        });

        Btn_por.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Btn_por.setText("*");
        Btn_por.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_porMouseClicked(evt);
            }
        });

        Btn_division.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Btn_division.setText("/");
        Btn_division.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_divisionMouseClicked(evt);
            }
        });

        BtnC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnC.setText("C");
        BtnC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCMouseClicked(evt);
            }
        });

        Btn10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Btn10.setText("<-");
        Btn10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn10MouseClicked(evt);
            }
        });

        jLabel1.setText("Torres Martinez Iván");

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btnpunto, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btnigual, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_mas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_por, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_division, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1)))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_mas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_por, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btnpunto, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btnigual, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_division, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn1MouseClicked
        jTextField1.setText(obj.concatenamiento("1"));
    }//GEN-LAST:event_Btn1MouseClicked

    private void Btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn2MouseClicked
        jTextField1.setText(obj.concatenamiento("2"));
    }//GEN-LAST:event_Btn2MouseClicked

    private void Btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn3MouseClicked
        jTextField1.setText(obj.concatenamiento("3"));
    }//GEN-LAST:event_Btn3MouseClicked

    private void Btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn4MouseClicked
        jTextField1.setText(obj.concatenamiento("4"));
    }//GEN-LAST:event_Btn4MouseClicked

    private void Btn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn5MouseClicked
        jTextField1.setText(obj.concatenamiento("5"));
    }//GEN-LAST:event_Btn5MouseClicked

    private void Btn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn6MouseClicked
        jTextField1.setText(obj.concatenamiento("6"));
    }//GEN-LAST:event_Btn6MouseClicked

    private void Btn7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn7MouseClicked
        jTextField1.setText(obj.concatenamiento("7"));
    }//GEN-LAST:event_Btn7MouseClicked

    private void Btn8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn8MouseClicked
        jTextField1.setText(obj.concatenamiento("8"));
    }//GEN-LAST:event_Btn8MouseClicked

    private void Btn9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn9MouseClicked
        jTextField1.setText(obj.concatenamiento("9"));
    }//GEN-LAST:event_Btn9MouseClicked

    private void Btn0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn0MouseClicked
        jTextField1.setText(obj.concatenamiento("0"));
    }//GEN-LAST:event_Btn0MouseClicked

    private void Btn_masMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_masMouseClicked
        obj.suma(jTextField1.getText());
    }//GEN-LAST:event_Btn_masMouseClicked

    private void BtnigualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnigualMouseClicked
        jTextField1.setText(""+obj.resultado(jTextField1.getText()));
    }//GEN-LAST:event_BtnigualMouseClicked

    private void BtnpuntoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnpuntoMouseClicked
        jTextField1.setText(obj.concatenamiento("."));
    }//GEN-LAST:event_BtnpuntoMouseClicked

    private void Btn_menosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_menosMouseClicked
        obj.resta(jTextField1.getText());
    }//GEN-LAST:event_Btn_menosMouseClicked

    private void Btn_porMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_porMouseClicked
        obj.multiplicacion(jTextField1.getText());
    }//GEN-LAST:event_Btn_porMouseClicked

    private void Btn_divisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_divisionMouseClicked
        obj.division(jTextField1.getText());
    }//GEN-LAST:event_Btn_divisionMouseClicked

    private void BtnCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCMouseClicked
        obj.borrarT(jTextField1.getText());
        jTextField1.setText("0");
    }//GEN-LAST:event_BtnCMouseClicked

    private void Btn10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn10MouseClicked
        if(jTextField1.getText().length()!=0){
            jTextField1.setText(jTextField1.getText().substring(0, jTextField1.getText().length()-1));
        }
    }//GEN-LAST:event_Btn10MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn0;
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn10;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    private javax.swing.JButton BtnC;
    private javax.swing.JButton Btn_division;
    private javax.swing.JButton Btn_mas;
    private javax.swing.JButton Btn_menos;
    private javax.swing.JButton Btn_por;
    private javax.swing.JButton Btnigual;
    private javax.swing.JButton Btnpunto;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
