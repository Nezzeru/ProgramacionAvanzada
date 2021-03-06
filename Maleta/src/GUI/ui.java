/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import maleta.Armas;
import maleta.Maleta;
import maleta.Medicina;
import maleta.Objclaves;

/**
 *
 * @author teodora
 */
public class ui extends javax.swing.JFrame {

    maleta.Maleta baul = new Maleta();
    maleta.Armas arma = new Armas(001, "Armas", 200);
    maleta.Medicina medicina = new Medicina(002, "Medicinas", 100);
    maleta.Objclaves objeto = new Objclaves(003, "Objetos", false);

    /**
     * Agrega la imagen al label
     */
    private void addgun() {
        final JLabel textgun = new JLabel("");
        textgun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/01.png")));
        final JButton eliminar = new JButton("Eliminar");
        baseBaul.add(textgun);
        baseBaul.add(eliminar);
        revalidate();
        eliminar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                textgun.setVisible(false);
                eliminar.setVisible(false);
                baul.eliminar(arma.getId());
                System.out.println("____________________________________________");
                baul.consultar();

            }
        });
        repaint();

    }

    private void addMedicina() {
        final JLabel textgun = new JLabel("");
        textgun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/02.png")));
        final JButton eliminar = new JButton("Eliminar");
        baseBaul.add(textgun);
        baseBaul.add(eliminar);
        revalidate();
        eliminar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                textgun.setVisible(false);
                eliminar.setVisible(false);
                baul.eliminar(medicina.getId());
                System.out.println("____________________________________________");
                baul.consultar();

            }
        });
        repaint();

    }

    private void addObj() {
        final JLabel textgun = new JLabel("");
        textgun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/03.png")));
        final JButton eliminar = new JButton("Eliminar");
        baseBaul.add(textgun);
        baseBaul.add(eliminar);
        revalidate();
        eliminar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                textgun.setVisible(false);
                eliminar.setVisible(false);
                baul.eliminar(objeto.getId());
                System.out.println("____________________________________________");
                baul.consultar();

            }
        });
        repaint();

    }

    private void rmGun() {
        //baseBaul.removeMouseListener()
    }

    /**
     * Creates new form ui
     */
    public ui() {
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

        baseBaul = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        itemsToAdd = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 480));
        setResizable(false);

        baseBaul.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        baseBaul.setLayout(new java.awt.GridLayout(4, 5));

        menu.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("ALMACENAR");

        itemsToAdd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Armas", "Medicinas", "Objetos" }));
        itemsToAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsToAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemsToAdd, javax.swing.GroupLayout.Alignment.TRAILING, 0, 130, Short.MAX_VALUE)
                            .addGroup(menuLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemsToAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(baseBaul, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(baseBaul, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemsToAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsToAddActionPerformed
        //Si el elemento seleccionado coincide con los creados se añade al inventario
        if (itemsToAdd.getSelectedItem().toString().equalsIgnoreCase(arma.getName())) {
            try {
                baul.añadir(arma);
                //JOptionPane.showMessageDialog(null, "Se ha almacenado un arma", "¡ATENCION!", JOptionPane.INFORMATION_MESSAGE);
                addgun();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No hay espacio disponible para almacenar", "¡ATENCION!", JOptionPane.WARNING_MESSAGE);
            }
            //Si el elemento seleccionado coincide con los creados se añade al inventario
        } else if (itemsToAdd.getSelectedItem().toString().equalsIgnoreCase(medicina.getName())) {
            try {
                baul.añadir(medicina);
                //JOptionPane.showMessageDialog(null, "Se ha almacenado una medicina", "¡ATENCION!", JOptionPane.INFORMATION_MESSAGE);
                addMedicina();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No hay espacio disponible para almacenar", "¡ATENCION!", JOptionPane.WARNING_MESSAGE);

            }
            //Si el elemento seleccionado coincide con los creados se añade al inventario
        } else if (itemsToAdd.getSelectedItem().toString().equalsIgnoreCase(objeto.getName())) {
            try {
                baul.añadir(objeto);
                //JOptionPane.showMessageDialog(null, "Se ha almacenado un objeto importante", "¡ATENCION!", JOptionPane.INFORMATION_MESSAGE);
                addObj();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No hay espacio disponible para almacenar", "¡ATENCION!", JOptionPane.WARNING_MESSAGE);

            }

        }
    }//GEN-LAST:event_itemsToAddActionPerformed

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
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel baseBaul;
    private javax.swing.JComboBox itemsToAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables
}
