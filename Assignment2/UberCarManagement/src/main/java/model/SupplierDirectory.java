package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Dimple Patel
 */
public class SupplierDirectory {

    private List<Supplier> supplierList;
    public static Date date;


    /**
     * SupplierDirectory constructor
     */
    public SupplierDirectory() {
        supplierList = new ArrayList<Supplier>();
    }
    
    /**
     * set method for supplierList
     * @param supplierList 
     */
    public void setSupplierList(List<Supplier> supplierList) {
        this.supplierList = supplierList;
    }

    /**
     * get method for supplierList
     * @return supplierList
     */
    public List<Supplier> getSupplierlist() {
        return supplierList;
    }

    /**
     * add new supplier method
     * @return Supplier
     */
    public Supplier addSupplier() {
        Supplier newSupplier = new Supplier();
        supplierList.add(newSupplier);
        return newSupplier;
    }
    
    
    /**
     * remove supplier method
     * @param s 
     */
    public void removeSupplier(Supplier s) {
        supplierList.remove(s);
    }

    /**
     * search supplier method
     * @param supplierName
     * @return 
     */
    public Supplier searchSupplier(String supplierName) {
        for (Supplier supplier : supplierList) {
            if (supplier.getSupplyName().equals(supplierName)) {
                return supplier;
            }
        }
        return null;
    }
}
