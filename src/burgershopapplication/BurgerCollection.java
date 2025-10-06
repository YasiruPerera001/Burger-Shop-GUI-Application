package burgershopapplication;

import javax.swing.table.DefaultTableModel;

public class BurgerCollection {

    private Burger[] burgers = new Burger[0];

    private void extendsBurgersArray() {
        Burger[] tempBurgersArray = new Burger[burgers.length + 1];
        for (int i = 0; i < burgers.length; i++) {
            tempBurgersArray[i] = burgers[i];
        }
        burgers = tempBurgersArray;
    }

    public boolean addOrder(Burger order) {
        extendsBurgersArray();
        burgers[burgers.length - 1] = order;
        return true;
    }

    public int findIndexOf1(String ID) {
        for (int i = 0; i < burgers.length; i++) {
            if (ID.equalsIgnoreCase(burgers[i].getCustomerID())) {
                return i;
            }
        }
        return -1;
    }
    
     public int findIndexOf2(String ID) {
        for (int i = 0; i < burgers.length; i++) {
            if (ID.equalsIgnoreCase(burgers[i].getOrderID())) {
                return i;
            }
        }
        return -1;
    }

    public void sort(Burger[] temp) {
        for (int i = temp.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (temp[j].getTotal() < temp[j + 1].getTotal()) {
                    Burger t = temp[j + 1];
                    temp[j + 1] = temp[j];
                    temp[j] = t;
                }
            }
        }
    }

    public Burger[] removeDuplicates(Burger[] temp) {
        for (int i = 0; i < temp.length; i++) {
            temp[i] = new Burger(
                    burgers[i].getOrderID(),
                    burgers[i].getCustomerID(),
                    burgers[i].getName(),
                    burgers[i].getQuantity(),
                    burgers[i].getTotal(),
                    burgers[i].getStatus()
            );
        }

        double tot1 = 0;
        double tot2 = 0;
        int qty1 = 0;
        int qty2 = 0;
        for (int i = 0; i < temp.length; i++) {
            for (int j = i + 1; j < temp.length; j++) {
                if (temp[i] != null && temp[j] != null && temp[i].getStatus() != Burger.CANCEL) {
                    if (temp[i].getName().equalsIgnoreCase(temp[j].getName()) && temp[j].getStatus() != Burger.CANCEL) {
                        tot1 = temp[i].getTotal();
                        tot2 = temp[j].getTotal();
                        qty1 = temp[i].getQuantity();
                        qty2 = temp[j].getQuantity();
                        tot1 += tot2;
                        qty1 += qty2;
                        temp[i].setTotal(tot1);
                        temp[j].setTotal(0);
                        temp[i].setQuantity(qty1);
                        temp[j].setQuantity(0);
                    }
                }
            }
        }
        for (int i = 0; i < temp.length; i++) {
            for (int j = i + 1; j < temp.length; j++) {
                if (temp[i] != null && temp[j] != null && temp[i].getStatus() != Burger.CANCEL && temp[j].getStatus() != Burger.CANCEL) {
                    if (temp[i].getName().equalsIgnoreCase(temp[j].getName())) {
                        temp[j] = null;
                    }
                }
            }
        }
        int k = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != null) {
                temp[k] = temp[i];
                k++;
            }
        }
        Burger[] temp2 = new Burger[k];
        //System.out.println(k);
        for (int i = 0; i < temp2.length; i++) {
            temp2[i] = temp[i];
        }
        temp = temp2;

        return temp;
    }

    public DefaultTableModel addRowData(Burger[] temp, DefaultTableModel dtm, String[] columnsName) {
        Object[][] rowData = new Object[temp.length][3];
        for (int i = 0; i < rowData.length; i++) {
            for (int j = 0; j < 3; j++) {
                switch (j) {
                    case 0:
                        rowData[i][j] = temp[i].getCustomerID();
                        //System.out.println(rowData[i][j]);
                        break;
                    case 1:
                        rowData[i][j] = temp[i].getQuantity();
                        //System.out.println(rowData[i][j]);
                        break;
                    case 2:
                        rowData[i][j] = temp[i].getTotal();
                        //System.out.println(rowData[i][j]);
                        break;
                }
            }
        }
        dtm = new DefaultTableModel(columnsName, 0);
        for (int i = 0; i < rowData.length; i++) {
            if (temp[i].getStatus() != Burger.CANCEL) {
                dtm.addRow(rowData[i]);
            }
        }
        return dtm;
    }

    public DefaultTableModel addRowData(DefaultTableModel dtm, String[] columnsName, String name) {
        Object[][] rowData = new Object[burgers.length][3];
        for (int i = 0; i < rowData.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (name.equalsIgnoreCase(burgers[i].getName())) {
                    switch (j) {
                        case 0:
                            rowData[i][j] = burgers[i].getOrderID();
                            //System.out.println(rowData[i][j]);
                            break;
                        case 1:
                            rowData[i][j] = burgers[i].getQuantity();
                            //System.out.println(rowData[i][j]);
                            break;
                        case 2:
                            rowData[i][j] = burgers[i].getTotal();
                            //System.out.println(rowData[i][j]);
                            break;
                    }
                }
            }
        }
        dtm = new DefaultTableModel(columnsName, 0);
        for (int i = 0; i < rowData.length; i++) {
            if (name.equals(burgers[i].getName())) {
                dtm.addRow(rowData[i]);
            }
        }
        return dtm;
    }

    public String generateOrderID() {
        if (burgers.length <= 0) {
            return "O001";
        }
        String lastOrderID = burgers[burgers.length - 1].getOrderID();
        int lastOrderIDNumber = Integer.parseInt(lastOrderID.substring(1));
        return String.format("O%03d", lastOrderIDNumber + 1);
    }

    public String generateCustomerID() {
        if (burgers.length <= 0) {
            return "C001";
        }
        String lastCustomerID = burgers[burgers.length - 1].getCustomerID();
        int lastCustomerIDNumber = Integer.parseInt(lastCustomerID.substring(1));
        return String.format("C%03d", lastCustomerIDNumber + 1);
    }

    public Burger[] getBurgersArray() {
        return burgers;
    }
}
