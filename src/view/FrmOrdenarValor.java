/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Collections;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Auto;

/**
 *
 * @author aldai
 */
public class FrmOrdenarValor extends ManejadorDeAutos {

    /**
     * Creates new form frmordenarvalor
     */
    public FrmOrdenarValor() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnmostrar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ORDENAR POR VALOR");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Marca", "Placa", "Modelo", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnmostrar.setText("MOSTRAR");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });

        btnsalir.setText("SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnmostrar)
                        .addGap(39, 39, 39)
                        .addComponent(btnsalir)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmostrar)
                    .addComponent(btnsalir))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
        List<Auto> autosAOrdenar = getAutos();
        Collections.sort(autosAOrdenar, (esteAuto,otroAuto) -> {
            if (otroAuto instanceof Auto) {
                Auto anotherAuto = (Auto) otroAuto;
                if (esteAuto.getValor() == anotherAuto.getValor()) {
                    return 0;
                }
                if (esteAuto.getValor() > anotherAuto.getValor()) {
                    return 1;
                }
                return -1;
            } else {
                throw new IllegalArgumentException("the provided object is not another car so they can't be compared");
            }
        });
        setAutos(autosAOrdenar);
        mostrar();
    }//GEN-LAST:event_btnmostrarActionPerformed

    /**
     * Obtiene la lista compartida de autos y la muestra. Note que el
     * ordenamiento no se realiza aquí
     */
    public void mostrar() {
        int size = getAutos().size();
        String matriz[][] = new String[size][COLUMNS];

        for (int currentColumn = 0; currentColumn < size; currentColumn++) {
            Auto autoActual = getAutos().get(currentColumn);
            matriz[currentColumn][BRAND_COLUMN_NO] = autoActual.getMarca();
            matriz[currentColumn][PLATE_COLUMN_NO] = autoActual.getPlaca();
            matriz[currentColumn][MODEL_COLUMN_NO] = Integer.toString(autoActual.getModelo());
            matriz[currentColumn][VALUE_COLUMN_NO] = Double.toString(autoActual.getValor());
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel( //TODO: rename to something more meaningful
                matriz,
                new String[]{
                    "Marca", "Placa", "Modelo", "Valor"
                }
        ));
    }
    private static final int VALUE_COLUMN_NO = 3;
    private static final int MODEL_COLUMN_NO = 2;
    private static final int PLATE_COLUMN_NO = 1;
    private static final int BRAND_COLUMN_NO = 0;

    /**
     * *
     * nUMBER OF COLUMNS TO SHOW
     */
    private static final int COLUMNS = 4;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmostrar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
