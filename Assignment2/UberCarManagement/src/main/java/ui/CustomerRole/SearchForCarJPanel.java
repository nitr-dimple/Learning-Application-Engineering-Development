package ui.CustomerRole;

import java.awt.CardLayout;
import java.awt.Component;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Car;
import model.Supplier;
import model.SupplierDirectory;

/**
 *
 * @author Dimple Patel
 */
public class SearchForCarJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchForCarJPanel
     */
    private JPanel userProcessContainer;
    private SupplierDirectory supplierDirectory;

    public SearchForCarJPanel(JPanel upc, SupplierDirectory sd) {
        initComponents();
        this.userProcessContainer = upc;
        this.supplierDirectory = sd;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSerialNo = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblProductId = new javax.swing.JLabel();

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setText("Search for Car");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblProductId.setText("Car Searial No :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnBack)
                .addGap(122, 122, 122)
                .addComponent(lblTitle)
                .addGap(273, 273, 273))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProductId)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(175, 175, 175))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitle)
                    .addComponent(btnBack))
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductId))
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addContainerGap(268, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        Car car = new Car();
        int count = 0;
        for (Supplier supplier : supplierDirectory.getSupplierlist()) {
            for (Car c : supplier.getCarCatalog().getCarCatalog()) {
                if (c.getSerialNo().equalsIgnoreCase(txtSerialNo.getText())) {
                    car = c;
                    count++;
                }
            }
        }
        if (count == 0) {
            JOptionPane.showMessageDialog(this, "Please Enter Valid Serial Number", "info", JOptionPane.INFORMATION_MESSAGE);
            return;

        }
        ViewSearchResultDetailJPanel vpdp = new ViewSearchResultDetailJPanel(userProcessContainer, car);
        userProcessContainer.add("ViewProductDetailJPanel", vpdp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);


    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    private void backAction() {
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        BrowseCarJPanel browseCarJPanel = (BrowseCarJPanel) component;
        browseCarJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel lblProductId;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtSerialNo;
    // End of variables declaration//GEN-END:variables
}
