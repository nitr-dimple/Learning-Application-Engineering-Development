package ui.SupplierRole;

import model.Supplier;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Car;
import model.SupplierDirectory;

/**
 *
 * @author Dimple Patel
 */
public class CreateNewProductJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Supplier supplier;
    private SupplierDirectory supplierDirectory;

    public CreateNewProductJPanel(JPanel upc, Supplier s, SupplierDirectory supplierDirectory) {
        initComponents();
        userProcessContainer = upc;
        supplier = s;
        this.supplierDirectory = supplierDirectory;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblManuYear = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblModel = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        lblSeats = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblMaintenanceExp = new javax.swing.JLabel();
        lblSearialNumber = new javax.swing.JLabel();
        lblAvail = new javax.swing.JLabel();
        txtSearialNo = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtSeats = new javax.swing.JTextField();
        txtexp = new javax.swing.JTextField();
        ckbAvail = new javax.swing.JCheckBox();

        setPreferredSize(new java.awt.Dimension(650, 600));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Add New Car");

        lblManuYear.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblManuYear.setText("Manufacturing Year:");

        btnAdd.setText("Add Car");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblModel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblModel.setText("Model :");

        lblSeats.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblSeats.setText("Number of Seats :");

        lblCity.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblCity.setText("City:");

        lblMaintenanceExp.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblMaintenanceExp.setText("Maintenance Certificate Expiry :");

        lblSearialNumber.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblSearialNumber.setText("Serial Number :");

        lblAvail.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblAvail.setText("Is Car Available :");

        ckbAvail.setText("yes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(503, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnBack)
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(73, 73, 73)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblSearialNumber)
                                .addComponent(lblSeats)
                                .addComponent(lblManuYear)
                                .addComponent(lblModel))
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSearialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(4, 4, 4))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblAvail)
                                .addComponent(lblMaintenanceExp)
                                .addComponent(lblCity))
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtexp, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ckbAvail)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jLabel1))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblManuYear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaintenanceExp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtexp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckbAvail))
                .addGap(56, 56, 56)
                .addComponent(btnAdd)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtModel, txtYear});

    }// </editor-fold>//GEN-END:initComponents
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        Integer year;
        Integer noOfSeats;
        Integer mainExpiry;

        /**
         * check if none of the field is empty
         */
        if (txtYear.getText().isEmpty() || txtYear.getText().isEmpty() || txtSeats.getText().isEmpty() || txtSearialNo.getText().isEmpty()
                || txtCity.getText().isEmpty() || txtexp.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter all field values", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        /**
         * check for number value format
         */
        try {
            year = Integer.parseInt(txtYear.getText());
            noOfSeats = Integer.parseInt(txtSeats.getText());
            mainExpiry = Integer.parseInt(txtexp.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please check manufacturing year, expiry year  & number of seats formats", "error", JOptionPane.ERROR_MESSAGE);
            return;
        }

//        serial number should be unique
        for (Supplier supplier : supplierDirectory.getSupplierlist()) {
            for (Car car : supplier.getCarCatalog().getCarCatalog()) {
                if (car.getSerialNo().equalsIgnoreCase(txtSearialNo.getText())) {
                    JOptionPane.showMessageDialog(this, "Serial Number of a Car should be unique", "error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
        }

//        year should not be more than 4 digit
        if (txtYear.getText().length() != 4 || txtexp.getText().length() != 4) {
            JOptionPane.showMessageDialog(this, "Please Enter Valid Manufacturing/Maintenance Expire Year e.g. 1996");
            return;
        }

        Car car = supplier.getCarCatalog().addCar();
        car.setModel(txtModel.getText());
        car.setManufacturingYear(year);
        car.setNoOfSeats(noOfSeats);
        car.setSerialNo(txtSearialNo.getText());
        car.setCity(txtCity.getText());
        car.setMaintenanceExpiryDate(mainExpiry);
        car.setIsAvailable(ckbAvail.isSelected());

        JOptionPane.showMessageDialog(null, "Car Details added successfully!", "Info", JOptionPane.INFORMATION_MESSAGE);

        txtModel.setText("");
        txtYear.setText("");
        txtSeats.setText("");
        txtSearialNo.setText("");
        txtCity.setText("");
        txtexp.setText("");
        ckbAvail.setSelected(false);
        SupplierDirectory.date = new Date();

}//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageProductCatalogJPanel manageProductCatalogJPanel = (ManageProductCatalogJPanel) component;
        manageProductCatalogJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JCheckBox ckbAvail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAvail;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblMaintenanceExp;
    private javax.swing.JLabel lblManuYear;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblSearialNumber;
    private javax.swing.JLabel lblSeats;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtSearialNo;
    private javax.swing.JTextField txtSeats;
    private javax.swing.JTextField txtYear;
    private javax.swing.JTextField txtexp;
    // End of variables declaration//GEN-END:variables
}
