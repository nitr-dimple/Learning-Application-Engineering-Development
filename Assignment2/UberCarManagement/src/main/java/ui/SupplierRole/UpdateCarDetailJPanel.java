package ui.SupplierRole;

import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Car;
import model.Supplier;
import model.SupplierDirectory;

/**
 *
 * @author Dimple Patel
 */
public class UpdateCarDetailJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Car car;
    private SupplierDirectory supplierDirectory;

    public UpdateCarDetailJPanel(JPanel upc, Car car, SupplierDirectory supplierDirectory) {
        initComponents();
        this.userProcessContainer = upc;
        this.car = car;
        this.supplierDirectory = supplierDirectory;

        txtModel.setText(car.getModel());
        txtSearialNo.setText(car.getSerialNo());
        txtYear.setText(car.getManufacturingYear().toString());
        ckbAvail.setSelected(car.isIsAvailable());
        txtSeats.setText(car.getNoOfSeats().toString());
        txtCity.setText(car.getCity());
        txtexp.setText(car.getMaintenanceExpiryDate().toString());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtModel = new javax.swing.JTextField();
        lblSeats = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblMaintenanceExp = new javax.swing.JLabel();
        lblSearialNumber = new javax.swing.JLabel();
        lblAvail = new javax.swing.JLabel();
        lblManuYear = new javax.swing.JLabel();
        txtSearialNo = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtSeats = new javax.swing.JTextField();
        txtexp = new javax.swing.JTextField();
        lblModel = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        ckbAvail = new javax.swing.JCheckBox();

        setPreferredSize(new java.awt.Dimension(650, 600));

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setText("Update Car Detail");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

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

        lblManuYear.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblManuYear.setText("Manufacturing Year:");

        lblModel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblModel.setText("Model :");

        btnUpdate.setText("Update Details");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        ckbAvail.setText("yes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(btnBack)
                            .addGap(157, 157, 157)
                            .addComponent(lblTitle))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(189, 189, 189)
                            .addComponent(lblModel)
                            .addGap(31, 31, 31)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAvail)
                                    .addComponent(lblMaintenanceExp)
                                    .addComponent(lblCity))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtexp, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ckbAvail)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSearialNumber)
                                    .addComponent(lblSeats)
                                    .addComponent(lblManuYear))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSearialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnBack))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(92, 92, 92)
                .addComponent(btnUpdate)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        Integer year;
        Integer noOfSeats;
        Integer mainExpiry;

        if (txtYear.getText().isEmpty() || txtYear.getText().isEmpty() || txtSeats.getText().isEmpty() || txtSearialNo.getText().isEmpty()
                || txtCity.getText().isEmpty() || txtexp.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter all field values", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            year = Integer.parseInt(txtYear.getText());
            noOfSeats = Integer.parseInt(txtSeats.getText());
            mainExpiry = Integer.parseInt(txtexp.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please check manufacturing year, expiry year  & number of seats formats");
            return;
        }

        for (Supplier supplier : supplierDirectory.getSupplierlist()) {
            for (Car car : supplier.getCarCatalog().getCarCatalog()) {
                if (this.car.getCarId() != car.getCarId() &&  car.getSerialNo().equalsIgnoreCase(txtSearialNo.getText())) {
                    JOptionPane.showMessageDialog(this, "Serial Number of a Car should be unique", "error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
        }

        if (txtYear.getText().length() != 4 || txtexp.getText().length() != 4) {
            JOptionPane.showMessageDialog(this, "Please Enter Valid Manufacturing/Maintenance Expire Year, e.g. 1996");
            return;
        }

        car.setModel(txtModel.getText());
        car.setManufacturingYear(year);
        car.setNoOfSeats(noOfSeats);
        car.setSerialNo(txtSearialNo.getText());
        car.setCity(txtCity.getText());
        car.setMaintenanceExpiryDate(mainExpiry);
        car.setIsAvailable(ckbAvail.isSelected());

        JOptionPane.showMessageDialog(null, "Car Details updated successfully!", "Info", JOptionPane.INFORMATION_MESSAGE);
        SupplierDirectory.date = new Date();

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void backAction() {
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageProductCatalogJPanel manageProductCatalogJPanel = (ManageProductCatalogJPanel) component;
        manageProductCatalogJPanel.refreshTable();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox ckbAvail;
    private javax.swing.JLabel lblAvail;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblMaintenanceExp;
    private javax.swing.JLabel lblManuYear;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblSearialNumber;
    private javax.swing.JLabel lblSeats;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtSearialNo;
    private javax.swing.JTextField txtSeats;
    private javax.swing.JTextField txtYear;
    private javax.swing.JTextField txtexp;
    // End of variables declaration//GEN-END:variables
}
