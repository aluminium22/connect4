/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;
import connect4.Play;


/**
 *
 * @author Aluminium
 */
public class boardPanel extends javax.swing.JFrame {
    static String name1 = "Me";
//public static void main(String[] args){
//    System.out.println(name1);
//}
public void run(){    
}
    /**
     * Creates new form boardPanel
     */
//    public static void main (String[] args){
//        boardPanel run = new boardPanel();
//        run.initComponents(); 
//    }
    public boardPanel() {
        System.out.println("Me!");
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

        javax.swing.JPanel JBoardPanel = new javax.swing.JPanel();
        jBoardTitlePanel = new javax.swing.JPanel();
        jBoardLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton6BoardColumn = new javax.swing.JButton();
        jButton6BoardColumn1 = new javax.swing.JButton();
        jButton6BoardColumn2 = new javax.swing.JButton();
        jButton6BoardColumn3 = new javax.swing.JButton();
        jButton6BoardColumn4 = new javax.swing.JButton();
        jButton6BoardColumn5 = new javax.swing.JButton();
        jButton6BoardColumn6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBoardLabel.setFont(new java.awt.Font("Futura", 0, 50)); // NOI18N
        jBoardLabel.setForeground(new java.awt.Color(204, 102, 0));
        jBoardLabel.setText("Connect 4");

        jTable2.setFont(new java.awt.Font("Ravie", 1, 20)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Col 0", "Col 1", "Col 2", "Col 3", "Col 4", "Col 5", "Col 6"
            }
        ));
        jTable2.setRowHeight(50);
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setHeaderValue("Col 0");
            jTable2.getColumnModel().getColumn(1).setHeaderValue("Col 1");
            jTable2.getColumnModel().getColumn(2).setHeaderValue("Col 2");
            jTable2.getColumnModel().getColumn(3).setHeaderValue("Col 3");
            jTable2.getColumnModel().getColumn(4).setHeaderValue("Col 4");
            jTable2.getColumnModel().getColumn(5).setHeaderValue("Col 5");
            jTable2.getColumnModel().getColumn(6).setHeaderValue("Col 6");
        }

        jButton6BoardColumn.setText("6");
        jButton6BoardColumn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6BoardColumn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6BoardColumn.setIconTextGap(0);
        jButton6BoardColumn.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton6BoardColumn.setMaximumSize(new java.awt.Dimension(50, 23));
        jButton6BoardColumn.setPreferredSize(new java.awt.Dimension(30, 30));

        jButton6BoardColumn1.setText("0");
        jButton6BoardColumn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6BoardColumn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6BoardColumn1.setIconTextGap(0);
        jButton6BoardColumn1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton6BoardColumn1.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton6BoardColumn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6BoardColumn1ActionPerformed(evt);
            }
        });

        jButton6BoardColumn2.setText("1");
        jButton6BoardColumn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6BoardColumn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6BoardColumn2.setIconTextGap(0);
        jButton6BoardColumn2.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton6BoardColumn2.setPreferredSize(new java.awt.Dimension(30, 30));

        jButton6BoardColumn3.setText("2");
        jButton6BoardColumn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6BoardColumn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6BoardColumn3.setIconTextGap(0);
        jButton6BoardColumn3.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton6BoardColumn3.setMaximumSize(new java.awt.Dimension(50, 23));
        jButton6BoardColumn3.setPreferredSize(new java.awt.Dimension(30, 30));

        jButton6BoardColumn4.setText("3");
        jButton6BoardColumn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6BoardColumn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6BoardColumn4.setIconTextGap(0);
        jButton6BoardColumn4.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton6BoardColumn4.setMaximumSize(new java.awt.Dimension(50, 23));
        jButton6BoardColumn4.setPreferredSize(new java.awt.Dimension(30, 30));

        jButton6BoardColumn5.setText("4");
        jButton6BoardColumn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6BoardColumn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6BoardColumn5.setIconTextGap(0);
        jButton6BoardColumn5.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton6BoardColumn5.setMaximumSize(new java.awt.Dimension(50, 23));
        jButton6BoardColumn5.setPreferredSize(new java.awt.Dimension(30, 30));

        jButton6BoardColumn6.setText("5");
        jButton6BoardColumn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6BoardColumn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6BoardColumn6.setIconTextGap(0);
        jButton6BoardColumn6.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton6BoardColumn6.setMaximumSize(new java.awt.Dimension(50, 23));
        jButton6BoardColumn6.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText(name1 + "it's your turn");

        org.jdesktop.layout.GroupLayout jBoardTitlePanelLayout = new org.jdesktop.layout.GroupLayout(jBoardTitlePanel);
        jBoardTitlePanel.setLayout(jBoardTitlePanelLayout);
        jBoardTitlePanelLayout.setHorizontalGroup(
            jBoardTitlePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jBoardTitlePanelLayout.createSequentialGroup()
                .add(0, 30, Short.MAX_VALUE)
                .add(jBoardTitlePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .add(jBoardTitlePanelLayout.createSequentialGroup()
                        .add(jButton6BoardColumn1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton6BoardColumn2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton6BoardColumn3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton6BoardColumn4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton6BoardColumn5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton6BoardColumn6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton6BoardColumn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(30, 30, 30))
            .add(jBoardTitlePanelLayout.createSequentialGroup()
                .add(107, 107, 107)
                .add(jBoardTitlePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jBoardLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jBoardTitlePanelLayout.setVerticalGroup(
            jBoardTitlePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jBoardTitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(jBoardLabel)
                .add(2, 2, 2)
                .add(jLabel1)
                .add(18, 18, 18)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 377, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jBoardTitlePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton6BoardColumn1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton6BoardColumn2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton6BoardColumn3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton6BoardColumn4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton6BoardColumn5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton6BoardColumn6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton6BoardColumn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName(name1);

        org.jdesktop.layout.GroupLayout JBoardPanelLayout = new org.jdesktop.layout.GroupLayout(JBoardPanel);
        JBoardPanel.setLayout(JBoardPanelLayout);
        JBoardPanelLayout.setHorizontalGroup(
            JBoardPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jBoardTitlePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JBoardPanelLayout.setVerticalGroup(
            JBoardPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jBoardTitlePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(JBoardPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(JBoardPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton6BoardColumn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6BoardColumn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6BoardColumn1ActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBoardLabel;
    private javax.swing.JPanel jBoardTitlePanel;
    private javax.swing.JButton jButton6BoardColumn;
    private javax.swing.JButton jButton6BoardColumn1;
    private javax.swing.JButton jButton6BoardColumn2;
    private javax.swing.JButton jButton6BoardColumn3;
    private javax.swing.JButton jButton6BoardColumn4;
    private javax.swing.JButton jButton6BoardColumn5;
    private javax.swing.JButton jButton6BoardColumn6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
